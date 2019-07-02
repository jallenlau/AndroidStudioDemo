package com.example.alertdialogdemo;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.DialogInterface;
import android.view.View;
import android.view.Menu;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        Button btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn1) {
            AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
            dlg.setTitle("Please confirm your decision.");
            dlg.setMessage("Really?");
            dlg.setCancelable(false);
            //Confirm Buttom
            dlg.setPositiveButton("Confirm",new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog,int which) {
                    Toast.makeText(MainActivity.this,"Confirm action",Toast.LENGTH_SHORT).show();
                }
            });
            //Cancel action button
            dlg.setNegativeButton("Cancel",new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog,int which) {
                    Toast.makeText(MainActivity.this,"Cancel action",Toast.LENGTH_SHORT).show();
                }
            });
            dlg.show();
        }
    }
}
