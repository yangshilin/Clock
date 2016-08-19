package com.example.alarmclock;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.app.TimePickerDialog.OnTimeSetListener;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TimePicker;

import com.example.alarm.listview.RepeatActivity;
import com.example.alarm.listview.TaskActivity;
import com.example.clock.MainActivity2;
import com.example.clock.R;

public class BianJiNaoZhongActivity extends Activity {

	TextView timebtn,timebtn2, timebtn3, timebtn4;// 具体时间
	TextView textname;// 铃声名字
	ImageButton returnbtn;// 返回
	ImageButton completebtn;// 完成
	RelativeLayout selectbtn;// 选择
	LinearLayout linearlayouttime;// 时间
	RelativeLayout repeatbtn;// 重复
	RelativeLayout theBellbtn;// 铃声
	String name = "FireFly";
	EditText edittext;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.bianjinaozhong);

		textname = (TextView) findViewById(R.id.lingsheng_name);
		if (getIntent() != null && getIntent().getExtras() != null) {
			name = getIntent().getExtras().getString("musicname");
			// Toast.makeText(BianJiNaoZhongActivity.this, "1223",
			// Toast.LENGTH_LONG).show();
			textname.setText(name);
		} else {
			// Toast.makeText(BianJiNaoZhongActivity.this, "1111",
			// Toast.LENGTH_LONG).show();

		}
		timebtn = (TextView) findViewById(R.id.time_btn);
		timebtn2=(TextView)findViewById(R.id.time2_btn);
		timebtn3 = (TextView) findViewById(R.id.time3_btn);
		timebtn4 = (TextView) findViewById(R.id.time4_btn);
		returnbtn = (ImageButton) findViewById(R.id.return_imagebtn);
		completebtn = (ImageButton) findViewById(R.id.complete_imagebtn);
		selectbtn = (RelativeLayout) findViewById(R.id.select_imagebtn);
		linearlayouttime = (LinearLayout) findViewById(R.id.time_linearlayout);
		repeatbtn = (RelativeLayout) findViewById(R.id.repeat_imagebtn);
		theBellbtn = (RelativeLayout) findViewById(R.id.thebell_imagebtn);
		edittext = (EditText) findViewById(R.id.edittext_id);

		returnbtn.setOnClickListener(onClickListener);
		completebtn.setOnClickListener(onClickListener);
		selectbtn.setOnClickListener(onClickListener);
		linearlayouttime.setOnClickListener(onClickListener);
		repeatbtn.setOnClickListener(onClickListener);
		theBellbtn.setOnClickListener(onClickListener);
		timebtn.setOnClickListener(onClickListener);
		edittext.setOnClickListener(onClickListener);
	}

	OnClickListener onClickListener = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.return_imagebtn:// 返回首页
				Intent intent = new Intent(BianJiNaoZhongActivity.this,
						MainActivity2.class);
				startActivity(intent);

				break;
			case R.id.complete_imagebtn:// 完成
				Intent intent1 = new Intent(BianJiNaoZhongActivity.this,
						MainActivity2.class);
				startActivity(intent1);
				break;
			case R.id.select_imagebtn:// 选择任务
				Intent intent2 = new Intent(BianJiNaoZhongActivity.this,
						TaskActivity.class);
				startActivity(intent2);

				break;
			case R.id.repeat_imagebtn:// 选择提醒日期
				Intent intent3 = new Intent(BianJiNaoZhongActivity.this,
						RepeatActivity.class);
				startActivity(intent3);

				break;
			case R.id.thebell_imagebtn:// 选择铃声

				Intent intent4 = new Intent(BianJiNaoZhongActivity.this,
						SheZingLingShengActivity.class);
				startActivity(intent4);

				break;
			case R.id.time_linearlayout:// 设置时间
				int numb = Integer.valueOf(timebtn.getText().toString());
				Log.i("numb", ""+numb);
				int numb2 = Integer.valueOf(timebtn3.getText().toString());
				TimePickerDialog time = new TimePickerDialog(
						BianJiNaoZhongActivity.this, new OnTimeSetListener() {
							
							@Override
							public void onTimeSet(TimePicker view,
									int hourOfDay, int minute) {
								// TODO Auto-generated method stub
								if(hourOfDay<12){
									timebtn.setText(String.valueOf(hourOfDay));
									timebtn2.setText(":");
									timebtn3.setText(String.valueOf(minute));
									timebtn4.setText("AM");
								}else{
									timebtn.setText(String.valueOf(hourOfDay-12));
									timebtn2.setText(":");
									timebtn3.setText(String.valueOf(minute));
									timebtn4.setText("PM");
								}
							
							}
						}, numb, numb2, true);
				time.show();
				break;
			case R.id.edittext_id:

			default:
				break;
			}
		}
	};

}
