package com.xuguoli.acyivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;

import com.example.clock.R;

public class Third_party extends Activity implements OnCheckedChangeListener {
	RadioGroup radioGroup;
	RadioButton radioButton1, radioButton2, radioButton3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.third_party_login);
		intView();

	}

	// 初始化控件
	public void intView() {

		radioGroup = (RadioGroup) findViewById(R.id.wode_radioGroup);
		radioButton1 = (RadioButton) findViewById(R.id.radioButton1);
		radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
		radioButton3 = (RadioButton) findViewById(R.id.radioButton3);

	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		switch (checkedId) {
		case R.id.radioButton1:
			weixinLogon();
			break;

		case R.id.radioButton2:
			weiboLogon();
			break;
		case R.id.radioButton3:
			qqLogon();
			break;
		}
	}
	public void weixinLogon(){
	Toast.makeText(this, "微信登录还未开发", Toast.LENGTH_LONG).show();
	}
	public void weiboLogon(){
		Toast.makeText(this, "微博登录还未开发", Toast.LENGTH_LONG).show();
		}
	
	public void qqLogon(){
		Toast.makeText(this, "QQ登录还未开发", Toast.LENGTH_LONG).show();
		}
}
