package com.example.gandatadyosurya.aplication;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class BiodataActivity extends AppCompatActivity {
    Button btnsimpan, btnbatal;
    EditText edtnama, edttelepon, edtalamat;
    ListView list;
    DataHelper myDb;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
        btnbatal=(Button)findViewById(R.id.btnbatal);
        btnsimpan=(Button)findViewById(R.id.btnsimpan);
        edtnama=(EditText)findViewById(R.id.edtnama);
        edttelepon=(EditText)findViewById(R.id.edttelepon);
        edtalamat=(EditText)findViewById(R.id.edtalamat);
        list=(ListView) findViewById(R.id.listview);

        myDb = new DataHelper(this);

        btnsimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted = myDb.insertData(edtnama.getText().toString());
                if (isInserted = true)
                    Toast.makeText(BiodataActivity.this, "Data Inserted", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(BiodataActivity.this, "Data not Inserted", Toast.LENGTH_SHORT).show();
                edtnama.setText("");
            }
        });

        btnbatal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor res = myDb.getAlldata();
                if (res.getCount() == 0) {
                    Toast.makeText(BiodataActivity.this,"Data not found",Toast.LENGTH_SHORT).show();
                }
                ArrayList array_list1 = new ArrayList();
                while (res.moveToNext()) {
                    array_list1.add(res.getString(1));
                }
                final ArrayAdapter arrayAdapter =new ArrayAdapter(BiodataActivity.this,android.R.layout.simple_list_item_1,array_list1);
                list.setAdapter(arrayAdapter);
            }
        });
    }
}