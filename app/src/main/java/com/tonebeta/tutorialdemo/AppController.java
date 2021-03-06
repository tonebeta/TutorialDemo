package com.tonebeta.tutorialdemo;

import android.content.Context;
import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;

/**
 * Created by 109890 on 2018/3/4.
 */

public class AppController extends MultiDexApplication {

    private static AppController instance;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static synchronized AppController getInstance() {
        return instance;
    }
}
