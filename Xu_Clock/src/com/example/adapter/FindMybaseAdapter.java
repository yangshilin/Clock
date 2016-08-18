package com.example.adapter;

import java.util.List;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.alarmclok.view.Parameter;

<<<<<<< HEAD:Xu_Clock/src/com/example/adapter/Find_MybaseAdapter.java
public class Find_MybaseAdapter extends BaseAdapter{	
	Context context;//������
	LayoutInflater inflater;//���������
	int item;
	int[] id;//id����
	List<Parameter> list;//�б���parameter��װ��
	
	
	public Find_MybaseAdapter(){//�޲ι�����
=======
public class FindMybaseAdapter extends BaseAdapter{	
	Context context;//上下文
	LayoutInflater inflater;//布局填充器
	int item;
	int[] id;//id数组
	List<Parameter> list;//列表集合parameter封装类
	
	
	public FindMybaseAdapter(){//无参构造器
>>>>>>> c7a7a8c03148cf0b0423dc02de651c730ceb7e56:Xu_Clock/src/com/example/adapter/FindMybaseAdapter.java
		super();
=======
public class FindMybaseAdapter extends BaseAdapter {
	Context context;// 上下文
	LayoutInflater inflater;// 布局填充器
	int item;
	int[] id;// id数组
	List<Parameter> list;// 列表集合parameter封装类

	public FindMybaseAdapter() {// 无参构造器
>>>>>>> origin/feature/ysl
	}
	
	public FindMybaseAdapter(Context context,int item, int[] id, List<Parameter> list){

	public FindMybaseAdapter(Context context, int item, int[] id,
			List<Parameter> list) {
		super();
		this.context = context;
		this.item = item;
		this.id = id;
		this.list = list;
		inflater = LayoutInflater.from(context);
		

	}
	
	

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@SuppressLint("NewApi")
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		if (convertView == null) {
			convertView = inflater.inflate(item, null);
		}
		ImageButton playmusic = (ImageButton) convertView.findViewById(id[0]);
		TextView title = (TextView) convertView.findViewById(id[1]);
		TextView time = (TextView) convertView.findViewById(id[2]);
		ImageButton user = (ImageButton) convertView.findViewById(id[3]);
		TextView userQuantity = (TextView) convertView.findViewById(id[4]);
		ImageButton praise = (ImageButton) convertView.findViewById(id[5]);
		TextView praiseQuantity = (TextView) convertView.findViewById(id[6]);
		ImageButton comment = (ImageButton) convertView.findViewById(id[7]);
		TextView commentQuantity = (TextView) convertView.findViewById(id[8]);
		Button download = (Button) convertView.findViewById(id[9]);

		Parameter parameter = list.get(position);

		playmusic.setImageResource(parameter.getPlaymusic());
		title.setText(parameter.getTitle());
		time.setText(parameter.getTime());
		user.setImageResource(parameter.getUser());
		userQuantity.setText(parameter.getUserQuantity());
		praise.setImageResource(parameter.getPraise());
		praiseQuantity.setText(parameter.getPraiseQuantity());
		comment.setImageResource(parameter.getComment());
		commentQuantity.setText(parameter.getCommentQuantity());
		download.setBottom(parameter.getDownload());
		
		return convertView;
	}
}








