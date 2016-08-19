package com.example.xuguoliactivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alarmclock.BianJiNaoZhongActivity;
import com.example.clock.MainActivity2;
import com.example.clock.R;

public class Set extends Activity implements OnClickListener {
	private ImageView returnbe;
	CheckBox imageButton5, imageButton4;
	private TextView setname;
	private ImageButton imageButton1, imageButton2, imageButton3, imageButton6;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.set);
		intView();
		if (getIntent().getExtras() != null) {
			setname.setText(getIntent().getExtras().getString("name"));
		}
	}

	public void intView() {
		setname = (TextView) findViewById(R.id.setname);
		returnbe = (ImageView) findViewById(R.id.returnbe);
		imageButton1 = (ImageButton) findViewById(R.id.imageButton1);
		imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
		imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
		imageButton4 = (CheckBox) findViewById(R.id.imageButton4);
		imageButton5 = (CheckBox) findViewById(R.id.imageButton5);
		imageButton6 = (ImageButton) findViewById(R.id.imageButton6);
		returnbe.setOnClickListener(this);
		imageButton1.setOnClickListener(this);
		imageButton2.setOnClickListener(this);
		imageButton3.setOnClickListener(this);
		imageButton4.setOnClickListener(this);
		imageButton5.setOnClickListener(this);
		imageButton6.setOnClickListener(this);
		setname.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.returnbe:
			Intent intent =new Intent();
			intent.putExtra("name", setname.getText().toString());
			setResult(200, intent);
			finish();
			break;
		case R.id.imageButton1:
			startActivity(new Intent(Set.this, Add.class));
			break;
		case R.id.imageButton2:
			startActivity(new Intent(Set.this, Add.class));
			break;
		case R.id.imageButton3:
			startActivity(new Intent(Set.this, BianJiNaoZhongActivity.class));
			break;
		case R.id.imageButton4:
			if (imageButton4.isChecked()) {
				// 添加点中的状态
			} else {
				// 添加点中的状态
			}

			// startActivity(new Intent(Set.this, Add.class));
			break;
		case R.id.imageButton5:
			if (imageButton5.isChecked()) {
				// 添加点中的状态
			} else {
				// 添加点中的状态
			}
			// startActivity(new Intent(Set.this, Add.class));
			break;
		case R.id.imageButton6:
			startActivity(new Intent(Set.this, Add.class));
			break;
		case R.id.setname:
			bjname();
			break;

		}
	}

	@SuppressLint("NewApi")
	private void bjname() {
		// String[] str = { "1", "2" };
		LayoutInflater inflater = getLayoutInflater();
		final View v = inflater.inflate(R.layout.item_setname, null);
		AlertDialog.Builder builder = new AlertDialog.Builder(Set.this,
				android.R.style.Theme_Dialog);
		builder.setView(v);
		TextView tv = (TextView) v.findViewById(R.id.tv);
		tv.setText("昵称");
		EditText et = (EditText) v.findViewById(R.id.et);
		et.setText(setname.getText());
		// builder.setItems(str, new DialogInterface.OnClickListener() {
		/*
		 * @Override 对话框的选择1或者是二 public void onClick(DialogInterface dialog, int
		 * which) { // TODO Auto-generated method stub switch (which) { case 0:
		 * setname.setText("1"); break; case 1: setname.setText("2"); break;
		 * default: break; } dialog.dismiss(); } });
		 */
		builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				EditText et = (EditText) v.findViewById(R.id.et);
				setname.setText(et.getText());
				Toast.makeText(Set.this, "修改成功", Toast.LENGTH_SHORT).show();
				dialog.dismiss();
			}
		});
		builder.create().show();

	}

}
