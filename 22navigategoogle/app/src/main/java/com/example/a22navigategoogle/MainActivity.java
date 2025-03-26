package com.example.a22navigategoogle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void navigateto(View view){
        String url = "https://www.google.com";
        Intent google = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(google);
    }
}