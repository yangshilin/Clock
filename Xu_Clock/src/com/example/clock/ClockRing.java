package com.example.clock;

import com.example.alarmclock.BianJiNaoZhongActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.format.DateFormat;
import android.text.format.Time;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class ClockRing extends View {
	private String time = "12:00";
	private String date = "06/25";
	private String week = "周六";
	private String wendu = "30";
	private String temp = wendu + "℃";
	int bitm = R.drawable.weather;
	int difficult = 1;
	String diffi = "难度：";
	String doing = "稍息立正起床！";
	String alarm_time = "07:30";
	boolean open;
	boolean isRunning;

	public ClockListener getClockListener() {
		return clockListener;
	}

	public void setClockListener(ClockListener clockListener) {
		this.clockListener = clockListener;
	}

	ClockListener clockListener;

	public ClockRing(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public ClockRing(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		int action = event.getAction();
		switch (event.getAction()) {
		case MotionEvent.ACTION_DOWN:
			Log.i("event.getX()", "" + event.getX());
			Log.i("event.getY()", "" + event.getY());
			if (event.getX() > 525 && event.getX() < 625 && event.getY() > 550
					&& event.getY() < 610) {
				if (open) {
					open = false;
				} else {
					open = true;
				}
				invalidate();
			} else if (event.getX() > 100 && event.getX() < 440
					&& event.getY() > 525 && event.getY() < 625) {
				/*
				 * Intent intent=new
				 * Intent(getContext(),BianJiNaoZhongActivity.class);
				 * getContext().startActivity(intent);
				 */
				if (clockListener != null) {
					clockListener.click();
				}

			}
			break;

		default:
			break;
		}
		return true;
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		if (!isRunning) {
			refreshTime();
			isRunning = true;
		}
		Paint paint = new Paint();
		paint.setColor(getResources().getColor(android.R.color.white));
		paint.setStyle(Paint.Style.STROKE);
		paint.setStrokeWidth(5);
		canvas.drawCircle(375, 240, 200, paint);
		paint.setStyle(Paint.Style.STROKE);
		paint.setStrokeWidth(1);
		canvas.drawCircle(375, 240, 180, paint);
		paint.setColor(getResources().getColor(R.color.ablack));
		paint.setStyle(Paint.Style.FILL);
		canvas.drawCircle(375, 240, 200, paint);
		paint.setTextSize(30);
		paint.setColor(getResources().getColor(R.color.hui));
		canvas.drawText(date, 285, 170, paint);
		canvas.drawText(week, 395, 170, paint);
		paint.setTextSize(80);
		paint.setColor(getResources().getColor(android.R.color.white));
		canvas.drawText(time, 275, 270, paint);

		canvas.drawLine(250, 300, 500, 300, paint);
		paint.setColor(getResources().getColor(R.color.wendu));
		paint.setTextSize(36);
		canvas.drawText(temp, 300, 360, paint);
		Bitmap bitmap = new BitmapFactory()
				.decodeResource(getResources(), bitm);
		canvas.drawBitmap(bitmap, 400, 320, paint);
		paint.setColor(getResources().getColor(R.color.hui));

		paint.setStrokeWidth(2);
		paint.setTextSize(45);
		paint.setColor(getResources().getColor(android.R.color.white));
		canvas.drawText(alarm_time, 105, 590, paint);
		paint.setStrokeWidth(1);
		paint.setTextSize(24);
		paint.setColor(getResources().getColor(R.color.nandu));
		canvas.drawText(diffi, 230, 560, paint);
		canvas.drawText(doing, 230, 600, paint);
		Bitmap bitmap_star = new BitmapFactory().decodeResource(getResources(),
				R.drawable.star);
		Bitmap bitmap_star_not = new BitmapFactory().decodeResource(
				getResources(), R.drawable.star_not);
		for (int i = 0; i < 5; i++) {
			if (i + 1 <= difficult) {
				canvas.drawBitmap(bitmap_star, 300 + 25 * i, 540, paint);
			} else {
				canvas.drawBitmap(bitmap_star_not, 300 + 25 * i, 540, paint);
			}
		}
		Bitmap bitmap_off = new BitmapFactory().decodeResource(getResources(),
				R.drawable.on_off_not);
		Bitmap bitmap_on = new BitmapFactory().decodeResource(getResources(),
				R.drawable.on_off);
		if (!open) {
			canvas.drawBitmap(bitmap_off, 525, 550, paint);
		} else if (open) {
			canvas.drawBitmap(bitmap_on, 525, 550, paint);
		}
		paint.setStyle(Paint.Style.STROKE);
		paint.setStrokeWidth(3);
		RectF rectf = new RectF(75, 525, 675, 625);
		canvas.drawRoundRect(rectf, 50, 50, paint);
		if (bitmap != null) {
			bitmap.recycle();
		}
		if (bitmap_star != null) {
			bitmap_star.recycle();
		}
		if (bitmap_star_not != null) {
			bitmap_star_not.recycle();
		}
		if (bitmap_off != null) {
			bitmap_off.recycle();
		}
		if (bitmap_on != null) {
			bitmap_on.recycle();
		}
	}

	public void refreshTime() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Time times = new Time("GMT-8");
				
				/*
				 * 对于已经设定为GMT时间标准的dateFormat来说，一切需要他转换的字符串日期都是GMT标准时间，转换后返回的Date由于默认
				 * 遵守系统默认时区，所以转换给Date的日期需要+8（例如北京标准时区），也就是时区与标准不同导致的时差。
				 */

				try {
					while (true) {
						times.setToNow();
						int year = times.year;
						int month = times.month+1;
						int day = times.monthDay;
						int minute = times.minute;
						int hour = times.hour+8;
						int week=times.weekDay;
						int sec = times.second;
						if (sec%10==0) {
							Log.i("time", "当前时间为：" + year + "年 " + month + "月 "
									+ day + "日 " + hour + "时 " + minute + "分 "
									+ sec + "秒" + "time" + "week"+week);
							date = String.valueOf(month) + "/"
									+ String.valueOf(day);
							if(minute>9){
							time = String.valueOf(hour) + ":"
									+ String.valueOf(minute);
							}
							else{
								time=String.valueOf(hour) + ":"
										+ "0"+String.valueOf(minute);
							}
							Message msg = new Message();
							msg.what = 1001;
							handler.sendMessage(msg);
							Thread.sleep(1000);//
							//
						}
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}).start();

	}

	Handler handler = new Handler() {
		public void handleMessage(Message msg) {
			switch (msg.what) {
			case 1001:

				invalidate();
				break;
			case 1002:

				break;

			default:
				break;
			}
		}
	};

	public int getDifficult() {
		return difficult;
	}

	public void setDifficult(int difficult) {
		this.difficult = difficult;
	}

	public String getDiffi() {
		return diffi;
	}

	public void setDiffi(String diffi) {
		this.diffi = diffi;
	}

	public String getDoing() {
		return doing;
	}

	public void setDoing(String doing) {
		this.doing = doing;
	}

	public String getAlarm_time() {
		return alarm_time;
	}

	public void setAlarm_time(String alarm_time) {
		this.alarm_time = alarm_time;
	}

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public String getWendu() {
		return wendu;
	}

	public void setWendu(String wendu) {
		this.wendu = wendu;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public int getBitm() {
		return bitm;
	}

	public void setBitm(int bitm) {
		this.bitm = bitm;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public interface ClockListener {
		public void click();
	}
}
