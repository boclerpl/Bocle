package com.example.icode9.bocle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class awal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_awal);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
    }
}
