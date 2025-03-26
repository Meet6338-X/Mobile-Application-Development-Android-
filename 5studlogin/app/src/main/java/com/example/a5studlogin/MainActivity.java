package com.example.a5studlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText usernameEditText,passwordEditText;
    String validuser = "Meet";
    String validpassword = "Meet";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
    }
    public void loginvalidation(View view)
    {
        if (usernameEditText.getText().toString().equals(validuser) && passwordEditText.getText().toString().equals(validpassword)){
            Toast.makeText(getApplicationContext(),"Welcome back User",Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(getApplicationContext(),"Not Valid user or pass incorrecct",Toast.LENGTH_LONG).show();
        }
    }
}