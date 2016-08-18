package com.example.xuguoliadapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.xuguolijavaclass.Cricle;

public class MybaseAdapter extends BaseAdapter {
	Context context;
	LayoutInflater inflater;

	int item;
	int[] id;
	List<Cricle> list;

	public MybaseAdapter() {
		super();
	}

	public MybaseAdapter(Context context, int item, int[] id, List<Cricle> list) {
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
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		if (convertView == null) {
			convertView = inflater.inflate(item, null);
		}
		ImageView tongxiang = (ImageView) convertView.findViewById(id[0]);
		TextView usename = (TextView) convertView.findViewById(id[1]);
		TextView fromphone = (TextView) convertView.findViewById(id[2]);
		ImageButton button = (ImageButton) convertView.findViewById(id[3]);
		TextView zuoyong = (TextView) convertView.findViewById(id[4]);
		ImageView player = (ImageView) convertView.findViewById(id[5]);
		TextView time = (TextView) convertView.findViewById(id[6]);
		TextView pinglun = (TextView) convertView.findViewById(id[7]);
		ImageView message = (ImageView) convertView.findViewById(id[8]);
		TextView numb = (TextView) convertView.findViewById(id[9]);
		ImageView colltect = (ImageView) convertView.findViewById(id[10]);
		
		Cricle cricle = list.get(position);

		tongxiang.setImageResource(cricle.getIamgeId());
		usename.setText(cricle.getUsename());
		fromphone.setText(cricle.getFromphone());
		button.setImageResource(cricle.getButton());
		zuoyong.setText(cricle.getZuoyong());
		player.setImageResource(cricle.getPlayer());
		time.setText(cricle.getTime());
		pinglun.setText(cricle.getPinglun());
		message.setImageResource(cricle.getMessage());
		numb.setText(cricle.getNumb());
		colltect.setImageResource(cricle.getColltect());
		
		return convertView;
	}

}
