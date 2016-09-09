package com.example.zuji;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.zuji.adapter.ZuJiAdapter;
import com.example.zuji.javaclass.ZuJi;

@SuppressLint("SimpleDateFormat")
public class ZuJiActivity extends Activity {
	private TextView fasongText = null;
	private EditText zujiEditText = null;
	private ListView zujiListView = null;
	private List<ZuJi> zujiList = null;
	private ZuJiAdapter zujiAdapter = null;
	ImageButton zujiReturn;
	TextView timetext;
	String date;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.zuji);
		getTime();
		zujiEditText = (EditText) this.findViewById(R.id.zuji_edittext);
		fasongText = (TextView) this.findViewById(R.id.zuji_fasong);
		zujiReturn = (ImageButton) this.findViewById(R.id.zuji_return);
		timetext=(TextView)findViewById(R.id.zuji_time);
		zujiListView = (ListView) this.findViewById(R.id.duihua_listview);

		zujiList = new ArrayList<ZuJi>();
		ZuJi zuji = null;
		for (int i = 0; i < 2; i++) {
			zuji = new ZuJi();
			if (i % 2 == 0) {
				zuji.setComeMsg(false);
				zuji.setContent("Hello");
				
				zuji.setZujitime(date);
			} else {
				zuji.setComeMsg(true);
				zuji.setContent("Hello,nice to meet you!");
				
				zuji.setZujitime(date);
			}
			zujiList.add(zuji);
		}
		zujiAdapter = new ZuJiAdapter(this, zujiList);
		zujiListView.setAdapter(zujiAdapter);

		fasongText.setOnClickListener(onClickListener);
		zujiReturn.setOnClickListener(onClickListener);
	}
	

	OnClickListener onClickListener = new OnClickListener() {

		@Override
		public void onClick(View v) {

			switch (v.getId()) {
			case R.id.zuji_fasong:
				if (!zujiEditText.getText().toString().equals("")) {
					// 发送消息
					getTime();
					getData();
					
					
					
				} else {
					Toast.makeText(ZuJiActivity.this, "不能发送空白消息",
							Toast.LENGTH_SHORT).show();
				}

				break;
			case R.id.zuji_return:
					Intent intent=new Intent(ZuJiActivity.this,BottonNavigationActivity.class);
					startActivity(intent);
				break;
			default:
				break;
			}

		}
	};
	

	
	private void getData() {
		ZuJi zuji = new ZuJi();
		zuji.setZujitime(date);
		zuji.setContent(zujiEditText.getText().toString());
		zuji.setComeMsg(false);
		zujiList.add(zuji);
		zujiAdapter.notifyDataSetChanged();
		zujiListView.setSelection(zujiList.size() - 1);
		zujiEditText.setText("");
	}
	
	public String getTime(){//获取本地时间
		SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");     
		date=sDateFormat.format(new java.util.Date());
		
		return date;

	}
	
	
	
}