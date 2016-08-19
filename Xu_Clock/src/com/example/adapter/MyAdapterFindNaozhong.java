package com.example.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alarmclok.view.FindSetgetNaozhong;
import com.example.clock.R;

public class MyAdapterFindNaozhong extends BaseAdapter{
	LayoutInflater inflater;//布局填充器
	Context context;//上下文
	List<FindSetgetNaozhong> lists;
	int resourceid;
	
	public MyAdapterFindNaozhong(){//自定义的无参构造器
		
	}
	public MyAdapterFindNaozhong(Context context, int resourceid, List<FindSetgetNaozhong> lists){
		this.lists = lists;
		this.context = context;
		this.resourceid = resourceid;
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
			convertView = inflater.inflate(resourceid,null);
		}
		ImageView bofang =(ImageView)convertView.findViewById(R.id.find_bofang_button);
		TextView title = (TextView) convertView.findViewById(R.id.find_music_title);
		TextView time = (TextView) convertView.findViewById(R.id.find_music_riqi);
		TextView userQuantity = (TextView) convertView.findViewById(R.id.find_renshu_shuzhi);
		TextView praiseQuantity = (TextView) convertView.findViewById(R.id.find_dianzan_shuzhi);
		TextView commentQuantity = (TextView) convertView.findViewById(R.id.find_dianjicishu_shuzhi);
		
		FindSetgetNaozhong fs1 =lists.get(position);
		
		
		/*	imageView.setBackgroundDrawable(context.getResources().getDrawable(
					products.getImgedt())); 背景写法*/
		bofang.setImageResource(fs1.getBofang());
		title.setText(fs1.getTitle());
		time.setText(fs1.getTime());
		userQuantity.setText(fs1.getUserQuantity());
		praiseQuantity.setText(fs1.getPraiseQuantity());
		commentQuantity.setText(fs1.getCommentQuantity());
		
		return convertView;
	}

}















