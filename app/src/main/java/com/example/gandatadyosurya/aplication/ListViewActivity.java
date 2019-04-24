package com.example.gandatadyosurya.aplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewActivity extends AppCompatActivity{
    ListView list;
    String data[]={"Informatika","Elektro","Ekonomi","Akutansi","Manajemen","Industri","Agro Teknologi","Bahasa Inggris",
    "Bahsa Indonesia","Hukum","Kesehatan","KeDookteran","Komputer","Pertanian","Biologi","Kimia","Olahraga","Bimbingan Konseling"};
    Integer dataint[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        list=(ListView)findViewById(R.id.ListView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);

        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getApplicationContext(),"Jurusan "+data[position],Toast.LENGTH_SHORT).show();
            }
        });
    }
}
