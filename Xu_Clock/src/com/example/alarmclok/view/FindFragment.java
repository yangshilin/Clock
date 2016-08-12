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

import com.example.adapter.MyAdapter_Find_1;
import com.example.adapter.MyAdapter_Find_2;
import com.example.clock.R;



public class FindFragment extends Fragment {

	ImageButton imageButton1;//�������İ�ť
	ImageButton imageButton2;//������Ϣ��ť
	ViewFlipper lunbo;//��涯��
	GestureDetector huadong;//��ͼ������������Ƽ������
	LayoutInflater innflater;
	LinearLayout linearlayout;
	//Judge_Linyin jl;
	//View vw;//������Ҫ�����������ͼ���˴���������ʾlistview����
	RadioGroup radiogroup;
	//RadioButton naozhong;
	//RadioButton luyin;
	
	ListView listview1;
	ListView listview2;
	RadioButton radioBtn1;
	RadioButton radioBtn2;
	List<Find_setget_1> lists1;
	List<Find_setget_2> lists2;
	Find_setget_1 fs1;
	Find_setget_2 fs2;
	MyAdapter_Find_1 adapter;
	MyAdapter_Find_2 adapter2;
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view= inflater.inflate(R.layout.activity_find_1,container,false);//��ͼ���벼��
		//imageButton1=(ImageButton)view.findViewById(R.id.find_gerenzhongxin);//���������View�����ҿؼ�id
		//imageButton2=(ImageButton)view.findViewById(R.id.find_tianjia);
		/**
		 *ViewFlipping��������
		 */
		lunbo =(ViewFlipper)view.findViewById(R.id.find_view_flipper);//��涯��
		lunbo.startFlipping();//��ʼ�ֲ�
		huadong=new GestureDetector(listener);//���Ƽ���������ע�⣬����6������

