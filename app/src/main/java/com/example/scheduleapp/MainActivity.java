package com.example.scheduleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void GoToSchedule(View V){
        Intent intent = new Intent(this, activity_schedule.class);
        startActivity(intent);
    }

    public void GoToSettings(View V)
    {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

}