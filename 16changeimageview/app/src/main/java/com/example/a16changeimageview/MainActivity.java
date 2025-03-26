package com.example.a16changeimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int imgnum = 1;
    ImageView imgv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgv = findViewById(R.id.imgv);
    }
    public void imgchg(View view){
        int restid = getResources().getIdentifier("image"+imgnum,"drawable",getPackageName());
        imgv.setImageResource(restid);
        imgnum++;
        if(imgnum > 5){
            imgnum = 1;
            imgchg(view);
        }
    }
}