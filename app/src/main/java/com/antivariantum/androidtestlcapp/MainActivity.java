package com.antivariantum.androidtestlcapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView action;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        action = (TextView) findViewById(R.id.eventName);
        action.append("onCreate\n");

    }

    @Override
    protected void onStart() {
        super.onStart();
        action.append("-----------\n");
        action.append("onStart\n");
    }


    @Override
    protected void onResume() {
        super.onResume();
        action.append("onResume\n");
    }

    @Override
    protected void onPause() {
        super.onPause();
        action.append("onPause\n");
    }

    @Override
    protected void onStop() {
        super.onStop();
        action.append("onStop\n");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        action.append("onResume\n");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        action.append("onDestroy\n");
    }


    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        action.append("onSaveInstanceState\n");
    }
}