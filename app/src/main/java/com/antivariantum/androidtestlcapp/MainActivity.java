package com.antivariantum.androidtestlcapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView action;
    String TAG = "GETED";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        action = findViewById(R.id.eventName);
        action.append("onCreate\n");
        Log.d(TAG,"onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        action.append("-----------\n");
        action.append("onStart\n");
        Log.d(TAG,"onStart");
    }


    @Override
    protected void onResume() {
        super.onResume();
        action.append("onResume\n");
        Log.d(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        action.append("onPause\n");
        Log.d(TAG,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        action.append("onStop\n");
        Log.d(TAG,"onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        action.append("onRestart\n");
        Log.d(TAG,"onRestart");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        action.append("onDestroy\n");
        Log.d(TAG,"onDestroy");
    }


    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        action.append("onSaveInstanceState\n");
        Log.d(TAG,"onSaveInstance");
    }
}