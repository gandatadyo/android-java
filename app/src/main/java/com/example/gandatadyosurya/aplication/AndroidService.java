package com.example.gandatadyosurya.aplication;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.CountDownTimer;
import android.os.IBinder;
import android.support.annotation.Nullable;
//import android.support.v7.app.NotificationCompat;
import android.widget.Toast;

/**
 * Created by Ganda Tadyo Surya on 28/04/2017.
 */

public class AndroidService extends Service {
//    private static final String FORMAT = "%02d:%02d:%02d";
//
//    int seconds , minutes;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {

        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        new CountDownTimer(30000, 1000) {
            public void onTick(long millisUntilFinished) {
//                NotificationCompat.Builder b = new NotificationCompat.Builder(AndroidService.this);
//                b.setAutoCancel(true)
//                        .setDefaults(NotificationCompat.DEFAULT_ALL)
//                        .setWhen(System.currentTimeMillis())
//                        .setSmallIcon(R.drawable.ic_menu_send)
//                        .setTicker("{your tiny message}")
//                        .setContentTitle("Running")
//                        .setContentText("Running User")
//                        .setContentInfo("INFO");
//                NotificationManager nm = (NotificationManager) AndroidService.this.getSystemService(Context.NOTIFICATION_SERVICE);
//                nm.notify(1, b.build());
            }

            public void onFinish() {
                Toast.makeText(AndroidService.this, "Done Started", Toast.LENGTH_SHORT).show();
            }

        }.start();

        return START_STICKY;
    }
}
