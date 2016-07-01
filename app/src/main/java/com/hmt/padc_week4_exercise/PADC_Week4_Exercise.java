package com.hmt.padc_week4_exercise;

import android.app.Application;
import android.content.Context;

/**
 * Created by Dell on 02-Jul-16.
 */
public class PADC_Week4_Exercise extends Application{

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext(){
        return context;
    }
}
