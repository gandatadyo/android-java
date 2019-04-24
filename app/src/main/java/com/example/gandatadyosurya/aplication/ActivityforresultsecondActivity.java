package com.example.gandatadyosurya.aplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityforresultsecondActivity extends AppCompatActivity {
    EditText edtactivityforresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityforresultsecond);
        edtactivityforresult = (EditText)findViewById(R.id.edtactivityforresult);
        Button buttonactivityforresultview2 = (Button)findViewById(R.id.buttonactivityforresultview2);
        buttonactivityforresultview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String stringToPassBack = edtactivityforresult.getText().toString();
            Intent intent = new Intent();
            intent.putExtra("keyName", stringToPassBack);
            setResult(RESULT_OK, intent);
            finish();

            }
        });

    }
}
