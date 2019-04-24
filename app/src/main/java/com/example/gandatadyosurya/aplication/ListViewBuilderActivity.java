package com.example.gandatadyosurya.aplication;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

public class ListViewBuilderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_builder);
        Button btb =(Button)findViewById(R.id.btnlist);
        btb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ListCategory();
            }
        });
    }

    private void ListCategory(){
        AlertDialog.Builder builderSingle = new AlertDialog.Builder(ListViewBuilderActivity.this);
        builderSingle.setTitle("Select Categoty : ");

        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(ListViewBuilderActivity.this, android.R.layout.select_dialog_singlechoice);
        arrayAdapter.add("Sembako");
        arrayAdapter.add("Fashion");
        arrayAdapter.add("Elektronik");
        arrayAdapter.add("Furniture");
        arrayAdapter.add("Otomotif");

        builderSingle.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        builderSingle.setAdapter(arrayAdapter, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String strName = arrayAdapter.getItem(which);
                AlertDialog.Builder builderInner = new AlertDialog.Builder(ListViewBuilderActivity.this);
                builderInner.setMessage(strName);
                builderInner.setTitle("Your Selected Item is");
                builderInner.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog,int which) {
                        dialog.dismiss();
                    }
                });
                builderInner.show();
            }
        });
        builderSingle.show();
    }

}
