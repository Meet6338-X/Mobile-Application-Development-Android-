package com.example.a26sendemail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText mailtoname,subjectmail,subjectbody;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void mailsent(View view){
        mailtoname = findViewById(R.id.mailtoname);
        subjectbody = findViewById(R.id.subjectbody);
        subjectmail = findViewById(R.id.subjectmail);
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL,new String[]{mailtoname.getText().toString()});
        intent.putExtra(Intent.EXTRA_SUBJECT,subjectmail.getText().toString());
        intent.putExtra(Intent.EXTRA_TEXT,subjectbody.getText().toString());
        startActivity(Intent.createChooser(intent,"Choose the Application."));
    }
}