package com.example.alarmclock;

import com.example.clock.MainActivity2;
import com.example.clock.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class LuZhiLingShengActivity extends Activity{
	ImageButton returnbtn;
	ImageView recordingbtn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.luzhilingsheng);
		
		returnbtn=(ImageButton)findViewById(R.id.return_imagebtn);
		recordingbtn=(ImageView)findViewById(R.id.recording_imagebtn);
		
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
				Toast.makeText(getApplicationContext(), "：", Toast.LENGTH_LONG).show();// ��ʾʱ��϶�
				//Toast.makeText(this, "�����¼�����������", Toast.LENGTH_SHORT).show();
				break;
			default:
				break;
			}
		}
	};
}
