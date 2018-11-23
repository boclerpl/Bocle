package com.example.icode9.bocle;

import android.app.Application;
import android.os.SystemClock;

public class appTime extends Application {
    public void onCreate(){
        super.onCreate();
        SystemClock.sleep(2000);
    }
}
