package com.example.alarmclock;

import com.example.clock.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;

public class DaoHangActivity extends Activity{
	ImageButton addBtn;
	ImageView personalBtn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.daohang);
		addBtn=(ImageButton)findViewById(R.id.add_imagebutton);
		personalBtn=(ImageView)findViewById(R.id.personal_imageview);
		
		
		addBtn.setOnClickListener(onClickListener);
		personalBtn.setOnClickListener(onClickListener);
	}
	OnClickListener onClickListener=new OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()){
			case R.id.add_imagebutton:
				Log.i("personalBtn","��Ҫ���ʲô��");
				break;
			case R.id.personal_imageview:
				Log.i("personalBtn","��Ҫ�����������");
				break;
			default:
				break;
			}
		}
	};
}
