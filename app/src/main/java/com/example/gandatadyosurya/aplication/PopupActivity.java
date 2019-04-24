package com.example.gandatadyosurya.aplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

/**
 * Created by Ganda Tadyo Surya on 15/04/2017.
 */

public class PopupActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.widthPixels;

        getWindow().setLayout((int)(width*.8), (int)(height*.6));

    }
}