package com.example.alarmclock;



import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.clock.R;

public class SheZingLingShengActivity extends Activity {
	TextView  textview;//ģʽ�ı�
	RadioButton fireflybtn;
	RadioGroup radiogroup;
	RadioButton babybtn;
	RadioButton bobbtn;
	RadioButton bodesabtn;
	RadioButton lanternbtn;
	RadioButton lemonbtn;
	RadioButton mushroomsbtn;
	ImageButton returnbtn;//���ر༭���Ӱ�ť
	RelativeLayout setbtn;// ѡ�����ѷ�ʽ
	TextView textview2;
	String[] str={"震动","铃声","震动加铃声"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shedinglingsheng);
		textview=(TextView)findViewById(R.id.textview_moshi);
		setbtn = (RelativeLayout) findViewById(R.id.shezhi_id);
		radiogroup=(RadioGroup) findViewById(R.id.radiogroup);
		returnbtn = (ImageButton) findViewById(R.id.return_btn);
		fireflybtn = (RadioButton) findViewById(R.id.radiobtn_Firefly);
		babybtn = (RadioButton) findViewById(R.id.radiobtn_Baby);
		bodesabtn = (RadioButton) findViewById(R.id.radiobtn_BoDeSa);
		lanternbtn = (RadioButton) findViewById(R.id.radiobtn_Lantern);
		lemonbtn = (RadioButton) findViewById(R.id.radiobtn_Lemon);
		mushroomsbtn = (RadioButton) findViewById(R.id.radiobtn_Mushrooms);

		fireflybtn.setOnClickListener(onClickListener);
		babybtn.setOnClickListener(onClickListener);
		bodesabtn.setOnClickListener(onClickListener);
		lanternbtn.setOnClickListener(onClickListener);
		lemonbtn.setOnClickListener(onClickListener);
		mushroomsbtn.setOnClickListener(onClickListener);
		returnbtn.setOnClickListener(onClickListener);
		setbtn.setOnClickListener(onClickListener);
		radiogroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				switch (checkedId) {
				case R.id.radiobtn_Firefly:
					radiogroup.check(fireflybtn.getId());
					break;
				case R.id.radiobtn_Baby:
					radiogroup.check(babybtn.getId());
					break;
				case R.id.radiobtn_BoDeSa:
					radiogroup.check(bodesabtn.getId());
					break;
				case R.id.radiobtn_Lantern:
					radiogroup.check(lanternbtn.getId());
					break;
				case R.id.radiobtn_Lemon:
					radiogroup.check(lemonbtn.getId());
					break;
				case R.id.radiobtn_Mushrooms:
					radiogroup.check(mushroomsbtn.getId());
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
			case R.id.return_btn:

				Intent intent = new Intent(SheZingLingShengActivity.this,
						BianJiNaoZhongActivity.class);
				Bundle bundle=new Bundle();
				intent.putExtra("String", "Firefly");
				
				startActivity(intent);
				break;
			case R.id.shezhi_id:
				dialog();
				break;
			
			default:
				break;
			}
		}
	};
	public void dialog(){
		AlertDialog.Builder builder=new AlertDialog.Builder(SheZingLingShengActivity.this);
		builder.setTitle("选择模式：");
		builder.setItems(str, null);
		//builder.setOnClickListener(onClickListener);
		builder.setNegativeButton("确认", null);
		builder.show();
		//textview.setText(text);
		
	}
}