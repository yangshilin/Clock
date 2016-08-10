package com.example.alarmclock;



import com.example.alarm.listview.RepeatActivity;
import com.example.alarm.listview.TaskActivity;
import com.example.clock.MainActivity2;
import com.example.clock.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class BianJiNaoZhongActivity extends Activity{
	TextView thebelltext;//�����ı�
	ImageButton returnbtn;//����
	ImageButton completebtn;//���
	RelativeLayout selectbtn;//ѡ��
	RelativeLayout repeatbtn;//�ظ�
	RelativeLayout theBellbtn;//����
	RelativeLayout timebtn;//ʱ��
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bianjinaozhong);
	
		returnbtn=(ImageButton)findViewById(R.id.return_imagebtn);
		completebtn=(ImageButton)findViewById(R.id.complete_imagebtn);
		selectbtn=(RelativeLayout)findViewById(R.id.select_imagebtn);
		repeatbtn=(RelativeLayout)findViewById(R.id.repeat_imagebtn);
		theBellbtn=(RelativeLayout)findViewById(R.id.thebell_imagebtn);
		timebtn=(RelativeLayout)findViewById(R.id.time_relativelayout);
		
		
		returnbtn.setOnClickListener(onClickListener);
		completebtn.setOnClickListener(onClickListener);
		selectbtn.setOnClickListener(onClickListener);
		repeatbtn.setOnClickListener(onClickListener);
		theBellbtn.setOnClickListener(onClickListener);
		timebtn.setOnClickListener(onClickListener);
	}
	OnClickListener onClickListener=new OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()){
			case R.id.return_imagebtn://����
				Intent intent = new Intent(BianJiNaoZhongActivity.this , MainActivity2.class);
				 startActivity(intent);
				 
				break;
			case R.id.complete_imagebtn://���
				Intent intent1 = new Intent(BianJiNaoZhongActivity.this , MainActivity2.class);
				 startActivity(intent1);
				break;
			case R.id.select_imagebtn://ѡ��
				Intent intent2 = new Intent(BianJiNaoZhongActivity.this , TaskActivity.class);
				 startActivity(intent2);
				
				break;
			case R.id.repeat_imagebtn://�ظ�
				Intent intent3= new Intent(BianJiNaoZhongActivity.this , RepeatActivity.class);
				 startActivity(intent3);
				
				break;
			case R.id.thebell_imagebtn://����
				Intent intent4= new Intent(BianJiNaoZhongActivity.this , SheZingLingShengActivity.class);
				 startActivity(intent4); 
				break;
			case R.id.time_relativelayout://ʱ��
				
				break;
			default:
				break;
			}
		}
	};
	
}
