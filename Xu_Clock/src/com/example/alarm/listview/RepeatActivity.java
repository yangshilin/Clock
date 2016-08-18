package com.example.alarm.listview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.example.alarmclock.BianJiNaoZhongActivity;
import com.example.clock.MainActivity2;
import com.example.clock.R;

public class RepeatActivity extends Activity{
	/**
	 * 跳转页面
	 */
	ImageButton btn;
	/**
	 * listview添加数据
	 */
	ListView listview;
	TextView tv;
	CheckBox cb;//chackBox选中控件【可多选/选中效果打勾】
	ArrayAdapter arrayAdapter;//数组适配器
	SimpleAdapter simpleAdapter;//简单适配器
	List<String> lists = new ArrayList<String>();//列表适配器
	List<Map<String,Object>> listData = new ArrayList<Map<String,Object>>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);//取消运行时的顶部标题
		setContentView(R.layout.activity_repeat_listview);
		/**
		 * listview添加数据
		 */
		listview = (ListView)findViewById(R.id.repeat_ListView);
		tv = (TextView)findViewById(R.id.chongfu_xingqi_textview);
		cb = (CheckBox)findViewById(R.id.chongfu_checkbox);
		arrayAdapter = new ArrayAdapter(RepeatActivity.this,R.layout.activity_repeat_date);
		String[] keys = {"tv","cb"};//key值定义对象，数组需加s
		int[] viewIds = {R.id.chongfu_xingqi_textview,R.id.chongfu_checkbox};//视图id
		simpleAdapter = new SimpleAdapter(RepeatActivity.this,listData,
				R.layout.activity_repeat_date,keys,viewIds);
		listview.setAdapter(simpleAdapter);
		getData();
		/**
		 * 跳转页面
		 * 需要在 AndroidManifest.xml 加标签
		 *  <!-- 新增其他Activity页面 -->
         * <activity android:name="com.example.alarmclok.view.Cheshi_tiaozhuan" />
		 */
		btn = (ImageButton)findViewById(R.id.repeat_fanhui_button_gonzuori);
		btn.setOnClickListener(listener);
	}
	OnClickListener listener = new OnClickListener(){ 

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.repeat_fanhui_button_gonzuori://idz执行         //当前上下文//跳转指定的界面
				Intent intent = new Intent(RepeatActivity.this,BianJiNaoZhongActivity.class);
				startActivity(intent);//start开始 执行Intent意图【跳转】
				break;

			default:
				break;
			}
		}
		
	};
	/**
	 * listview添加数据
	 */
	public void getData() {
		// TODO Auto-generated method stub
		Map<String,Object> map =new HashMap<String,Object>();
		map.put("tv","星期日");
		listData.add(map);
		map =new HashMap<String,Object>();
		map.put("tv","星期一");
		/*map.put("cb", R.drawable.repetition_select);添加图片的方式*/
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
