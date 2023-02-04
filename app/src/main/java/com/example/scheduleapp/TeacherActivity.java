package com.example.scheduleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TeacherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);
    }

    public void GoToMain(View V){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        this.finish();
    }

    public void GoToSettings(View V)
    {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
        this.finish();
    }

    public void GoToSchedule(View V) {
        Intent intent = new Intent(this, ScheduleActivity.class);
        startActivity(intent);
        this.finish();
    }
}