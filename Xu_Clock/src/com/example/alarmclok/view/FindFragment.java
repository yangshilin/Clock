package com.example.alarmclok.view;

import java.util.ArrayList;
import java.util.List;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.View.OnClickListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.example.adapter.MyAdapterFindNaozhong;
import com.example.adapter.MyAdapterFindLuyin;
import com.example.clock.R;
import com.example.clock.menu.view.MyHorizontalScrollView;



public class FindFragment extends Fragment {

	ImageButton But_zhongxin;//个人中心按钮
	ImageButton But_xinxi;//增加信息按钮
	/**
	 * 广告动画
	 */
	ViewFlipper lunbo;//广告动画
	GestureDetector huadong;//视图点击滑动【手势检测器】
	//LayoutInflater innflater;
	//LinearLayout linearlayout;
	/**
	 * 头视图
	 */
	 View header;
	/**
	 * 添加数据
	 */
	 ImageButton personage;
	 MyHorizontalScrollView mMyHorizontalScrollView;
	RadioGroup radiogroup;
	ListView listNaozhong;
	ListView listLuyin;
	RadioButton BtnNaozhong;
	RadioButton BtnLuyin;
	List<FindSetgetNaozhong> lists1;
	List<FindSetgetLuyin> lists2;
	FindSetgetNaozhong fs1;
	FindSetgetLuyin fs2;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view= inflater.inflate(R.layout.activity_find,container,false);//视图传入布局
		/**
		 * 头视图
		 */
		header = LayoutInflater.from(getActivity()).inflate(
				R.layout.activity_find_headview,null);
		
	
	
		/**
		 * 数据添加listview数据
		 */
		personage=(ImageButton) view.findViewById(R.id.find_gerenzhongxin);
		personage.setOnClickListener(clickListener);
		mMyHorizontalScrollView=(MyHorizontalScrollView) getActivity().findViewById(R.id.mMyHorizontalScrollView);
		listNaozhong = (ListView)view.findViewById(R.id.find_listview_1);
		listNaozhong.addHeaderView(header);//listview添加头视图
		listLuyin = (ListView)view.findViewById(R.id.find_listview_2);
		listLuyin.addHeaderView(header);//切换之后的listview一样添加头视图
		//【Fragment里调用/布局本该应用view[.点]头视图内的则用头视图.点 ——只要是头视图里面的控件都得更改】 
		
		BtnNaozhong = (RadioButton)header.findViewById(R.id.find_radiobutton_naozhong);
		BtnLuyin = (RadioButton)header.findViewById(R.id.find_radiobutton_luyin);
		radiogroup =(RadioGroup)header.findViewById(R.id.find_radiogroup);
		radiogroup.setOnCheckedChangeListener(onCheckedChangeListener);
	
		/**
		 *ViewFlipping动画播放
		 */
		lunbo =(ViewFlipper)header.findViewById(R.id.find_view_flipper);//广告动画  【Fragment里调用/布局本该应用view[.点]头视图内的则用头视图.点】 
		lunbo.startFlipping();//开始轮播
		huadong=new GestureDetector(listener);//手势监听倒包需注意，共有6个方法
		
		getDate();	
		
