package com.example.a8timepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    TimePicker timep;
    TextView tv;
    int newtime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timep = findViewById(R.id.timep);
        timep.setIs24HourView(false);
        tv = findViewById(R.id.tv);
//        timep.getCurrentHour();
//        timep.getCurrentMinute();
        timep.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int i, int i1) {
                String amPm = (i < 12) ? "AM" : "PM";
                if(amPm=="PM")
                {
                    newtime = i-12;
                    tv.setText(newtime + ":" + i1 + amPm);
                }
                else
                {
                    tv.setText(i + ":" + i1 + amPm);
                }
            }
        });
    }
}
