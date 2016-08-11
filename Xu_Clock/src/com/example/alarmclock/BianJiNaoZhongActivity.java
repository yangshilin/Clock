package com.example.alarmclock;



import com.example.alarm.listview.RepeatActivity;
import com.example.alarm.listview.TaskActivity;
import com.example.clock.MainActivity2;
import com.example.clock.R;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TimePicker;

public class BianJiNaoZhongActivity extends Activity{
		
	TextView timebtn;// 铃声文本
	
	ImageButton returnbtn;//返回
	ImageButton completebtn;//完成
	RelativeLayout selectbtn;//选择
	RelativeLayout repeatbtn;//重复
	RelativeLayout theBellbtn;//铃声
	
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
		timebtn=(TextView)findViewById(R.id.time_btn);
		
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
			case R.id.return_imagebtn://返回首页
				Intent intent = new Intent(BianJiNaoZhongActivity.this , MainActivity2.class);
				 startActivity(intent);
				 
				break;
			case R.id.complete_imagebtn://完成
				Intent intent1 = new Intent(BianJiNaoZhongActivity.this , MainActivity2.class);
				 startActivity(intent1);
				break;
			case R.id.select_imagebtn://选择任务
				Intent intent2 = new Intent(BianJiNaoZhongActivity.this , TaskActivity.class);
				 startActivity(intent2);
				
				break;
			case R.id.repeat_imagebtn://选择提醒日期
				Intent intent3= new Intent(BianJiNaoZhongActivity.this , RepeatActivity.class);
				 startActivity(intent3);
				
				break;
			case R.id.thebell_imagebtn://选择铃声
				Intent intent4= new Intent(BianJiNaoZhongActivity.this , SheZingLingShengActivity.class);
				 startActivity(intent4); 
				break;
			case R.id.time_relativelayout://设置时间

				TimePickerDialog time = new TimePickerDialog(
						BianJiNaoZhongActivity.this, new OnTimeSetListener() {

							@Override
							public void onTimeSet(TimePicker view,
									int hourOfDay, int minute) {
								// TODO Auto-generated method stub
								timebtn.setText(hourOfDay+":"+minute);
							}
						}, 18, 25, true);
				time.show();
				break;
			default:
				break;
			}
		}
	};
	
}
