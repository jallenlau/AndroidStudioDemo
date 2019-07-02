package com.example.menudemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Context menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.mainmenu,menu);
        return true;
    }

    //Response menu item
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.menuitem1:
            {
                Toast.makeText(this,"MenuItem 1",Toast.LENGTH_SHORT).show();
            } break;
            case R.id.menuitem2:
            {
                Toast.makeText(this,"MenuItem 2",Toast.LENGTH_SHORT).show();
            } break;
            case R.id.menuitem3:
            {
                Toast.makeText(this,"MenuItem 3",Toast.LENGTH_SHORT).show();
            } break;
        }
        return true;
    }
}
