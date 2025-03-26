package com.example.a23logintoastsucess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText ed1,ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
    }
    public void checkvalid(View view){
        if (ed1.getText().toString().equals("Meet")  && ed2.getText().toString().equals("123")){
            Toast.makeText(MainActivity.this,"Successfull",Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(MainActivity.this,"Unsuccessfull",Toast.LENGTH_SHORT).show();
        }
    }
}