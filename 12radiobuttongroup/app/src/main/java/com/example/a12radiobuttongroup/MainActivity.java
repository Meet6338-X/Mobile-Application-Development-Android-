package com.example.a12radiobuttongroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton rd1,rd2,male,female;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rd1 = findViewById(R.id.rd1);
        rd2 = findViewById(R.id.rd2);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
    }
    public void displayselectedradio(View view)
    {
        if (rd1.isChecked()){
            Toast.makeText(getApplicationContext(),"Radio button 1 Selected",Toast.LENGTH_SHORT).show();
        }
        if (rd2.isChecked()){
            Toast.makeText(getApplicationContext(),"Radio button 2 Selected",Toast.LENGTH_SHORT).show();
        }
        if (male.isChecked())
        {
            Toast.makeText(getApplicationContext(),"Male",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Female",Toast.LENGTH_SHORT).show();
        }
    }
}