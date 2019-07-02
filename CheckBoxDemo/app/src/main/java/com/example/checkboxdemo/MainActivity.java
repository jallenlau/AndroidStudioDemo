package com.example.checkboxdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private int[] chkList = {R.id.chk1, R.id.chk2, R.id.chk3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        for (int chkId : chkList) {
            CheckBox chk = (CheckBox)findViewById(chkId);
            chk.setOnCheckedChangeListener(this);
        }
        //
        Button btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "";
                for (int chkId : chkList)
                {
                    CheckBox chk = (CheckBox)findViewById(chkId);
                    if (chk.isChecked()) msg = msg + " " + chk.getText();
                }
                TextView txt1 = (TextView)findViewById(R.id.txt1);
                txt1.setText(msg);
            }
        });
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView,boolean isChecked)
    {
        TextView txt1 = (TextView)findViewById(R.id.txt1);
        String msg = buttonView.getText().toString();
        if (isChecked) msg += "Selected";
        else msg += "unSelected";
        txt1.setText(msg);
    }
}
