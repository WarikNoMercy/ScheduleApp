package com.example.scheduleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ScheduleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
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

    public void GoToTeachers(View V) {
        Intent intent = new Intent(this, TeacherActivity.class);
        startActivity(intent);
        this.finish();
    }
}