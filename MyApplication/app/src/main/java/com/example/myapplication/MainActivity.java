package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        TextView tv = (TextView)findViewById(R.id.txt1);
        tv.setText(String.valueOf(System.currentTimeMillis()));
        //
        Button btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

/*
        String ver = String.valueOf(Build.VERSION.SDK_INT);
        TextView txt1 = (TextView)findViewById(R.id.txt1);
        txt1.setText("当前API版本："+ver);

        Log.d("当前API版本",ver);
*/
    }
}
