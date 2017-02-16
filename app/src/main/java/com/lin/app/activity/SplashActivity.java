package com.lin.app.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;

import com.lin.app.R;
import com.lin.framework.reactnative.ReactNativeUtil;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        if (!ReactNativeUtil.isSupport()) {
            ReactNativeUtil.notSupportWarning(this);
            return;
        }

    }
}
