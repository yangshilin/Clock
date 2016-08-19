package com.example.adapter;

import java.util.List;

import android.content.Context;
import android.opengl.Visibility;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alarmclok.view.TaskSetget;

public class MyAdapterTask extends BaseAdapter {
	Context context;// 上下文
	LayoutInflater inflater;// 上下文
	int item;
	int[] id;// id数组
	List<TaskSetget> lists;// 列表集合Task_setget封装类

	public MyAdapterTask() {// 无参构造器
		// TODO Auto-generated constructor stub
		super();
	}

	public MyAdapterTask(Context context, int item, int[] id,
			List<TaskSetget> lists) {
		super();
		this.context = context;
		this.id = id;
		this.item = item;
		this.lists = lists;
		inflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return lists.size();// 返回列表长度
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return lists.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		//if (posiotion =0)
		if (convertView == null) {
			convertView = inflater.inflate(item, null);
			
		}
		ImageView beijing = (ImageView) convertView.findViewById(id[0]);// 此处的下标为0开始递增，不能写错
		ImageButton bofang = (ImageButton) convertView.findViewById(id[1]);
		TextView title = (TextView) convertView.findViewById(id[2]);
		TextView nandu = (TextView) convertView.findViewById(id[3]);
		ImageView xingjione = (ImageView) convertView.findViewById(id[4]);
		ImageView xingjitwo = (ImageView) convertView.findViewById(id[5]);
		ImageView xingjithree = (ImageView) convertView.findViewById(id[6]);
		ImageView xingjifour = (ImageView) convertView.findViewById(id[7]);
		ImageView xingjifive = (ImageView) convertView.findViewById(id[8]);
		ImageButton xuanzhe = (ImageButton) convertView.findViewById(id[9]);

		TaskSetget ts = lists.get(position);// 将类型传给lists列表数组中 设置position

		beijing.setImageResource(ts.getBeijing());
		bofang.setImageResource(ts.getBofang());// 列表中声明的对象设置图片资源，【列表的对象定义设置类型】
		title.setText(ts.getTitle());
		nandu.setText(ts.getNandu());
		xingjione.setImageResource(ts.getXingjione());
		xingjitwo.setImageResource(ts.getXingjitwo());
		xingjithree.setImageResource(ts.getXingjithree());
		xingjifour.setImageResource(ts.getXingjifour());
		xingjifive.setImageResource(ts.getXingjifive());
		xuanzhe.setImageResource(ts.getXuanzhe());
		
		convertView.setOnClickListener(clickListener);

		return convertView;
		
	}

	OnClickListener clickListener = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			ImageButton xuanzhe = (ImageButton) v.findViewById(id[9]);
			if (xuanzhe.VISIBLE == 0) {
				xuanzhe.setVisibility(View.INVISIBLE);//隐藏
			} else {
				xuanzhe.setVisibility(View.VISIBLE);
			}             
			
		}

	};
}