		listview1 = (ListView)view.findViewById(R.id.find_listview_1);
		listview2 = (ListView)view.findViewById(R.id.find_listview_2);
		radiogroup =(RadioGroup)view.findViewById(R.id.find_radiogroup);
		radioBtn1 = (RadioButton)view.findViewById(R.id.find_radiobutton_naozhong);
		radioBtn2 = (RadioButton)view.findViewById(R.id.find_radiobutton_luyin);
		radiogroup.setOnCheckedChangeListener(onCheckedChangeListener);
		getDate();	
		return view;
	}
	/**
	 * �������listview����
	 */
	public void getDate() {
		// TODO Auto-generated method stub
		lists1=new ArrayList<Find_setget_1>();
		Find_setget_1  fs1 = new Find_setget_1();
		fs1.setTitle("��Ա");
		fs1.setTime("6/23");
		fs1.setUserQuantity("32");
		fs1.setPraiseQuantity("65");
		fs1.setCommentQuantity("21");
		lists1.add(fs1);
		
		 fs1 = new Find_setget_1();
			fs1.setTitle("�Է�˯���򶹶�");
			fs1.setTime("6/25");
			fs1.setUserQuantity("42");
			fs1.setPraiseQuantity("65");
			fs1.setCommentQuantity("11");
			lists1.add(fs1);
			
		fs1 = new Find_setget_1();
			fs1.setTitle("�ҵ�δ��������");
			fs1.setTime("6/30");
			fs1.setUserQuantity("82");
			fs1.setPraiseQuantity("61");
			fs1.setCommentQuantity("31");
			lists1.add(fs1);
			
			fs1 = new Find_setget_1();
			fs1.setTitle("ʮ��");
			fs1.setTime("6/30");
			fs1.setUserQuantity("51");
			fs1.setPraiseQuantity("15");
			fs1.setCommentQuantity("23");
			lists1.add(fs1);
			
			fs1 = new Find_setget_1();
			fs1.setTitle("����");
			fs1.setTime("6/30");
			fs1.setUserQuantity("54");
			fs1.setPraiseQuantity("12");
			fs1.setCommentQuantity("31");
			lists1.add(fs1);
			
			fs1 = new Find_setget_1();
			fs1.setTitle("��Լ�");
			fs1.setTime("7/2");
			fs1.setUserQuantity("541");
			fs1.setPraiseQuantity("61");
			fs1.setCommentQuantity("31");
			lists1.add(fs1);

			MyAdapter_Find_1 myAdapter1 = new MyAdapter_Find_1(getActivity(),
					R.layout.activity_find_1_1, lists1);
			listview1.setAdapter(myAdapter1);
			listview1.setOnItemClickListener(onItemClickListener);
}
	private void getDate2() {
		// TODO Auto-generated method stub	
		lists2=new ArrayList<Find_setget_2>();
		for (int i = 0; i < 5; i++) {
		Find_setget_2  fs2 = new Find_setget_2();
		fs2.setTitle("˯����");
		fs2.setTime("6/23");
		fs2.setUserQuantity("32");
		fs2.setPraiseQuantity("65");
		fs2.setCommentQuantity("21");
		lists2.add(fs2);
		
		 fs2 = new Find_setget_2();
			fs2.setTitle("ʹ��");
			fs2.setTime("6/25");
			fs2.setUserQuantity("42");
			fs2.setPraiseQuantity("65");
			fs2.setCommentQuantity("11");
			lists2.add(fs2);
	}
		MyAdapter_Find_2 myAdapter2 = new MyAdapter_Find_2(getActivity(),
				R.layout.activity_find_1_2, lists2);
		listview1.setAdapter(myAdapter2);
		listview1.setOnItemClickListener(onItemClickListener);
}
	OnItemClickListener onItemClickListener = new OnItemClickListener(){

		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			// TODO Auto-generated method stub
			Toast.makeText(getActivity(), "����ĵ�" + position + "��",
					Toast.LENGTH_SHORT).show();

		}
		
	};
	
	//Radiogroup����
	OnCheckedChangeListener onCheckedChangeListener = new OnCheckedChangeListener(){

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			// TODO Auto-generated method stub
			switch (checkedId) {
			case R.id.find_radiobutton_naozhong:
				radioBtn1.setBackgroundDrawable(getResources().getDrawable(
						R.drawable.lingyixuanxiang_naoling));
				radioBtn2.setBackgroundDrawable(getResources().getDrawable(
						R.drawable.lingyixuanxiang_luyin_null));
				 getDate();
				break;
			case R.id.find_radiobutton_luyin:
				radioBtn1.setBackgroundDrawable(getResources().getDrawable(
						R.drawable.lingyixuanxiang_naoling_null));
				radioBtn2.setBackgroundDrawable(getResources().getDrawable(
						R.drawable.lingyixuanxiang_luyin));
				 getDate2();
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

	
	public boolean OnTouchEvent(MotionEvent exent){
		return huadong.onTouchEvent(exent);
		
	}
	//���Ƶ������
	OnGestureListener listener =new OnGestureListener(){
		/**
		 * ����δ�뿪
		 */
		@Override
		public boolean onDown(MotionEvent e) {
			// TODO Auto-generated method stub
			return false;
		}
		/**
		 * �����δ�ƶ���̧��
		 */
		@Override
		public void onShowPress(MotionEvent e) {
			// TODO Auto-generated method stub
			
		}
		/**
		 * һ�ε���¼�
		 */
		@Override
		public boolean onSingleTapUp(MotionEvent e) {
			// TODO Auto-generated method stub
			Log.i("MotionEvent","MotionEvent"+e.getX());
			Log.i("MotionEvent","MotionEvent"+e.getY());
			return false;
		}
		/**
		 * ��Ļ�϶��¼�
		 */
		@Override
		public boolean onScroll(MotionEvent e1, MotionEvent e2,
				float distanceX, float distanceY) {
			// TODO Auto-generated method stub
			return false;
		}
		/**
		 * ����
		 */
		@Override
		public void onLongPress(MotionEvent e) {
			// TODO Auto-generated method stub
			
		}
		/**
		 * ��������
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
			if(e1.getX()-e2.getX()>20){//�ж���ͼ�ֲ���ֱ�ӵ���Ƿ�������ת�����������ֱ����ת
				lunbo.showNext();
			}else if (e2.getX() - e1.getX() >20){
				lunbo.showPrevious();
			}
			
			return true;
		}
	
	};
	
}
