package com.example.a4bluetoothonoff;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    BluetoothAdapter bluetoothAdapter;
    ToggleButton tg1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        tg1 = findViewById(R.id.tg1);
        tg1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b)
                {
                    turnonbluetooth(null);
                }
                else
                {
                    turnoffbluetooth(null);
                }
            }
        });
    }

    public void turnonbluetooth(View view) {
        if (bluetoothAdapter != null && !bluetoothAdapter.isEnabled()) {
            Intent btni = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
//            bluetoothAdapter.enable();
            startActivity(btni);
            Toast.makeText(this, "Bluetooth Turned ON", Toast.LENGTH_SHORT).show();
        }
    }

    public void turnoffbluetooth(View view) {
        bluetoothAdapter.disable();
        Toast.makeText(this, "Bluetooth Turned OFF", Toast.LENGTH_SHORT).show();
    }
}