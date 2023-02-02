package com.example.scheduleapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.ToggleButton;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        createTheme();
    }

    public void GoToMain(View V){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void GoToSchedule(View V)
    {
        Intent intent = new Intent(this, ScheduleActivity.class);
        startActivity(intent);
    }

    public void GoToTeachers(View V) {
        Intent intent = new Intent(this, TeacherActivity.class);
        startActivity(intent);
    }




    private void createTheme()
    {
        ToggleButton toggle = (ToggleButton) findViewById(R.id.toggleButton);
        int currentNightMode = getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK;
        switch (currentNightMode)
        {
            case Configuration.UI_MODE_NIGHT_NO:
                toggle.setText("Перейти на темную");
                toggle.setChecked(false);
                break;
            case Configuration.UI_MODE_NIGHT_YES:
                toggle.setText("Перейти на светлую");
                toggle.setChecked(true);
                break;
        }
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {


                if (isChecked) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                } else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                }
            }
        });
    }





}