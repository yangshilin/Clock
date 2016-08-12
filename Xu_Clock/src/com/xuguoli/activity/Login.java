package com.xuguoli.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
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
		setContentView(R.layout.login);
		intView();
	}
	// 初始化控件
	public void intView() {
		inputPhoneEt = (EditText) findViewById(R.id.et_phone);
		inputCodeEt = (EditText) findViewById(R.id.et_password);
		requestcode = (TextView) findViewById(R.id.requestcode);
		commitBtn = (Button) findViewById(R.id.bt_login);
		return_not=(ImageView)findViewById(R.id.return_not);
		requestcode.setOnClickListener(this);
		commitBtn.setOnClickListener(this);
		return_not.setOnClickListener(this);

	}
	
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.requestcode:
			String num = inputPhoneEt.getText().toString();
			if(!TextUtils.isEmpty(num)&&inputPhoneEt.length()==11){
				getMobileCode(num);
			}else {
				Toast.makeText(this, "注册号码输入不对，请重新输入", Toast.LENGTH_LONG).show();
			}
			break;
		case R.id.return_not:
			startActivity(new Intent(Login.this,Logon.class));
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
	}
	
}
