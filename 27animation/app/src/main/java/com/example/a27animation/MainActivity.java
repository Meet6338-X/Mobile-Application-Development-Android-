package com.example.a27animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView IMG;
    Animation fadein,clockwise,zoominout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void fadeinfun(View view){
        IMG = findViewById(R.id.img);
        fadein = AnimationUtils.loadAnimation(this,R.anim.fadein);
        IMG.startAnimation(fadein);
    }
    public void clockanim(View view){
        IMG = findViewById(R.id.img);
        clockwise = AnimationUtils.loadAnimation(this,R.anim.clockwise);
        IMG.startAnimation(clockwise);
    }
    public void zoominout(View view){
        IMG = findViewById(R.id.img);
        zoominout = AnimationUtils.loadAnimation(this,R.anim.zoom);
        IMG.startAnimation(zoominout);
    }
}