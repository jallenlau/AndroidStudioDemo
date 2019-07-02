package com.example.progressbardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

import static android.R.style.Widget;

public class MainActivity extends AppCompatActivity {

    ProgressBar pd1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Progress Bar
        pd1 = (ProgressBar)findViewById(R.id.pd1);
        pd1.setProgress(0);
        //
        Button btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pd1.setProgress(0);
                Timer timer = new Timer();
                TimerTask task = new TimerTask() {
                    @Override
                    public void run() {
                        int cur = pd1.getProgress();
                        cur += 10;
                        if (cur <= 100) {
                            pd1.setProgress(cur);
                        } else {
                            this.cancel();
                        }
                    }
                };
                timer.scheduleAtFixedRate(task,0,1000);
            }
        });

    }
}
