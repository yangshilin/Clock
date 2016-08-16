package com.xuguoli.activity;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.clock.R;
import com.example.clock.menu.view.MyHorizontalScrollView;
import com.xuguoli.adapter.MybaseAdapter;
import com.xuguoli.javaclass.Cricle;

public class Circle extends Fragment {
	ImageView imagesearch;//头视图控件
	TextView search;//头视图控件
	
	View header;//头视图
	ListView listView;
	ImageView personage;
	int[] id = { R.id.lvphoto, R.id.tvname, R.id.phonename, R.id.pull_down,
			R.id.tvsend, R.id.playmusi, R.id.tvtime, R.id.pinglun_numb,
			R.id.impinglun, R.id.lvnumb, R.id.ivlove };
	MybaseAdapter adapter;
	List<Cricle> list;
	MyHorizontalScrollView mMyHorizontalScrollView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	};

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View v = inflater.inflate(R.layout.circle, container, false);
		//头视图的
		header = LayoutInflater.from(getActivity()).inflate(
				R.layout.hearder_view,null);
		imagesearch=(ImageView)header.findViewById(R.id.imagesearch);
		search=(TextView)header.findViewById(R.id.search);
		//头视图的初始化控件
		
		listView = (ListView) v.findViewById(R.id.lvcircle);
		listView.addHeaderView(header);//listView中添加头视图
		personage=(ImageView) v.findViewById(R.id.personage);
		mMyHorizontalScrollView=(MyHorizontalScrollView) getActivity().findViewById(R.id.mMyHorizontalScrollView);
		personage.setOnClickListener(clickListener);
		getData();
		adapter = new MybaseAdapter(getActivity(), R.layout.list_cricle, id,
				list);
		listView.setAdapter(adapter);

		return v;
	}
