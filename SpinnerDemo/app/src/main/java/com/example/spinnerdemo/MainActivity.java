package com.example.spinnerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private String[] cityNames;
    private Spinner cityList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get city names
        cityNames = getResources().getStringArray(R.array.cities);
        cityList = (Spinner)findViewById(R.id.city_list);
        //
        cityList.setOnItemSelectedListener(this);
        //
        Button btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int index = cityList.getSelectedItemPosition();
                String name = cityNames[index];
                //
                String msg = String.format("%d : %s",index,name);
                Toast t = Toast.makeText(MainActivity.this,msg,Toast.LENGTH_SHORT);
                t.show();
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
        String msg = String.format("%d : %s",position,cityNames[position]);
        Toast t = Toast.makeText(MainActivity.this,msg,Toast.LENGTH_SHORT);
        t.show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        //Nothing to do
    }
}
