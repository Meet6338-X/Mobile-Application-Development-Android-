package com.example.a33custombroadcast;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
public class Custom_message extends BroadcastReceiver
{
    @Override
    public void onReceive(Context c, Intent i)
    {
        Toast.makeText(c,"Hey This is aka Meet the holy shit hidden weapon of liberation",Toast.LENGTH_LONG).show();
    }
}