OnClickListener clickListener=new OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.personage:
			mMyHorizontalScrollView.openSroll();
			break;

		default:
			break;
		}
	}
};
	public void getData() {
		list = new ArrayList<Cricle>();
		Cricle cricle = new Cricle();
		cricle.setIamgeId(R.drawable.head_portrait);
		cricle.setUsename("夏是夏天的夏_");
		cricle.setFromphone("来自iPhone 6");
		cricle.setButton(R.drawable.pull_down);
		cricle.setZuoyong("夏是夏天的夏_分享了一段语音");
		cricle.setPlayer(R.drawable.playmusic);
		cricle.setTime("22:47");
		cricle.setPinglun("31");
		cricle.setMessage(R.drawable.comment);
		cricle.setNumb("20");
		cricle.setColltect(R.drawable.praise);
		list.add(cricle);

		cricle = new Cricle();
		cricle.setIamgeId(R.drawable.head_portrait);
		cricle.setUsename("- 懵懂 .");
		cricle.setFromphone("来自iPhone 6 Plus");
		cricle.setButton(R.drawable.pull_down);
		cricle.setZuoyong("自学者和学生的区别，不在于知识的广度，而在于生命力和自信心的差异。by米兰*昆德拉");
		cricle.setTime("22:47");
		cricle.setPinglun("31");
		cricle.setMessage(R.drawable.comment);
		cricle.setNumb("20");
		cricle.setColltect(R.drawable.praise);
		list.add(cricle);

		cricle = new Cricle();
		cricle.setIamgeId(R.drawable.head_portrait);
		cricle.setUsename("等待戈多");
		cricle.setFromphone("来自iPhone 6 Plus");
		cricle.setButton(R.drawable.pull_down);
		cricle.setZuoyong("等待戈多 分享了一张图片");
		cricle.setPlayer(R.drawable.baoweiluobo);
		cricle.setTime("22:47");
		cricle.setPinglun("31");
		cricle.setMessage(R.drawable.comment);
		cricle.setNumb("20");
		cricle.setColltect(R.drawable.praise);
		list.add(cricle);

		cricle = new Cricle();
		cricle.setIamgeId(R.drawable.head_portrait);
		cricle.setUsename("夏是夏天的夏_");
		cricle.setFromphone("来自iPhone 6");
		cricle.setButton(R.drawable.pull_down);
		cricle.setZuoyong("夏是夏天的夏_分享了一段语音");
		cricle.setPlayer(R.drawable.playmusic);
		cricle.setTime("22:47");
		cricle.setPinglun("31");
		cricle.setMessage(R.drawable.comment);
		cricle.setNumb("20");
		cricle.setColltect(R.drawable.praise);
		list.add(cricle);

		cricle = new Cricle();
		cricle.setIamgeId(R.drawable.head_portrait);
		cricle.setUsename("- 懵懂 .");
		cricle.setFromphone("来自iPhone 6 Plus");
		cricle.setButton(R.drawable.pull_down);
		cricle.setZuoyong("自学者和学生的区别，不在于知识的广度，而在于生命力和自信心的差异。by米兰*昆德拉");
		cricle.setTime("22:47");
		cricle.setPinglun("31");
		cricle.setMessage(R.drawable.comment);
		cricle.setNumb("20");
		cricle.setColltect(R.drawable.praise);
		list.add(cricle);

		cricle = new Cricle();
		cricle.setIamgeId(R.drawable.head_portrait);
		cricle.setUsename("等待戈多");
		cricle.setFromphone("来自iPhone 6 Plus");
		cricle.setButton(R.drawable.pull_down);
		cricle.setZuoyong("等待戈多 分享了一张图片");
		cricle.setPlayer(R.drawable.baoweiluobo);
		cricle.setTime("22:47");
		cricle.setPinglun("31");
		cricle.setMessage(R.drawable.comment);
		cricle.setNumb("20");
		cricle.setColltect(R.drawable.praise);
		list.add(cricle);

		cricle = new Cricle();
		cricle.setIamgeId(R.drawable.head_portrait);
		cricle.setUsename("夏是夏天的夏_");
		cricle.setFromphone("来自iPhone 6");
		cricle.setButton(R.drawable.pull_down);
		cricle.setZuoyong("夏是夏天的夏_分享了一段语音");
		cricle.setPlayer(R.drawable.playmusic);
		cricle.setTime("22:47");
		cricle.setPinglun("31");
		cricle.setMessage(R.drawable.comment);
		cricle.setNumb("20");
		cricle.setColltect(R.drawable.praise);
		list.add(cricle);

		cricle = new Cricle();
		cricle.setIamgeId(R.drawable.head_portrait);
		cricle.setUsename("- 懵懂 .");
		cricle.setFromphone("来自iPhone 6 Plus");
		cricle.setButton(R.drawable.pull_down);
		cricle.setZuoyong("自学者和学生的区别，不在于知识的广度，而在于生命力和自信心的差异。by米兰*昆德拉");
		cricle.setTime("22:47");
		cricle.setPinglun("31");
		cricle.setMessage(R.drawable.comment);
		cricle.setNumb("20");
		cricle.setColltect(R.drawable.praise);
		list.add(cricle);

		cricle = new Cricle();
		cricle.setIamgeId(R.drawable.head_portrait);
		cricle.setUsename("等待戈多");
		cricle.setFromphone("来自iPhone 6 Plus");
		cricle.setButton(R.drawable.pull_down);
		cricle.setZuoyong("等待戈多 分享了一张图片");
		cricle.setPlayer(R.drawable.baoweiluobo);
		cricle.setTime("22:47");
		cricle.setPinglun("31");
		cricle.setMessage(R.drawable.comment);
		cricle.setNumb("20");
		cricle.setColltect(R.drawable.praise);
		list.add(cricle);

		cricle = new Cricle();
		cricle.setIamgeId(R.drawable.head_portrait);
		cricle.setUsename("夏是夏天的夏_");
		cricle.setFromphone("来自iPhone 6");
		cricle.setButton(R.drawable.pull_down);
		cricle.setZuoyong("夏是夏天的夏_分享了一段语音");
		cricle.setPlayer(R.drawable.playmusic);
		cricle.setTime("22:47");
		cricle.setPinglun("31");
		cricle.setMessage(R.drawable.comment);
		cricle.setNumb("20");
		cricle.setColltect(R.drawable.praise);
		list.add(cricle);

		cricle = new Cricle();
		cricle.setIamgeId(R.drawable.head_portrait);
		cricle.setUsename("- 懵懂 .");
		cricle.setFromphone("来自iPhone 6 Plus");
		cricle.setButton(R.drawable.pull_down);
		cricle.setZuoyong("自学者和学生的区别，不在于知识的广度，而在于生命力和自信心的差异。by米兰*昆德拉");
		cricle.setTime("22:47");
		cricle.setPinglun("31");
		cricle.setMessage(R.drawable.comment);
		cricle.setNumb("20");
		cricle.setColltect(R.drawable.praise);
		list.add(cricle);

		cricle = new Cricle();
		cricle.setIamgeId(R.drawable.head_portrait);
		cricle.setUsename("等待戈多");
		cricle.setFromphone("来自iPhone 6 Plus");
		cricle.setButton(R.drawable.pull_down);
		cricle.setZuoyong("等待戈多 分享了一张图片");
		cricle.setPlayer(R.drawable.baoweiluobo);
		cricle.setTime("22:47");
		cricle.setPinglun("31");
		cricle.setMessage(R.drawable.comment);
		cricle.setNumb("20");
		cricle.setColltect(R.drawable.praise);
		list.add(cricle);

	
	}
}
