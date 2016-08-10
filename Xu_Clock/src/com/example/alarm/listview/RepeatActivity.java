package com.example.alarm.listview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import com.example.clock.MainActivity2;
import com.example.clock.R;

public class RepeatActivity extends Activity{
	/**
	 * ��תҳ��
	 */
	ImageButton btn;
	/**
	 * listview�������
	 */
	ListView listview;
	TextView tv;
	CheckBox cb;//chackBoxѡ�пؼ����ɶ�ѡ/ѡ��Ч���򹴡�
	ArrayAdapter arrayAdapter;//����������
	SimpleAdapter simpleAdapter;//��������
	List<String> lists = new ArrayList<String>();//�б�������
	List<Map<String,Object>> listData = new ArrayList<Map<String,Object>>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_repeat_1);
		/**
		 * listview�������
		 */
		listview = (ListView)findViewById(R.id.repeat_ListView);
		tv = (TextView)findViewById(R.id.chongfu_xingqi_textview);
		cb = (CheckBox)findViewById(R.id.chongfu_checkbox);
		arrayAdapter = new ArrayAdapter(RepeatActivity.this,R.layout.activity_repeat_2);
		String[] keys = {"tv","cb"};//keyֵ��������������s
		int[] viewIds = {R.id.chongfu_xingqi_textview,R.id.chongfu_checkbox};//��ͼid
		simpleAdapter = new SimpleAdapter(RepeatActivity.this,listData,
				R.layout.activity_repeat_2,keys,viewIds);
		listview.setAdapter(simpleAdapter);
		getData();
		/**
		 * ��תҳ��
		 * ��Ҫ�� AndroidManifest.xml �ӱ�ǩ
		 *  <!-- ��������Activityҳ�� -->
         * <activity android:name="com.example.alarmclok.view.Cheshi_tiaozhuan" />
		 */
		btn = (ImageButton)findViewById(R.id.repeat_fanhui_button);
		btn.setOnClickListener(listener);
	}
	OnClickListener listener = new OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.task_fanhui_button://idzִ��         //��ǰ������//��תָ���Ľ���
				Intent intent = new Intent(RepeatActivity.this,MainActivity2.class);
				startActivity(intent);//start��ʼ ִ��Intent��ͼ����ת��
				break;

			default:
				break;
			}
		}
		
	};
	/**
	 * listview�������
	 */
	public void getData() {
		// TODO Auto-generated method stub
		Map<String,Object> map =new HashMap<String,Object>();
		map.put("tv","星期日");
		listData.add(map);
		map =new HashMap<String,Object>();
		map.put("tv","星期一");
		/*map.put("cb", R.drawable.repetition_select);���ͼƬ�ķ�ʽ*/
		listData.add(map);
		map =new HashMap<String,Object>();
		map.put("tv","星期二");
		listData.add(map);
		map =new HashMap<String,Object>();
		map.put("tv","星期三");
		listData.add(map);
		map =new HashMap<String,Object>();
		map.put("tv","星期四");
		listData.add(map);
		map =new HashMap<String,Object>();
		map.put("tv","星期五");
		listData.add(map);
		map =new HashMap<String,Object>();
		map.put("tv","星期六");
		listData.add(map);
		
	}
}
