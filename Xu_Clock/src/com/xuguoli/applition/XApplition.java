package com.xuguoli.applition;

import cn.smssdk.SMSSDK;
import android.app.Application;

public class XApplition extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		SMSSDK.initSDK(this, "15ce5acf19f81",
				"3d3591e3b1f4c3ff6645b0cb043b6fa2");
	}

}
