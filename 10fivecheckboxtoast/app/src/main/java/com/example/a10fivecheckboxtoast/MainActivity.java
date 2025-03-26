package com.example.a10fivecheckboxtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void displaytoast1(View view){
        Toast.makeText(getApplicationContext(),"Check box 1 Selected",Toast.LENGTH_LONG).show();
    }
    public  void displaytoast2(View view){
        Toast.makeText(getApplicationContext(),"Check box 2 Selected",Toast.LENGTH_LONG).show();
    }
    public  void displaytoast3(View view){
        Toast.makeText(getApplicationContext(),"Check box 3 Selected",Toast.LENGTH_LONG).show();
    }
    public  void displaytoast4(View view){
        Toast.makeText(getApplicationContext(),"Check box 4 Selected",Toast.LENGTH_LONG).show();
    }
    public  void displaytoast5(View view){
        Toast.makeText(getApplicationContext(),"Check box 5 Selected",Toast.LENGTH_LONG).show();
    }
}