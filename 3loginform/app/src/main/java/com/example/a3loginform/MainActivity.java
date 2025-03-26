package com.example.a3loginform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.name);
        ed2 = findViewById(R.id.password);
    }
    public void validationbutton(View view)
    {
        String name1 = ed1.getText().toString();
        String password1 = ed2.getText().toString();
        if (name1.equals("Meet") && password1.equals("Meet123"))
        {
            Toast.makeText(getApplicationContext(),"Login Successfully",Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Login Unsuccessfull",Toast.LENGTH_LONG).show();
        }
    }
}