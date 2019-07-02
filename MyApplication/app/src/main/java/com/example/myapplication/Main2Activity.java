package com.example.myapplication;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //
        Button btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.myapplication.ACTION_START"/*Main2Activity.this,Main3Activity.class*/);
                intent.addCategory("com.example.myapplication.SCENE2");
                /*
                intent.setData(Uri.parse("http://marasati.com"));
                 */
                startActivity(intent);

                /*
                intent.putExtra("hello","来自Main2的问候:)");
                startActivityForResult(intent,1);
                */
            }
        });
    }
    /*
    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data) {
        if(requestCode == 1) {
            TextView txt1 = (TextView)findViewById(R.id.txt1);
            if (resultCode == RESULT_OK){
                String s = data.getStringExtra("btn_msg");
                txt1.setText(s);
            } else if (resultCode == RESULT_CANCELED){
                String s = data.getStringExtra("back_msg");
                txt1.setText(s);
            }
        }
    }
    */
}
