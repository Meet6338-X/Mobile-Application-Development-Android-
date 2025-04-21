package com.example.a11autocompletesearcheng;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    String[] Searcheng = {"Google", "Bing", "Yahoo", "DuckDuckGo", "Ask", "Baidu", "Yandex", "Ecosia", "Brave"};
    AutoCompleteTextView autocomp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autocomp = findViewById(R.id.autocomp);
        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.activity_list_item,Searcheng);
        autocomp.setAdapter(arrayAdapter);
    }
}