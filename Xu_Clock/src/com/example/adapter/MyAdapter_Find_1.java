package com.example.adapter;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;



import com.example.alarmclok.view.Find_setget_1;
import com.example.clock.R;

public class MyAdapter_Find_1 extends BaseAdapter{
	LayoutInflater inflater;//���������
	Context context;//������
	List<Find_setget_1> lists;
	int id;
	
	public MyAdapter_Find_1(){//�Զ�����޲ι�����
		
	}
	public MyAdapter_Find_1(Context context, int id, List<Find_setget_1> lists){
		this.lists = lists;
		this.context = context;
		this.id = id;
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
			convertView = inflater.inflate(id,null);
		}
		TextView title = (TextView) convertView.findViewById(R.id.find_music_title);
		TextView time = (TextView) convertView.findViewById(R.id.find_music_riqi);
		TextView userQuantity = (TextView) convertView.findViewById(R.id.find_renshu_shuzhi);
		TextView praiseQuantity = (TextView) convertView.findViewById(R.id.find_dianzan_shuzhi);
		TextView commentQuantity = (TextView) convertView.findViewById(R.id.find_dianjicishu_shuzhi);
		
		Find_setget_1 fs1 =lists.get(position);
		
	/*	imageView.setBackgroundDrawable(context.getResources().getDrawable(
				products.getImgedt())); ����д��*/
		title.setText(fs1.getTitle());
		time.setText(fs1.getTitle());
		userQuantity.setText(fs1.getUserQuantity());
		praiseQuantity.setText(fs1.getPraiseQuantity());
		commentQuantity.setText(fs1.getCommentQuantity());
		
		return convertView;
	}

}















