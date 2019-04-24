package com.example.gandatadyosurya.aplication;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by Ganda Tadyo Surya on 20/03/2017.
 */

public class TimeDataActivity extends AppCompatActivity implements View.OnClickListener {
    private Button buttonDate, buttonTime;
    TextView textDate, textTime;
    Integer Tanggal, Bulan, Tahun;

    Integer minute, hour;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_date);

        buttonDate=(Button)findViewById(R.id.button);
        buttonTime=(Button)findViewById(R.id.button2);
        textTime=(TextView) findViewById(R.id.textView5);
        textDate=(TextView) findViewById(R.id.textView7);



        buttonTime.setOnClickListener(this);
        buttonDate.setOnClickListener(this);

    }


    @RequiresApi(api = Build.VERSION_CODES.N)
    public void onClick(View v) {
        //tanggal
        if (v == buttonDate){
            final Calendar c = Calendar.getInstance();
            Tanggal= c.get(Calendar.DAY_OF_MONTH);
            Bulan= c.get(Calendar.MONTH);
            Tahun= c.get(Calendar.YEAR);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    textDate.setText(dayOfMonth+"-"+(month+1)+"-"+year);
                }
            }
            ,Tanggal, Bulan, Tahun);
            datePickerDialog.show();
        }
        //jam
        if (v == buttonTime){
            final Calendar c = Calendar.getInstance();
            minute= c.get(Calendar.MINUTE);
            hour= c.get(Calendar.HOUR_OF_DAY);

            TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    textTime.setText(minute + "." + hour);
                }
            }
            ,minute, hour, false);
            timePickerDialog.show();
        }
    }
}
