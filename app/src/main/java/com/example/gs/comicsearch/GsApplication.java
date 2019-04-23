package com.example.gs.comicsearch;

import android.app.Application;

/**
 * Created by camdora on 16-12-26. 12:00
 */

public class GsApplication extends Application {
    private final static String TAG = "GsApplication";

    private static GsApplication mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    public static GsApplication getInstance(){
        return mContext;
    }

}
