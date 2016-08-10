package fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.alarmclock.BianJiNaoZhongActivity;
import com.example.clock.ClockRing;
import com.example.clock.MainActivity2;
import com.example.clock.R;
import com.example.clock.ClockRing.ClockListener;

@SuppressLint("NewApi")
public class Clock_Fragment extends Fragment  {
	ClockRing clockRing;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View v=new View(getActivity());
		v=inflater.inflate(R.layout.activity_clock, container,false);
		clockRing=(ClockRing) v.findViewById(R.id.clocking);
		clockRing.setClockListener(clockListener);
		return v;
	}
	ClockListener clockListener = new ClockListener() {

		@Override
		public void click() {
			// TODO Auto-generated method stub
			Intent intent=new Intent(getActivity(),BianJiNaoZhongActivity.class);
			getActivity().startActivity(intent);
		//	getActivity().startActivity(new Intent(getActivity(),MainActivity2.class));
		}
	};
}
