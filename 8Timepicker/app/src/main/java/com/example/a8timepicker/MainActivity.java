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
        timep.setIs24HourView(true);
        tv = findViewById(R.id.tv);
        timep.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int i, int i1) {
                String hh=Integer.toString(i);
                String mm=Integer.toString(i1);
                tv.setText(hh+":"+mm);
            }
        });
    }
}
