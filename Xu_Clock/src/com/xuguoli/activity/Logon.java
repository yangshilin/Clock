package com.xuguoli.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.example.clock.MainActivity2;
import com.example.clock.R;

public class Logon extends Activity implements OnClickListener {
	private EditText username;
	private EditText password;
	private Button btn_logon;
	private Button btn_regist;
	private Button btn_forgot;
	private Button btn_moreLogon;
	private SharedPreferences sp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.logon);
		intView();
	}

	// 初始化控件
	public void intView() {
		
		username = (EditText) findViewById(R.id.username);
		password = (EditText) findViewById(R.id.password);
		btn_logon = (Button) findViewById(R.id.btn_logon);
		btn_regist = (Button) findViewById(R.id.btn_regist);
		btn_forgot = (Button) findViewById(R.id.btn_forgot);
		btn_moreLogon = (Button) findViewById(R.id.btn_moreLogon);
		btn_logon.setOnClickListener(this);
		btn_regist.setOnClickListener(this);
		btn_forgot.setOnClickListener(this);
		btn_moreLogon.setOnClickListener(this);
	}
	

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_regist:
			startActivity(new Intent(Logon.this, Login.class));
			break;
		case R.id.btn_logon:
			startActivity(new Intent(Logon.this, MainActivity2.class));
			break;
		case R.id.btn_forgot:
			startActivity(new Intent(Logon.this, ForgotPassword_activity.class));
			break;
		case R.id.btn_moreLogon:
			startActivity(new Intent(Logon.this, Third_party.class));
			break;

		}
	}

}
