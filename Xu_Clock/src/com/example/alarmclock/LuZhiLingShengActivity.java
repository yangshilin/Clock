package com.example.alarmclock;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Toast;

import com.example.clock.MainActivity2;
import com.example.clock.R;

public class LuZhiLingShengActivity extends Activity{
	ImageButton returnbtn;
	ImageView recordingbtn;
	LinearLayout linearLayout;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.luzhilingsheng);
		
		returnbtn=(ImageButton)findViewById(R.id.return_imagebtn);
		recordingbtn=(ImageView)findViewById(R.id.recording_imagebtn);
		linearLayout=(LinearLayout)findViewById(R.id.linearlayout_id);
		returnbtn.setOnClickListener(onClickListener);
		recordingbtn.setOnClickListener(onClickListener);
	}
	
	OnClickListener onClickListener=new OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()){
			case R.id.return_imagebtn:
				Intent intent=new Intent(LuZhiLingShengActivity.this,MainActivity2.class);
				startActivity(intent);
				break;
			case R.id.recording_imagebtn:
				Toast.makeText(getApplicationContext(), "你可以录制你的声音了", Toast.LENGTH_LONG).show();// ��ʾʱ��϶�
				
				break;
			default:
				break;
			}
		}
	};
}
