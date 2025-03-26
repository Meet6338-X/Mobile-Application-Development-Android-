package com.example.a2samplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText e1,e2;
    private TextView result1;
    int n1,n2;
    int result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
        result1 = findViewById(R.id.result1);
    }
    public void addition(View view)
    {
        n1 = Integer.parseInt(e1.getText().toString());
        n2 = Integer.parseInt(e2.getText().toString());
        result = n1 + n2;
        result1.setText(String.valueOf(result));
    }
    public void subtraction(View view)
    {
        n1 = Integer.parseInt(e1.getText().toString());
        n2 = Integer.parseInt(e2.getText().toString());
        result = n1 - n2;
        result1.setText(String.valueOf(result));
    }
    public void multiplication(View view)
    {
        n1 = Integer.parseInt(e1.getText().toString());
        n2 = Integer.parseInt(e2.getText().toString());
        result = n1 * n2;
        result1.setText(String.valueOf(result));
    }
    public void division(View view)
    {
        n1 = Integer.parseInt(e1.getText().toString());
        n2 = Integer.parseInt(e2.getText().toString());
        result = n1 / n2;
        result1.setText(String.valueOf(result));
    }
}