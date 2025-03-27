package com.example.a25drawuserroute;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void redirectgooglemap(View view) {
        ed1 = findViewById(R.id.source);
        ed2 = findViewById(R.id.dest);
        Uri uri = Uri.parse("https://www.google.co.in/maps/dir/"+ed1.getText().toString()+"/"+ed2.getText().toString());
        Intent googlemap1 = new Intent(Intent.ACTION_VIEW,uri);
        googlemap1.setPackage("com.google.android.apps.maps");
        googlemap1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(googlemap1);
    }
}