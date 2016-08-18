package com.example.adapter;

import java.util.List;


import com.example.alarmclok.view.FindSetgetLuyin;
import com.example.clock.R;

>>>>>>> 76a9568c72b1ce61c7c0ae0b676edcec1992f61b

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.alarmclok.view.FindSetgetLuyin;
import com.example.clock.R;


public class MyAdapterFindLuyin extends BaseAdapter{
	LayoutInflater inflater;//布局填充器
	Context context;//上下文
	List<FindSetgetLuyin> lists;
	int resourceId;
	
	public MyAdapterFindLuyin(){//自定义的无参构造器
		
	}
	public MyAdapterFindLuyin(Context context, int resourceId, List<FindSetgetLuyin> lists){
		this.lists = lists;
		this.context = context;
		this.resourceId = resourceId;
		inflater = LayoutInflater.from(context);
	}
	
	
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return lists.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return lists.get( position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		if(convertView == null){
			convertView = inflater.inflate(resourceId,null);
		}
		TextView title = (TextView) convertView.findViewById(R.id.find_music_title);
		TextView time = (TextView) convertView.findViewById(R.id.find_music_riqi);
		TextView userQuantity = (TextView) convertView.findViewById(R.id.find_renshu_shuzhi);
		TextView praiseQuantity = (TextView) convertView.findViewById(R.id.find_dianzan_shuzhi);
		TextView commentQuantity = (TextView) convertView.findViewById(R.id.find_dianjicishu_shuzhi);
		
		FindSetgetLuyin fs2 =lists.get(position);
		
		/*	imageView.setBackgroundDrawable(context.getResources().getDrawable(
		products.getImgedt())); 背景写法*/
		title.setText(fs2.getTitle());
		time.setText(fs2.getTime());
		userQuantity.setText(fs2.getUserQuantity());
		praiseQuantity.setText(fs2.getPraiseQuantity());
		commentQuantity.setText(fs2.getCommentQuantity());
		
		return convertView;
	}

}
