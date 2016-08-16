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

import com.example.clock.R;
import com.example.clock.menu.view.MyHorizontalScrollView;
import com.xuguoli.adapter.MybaseAdapter;
import com.xuguoli.javaclass.Cricle;

public class Circle extends Fragment {
	ListView listView;
	ImageView personage;
	int[] id = { R.id.lvphoto, R.id.tvname, R.id.phonename, R.id.pull_down,
			R.id.tvsend, R.id.playmusi, R.id.tvtime, R.id.pinglun_numb,
			R.id.impinglun, R.id.lvnumb, R.id.ivlove };
	MybaseAdapter adapter;
	List<Cricle> list;
	MyHorizontalScrollView mMyHorizontalScrollView;

	@Override
	/*
	 * //protected void onCreate(Bundle savedInstanceState) { // TODO
	 * Auto-generated method stub super.onCreate(savedInstanceState);
	 * setContentView(R.layout.circle);
	 * listView=(ListView)findViewById(R.id.lvcircle);
	 * 
	 * getData();
	 * 
	 * adapter=new MybaseAdapter(Circle.this, R.layout.list_cricle, id, list);
	 * listView.setAdapter(adapter); }
	 */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	};

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View v = inflater.inflate(R.layout.circle, container, false);
		listView = (ListView) v.findViewById(R.id.lvcircle);
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
		cricle.setIamgeId(R.drawable.playmusic);
		cricle.setUsename("夏是夏天的夏_");
		cricle.setFromphone("来自iPhone 6");
		cricle.setButton(R.drawable.pull_down);
		cricle.setZuoyong("夏是夏天的夏_分享了一段语音");
		cricle.setButton(R.drawable.playmusic);
		cricle.setTime("22:47");
		cricle.setPinglun("31");
		cricle.setMessage(R.drawable.comment);
		cricle.setNumb("20");
		cricle.setColltect(R.drawable.praise);
		list.add(cricle);

		cricle = new Cricle();
		cricle.setIamgeId(R.drawable.playmusic);
		cricle.setUsename("夏是夏天的夏_");
		cricle.setFromphone("来自iPhone 6");
		cricle.setButton(R.drawable.pull_down);
		cricle.setZuoyong("夏是夏天的夏_分享了一段语音");
		cricle.setButton(R.drawable.playmusic);
		cricle.setTime("22:47");
		cricle.setPinglun("31");
		cricle.setMessage(R.drawable.comment);
		cricle.setNumb("20");
		cricle.setColltect(R.drawable.praise);
		list.add(cricle);
		cricle = new Cricle();
		cricle.setIamgeId(R.drawable.playmusic);
		cricle.setUsename("夏是夏天的夏_");
		cricle.setFromphone("来自iPhone 6");
		cricle.setButton(R.drawable.pull_down);
		cricle.setZuoyong("夏是夏天的夏_分享了一段语音");
		cricle.setButton(R.drawable.playmusic);
		cricle.setTime("22:47");
		cricle.setPinglun("31");
		cricle.setMessage(R.drawable.comment);
		cricle.setNumb("20");
		cricle.setColltect(R.drawable.praise);
		list.add(cricle);
		cricle = new Cricle();
		cricle.setIamgeId(R.drawable.playmusic);
		cricle.setUsename("夏是夏天的夏_");
		cricle.setFromphone("来自iPhone 6");
		cricle.setButton(R.drawable.pull_down);
		cricle.setZuoyong("夏是夏天的夏_分享了一段语音");
		cricle.setButton(R.drawable.playmusic);
		cricle.setTime("22:47");
		cricle.setPinglun("31");
		cricle.setMessage(R.drawable.comment);
		cricle.setNumb("20");
		cricle.setColltect(R.drawable.praise);
		list.add(cricle);
		cricle = new Cricle();
		cricle.setIamgeId(R.drawable.playmusic);
		cricle.setUsename("夏是夏天的夏_");
		cricle.setFromphone("来自iPhone 6");
		cricle.setButton(R.drawable.pull_down);
		cricle.setZuoyong("夏是夏天的夏_分享了一段语音");
		cricle.setButton(R.drawable.playmusic);
		cricle.setTime("22:47");
		cricle.setPinglun("31");
		cricle.setMessage(R.drawable.comment);
		cricle.setNumb("20");
		cricle.setColltect(R.drawable.praise);
		list.add(cricle);
		cricle = new Cricle();
		cricle.setIamgeId(R.drawable.playmusic);
		cricle.setUsename("夏是夏天的夏_");
		cricle.setFromphone("来自iPhone 6");
		cricle.setButton(R.drawable.pull_down);
		cricle.setZuoyong("夏是夏天的夏_分享了一段语音");
		cricle.setButton(R.drawable.playmusic);
		cricle.setTime("22:47");
		cricle.setPinglun("31");
		cricle.setMessage(R.drawable.comment);
		cricle.setNumb("20");
		cricle.setColltect(R.drawable.praise);
		list.add(cricle);
		cricle = new Cricle();
		cricle.setIamgeId(R.drawable.playmusic);
		cricle.setUsename("夏是夏天的夏_");
		cricle.setFromphone("来自iPhone 6");
		cricle.setButton(R.drawable.pull_down);
		cricle.setZuoyong("夏是夏天的夏_分享了一段语音");
		cricle.setButton(R.drawable.playmusic);
		cricle.setTime("22:47");
		cricle.setPinglun("31");
		cricle.setMessage(R.drawable.comment);
		cricle.setNumb("20");
		cricle.setColltect(R.drawable.praise);
		list.add(cricle);
		cricle = new Cricle();
		cricle.setIamgeId(R.drawable.playmusic);
		cricle.setUsename("夏是夏天的夏_");
		cricle.setFromphone("来自iPhone 6");
		cricle.setButton(R.drawable.pull_down);
		cricle.setZuoyong("夏是夏天的夏_分享了一段语音");
		cricle.setButton(R.drawable.playmusic);
		cricle.setTime("22:47");
		cricle.setPinglun("31");
		cricle.setMessage(R.drawable.comment);
		cricle.setNumb("20");
		cricle.setColltect(R.drawable.praise);
		list.add(cricle);
		cricle = new Cricle();
		cricle.setIamgeId(R.drawable.playmusic);
		cricle.setUsename("夏是夏天的夏_");
		cricle.setFromphone("来自iPhone 6");
		cricle.setButton(R.drawable.pull_down);
		cricle.setZuoyong("夏是夏天的夏_分享了一段语音");
		cricle.setButton(R.drawable.playmusic);
		cricle.setTime("22:47");
		cricle.setPinglun("31");
		cricle.setMessage(R.drawable.comment);
		cricle.setNumb("20");
		cricle.setColltect(R.drawable.praise);
		list.add(cricle);
		cricle = new Cricle();
		cricle.setIamgeId(R.drawable.playmusic);
		cricle.setUsename("夏是夏天的夏_");
		cricle.setFromphone("来自iPhone 6");
		cricle.setButton(R.drawable.pull_down);
		cricle.setZuoyong("夏是夏天的夏_分享了一段语音");
		cricle.setButton(R.drawable.playmusic);
		cricle.setTime("22:47");
		cricle.setPinglun("31");
		cricle.setMessage(R.drawable.comment);
		cricle.setNumb("20");
		cricle.setColltect(R.drawable.praise);
		list.add(cricle);
		cricle = new Cricle();
		cricle.setIamgeId(R.drawable.playmusic);
		cricle.setUsename("夏是夏天的夏_");
		cricle.setFromphone("来自iPhone 6");
		cricle.setButton(R.drawable.pull_down);
		cricle.setZuoyong("夏是夏天的夏_分享了一段语音");
		cricle.setButton(R.drawable.playmusic);
		cricle.setTime("22:47");
		cricle.setPinglun("31");
		cricle.setMessage(R.drawable.comment);
		cricle.setNumb("20");
		cricle.setColltect(R.drawable.praise);
		list.add(cricle);

	}
}
