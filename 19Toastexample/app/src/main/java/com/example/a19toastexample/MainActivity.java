package com.example.a19toastexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toast t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void showtoastm(View view){
        t1 = new Toast(getApplicationContext());
        View viewcustom = getLayoutInflater().inflate(R.layout.custom_toast_layout,(ViewGroup) findViewById(R.id.customlay));
        t1.setView(viewcustom);
        t1.setDuration(Toast.LENGTH_SHORT);
        t1.setGravity(Gravity.CENTER, 0, 0);
        t1.show();
    }
}