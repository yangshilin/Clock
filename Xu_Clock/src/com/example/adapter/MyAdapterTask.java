package com.example.adapter;

import java.util.List;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.alarmclok.view.Task_setget;

public class MyAdapter_Task extends BaseAdapter{
	Context context;//上下文
	LayoutInflater inflater;//布局填充器
	int item;
	int[] id;//id数组
	List<Task_setget> lists;//列表集合Task_setget封装类
	
	
	public MyAdapter_Task() {//无参构造器
		// TODO Auto-generated constructor stub
		super();
	}
	
	public MyAdapter_Task(Context context, int item, int[] id, List<Task_setget> lists){
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
		return lists.size();//返回列表长度
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
		if(convertView ==null){
			convertView = inflater.inflate(item, null);
		}
		ImageView beijing = (ImageView)convertView.findViewById(id[0]);//此处的下标为0开始递增，不能写错
		ImageButton bofang = (ImageButton)convertView.findViewById(id[1]);
		TextView title = (TextView)convertView.findViewById(id[2]);
		TextView nandu = (TextView)convertView.findViewById(id[3]);
		ImageView xingji = (ImageView)convertView.findViewById(id[4]);
		ImageButton xuanzhe = (ImageButton)convertView.findViewById(id[5]);
		
		Task_setget ts =lists.get(position);//将类型传给lists列表数组中 设置position
		
		beijing.setImageResource(ts.getBeijing());
		bofang.setImageResource(ts.getBofang());//列表中声明的对象设置图片资源，【列表的对象定义设置类型】
		title.setText(ts.getTitle());
		nandu.setText(ts.getNandu());
		xingji.setImageResource(ts.getXingji());
		xuanzhe.setImageResource(ts.getXuanzhe());
		
		return convertView;
	}	
}	
	
