package fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.clock.R;
import com.example.clock.menu.view.MyHorizontalScrollView;

@SuppressLint("NewApi")
public class Message_Fragment extends Fragment {
	ImageView personage;

	MyHorizontalScrollView mMyHorizontalScrollView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View v = new View(getActivity());
		v = inflater.inflate(R.layout.activity_message, container, false);
		mMyHorizontalScrollView=(MyHorizontalScrollView) v.findViewById(R.id.mMyHorizontalScrollView);
		personage = (ImageView) v.findViewById(R.id.personage);
		personage.setOnClickListener(new OnClickListener() {
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
		});
		return v;
	}

}
