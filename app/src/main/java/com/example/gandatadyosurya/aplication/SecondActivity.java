package com.example.gandatadyosurya.aplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
/**
 * Created by Ganda Tadyo Surya on 10/03/2017.
 */

public class SecondActivity extends AppCompatActivity{
    TextView teks;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); // untuk menghilangkan toolbar atas
        setContentView(R.layout.activity_second);
        teks=(TextView)findViewById(R.id.textView2);
        Bundle DataOne = getIntent().getExtras();
        teks.setText(DataOne.getString("DataOneName"));
    }
}
