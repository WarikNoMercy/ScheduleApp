package com.example.scheduleapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ScheduleCheckandedit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_checkandedit);
    }
    public void GoToEdit(View V){
        Intent intent = new Intent(this,activity_schedule_edit.class);
        startActivity(intent);
    }
    public void GoToCheck(View V){
        Intent intent = new Intent(this,activity_schedule_check.class);
        startActivity(intent);
    }
}