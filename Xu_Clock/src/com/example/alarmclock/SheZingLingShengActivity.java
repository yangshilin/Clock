package com.example.alarmclock;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.clock.R;

public class SheZingLingShengActivity extends Activity {
	TextView textview;// 模式文本
	RadioButton fireflybtn, babybtn, bobbtn, bodesabtn, lanternbtn, lemonbtn,
			mushroomsbtn;
	RadioGroup radiogroup;
	ImageButton returnbtn;// 返回
	RelativeLayout setbtn;// 设置模式
	TextView textview2;
	String musicname;
	String[] str = { "震动", "铃声", "震动加铃声" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.shedinglingsheng);
		textview = (TextView) findViewById(R.id.textview_moshi);
		setbtn = (RelativeLayout) findViewById(R.id.shezhi_id);
		radiogroup = (RadioGroup) findViewById(R.id.radiogroup);
		returnbtn = (ImageButton) findViewById(R.id.return_btn);
		fireflybtn = (RadioButton) findViewById(R.id.radiobtn_Firefly);
		bobbtn = (RadioButton) findViewById(R.id.radiobtn_Bob);
		babybtn = (RadioButton) findViewById(R.id.radiobtn_Baby);
		bodesabtn = (RadioButton) findViewById(R.id.radiobtn_BoDeSa);
		lanternbtn = (RadioButton) findViewById(R.id.radiobtn_Lantern);
		lemonbtn = (RadioButton) findViewById(R.id.radiobtn_Lemon);
		mushroomsbtn = (RadioButton) findViewById(R.id.radiobtn_Mushrooms);

		returnbtn.setOnClickListener(onClickListener);
		setbtn.setOnClickListener(onClickListener);
		radiogroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {// radioGroup的监听事件

					@Override
					public void onCheckedChanged(RadioGroup group, int checkedId) {
						// TODO Auto-generated method stub
						switch (checkedId) {
						case R.id.radiobtn_Firefly:
							musicname = "Firefly";
							break;
						case R.id.radiobtn_Baby:
							musicname = "Baby Wake Up";
							break;
						case R.id.radiobtn_Bob:
							musicname = "Bob Start Attack";
							break;
						case R.id.radiobtn_BoDeSa:
							musicname = "BoDoSa";
							break;
						case R.id.radiobtn_Lantern:
							musicname = "Lantern Start";
							break;
						case R.id.radiobtn_Lemon:
							musicname = "Lemon Port";
							break;
						case R.id.radiobtn_Mushrooms:
							musicname = "Moshrooms Villain";
							break;
						default:
							break;
						}
					}
				});
	}


	OnClickListener onClickListener = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.return_btn:// 返回上一个界面

				Intent intent = new Intent(SheZingLingShengActivity.this,
						BianJiNaoZhongActivity.class);

				int id = radiogroup.getCheckedRadioButtonId();
				RadioButton rb = (RadioButton) findViewById(id);
				musicname = rb.getText().toString();
				intent.putExtra("musicname", musicname);
				startActivity(intent);
				break;
			case R.id.shezhi_id:// 选择闹钟提醒模式
				new AlertDialog.Builder(SheZingLingShengActivity.this)
						.setTitle("请选择你想要的模式")
						.setItems(str, new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface dialog,
									int which) {
								// TODO Auto-generated method stub
								switch (which) {
								case 0:
									textview.setText(str[0]);
									break;
								case 1:
									textview.setText(str[1]);
									break;
								case 2:
									textview.setText(str[2]);
									break;
								}
							}
						}).show();
				break;
			default:
				break;
			}
		}
	};

	public RadioButton getFireflybtn() {
		return fireflybtn;
	}

	public void setFireflybtn(RadioButton fireflybtn) {
		this.fireflybtn = fireflybtn;
	}
}