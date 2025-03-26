package com.example.a6tabledisplaystudentinfo;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TableLayout tableLayout = findViewById(R.id.tableLayout);

        String[][] students = {
                {"1", "Meet Shah",  "A"},
                {"2", "Vedant Pawer", "B"},
                {"3", "Shivam Raut", "A"},
                {"4", "Sneha Naik", "C"},
                {"5", "Shivam Potpalliwar","B"},
                {"6", "Sneha Navender", "A"},
                {"7", "Shristi Tapse", "B"},
                {"8", "Sristi pawer", "A"},
                {"9", "Neha Salvi", "C"},
                {"10", "Shivaji Rathod", "B"}
        };

        for (String[] student : students) {
            TableRow row = new TableRow(this);
            for (String data : student) {
                TextView textView = new TextView(this);
                textView.setText(data);
                textView.setPadding(10, 10, 10, 10);
                textView.setBackgroundColor(Color.WHITE);
                row.addView(textView);
            }
            tableLayout.addView(row);
        }
    }
}
