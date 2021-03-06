package com.example.clock.menu.view;

import android.content.Context;
import android.text.GetChars;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

public class MyHorizontalScrollView extends HorizontalScrollView {
	private LinearLayout mWapper;
	private ViewGroup mMenu;
	private ViewGroup mContent;
	private int mScreenWidth;
	private int mMenuWidth;
	private int mMenuRightPadding = 100;
	private boolean once = false;
	private boolean isOpen;

	public MyHorizontalScrollView(Context context, AttributeSet attrs) {
		super(context, attrs);
		WindowManager wm = (WindowManager) context
				.getSystemService(Context.WINDOW_SERVICE);
		DisplayMetrics outMetrics = new DisplayMetrics();
		wm.getDefaultDisplay().getMetrics(outMetrics);
		mScreenWidth = outMetrics.widthPixels;
		mMenuRightPadding = (int) TypedValue.applyDimension(
				TypedValue.COMPLEX_UNIT_DIP, 100, context.getResources()
						.getDisplayMetrics());
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		// TODO Auto-generated method stub

		if (!once) {
			mWapper = (LinearLayout) getChildAt(0);
			mMenu = (ViewGroup) mWapper.getChildAt(0);
			mContent = (ViewGroup) mWapper.getChildAt(1);
			mMenuWidth = mMenu.getLayoutParams().width = mScreenWidth
					- mMenuRightPadding;
			mContent.getLayoutParams().width = mScreenWidth;
			once = true;
		}
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
	}

	@Override
	protected void onLayout(boolean changed, int l, int t, int r, int b) {
		// TODO Auto-generated method stub
		super.onLayout(changed, l, t, r, b);
		if (changed) {
			this.scrollTo(mMenuWidth, 0);
		}
	}

	@Override
	public boolean onTouchEvent(MotionEvent ev) {
		// TODO Auto-generated method stub

		int action = ev.getAction();
		switch (action) {
		case MotionEvent.ACTION_UP:
			int scrollx = getScrollX();
			if (scrollx >= mMenuWidth / 2) {
				this.smoothScrollTo(mMenuWidth, 0);
				isOpen=true;
			} else {
				this.smoothScrollTo(0, 0);
				isOpen=false;
			}
			return true;
		}
		
		return super.onTouchEvent(ev);
	}

	public void openSroll() {
		if (isOpen==false) {
			this.smoothScrollTo(mMenuWidth, 0);
		} else {
			this.smoothScrollTo(0, 0);
		}
	}
	
}
