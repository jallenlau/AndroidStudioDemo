package com.example.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    //List data
    private String[] data = {"aaa","bbb","ccc","ddd","eee","fff","ggg","hhh"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialize list
        ArrayAdapter<String> ada = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, data);
        //
        ListView lst1 = (ListView)findViewById(R.id.lst1);
        lst1.setAdapter(ada);
        //
        lst1.setOnItemClickListener(this);
    }
        //Click
        @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id)
        {
            if (id>=0) {
                String s = data[(int) id];
                Toast t = Toast.makeText(MainActivity.this,s,Toast.LENGTH_SHORT);
                t.show();
            }
        }
    }

