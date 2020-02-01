package com.example.sms;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

public class ReceiveSMS extends BroadcastReceiver {
    IntentFilter f= new
            IntentFilter("android.provider.Telephony.SMS_RECEIVED");
    ReceiveSMS r = new ReceiveSMS();
            registerReceiver(r,f);
}
