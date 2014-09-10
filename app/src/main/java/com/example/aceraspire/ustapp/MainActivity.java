package com.example.aceraspire.ustapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Button;



public class MainActivity extends ActionBarActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Arch(View v) {
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), Arch.class));
    }

    public void Educ(View v) {
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), Educ.class));
    }

    public void Nurse(View v) {
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), Nurse.class));
    }

    public void Science(View v) {
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), Science.class));
    }
    public void Music(View v) {
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), Music.class));
    }

    public void Engg(View v) {
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), Engg.class));
    }
    public void Account(View v) {
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), Account.class));
    }

    public void Commerce(View v) {
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), Commerce.class));
    }
    public void Cfad(View v) {
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), Cfad.class));
    }

    public void Ab(View v) {
        Button button = (Button) v;
        startActivity(new Intent(getApplicationContext(), Ab.class));
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in Android
        // Manifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}


