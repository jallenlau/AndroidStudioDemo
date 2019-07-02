package com.example.imageviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    //Counter
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        ImageView img1 = (ImageView)findViewById(R.id.img1);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView img = (ImageView)v;
                if (counter %2 == 0)
                    img.setImageResource(R.drawable.round);
                else
                    img.setImageResource(R.drawable.robot);
                counter++;
            }
        });
    }
}
