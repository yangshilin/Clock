package com.example.alarm.listview;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.adapter.MyAdapterTask;
import com.example.alarmclock.BianJiNaoZhongActivity;
import com.example.alarmclok.view.TaskSetget;
import com.example.clock.MainActivity2;
import com.example.clock.R;


public class TaskActivity extends Activity{
	/**
	 * listview添加数据
	 */
	ListView listview;
	int [] id ={R.id.task_shuju_beijing,R.id.task_shiping_button,R.id.task_shiping_title,R.id.task_textview_dengji,
			R.id.task_xingji_one,R.id.task_xingji_two,R.id.task_xingji_three,R.id.task_xingji_four,R.id.task_xingji_five,
			R.id.task_xianche_shouchang};//id数组
	MyAdapterTask adapter;//BaseAdapter 【自定义类】
	List<TaskSetget> lists;//列表集合对象
	/**
	 * 跳转页面
	 */
	ImageButton btn;
	/**
	 * 选择任务按钮
	 */
	//ImageButton taskButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);//取消运行时的顶部标题
		setContentView(R.layout.activity_task_listview);
		/**
		 * listview添加数据
		 */
		listview = (ListView)findViewById(R.id.task_listview);
		getData();//获得Data数据【方法】
									//此上下文只能用Activity类型，不能用Fragment. 布局则是需要添加进listview的布局
		adapter =new MyAdapterTask(TaskActivity.this,R.layout.activity_task_parameter, id, lists);
		listview.setAdapter(adapter);//列表视图设置适配

		/**
		 * 跳转页面
		 * 需要在 AndroidManifest.xml 加标签
		 *  <!-- 新增其他Activity页面 -->
         * <activity android:name="com.example.alarmclok.view.Cheshi_tiaozhuan" />
		 */
		btn = (ImageButton)findViewById(R.id.task_fanhui_button);
		btn.setOnClickListener(listener);
		/**
		 * 任务选择按钮
		 */
		//taskButton = (ImageButton)findViewById(R.id.task_xianche_shouchang);
		//taskButton.setOnClickListener(taskxuanze);
	}
	/**
	 * 任务选择
	 */
	/*OnClickListener taskxuanze = new OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
		//没写完
		}
		
	};*/
	
	/**
	 * 页面跳转
	 */
	OnClickListener listener = new OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.task_fanhui_button://idz执行         //当前上下文//跳转指定的界面
				Intent intent = new Intent(TaskActivity.this,BianJiNaoZhongActivity.class);
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
		lists = new ArrayList<TaskSetget>();
		TaskSetget ts = new TaskSetget();
		
		ts.setBeijing(R.drawable.pingjingdeyuzhou);
		ts.setBofang(R.drawable.play_not);
		ts.setTitle("平静的宇宙");
		ts.setNandu("难度：");
		ts.setXingjione(R.drawable.star_two);
		ts.setXingjitwo(R.drawable.star_not_two);
		ts.setXingjithree(R.drawable.star_not_two);
		ts.setXingjifour(R.drawable.star_not_two);
		ts.setXingjifive(R.drawable.star_not_two);
		ts.setXuanzhe(R.drawable.select);
		lists.add(ts);//列表添加数据对象
		
		
		 ts = new TaskSetget();
		ts.setBeijing(R.drawable.xingjiqibin);
		ts.setBofang(R.drawable.play_not);
		ts.setTitle("星际骑兵");
		ts.setNandu("难度：");
		ts.setXingjione(R.drawable.star_two);
		ts.setXingjitwo(R.drawable.star_two);
		ts.setXingjithree(R.drawable.star_two);
		ts.setXingjifour(R.drawable.star_two);
		ts.setXingjifive(R.drawable.star_two);
		lists.add(ts);//列表添加数据对象
		
			ts = new TaskSetget();
		ts.setBeijing(R.drawable.yuhangyuandeweixiao);
		ts.setBofang(R.drawable.play_not);
		ts.setTitle("宇航员的微笑");
		ts.setNandu("难度：");
		ts.setXingjione(R.drawable.star_two);
		ts.setXingjitwo(R.drawable.star_two);
		ts.setXingjithree(R.drawable.star_two);
		ts.setXingjifour(R.drawable.star_two);
		ts.setXingjifive(R.drawable.star_two);
		lists.add(ts);//列表添加数据对象
		
		 ts = new TaskSetget();
		ts.setBeijing(R.drawable.baoweiluobo);
		ts.setBofang(R.drawable.play_not);
		ts.setTitle("保卫萝卜");
		ts.setNandu("难度：");
		ts.setXingjione(R.drawable.star_two);
		ts.setXingjitwo(R.drawable.star_two);
		ts.setXingjithree(R.drawable.star_two);
		ts.setXingjifour(R.drawable.star_not_two);
		ts.setXingjifive(R.drawable.star_not_two);
		lists.add(ts);//列表添加数据对象
	}

}
