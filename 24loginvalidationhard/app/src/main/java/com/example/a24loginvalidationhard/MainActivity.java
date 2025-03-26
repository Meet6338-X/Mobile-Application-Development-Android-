package com.example.a24loginvalidationhard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    String name,pass;
    int unsuccesscount = 0;
    TextView tvunsuccess;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        tvunsuccess = findViewById(R.id.tvunsuccess);
    }
    public void checkvalid(View view){
        name = ed1.getText().toString();
        pass = ed2.getText().toString();
        if(name.isEmpty()){
            Toast.makeText(getApplicationContext(),"Fill the Username Empty not valid",Toast.LENGTH_SHORT).show();
            return;
        } else if (name.length() < 8) {
            Toast.makeText(getApplicationContext(),"Enter username more then 8 Characther",Toast.LENGTH_SHORT).show();
            return;
        }

        if(pass.isEmpty()){
            Toast.makeText(getApplicationContext(),"Fill the Password Empty not valid",Toast.LENGTH_SHORT).show();
            return;
        } else if (pass.length() < 8) {
            Toast.makeText(getApplicationContext(),"Enter Password more then 8 Characther",Toast.LENGTH_SHORT).show();
            return;
        }

        if (name.equals("Meet6338")  && pass.equals("10101010")){
            Toast.makeText(MainActivity.this,"Successfull",Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(MainActivity.this,"Unsuccessfull",Toast.LENGTH_SHORT).show();
            unsuccesscount++;
            tvunsuccess.setText("Unsuccessfull count : "+unsuccesscount);
        }
    }
}