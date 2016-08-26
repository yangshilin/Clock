package com.example.xuactivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.zuji.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class Minefocus extends Activity {
	ListView minefocus_listview;
	SimpleAdapter simpleAdapter;
	List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.minefocus);
		intView();

	}

	public void intView() {
		minefocus_listview = (ListView) findViewById(R.id.minefocus_listview);
		String[] from = { "fanstuxiang", "howspeak", "addfans" };
		int[] to = { R.id.fanstuxiang, R.id.howspeak, R.id.addfans };
		simpleAdapter = new SimpleAdapter(this, getData(),
				R.layout.minefans_listview, from, to);
		minefocus_listview.setAdapter(simpleAdapter);
	}

	private List<Map<String, Object>> getData() {
		for (int i = 0; i < 20; i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("fanstuxiang", R.drawable.focus_iconone);
			map.put("howspeak", "怎么说");
			map.put("addfans", R.drawable.addfans);
			list.add(map);
		}
		return list;

	}
}
