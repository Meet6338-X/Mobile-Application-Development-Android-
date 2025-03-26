package com.example.a28checkboxorderprice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox piz,cof,bur;
    String toaststr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        piz = findViewById(R.id.piz);
        cof = findViewById(R.id.cof);
        bur = findViewById(R.id.bur);
    }
    public void orderfun(View view){
        int totalbug = 0;
        toaststr = "Your Selected Order : \n";
        if(piz.isChecked()){
            toaststr += "Pizza = 120/-\n";
            totalbug += 120;
        }
        if(cof.isChecked()){
            toaststr += "Coffee = 30/-\n";
            totalbug += 30;
        }
        if(bur.isChecked()){
            toaststr += "Burger = 50/-\n";
            totalbug += 50;
        }
        toaststr += "Total : = "+totalbug+" Rs";
        Toast.makeText(this,toaststr,Toast.LENGTH_SHORT).show();
    }
}