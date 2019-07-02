package com.example.radiobuttondemo;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    RadioGroup rgSex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        rgSex = (RadioGroup)findViewById(R.id.rg_sex);
        //
        rgSex.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group,@IdRes int checkedId) {
                RadioButton rdo = (RadioButton)findViewById(checkedId);
                Toast t = Toast.makeText(MainActivity.this,rdo.getText(),Toast.LENGTH_SHORT);
                t.show();
            }
        });
    }
}
