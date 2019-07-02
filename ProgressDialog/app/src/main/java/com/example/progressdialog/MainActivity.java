package com.example.progressdialog;

import java.util.TimerTask;
import java.util.Timer;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.TimerTask;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        Button btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressDialog dlg = new ProgressDialog(MainActivity.this);
                dlg.setTitle("Program is on the way.");
                dlg.setMessage("Wait for a minutes plz...");
                dlg.setCancelable(false); //Whether dialog be cancelled by other ways or not.
                //
                dlg.setOnShowListener(new DialogInterface.OnShowListener() {
                    @Override
                    public void onShow(final DialogInterface dialog) {
                        Timer timer = new Timer();
                        TimerTask task = new TimerTask() {
                            @Override
                            public void run() {
                                dialog.dismiss();
                            }
                        };
                        timer.schedule(task,3000);
                    }
                });
                dlg.show();
            }
        });
    }
}
