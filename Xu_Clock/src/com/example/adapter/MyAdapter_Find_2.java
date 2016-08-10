package com.example.adapter;

import java.util.List;

import com.example.alarmclok.view.Find_setget_2;
import com.example.clock.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyAdapter_Find_2 extends BaseAdapter{
	LayoutInflater inflater;//���������
	Context context;//������
	List<Find_setget_2> lists;
	int id;
	
	public MyAdapter_Find_2(){//�Զ�����޲ι�����
		
	}
	public MyAdapter_Find_2(Context context, int id, List<Find_setget_2> lists){
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
		
		Find_setget_2 fs2 =lists.get(position);
		
	/*	imageView.setBackgroundDrawable(context.getResources().getDrawable(
				products.getImgedt())); ����д��*/
		title.setText(fs2.getTitle());
		time.setText(fs2.getTitle());
		userQuantity.setText(fs2.getUserQuantity());
		praiseQuantity.setText(fs2.getPraiseQuantity());
		commentQuantity.setText(fs2.getCommentQuantity());
		
		return convertView;
	}

}
