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

public class MyAdapterTask extends BaseAdapter{
	Context context;//������
	LayoutInflater inflater;//���������
	int item;
	int[] id;//id����
	List<TaskSetget> lists;//�б���Task_setget��װ��
	
	
	public MyAdapterTask() {//�޲ι�����
		// TODO Auto-generated constructor stub
		super();
	}
	
	public MyAdapterTask(Context context, int item, int[] id, List<TaskSetget> lists){
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
		return lists.size();//�����б���
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
		ImageView beijing = (ImageView)convertView.findViewById(id[0]);//�˴����±�Ϊ0��ʼ����������д��
		ImageButton bofang = (ImageButton)convertView.findViewById(id[1]);
		TextView title = (TextView)convertView.findViewById(id[2]);
		TextView nandu = (TextView)convertView.findViewById(id[3]);
		ImageView xingji = (ImageView)convertView.findViewById(id[4]);
		ImageButton xuanzhe = (ImageButton)convertView.findViewById(id[5]);
		
		TaskSetget ts =lists.get(position);//�����ʹ���lists�б������� ����position
		
		beijing.setImageResource(ts.getBeijing());
		bofang.setImageResource(ts.getBofang());//�б��������Ķ�������ͼƬ��Դ�����б�Ķ������������͡�
		title.setText(ts.getTitle());
		nandu.setText(ts.getNandu());
		xingji.setImageResource(ts.getXingji());
		xuanzhe.setImageResource(ts.getXuanzhe());
		
		return convertView;
	}	
}	
	
