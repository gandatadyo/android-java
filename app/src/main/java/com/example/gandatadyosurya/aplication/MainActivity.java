package com.example.gandatadyosurya.aplication;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btntoast, btnalert, btnmessage, btnloading, btnIntents, btnlistview, btnbiodata, btngps, btninput, btntab,
            btnsharedpreference1, btndatepicker, btnActivityResult, btnGridView, btnUploadImage, btnPopup, btnNavigationDrawer,
            btnservice, btnparalax, btnListBuild, btnMessageSend, btnListViewCustomeAdapter,btnQRBarcodeResult;
    DataHelper dbcenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btntoast=(Button)findViewById(R.id.btnToast);
        btnalert=(Button)findViewById(R.id.btnAlertDialog);
        btnmessage=(Button)findViewById(R.id.btnmessage);
        btnloading=(Button)findViewById(R.id.btnLoading);
        btnIntents=(Button)findViewById(R.id.btnIntent);
        btnlistview=(Button)findViewById(R.id.btnListView);
        btnbiodata=(Button)findViewById(R.id.btnbiodata);
        btninput=(Button)findViewById(R.id.btninput);
        btngps=(Button)findViewById(R.id.btngps);
        btntab=(Button)findViewById(R.id.btntablayout1);
        btndatepicker=(Button)findViewById(R.id.button3);
        btnsharedpreference1=(Button)findViewById(R.id.btnshared1);
        btnActivityResult=(Button)findViewById(R.id.btnActivityResult);
        btnGridView=(Button)findViewById(R.id.btnGridView);
        btnUploadImage=(Button)findViewById(R.id.btnUpload);
        btnPopup=(Button)findViewById(R.id.btnPopup);
        btnNavigationDrawer=(Button)findViewById(R.id.btnNavigationDrawer);
        btnservice=(Button)findViewById(R.id.btnservice);
        btnListBuild=(Button)findViewById(R.id.btnListBuild);
        btnMessageSend=(Button)findViewById(R.id.btnMessageSend);
        btnQRBarcodeResult=(Button)findViewById(R.id.btnQRBarcodeResult);


        btnQRBarcodeResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ZXingScannerActivity.class));
//                Intent i = new Intent(MainActivity.this, ZXingScannerActivity.class);
//                startActivityForResult(i, 0);
            }
        });

        btnMessageSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MessageActivity.class);
                startActivityForResult(i, 0);
            }
        });


        btnListBuild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ListViewBuilderActivity.class);
                startActivityForResult(i, 0);
            }
        });


        btnparalax=(Button)findViewById(R.id.btnParalax);


        btnparalax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ParalaxActivity.class);
                startActivityForResult(i, 0);
            }
        });



        btnservice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ServiceActivity.class);
                startActivityForResult(i, 0);
            }
        });

        btnNavigationDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, BackActivity.class);
                startActivityForResult(i, 0);
            }
        });

        btnActivityResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ActivityforresultActivity.class);
                startActivityForResult(i, 0);
            }
        });

        btnPopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PopupActivity.class);
                startActivity(i);
            }
        });

        btnUploadImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, UploadImageActivity.class);
                startActivityForResult(i, 0);
            }
        });

        btnGridView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, GridViewCusActivity.class);
                startActivityForResult(i, 0);
            }
        });


        btnsharedpreference1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SharedPreferenceActivity.class);
                startActivityForResult(i, 0);
            }
        });

        btndatepicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,TimeDataActivity.class);
                startActivityForResult(i,0);
            }
        });

        btntab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,TabLayoutActivity.class);
                startActivityForResult(i,0);
            }
        });

        dbcenter = new DataHelper(this);

        btninput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,InputActivity.class);
                startActivityForResult(i,0);
            }
        });

        btngps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,RecyclerActivity.class);
                startActivityForResult(i,0);
            }
        });

        btnbiodata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,BiodataActivity.class);
                startActivityForResult(i,0);
            }
        });


        btnlistview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,ListViewActivity.class);
                startActivityForResult(i,0);
            }
        });

        btnloading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressDialog pds=new ProgressDialog(MainActivity.this);
                pds.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                pds.setMessage("Loading");
                pds.setIndeterminate(true);
                pds.setCancelable(true);
                pds.show();
            }
        });

        btntoast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Hello Toast",Toast.LENGTH_SHORT).show();
            }
        });

        btnalert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Alert();
            }
        });

        btnIntents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,SecondActivity.class);
                i.putExtra("DataOneName","Hello Guys");
                startActivityForResult(i,0);
            }
        });

        btnmessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder build = new AlertDialog.Builder(MainActivity.this);
                build.setTitle("Hello Message");
                build.setMessage("what ?");
                build.setCancelable(false);
                build.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                build.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog haha = build.create();
                haha.show();
            }
        });
    }

    public void Alert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Hello Alert");
        builder.setMessage("You Okay");
        builder.setNegativeButton("OK",null);
        AlertDialog dialog = builder.create();
        dialog.getWindow().getAttributes().windowAnimations = 0;
        dialog.show();
    }
}
