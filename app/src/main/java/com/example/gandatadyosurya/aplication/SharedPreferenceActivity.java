package com.example.gandatadyosurya.aplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SharedPreferenceActivity extends AppCompatActivity {
    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preference);
        final EditText edtnama=(EditText)findViewById(R.id.editText4);
        final EditText edtaddress = (EditText)findViewById(R.id.editText3);


        prefs = this.getSharedPreferences("com.example.gandatadyosurya.aplication", Context.MODE_PRIVATE);
        if (prefs.getString("shared_user", "").toString()!=""){
            edtnama.setText(prefs.getString("shared_user", ""));
            edtaddress.setText(prefs.getString("shared_alamat", ""));

        }




        Button btnsave = (Button)findViewById(R.id.btnsaveshared);
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = prefs.edit();
                editor.putString("shared_user", edtnama.getText().toString());
                editor.putString("shared_alamat", edtaddress.getText().toString());
                editor.commit();
                Toast.makeText(getApplicationContext(), "Shared Preferences Saved", Toast.LENGTH_LONG).show();
            }
        });
    }
}
