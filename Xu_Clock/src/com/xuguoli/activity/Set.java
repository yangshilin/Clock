package com.xuguoli.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.clock.R;

public class Set extends Activity implements OnClickListener{
	private ImageView returnbe;
	private ImageButton imageButton1,imageButton2,imageButton3,imageButton4,imageButton5,imageButton6;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.set);
		intView();
	}
	public void intView(){
		
		returnbe=(ImageView)findViewById(R.id.returnbe);
		imageButton1=(ImageButton)findViewById(R.id.imageButton1);
		imageButton2=(ImageButton)findViewById(R.id.imageButton2);
		imageButton3=(ImageButton)findViewById(R.id.imageButton3);
		imageButton4=(ImageButton)findViewById(R.id.imageButton4);
		imageButton5=(ImageButton)findViewById(R.id.imageButton5);
		imageButton6=(ImageButton)findViewById(R.id.imageButton6);
		returnbe.setOnClickListener(this);
		imageButton1.setOnClickListener(this);
		imageButton2.setOnClickListener(this);
		imageButton3.setOnClickListener(this);
		imageButton4.setOnClickListener(this);
		imageButton5.setOnClickListener(this);
		imageButton6.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
	 switch (v.getId()) {
	case R.id.returnbe:
	startActivity(new Intent(Set.this,Login.class));	
		break;
	case R.id.imageButton1:
		startActivity(new Intent(Set.this,Add.class));
		break;
	case R.id.imageButton2:
		startActivity(new Intent(Set.this,Add.class));
		break;
	case R.id.imageButton3:
		startActivity(new Intent(Set.this,Add.class));
		break;
	case R.id.imageButton4:
		startActivity(new Intent(Set.this,Add.class));
		break;
	case R.id.imageButton5:
		startActivity(new Intent(Set.this,Add.class));
		break;
	case R.id.imageButton6:
		startActivity(new Intent(Set.this,Add.class));
		break;

	 }
	}
	
	
	
	
	
	
	
	
}
