package com.example.alarmclok.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;
/**
 * ���ChangeView��GridView��Ƕ��
 * @author Administrator
 *
 */
public class ChangeViewAndGridView extends GridView{

	public ChangeViewAndGridView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}
	public ChangeViewAndGridView(Context context){//��д����
		super(context);
	}
	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		// TODO Auto-generated method stub
		
		int expandSpec =MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
				MeasureSpec.AT_MOST);
		
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
	}

}
