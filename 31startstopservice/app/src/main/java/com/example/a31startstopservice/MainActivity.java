package com.example.a31startstopservice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Toast t1;
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        t1 = new Toast(getApplicationContext());
        View viewcustom = getLayoutInflater().inflate(R.layout.custom_toast_layout,(ViewGroup) findViewById(R.id.customlay));
        t1.setView(viewcustom);
        t1.setDuration(Toast.LENGTH_LONG);
        t1.show();
        tv = viewcustom.findViewById(R.id.textv);
        tv.setText(" Service Started ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        t1 = new Toast(getApplicationContext());
        View viewcustom = getLayoutInflater().inflate(R.layout.custom_toast_layout,(ViewGroup) findViewById(R.id.customlay));
        t1.setView(viewcustom);
        t1.setDuration(Toast.LENGTH_LONG);
        t1.show();
        tv = viewcustom.findViewById(R.id.textv);
        tv.setText(" Service Stopped ");    }
}