package com.example.alarm.listview;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.adapter.MyAdapterTask;
import com.example.alarmclok.view.TaskSetget;
import com.example.clock.MainActivity2;
import com.example.clock.R;

public class TaskActivity extends Activity{
	/**
	 * listview�������
	 */
	ListView listview;
	int [] id ={R.id.task_shuju_beijing,R.id.task_shiping_button,R.id.task_shiping_title,R.id.task_textview_dengji,
			R.id.task_xingji,R.id.task_xianche_shouchang};//id����
	MyAdapterTask adapter;//BaseAdapter ���Զ����ࡿ
	List<TaskSetget> lists;//�б��϶���
	/**
	 * ��תҳ��
	 */
	ImageButton btn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_task_1);
		/**
		 * listview�������
		 */
		listview = (ListView)findViewById(R.id.task_listview);
		getData();//���Data���ݡ�������
									//��������ֻ����Activity���ͣ�������Fragment. ����������Ҫ��ӽ�listview�Ĳ���
<<<<<<< HEAD
		
		adapter =new MyAdapterTask(TaskActivity.this,R.layout.activity_task_2,id,lists);
=======
		adapter =new MyAdapterTask(TaskActivity.this,R.layout.activity_task_2, id, lists);
>>>>>>> 76a9568c72b1ce61c7c0ae0b676edcec1992f61b
		listview.setAdapter(adapter);//�б���ͼ����������
		/**
		 * ��תҳ��
		 * ��Ҫ�� AndroidManifest.xml �ӱ�ǩ
		 *  <!-- ��������Activityҳ�� -->
         * <activity android:name="com.example.alarmclok.view.Cheshi_tiaozhuan" />
		 */
		btn = (ImageButton)findViewById(R.id.task_fanhui_button);
		btn.setOnClickListener(listener);
	}
	
	OnClickListener listener = new OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.task_fanhui_button://idzִ��         //��ǰ������//��תָ���Ľ���
				Intent intent = new Intent(TaskActivity.this,MainActivity2.class);
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
		lists = new ArrayList<TaskSetget>();
		TaskSetget ts = new TaskSetget();
		
		ts.setBeijing(R.drawable.pingjingdeyuzhou);
		ts.setBofang(R.drawable.play_not);
		ts.setTitle("ƽ��������");
		ts.setNandu("�Ѷ�");
		ts.setXingji(R.drawable.xingxing_dengji_1);
		ts.setXuanzhe(R.drawable.select);
		lists.add(ts);//�б�������ݶ���
		
		
		 ts = new TaskSetget();
		ts.setBeijing(R.drawable.xingjiqibin);
		ts.setBofang(R.drawable.play_not);
		ts.setTitle("�Ǽ����");
		ts.setNandu("�Ѷ�");
		ts.setXingji(R.drawable.xingxing_dengji_5);
		
		lists.add(ts);//�б�������ݶ���
		
			ts = new TaskSetget();
		ts.setBeijing(R.drawable.yuhangyuandeweixiao);
		ts.setBofang(R.drawable.play_not);
		ts.setTitle("�Ա��΢Ц");
		ts.setNandu("�Ѷ�");
		ts.setXingji(R.drawable.xingxing_dengji_5);
		
		lists.add(ts);//�б�������ݶ���
		
		 ts = new TaskSetget();
		ts.setBeijing(R.drawable.baoweiluobo);
		ts.setBofang(R.drawable.play_not);
		ts.setTitle("�����ܲ�");
		ts.setNandu("�Ѷ�");
		ts.setXingji(R.drawable.xingxing_dengji_1);
		
		lists.add(ts);//�б�������ݶ���
	}

}
