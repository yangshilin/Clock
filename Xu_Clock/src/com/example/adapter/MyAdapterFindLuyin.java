package com.example.adapter;

import java.util.List;

<<<<<<< HEAD
import com.example.alarmclok.view.FindSetgetLuyin;
import com.example.clock.R;

=======
>>>>>>> 76a9568c72b1ce61c7c0ae0b676edcec1992f61b
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

<<<<<<< HEAD
=======
import com.example.alarmclok.view.FindSetgetLuyin;
import com.example.clock.R;

>>>>>>> 76a9568c72b1ce61c7c0ae0b676edcec1992f61b
public class MyAdapterFindLuyin extends BaseAdapter{
	LayoutInflater inflater;//���������
	Context context;//������
	List<FindSetgetLuyin> lists;
	int id;
	
	public MyAdapterFindLuyin(){//�Զ�����޲ι�����
		
	}
	public MyAdapterFindLuyin(Context context, int id, List<FindSetgetLuyin> lists){
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
		
		FindSetgetLuyin fs2 =lists.get(position);
		
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
