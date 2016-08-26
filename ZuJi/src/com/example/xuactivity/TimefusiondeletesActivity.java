package com.example.xuactivity;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.zuji.BottonNavigationActivity;
import com.example.zuji.R;

public class TimefusiondeletesActivity extends Activity implements OnClickListener{
	ImageButton btfhmine;
	Button bt_inpast;
	ListView time_listviews;
	SimpleAdapter simpleAdapter;
	List<Map<String, Object>> list;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.time_fusiondeletes);
		intView();
		time_listviews.setOnItemClickListener(itemClickListener);
	}

	// 初始化
	public void intView() {
		btfhmine=(ImageButton) findViewById(R.id.btfhmine);
		btfhmine.setOnClickListener(this);
		bt_inpast = (Button) findViewById(R.id.bt_inpast);
		bt_inpast.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {

				startActivity(new Intent(TimefusiondeletesActivity.this,
						Timeinthepast_activity.class));
			}
		});
		time_listviews = (ListView) findViewById(R.id.time_listviews);
		String[] from = { "times", "mothday", "timelife" };
		int[] to = { R.id.times, R.id.mothday, R.id.timelife };

		simpleAdapter = new SimpleAdapter(this, data(),
				R.layout.time_fusiondeletes_listview, from, to);
		time_listviews.setAdapter(simpleAdapter);

	}

	OnItemClickListener itemClickListener = new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			TextView timeshare = (TextView) arg1.findViewById(R.id.timeshare);
			TextView timepaizhao = (TextView) arg1
					.findViewById(R.id.timepaizhao);
			TextView timedelete = (TextView) arg1.findViewById(R.id.timedelete);
			final int a = arg2;
			Toast.makeText(TimefusiondeletesActivity.this, "" + arg2,
					Toast.LENGTH_SHORT).show();
			timeshare.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {// 分享
					Toast.makeText(TimefusiondeletesActivity.this, "分享成功",
							Toast.LENGTH_SHORT).show();
				}
			});
			timepaizhao.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					getPhoto(v);
					// Toast.makeText(Timefusiondeletes.this, "拍照",
					// Toast.LENGTH_SHORT).show();
				}
			});
			timedelete.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					list.remove(a);
					simpleAdapter.notifyDataSetChanged();
					Toast.makeText(TimefusiondeletesActivity.this, "删除成功" + a,
							Toast.LENGTH_SHORT).show();
				}
			});
		}
	};

	// 调用相机功能照相
	public void getPhoto(View v) {
		Intent intent = new Intent();
		intent.setAction("android.media.action.IMAGE_CAPTURE");
		intent.addCategory("android.intent.category.DEFAULT");
		File file = new File(Environment.getExternalStorageDirectory()
				+ "/000.jpg");
		Uri uri = Uri.fromFile(file);
		intent.putExtra(MediaStore.EXTRA_OUTPUT, uri);
		this.startActivity(intent);
	}

	// simpleAdapter的数据
	private List<Map<String, Object>> data() {
		list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("times", "2016");
		map.put("mothday", "02.10");
		map.put("timelife", "生命，是一个过程，可悲的是它不能重来，可喜的是它也不需要重来。");
		list.add(map);

		map = new HashMap<String, Object>();
		map.put("times", "2016");
		map.put("mothday", "02.10");
		map.put("timelife", "生命，是一个过程，可悲的是它不能重来，可喜的是它也不需要重来。");
		list.add(map);
		map = new HashMap<String, Object>();
		map.put("times", "2016");
		map.put("mothday", "02.10");
		map.put("timelife", "生命，是一个过程，可悲的是它不能重来，可喜的是它也不需要重来。");
		list.add(map);
		return list;
	}

	@Override
	public void onClick(View v) {
	switch (v.getId()) {
	case R.id.btfhmine:
		startActivity(new Intent(TimefusiondeletesActivity.this,BottonNavigationActivity.class));
		break;

	default:
		break;
	}
		
	}

	
}
