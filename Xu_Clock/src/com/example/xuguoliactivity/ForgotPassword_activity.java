package com.example.xuguoliactivity;


import com.example.clock.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class ForgotPassword_activity extends Activity implements OnClickListener{
	private EditText changeet_phone, changeet_password;// 输入修改的电话
	private TextView change_requestcode;// 发送验证码
	private Button change_password;// 修改密码

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.forgot_password);
		intView();
	}

	public void intView() {
		changeet_phone = (EditText) findViewById(R.id.changeet_phone);
		changeet_password = (EditText) findViewById(R.id.changeet_password);
		change_requestcode = (TextView) findViewById(R.id.change_requestcode);
		change_password = (Button) findViewById(R.id.change_password);
		change_requestcode.setOnClickListener(this);
		change_password.setOnClickListener(this);
	}
	
	public void sendYezhengma(){//验证码的发送
		Toast.makeText(this, "验证码的发送尚未开发", Toast.LENGTH_LONG).show();
	}
	public void changePassword(){//找回密码进入
		startActivity(new Intent(ForgotPassword_activity.this,Logon.class));
	}
	

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.change_requestcode:
			sendYezhengma();
			break;
		case R.id.change_password:
			changePassword();
			break;
		
		}
	}
}
