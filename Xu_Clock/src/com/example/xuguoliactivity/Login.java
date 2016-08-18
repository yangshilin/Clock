package com.example.xuguoliactivity;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import cn.smssdk.EventHandler;
import cn.smssdk.SMSSDK;

import com.example.clock.R;

public class Login extends Activity implements OnClickListener {
	private ImageView return_not;
	private EditText inputPhoneEt;
	private EditText inputCodeEt;
	private TextView requestcode;
	private Button commitBtn;
	private SharedPreferences sp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.login);
		intView();
	}

	// 初始化控件
	public void intView() {
		inputPhoneEt = (EditText) findViewById(R.id.et_phone);
		inputCodeEt = (EditText) findViewById(R.id.et_password);
		requestcode = (TextView) findViewById(R.id.requestcode);
		commitBtn = (Button) findViewById(R.id.bt_login);
		return_not = (ImageView) findViewById(R.id.return_not);
		requestcode.setOnClickListener(this);
		commitBtn.setOnClickListener(this);
		return_not.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.requestcode:
			String num = inputPhoneEt.getText().toString();
			if (!TextUtils.isEmpty(num) && inputPhoneEt.length() == 11) {
				getMobileCode(num);
			} else {
				Toast.makeText(this, "注册号码输入不对，请重新输入", Toast.LENGTH_LONG)
						.show();
			}
			
			break;

		case R.id.return_not:
			startActivity(new Intent(Login.this, Logon.class));
			break;

		case R.id.bt_login:
			startActivity(new Intent(Login.this, Logon.class));
			break;
		}
	}

	// 获取验证码
	private void getMobileCode(String tellNum) {
		EventHandler eh = new EventHandler() {
			@Override
			public void afterEvent(int event, int result, Object data) {
				if (result == SMSSDK.RESULT_COMPLETE) {
					// 回调完成
					if (event == SMSSDK.EVENT_SUBMIT_VERIFICATION_CODE) {
						// 提交验证码成功
					} else if (event == SMSSDK.EVENT_GET_VERIFICATION_CODE) {
						// 获取验证码成功

					} else if (event == SMSSDK.EVENT_GET_SUPPORTED_COUNTRIES) {
						// 返回支持发送验证码的国家列表
					}
				} else {
					((Throwable) data).printStackTrace();
				}
			}
		};
		SMSSDK.registerEventHandler(eh); // 注册短信回调
		// 请求获取短信验证码，在监听中返回
		SMSSDK.getVerificationCode("86", tellNum);
		Handler mHandler = new Handler() {
			public void handleMessage(Message msg) {
				super.handleMessage(msg);
				int event = msg.arg1;
				int result = msg.arg2;
				Object data = msg.obj;
				if (result == SMSSDK.RESULT_COMPLETE) {
					if (event == SMSSDK.EVENT_GET_VERIFICATION_CODE) {
						Toast.makeText(Login.this, "发送验证码成功", Toast.LENGTH_LONG)
								.show();
					} else if (event == SMSSDK.EVENT_SUBMIT_VERIFICATION_CODE) {// 提交验证码成功
						Toast.makeText(Login.this, "注册成功", Toast.LENGTH_LONG)
								.show();
					} else {
						int status = 0;
						try {
							((Throwable) data).printStackTrace();
							Throwable throwable = (Throwable) data;
							JSONObject object;
							object = new JSONObject(throwable.getMessage());
							String des = object.optString("detail");
							status = object.optInt("status");
							if (!TextUtils.isEmpty(des)) {
								Toast.makeText(Login.this, des, Toast.LENGTH_SHORT).show();
								return;
							}
						} catch (JSONException e) {
							e.printStackTrace();
						}
					}
				}
			}
		};
	}


		
	}

