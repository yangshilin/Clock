package com.xuguoli.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import com.example.clock.R;

public class Set_new_passActivity extends Activity{
private EditText setnewet_password,once_again;

private Button verify;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.set_new_password);
		intView();
		
	}
	public void intView(){
		
	setnewet_password=(EditText)findViewById(R.id.setnewet_password);
	once_again=(EditText)findViewById(R.id.once_again);
	verify=(Button)findViewById(R.id.verify);
		
		
	}
	
	
}
