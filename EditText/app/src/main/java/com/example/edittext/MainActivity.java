package com.example.edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import  android.widget.EditText;

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
                EditText edit1 = (EditText)findViewById(R.id.edit1);
                Button btn = (Button)findViewById(R.id.btn1);
                btn.setText(edit1.getText());
            }
        });
    }
}
