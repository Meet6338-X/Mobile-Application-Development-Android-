package com.example.a17captureimage;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    final int reqcodecam = 2;
    ImageView imgv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgv = findViewById(R.id.imgv);
    }
    public void imgchg(View view){
        Intent imgint = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(imgint,reqcodecam);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==reqcodecam){
            Bitmap img = (Bitmap)(data.getExtras().get("data"));
            imgv.setImageBitmap(img);
        }
    }
}