package com.example.a30factorialtwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtext;
    int numbert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtext = findViewById(R.id.num);
    }
    public void factorialnum(View view){
        Intent outputscreen = new Intent(MainActivity.this,outputfacto.class);
        String numbers = edtext.getText().toString();
        numbert = Integer.parseInt(numbers);
        int fact = 1;
        for (int i = 1; i <= numbert; i++) {
            fact *= i;
        }
        outputscreen.putExtra("Factorial_num",fact);
        startActivity(outputscreen);
    }
}