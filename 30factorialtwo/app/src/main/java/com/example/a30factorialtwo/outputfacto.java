package com.example.a30factorialtwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class outputfacto extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outputfacto);
        tv = findViewById(R.id.tv);
        int intv = getIntent().getIntExtra("Factorial_num",1);
        tv.setText("Result : "+intv);
    }
}
