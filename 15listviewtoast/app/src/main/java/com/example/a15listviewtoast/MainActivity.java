package com.example.a15listviewtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] codinglang = {"Android","Java","Php","Hadoop","Sap","Python","Ajax","C++","Ruby","Rails"};
    ArrayAdapter arrayAdapter;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.lst1);
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, codinglang);
        lv.setAdapter(arrayAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),codinglang[i],Toast.LENGTH_SHORT).show();
            }
        });
    }
}