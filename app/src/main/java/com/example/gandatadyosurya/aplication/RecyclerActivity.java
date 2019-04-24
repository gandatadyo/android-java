package com.example.gandatadyosurya.aplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class RecyclerActivity extends AppCompatActivity {
    private ArrayList<String> user, price;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        initView();
    }

    private void initView() {
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.card_recycler_view);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        
        user = new ArrayList<>();
        user.add("ganda@yahoo.com");
        user.add("dinda@yahoo.com");
        user.add("arin@yahoo.com");
        user.add("raga@yahoo.com");
        user.add("eni@yahoo.com");
        user.add("ninda@yahoo.com");
        user.add("tono@yahoo.com");
        user.add("sanusi@yahoo.com");
        user.add("tyke@yahoo.com");
        user.add("alex@yahoo.com");
        user.add("dio@yahoo.com");
        user.add("ganda@yahoo.com");
        user.add("ganda@yahoo.com");
        user.add("ganda@yahoo.com");
        user.add("ganda@yahoo.com");

        price = new ArrayList<>();
        price.add("Rp.10.000");
        price.add("Rp.12.000");
        price.add("Rp.13.000");
        price.add("Rp.18.000");
        price.add("Rp.15.000");
        price.add("Rp.28.000");
        price.add("Rp.19.000");
        price.add("Rp.14.000");
        price.add("Rp.18.000");
        price.add("Rp.14.000");
        price.add("Rp.12.000");
        price.add("Rp.10.000");
        price.add("Rp.12.000");
        price.add("Rp.20.000");
        price.add("Rp.30.000");
        price.add("Rp.10.000");



        RecyclerView.Adapter adapter = new DataAdapter(user, price);
        recyclerView.setAdapter(adapter);

        recyclerView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            GestureDetector gestureDetector = new GestureDetector(getApplicationContext(), new GestureDetector.SimpleOnGestureListener() {

                public boolean onSingleTapUp(MotionEvent e){
                    return true;
                }
            });

            @Override
            public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
                View child = rv.findChildViewUnder(e.getX(), e.getY());
                if (child != null && gestureDetector.onTouchEvent(e)){
                    int position = rv.getChildAdapterPosition(child);
                    Toast.makeText(getApplicationContext(), user.get(position)+"\n"+price.get(position), Toast.LENGTH_SHORT).show();
                }
                return false;
            }

            @Override
            public void onTouchEvent(RecyclerView rv, MotionEvent e) {

            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

            }
        });
    }
}
