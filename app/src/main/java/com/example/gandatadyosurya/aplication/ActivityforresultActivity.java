package com.example.gandatadyosurya.aplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityforresultActivity extends AppCompatActivity {
    // Add a different request code for every activity you are starting from here
    private static final int SECOND_ACTIVITY_RESULT_CODE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityforresult);
        Button buttonActivityfor1 = (Button)findViewById(R.id.btnActivityforResult);
        buttonActivityfor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the SecondActivity
                Intent intent = new Intent(ActivityforresultActivity.this, ActivityforresultsecondActivity.class);
                startActivityForResult(intent, SECOND_ACTIVITY_RESULT_CODE);
            }
        });
    }

    // This method is called when the second activity finishes
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // check that it is the SecondActivity with an OK result
        if (requestCode == SECOND_ACTIVITY_RESULT_CODE) {
            if (resultCode == RESULT_OK) {

                // get String data from Intent
                String returnString = data.getStringExtra("keyName");

                // set text view with string
                TextView textView = (TextView) findViewById(R.id.textViewActivityforresult1);
                textView.setText(returnString);
            }
        }
    }
}
