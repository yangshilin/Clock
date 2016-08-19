package com.example.clock;

import com.example.alarmclock.LuZhiLingShengActivity;
import com.example.alarmclok.view.FindFragment;
import com.example.clock.ClockRing.ClockListener;
import com.example.clock.menu.view.MyHorizontalScrollView;
import com.example.fragment.Clock_Fragment;
import com.example.fragment.Message_Fragment;
import com.example.xuguoliactivity.Circle;
import com.example.xuguoliactivity.Set;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.format.Time;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class MainActivity2 extends FragmentActivity {
	public static final int REQUEST_CODE = 1002;
	RadioGroup radioGroup;
	RadioButton clock;
	RadioButton found;
	RadioButton ring;
	RadioButton message;
	ImageView head_portrait;
	Clock_Fragment clock_Fragment = new Clock_Fragment();
	Message_Fragment message_Fragment = new Message_Fragment();
	Circle circle = new Circle();
	FindFragment FindFragment = new FindFragment();
	TextView signature;
	TextView name;
	ImageView record;
	TextView text_record;
	ImageView personage;
	MyHorizontalScrollView mMyHorizontalScrollView;

	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_shouye);
		setFragment(R.id.clock);
		radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
		radioGroup.setOnCheckedChangeListener(checkedChangeListener);
		clock = (RadioButton) findViewById(R.id.clock);
		found = (RadioButton) findViewById(R.id.found);
		ring = (RadioButton) findViewById(R.id.ring);
		record = (ImageView) findViewById(R.id.record);
		name = (TextView) findViewById(R.id.name);
		text_record = (TextView) findViewById(R.id.text_record);
		mMyHorizontalScrollView = (MyHorizontalScrollView) findViewById(R.id.mMyHorizontalScrollView);
		head_portrait = (ImageView) findViewById(R.id.head_portrait);
		signature = (TextView) findViewById(R.id.signature);
		message = (RadioButton) findViewById(R.id.message);
		signature.setOnClickListener(clickListener);
		record.setOnClickListener(clickListener);
		text_record.setOnClickListener(clickListener);
		head_portrait.setOnClickListener(clickListener);
	};

	OnClickListener clickListener = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.signature:
				signature.setText("��ʱ�������");
				break;
			case R.id.head_portrait:
				Intent intent = new Intent(MainActivity2.this, Set.class);
				intent.putExtra("name", name.getText().toString());
				startActivityForResult(intent, REQUEST_CODE);
				break;
			case R.id.record:
				Intent intent1 = new Intent(MainActivity2.this,
						LuZhiLingShengActivity.class);
				startActivity(intent1);
				break;
			case R.id.text_record:
				Intent intent2 = new Intent(MainActivity2.this,
						LuZhiLingShengActivity.class);
				startActivity(intent2);
				break;
			case R.id.personage:
				mMyHorizontalScrollView.openSroll();
				break;
			default:
				break;
			}
		}
	};

	@Override
	protected void onActivityResult(int arg0, int arg1, Intent arg2) {
		if (arg0 == 1002 && arg2 != null && arg2.getExtras() != null) {
			String username = arg2.getExtras().getString("name");
			name.setText(username);
			super.onActivityResult(arg0, arg1, arg2);
		}
	};

	private void setchecked(int id) {
		// TODO Auto-generated method stub
		switch (id) {
		case R.id.message:
			message.setCompoundDrawablesWithIntrinsicBounds(null,
					getResources().getDrawable(R.drawable.message_not), null,
					null);
			clock.setCompoundDrawablesWithIntrinsicBounds(null, getResources()
					.getDrawable(R.drawable.clock), null, null);
			found.setCompoundDrawablesWithIntrinsicBounds(null, getResources()
					.getDrawable(R.drawable.find), null, null);
			ring.setCompoundDrawablesWithIntrinsicBounds(null, getResources()
					.getDrawable(R.drawable.ring), null, null);
			message.setTextColor(getResources().getColor(android.R.color.white));
			clock.setTextColor(getResources().getColor(R.color.darkgray));
			found.setTextColor(getResources().getColor(R.color.darkgray));
			ring.setTextColor(getResources().getColor(R.color.darkgray));
			break;
		case R.id.clock:
			message.setCompoundDrawablesWithIntrinsicBounds(null,
					getResources().getDrawable(R.drawable.message), null, null);
			clock.setCompoundDrawablesWithIntrinsicBounds(null, getResources()
					.getDrawable(R.drawable.clock_not), null, null);
			found.setCompoundDrawablesWithIntrinsicBounds(null, getResources()
					.getDrawable(R.drawable.find), null, null);
			ring.setCompoundDrawablesWithIntrinsicBounds(null, getResources()
					.getDrawable(R.drawable.ring), null, null);
			message.setTextColor(getResources().getColor(R.color.darkgray));
			clock.setTextColor(getResources().getColor(android.R.color.white));
			found.setTextColor(getResources().getColor(R.color.darkgray));
			ring.setTextColor(getResources().getColor(R.color.darkgray));
			break;
		case R.id.ring:
			message.setCompoundDrawablesWithIntrinsicBounds(null,
					getResources().getDrawable(R.drawable.message), null, null);
			clock.setCompoundDrawablesWithIntrinsicBounds(null, getResources()
					.getDrawable(R.drawable.clock), null, null);
			found.setCompoundDrawablesWithIntrinsicBounds(null, getResources()
					.getDrawable(R.drawable.find), null, null);
			ring.setCompoundDrawablesWithIntrinsicBounds(null, getResources()
					.getDrawable(R.drawable.ring_not), null, null);
			message.setTextColor(getResources().getColor(R.color.darkgray));
			clock.setTextColor(getResources().getColor(R.color.darkgray));
			found.setTextColor(getResources().getColor(R.color.darkgray));
			ring.setTextColor(getResources().getColor(android.R.color.white));
			break;
		case R.id.found:
			message.setCompoundDrawablesWithIntrinsicBounds(null,
					getResources().getDrawable(R.drawable.message), null, null);
			clock.setCompoundDrawablesWithIntrinsicBounds(null, getResources()
					.getDrawable(R.drawable.clock), null, null);
			found.setCompoundDrawablesWithIntrinsicBounds(null, getResources()
					.getDrawable(R.drawable.find_not), null, null);
			ring.setCompoundDrawablesWithIntrinsicBounds(null, getResources()
					.getDrawable(R.drawable.ring), null, null);
			message.setTextColor(getResources().getColor(R.color.darkgray));
			clock.setTextColor(getResources().getColor(R.color.darkgray));
			found.setTextColor(getResources().getColor(android.R.color.white));
			ring.setTextColor(getResources().getColor(R.color.darkgray));
			break;

		default:
			break;
		}

	}

	OnCheckedChangeListener checkedChangeListener = new OnCheckedChangeListener() {

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			// TODO Auto-generated method stub
			setFragment(checkedId);
			setchecked(checkedId);
			switch (checkedId) {
			case R.id.clock:

				break;

			default:
				break;
			}
		}
	};

	private void setFragment(int R_id) {
		// TODO Auto-generated method stub
		FragmentManager fm = getSupportFragmentManager();
		FragmentTransaction ft = fm.beginTransaction();
		switch (R_id) {
		case R.id.clock:
			ft.replace(R.id.linearlayout, clock_Fragment);
			ft.commit();
			break;
		case R.id.message:
			ft.replace(R.id.linearlayout, message_Fragment);
			ft.commit();
			break;
		case R.id.ring:
			ft.replace(R.id.linearlayout, circle);
			ft.commit();
			break;
		case R.id.found:
			ft.replace(R.id.linearlayout, FindFragment);
			ft.commit();
			break;
		default:
			break;
		}

	}
}
