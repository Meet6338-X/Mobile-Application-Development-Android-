package com.example.a35bluetoothgetdeviceenable;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Set;

public class MainActivity extends AppCompatActivity {
    BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter(); // Initialize directly

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void turnonblue(View view) {
        startActivity(new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE));
    }

    public void turnoffblue(View view) {
        bluetoothAdapter.disable();
    }

    public void listbluedevice(View view) {
        Set<BluetoothDevice> pairedDevices = bluetoothAdapter.getBondedDevices();
        StringBuilder deviceList = new StringBuilder();

        for (BluetoothDevice device : pairedDevices) {
            deviceList.append(device.getName()).append(" - ").append(device.getAddress()).append("\n");
        }

        Toast.makeText(this, deviceList.toString(), Toast.LENGTH_LONG).show();
    }

    public void getvisibleblue(View view) {
        Intent discoverableIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
        discoverableIntent.putExtra(BluetoothAdapter.EXTRA_DISCOVERABLE_DURATION, 300);
        startActivity(discoverableIntent);
    }
}