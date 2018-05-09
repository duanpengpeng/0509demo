package com.example.lianxi02;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by huoxuebin on 2018/5/9.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