		return view;
	}
	OnClickListener clickListener=new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.find_gerenzhongxin:
				mMyHorizontalScrollView.openSroll();
				break;

			default:
				break;
			}
		}
	};
	/**
	 * 数据添加listview数据
	 */
	public void getDate() {
		// TODO Auto-generated method stub
		lists1=new ArrayList<FindSetgetNaozhong>();
		FindSetgetNaozhong  fs1 = new FindSetgetNaozhong();
		fs1.setBofang(R.drawable.play);
		fs1.setTitle("演员");
		fs1.setTime("7/3");
		fs1.setUserQuantity("232");
		fs1.setPraiseQuantity("65");
		fs1.setCommentQuantity("21");
		lists1.add(fs1);
		
		 fs1 = new FindSetgetNaozhong();
			fs1.setTitle("吃饭睡觉打豆豆");
			fs1.setTime("6/25");
			fs1.setUserQuantity("42");
			fs1.setPraiseQuantity("65");
			fs1.setCommentQuantity("11");
			lists1.add(fs1);
			
		fs1 = new FindSetgetNaozhong();
			fs1.setTitle("我的未来不是梦");
			fs1.setTime("6/30");
			fs1.setUserQuantity("82");
			fs1.setPraiseQuantity("61");
			fs1.setCommentQuantity("31");
			lists1.add(fs1);
			
			fs1 = new FindSetgetNaozhong();
			fs1.setTitle("十年");
			fs1.setTime("6/30");
			fs1.setUserQuantity("51");
			fs1.setPraiseQuantity("15");
			fs1.setCommentQuantity("23");
			lists1.add(fs1);
			
			fs1 = new FindSetgetNaozhong();
			fs1.setTitle("后来");
			fs1.setTime("6/30");
			fs1.setUserQuantity("54");
			fs1.setPraiseQuantity("12");
			fs1.setCommentQuantity("31");
			lists1.add(fs1);
			
			fs1 = new FindSetgetNaozhong();
			fs1.setTitle("最爱自己");
			fs1.setTime("7/2");
			fs1.setUserQuantity("541");
			fs1.setPraiseQuantity("61");
			fs1.setCommentQuantity("31");
			lists1.add(fs1);

			fs1 = new FindSetgetNaozhong();
			fs1.setTitle("今夜20岁");
			fs1.setTime("6/30");
			fs1.setUserQuantity("54");
			fs1.setPraiseQuantity("12");
			fs1.setCommentQuantity("31");
			lists1.add(fs1);
			
			fs1 = new FindSetgetNaozhong();
			fs1.setTitle("那一天");
			fs1.setTime("7/2");
			fs1.setUserQuantity("541");
			fs1.setPraiseQuantity("61");
			fs1.setCommentQuantity("31");
			lists1.add(fs1);

			fs1 = new FindSetgetNaozhong();
			fs1.setTitle("今夜20岁");
			fs1.setTime("7/2");
			fs1.setUserQuantity("541");
			fs1.setPraiseQuantity("61");
			fs1.setCommentQuantity("31");
			lists1.add(fs1);
			
			fs1 = new FindSetgetNaozhong();
			fs1.setTitle("说不出口");
			fs1.setTime("7/2");
			fs1.setUserQuantity("541");
			fs1.setPraiseQuantity("61");
			fs1.setCommentQuantity("31");
			lists1.add(fs1);
			
			fs1 = new FindSetgetNaozhong();
			fs1.setTitle("寂寞可以");
			fs1.setTime("7/2");
			fs1.setUserQuantity("541");
			fs1.setPraiseQuantity("61");
			fs1.setCommentQuantity("31");
			lists1.add(fs1);
			
			fs1 = new FindSetgetNaozhong();
			fs1.setTitle("说不出口");
			fs1.setTime("7/2");
			fs1.setUserQuantity("541");
			fs1.setPraiseQuantity("61");
			fs1.setCommentQuantity("31");
			lists1.add(fs1);
			
			fs1 = new FindSetgetNaozhong();
			fs1.setTitle("生活不止眼前的苟且");
			fs1.setTime("7/2");
			fs1.setUserQuantity("541");
			fs1.setPraiseQuantity("61");
			fs1.setCommentQuantity("31");
			lists1.add(fs1);
			
			MyAdapterFindNaozhong myAdapter1 = new MyAdapterFindNaozhong(getActivity(),
					R.layout.activity_find_download, lists1);
			listNaozhong.setAdapter(myAdapter1);
			listNaozhong.setOnItemClickListener(onItemClickListener);
}
	private void getDate2() {
		// TODO Auto-generated method stub	
		lists2=new ArrayList<FindSetgetLuyin>();
		for (int i = 0; i < 6; i++) {
		FindSetgetLuyin  fs2 = new FindSetgetLuyin();
		fs2.setTitle("睡觉觉");
		fs2.setTime("6/23");
		fs2.setUserQuantity("32");
		fs2.setPraiseQuantity("65");
		fs2.setCommentQuantity("21");
		lists2.add(fs2);
		
		 fs2 = new FindSetgetLuyin();
			fs2.setTitle("痛苦");
			fs2.setTime("6/25");
			fs2.setUserQuantity("42");
			fs2.setPraiseQuantity("65");
			fs2.setCommentQuantity("11");
			lists2.add(fs2);
	}
		MyAdapterFindLuyin myAdapter2 = new MyAdapterFindLuyin(getActivity(),
				R.layout.activity_find_luyin, lists2);
		listNaozhong.setAdapter(myAdapter2);
		listNaozhong.setOnItemClickListener(onItemClickListener);
}
	OnItemClickListener onItemClickListener = new OnItemClickListener(){

		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			// TODO Auto-generated method stub
			Toast.makeText(getActivity(), "点击的第" + position + "列",
					Toast.LENGTH_SHORT).show();

		}
		
	};
	
	//Radiogroup监听
	OnCheckedChangeListener onCheckedChangeListener = new OnCheckedChangeListener(){
	
		@SuppressWarnings("deprecation")
		@SuppressLint("NewApi")
		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			// TODO Auto-generated method stub
			switch (checkedId) {
			case R.id.find_radiobutton_naozhong:
				BtnNaozhong.setBackgroundDrawable(getResources().getDrawable(
						R.drawable.lingyixuanxiang_naoling));
				BtnLuyin.setBackgroundDrawable(getResources().getDrawable(
						R.drawable.lingyixuanxiang_luyin_null));
				 getDate();
				 listNaozhong.setVisibility(listNaozhong.VISIBLE);
				 listLuyin.setVisibility(listLuyin.GONE);
				break;
			case R.id.find_radiobutton_luyin:
				BtnNaozhong.setBackgroundDrawable(getResources().getDrawable(
						R.drawable.lingyixuanxiang_naoling_null));
				BtnLuyin.setBackgroundDrawable(getResources().getDrawable(
						R.drawable.lingyixuanxiang_luyin));
				 getDate2();
				 listLuyin.setVisibility(listNaozhong.VISIBLE);//切换头视图的方法
				 listLuyin.setVisibility(listLuyin.GONE);
				break;
			default:
				break;
			}
		}
		
	};

	private FragmentManager getSupportFragmentManager() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 广告轮播控制
	 * @return
	 */
	public boolean OnTouchEvent(MotionEvent exent){
		return huadong.onTouchEvent(exent);
		
	}
	//手势点击监听
	OnGestureListener listener =new OnGestureListener(){
		/**
		 * 按下未离开
		 */
		@Override
		public boolean onDown(MotionEvent e) {
			// TODO Auto-generated method stub
			return false;
		}
		/**
		 * 点击还未移动或抬起
		 */
		@Override
		public void onShowPress(MotionEvent e) {
			// TODO Auto-generated method stub
			
		}
		/**
		 * 一次点击事件
		 */
		@Override
		public boolean onSingleTapUp(MotionEvent e) {
			// TODO Auto-generated method stub
			Log.i("MotionEvent","MotionEvent"+e.getX());
			Log.i("MotionEvent","MotionEvent"+e.getY());
			return false;
		}
		/**
		 * 屏幕拖动事件
		 */
		@Override
		public boolean onScroll(MotionEvent e1, MotionEvent e2,
				float distanceX, float distanceY) {
			// TODO Auto-generated method stub
			return false;
		}
		/**
		 * 长按
		 */
		@Override
		public void onLongPress(MotionEvent e) {
			// TODO Auto-generated method stub
			
		}
		/**
		 * 滑动手势
		 */
		@SuppressLint("NewApi")
		@Override
		public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
				float velocityY) {
			// TODO Auto-generated method stub
			Log.i("velocityX", "velocityX" + velocityX);
			Log.i("velocityY", "velocityY" + velocityY);
			Log.i("e1", "e1" + e1);
			Log.i("MotionEvent", "MotionEvent" + e1.getX());
			Log.i("MotionEvent", "MotionEvent" + e1.getY());
			Log.i("e2", "e2" + e2);
			Log.i("MotionEvent", "MotionEvent" + e2.getX());
			Log.i("MotionEvent", "MotionEvent" + e2.getY());
			if(e1.getX()-e2.getX()>20){//判断视图轮播器直接点击是否正在跳转，点击滑动可直接跳转ת
				lunbo.showNext();
			}else if (e2.getX() - e1.getX() >20){
				lunbo.showPrevious();
			}
			
			return true;
		}
	
	};
	
}
