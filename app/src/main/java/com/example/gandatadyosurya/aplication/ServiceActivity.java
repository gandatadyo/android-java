package com.example.gandatadyosurya.aplication;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
//import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

/**
 * Created by Ganda Tadyo Surya on 28/04/2017.
 */

public class ServiceActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        Button btnStart = (Button) findViewById(R.id.btnStart);
        Button btnStop = (Button) findViewById(R.id.btnStop);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(new Intent(ServiceActivity.this, AndroidService.class));
            }
        });
        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(new Intent(ServiceActivity.this, AndroidService.class));
                //notification
//                NotificationCompat.Builder b = new NotificationCompat.Builder(ServiceActivity.this);
//                b.setAutoCancel(true)
//                        .setDefaults(NotificationCompat.DEFAULT_ALL)
//                        .setWhen(System.currentTimeMillis())
//                        .setSmallIcon(R.drawable.sipp)
//                        .setTicker("{your tiny message}")
//                        .setContentTitle("Stop Pagi")
//                        .setContentText("Stop User")
//                        .setContentInfo("INFO");
//                NotificationManager nm = (NotificationManager) ServiceActivity.this.getSystemService(Context.NOTIFICATION_SERVICE);
//                nm.notify(1, b.build());
            }
        });
    }
}