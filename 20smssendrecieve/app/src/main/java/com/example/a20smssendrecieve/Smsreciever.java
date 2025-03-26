package com.example.a20smssendrecieve;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.gsm.SmsMessage;
import android.widget.Toast;

public class Smsreciever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle = intent.getExtras();
        Object[] smsobj = (Object[]) bundle.get("pdus");
        for(Object obj : smsobj){
            SmsMessage msg = SmsMessage.createFromPdu((byte[]) obj);
            String mobno = msg.getDisplayOriginatingAddress();
            String message = msg.getDisplayMessageBody();
            Toast.makeText(context.getApplicationContext(), "Phone Number : "+mobno+"\n Messge : "+message,Toast.LENGTH_LONG).show();
        }
    }
}
