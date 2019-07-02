package com.example.buttondemo;

import android.content.Context;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,View.OnTouchListener,View.OnLongClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Click
        ((Button) findViewById(R.id.btn1)).setOnClickListener(this);
        ((Button) findViewById(R.id.btn2)).setOnClickListener(this);
        ((Button) findViewById(R.id.btn3)).setOnClickListener(this);
        //Touch
        ((Button)findViewById(R.id.btn2)).setOnClickListener(this);
        ((Button)findViewById(R.id.btn2)).setOnTouchListener(this);
        //Long Click
        ((Button) findViewById(R.id.btn1)).setOnLongClickListener(this);
        ((Button) findViewById(R.id.btn2)).setOnLongClickListener(this);
        ((Button) findViewById(R.id.btn3)).setOnLongClickListener(this);
    }

    //Long Click
    @Override
    public boolean onLongClick(View v) {
        if (v.getId() == R.id.btn1) {
            Toast.makeText(MainActivity.this, "Long Press", Toast.LENGTH_SHORT).show();
            //Vibrate
            Vibrator vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            vib.vibrate(500);
        }
        return true;
    }

    @Override
    public void onClick(View v) {
        TextView txt1 = (TextView)findViewById(R.id.txt1);
        switch (v.getId()) {
            case R.id.btn1: {
                txt1.setText("Click Button 1");
            } break;
            case R.id.btn2: {
                txt1.setText("Click Button 2");
            } break;
            case R.id.btn3: {
                txt1.setText("Click Button 3");
            } break;
            }
        }

    //Touch
    @Override
    public boolean onTouch(View v, MotionEvent event) {
         if (v.getId() == R.id.btn2) {
             TextView txt = (TextView)findViewById(R.id.txt1);
             if (event.getAction()==MotionEvent.ACTION_DOWN) {
                 txt.setText("Finger Down");
             } else if (event.getAction()==MotionEvent.ACTION_UP) {
                 txt.setText("Finger Up");
             } else if (event.getAction()==MotionEvent.ACTION_MOVE) {
                 txt.setText("Finger Moved");
             }
         }
         return true;
    }
}

