package com.example.gandatadyosurya.aplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import java.util.ArrayList;

public class GridViewCusActivity extends AppCompatActivity {
    GridView gridView;
    private ArrayList<String> kota, kota1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        GridView gridview = (GridView) findViewById(R.id.gridview2);
        gridview.setAdapter(new GridViewCusAdapter(this));
    }
}
