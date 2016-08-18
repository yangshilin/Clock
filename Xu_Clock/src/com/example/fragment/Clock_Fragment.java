package fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.text.format.Time;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.example.alarmclock.BianJiNaoZhongActivity;
import com.example.clock.ClockRing;
import com.example.clock.MainActivity2;
import com.example.clock.R;
import com.example.clock.ClockRing.ClockListener;
import com.example.clock.menu.view.MyHorizontalScrollView;

@SuppressLint("NewApi")
public class Clock_Fragment extends Fragment {
	ClockRing clockRing;
	Handler handler = new Handler();
	ImageView personage;

	MyHorizontalScrollView mMyHorizontalScrollView;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View v = new View(getActivity());
		v = inflater.inflate(R.layout.activity_clock, container, false);
		clockRing = (ClockRing) v.findViewById(R.id.clocking);
		clockRing.setClockListener(clockListener);
		mMyHorizontalScrollView=(MyHorizontalScrollView) getActivity().findViewById(R.id.mMyHorizontalScrollView);
		personage = (ImageView) v.findViewById(R.id.personage);
		personage.setOnClickListener(clickListener); 
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
	ClockListener clockListener = new ClockListener() {

		@Override
		public void click() {
			// TODO Auto-generated method stub
			Intent intent = new Intent(getActivity(),
					BianJiNaoZhongActivity.class);
			getActivity().startActivity(intent);
			// getActivity().startActivity(new
			// Intent(getActivity(),MainActivity2.class));
		}
	};

}
