package com.example.datetime;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.provider.Settings;
import android.provider.Settings.SettingNotFoundException;
import android.widget.Toast;

public class TimeChanged extends BroadcastReceiver {
    public TimeChanged() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // Do whatever changes you need here
        // you can check the updated time using Calendar c = Calendar.getInstance();
    	
    	System.out.println("Date Changed !");
    	System.out.println("Date Changed !");
    	
    	
    /*	try {
			Settings.System.getInt(context.getContentResolver(), Settings.System.TIME_12_24);
		} catch (SettingNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	*/
    	
    	try {
    		@SuppressWarnings("unused")
			int i=android.provider.Settings.Global.getInt(context.getContentResolver(), android.provider.Settings.Global.AUTO_TIME, 0);
    	System.out.println("System Updated "+i);
    	
    	if(i==0)
    		Toast.makeText(context, "you cannot do Fingerprint !", Toast.LENGTH_SHORT).show();
    	else
    		Toast.makeText(context, "you can do Fingerprint !", Toast.LENGTH_SHORT).show();
    	
    	
    	} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    //	Settings.System.getInt(context.getContentResolver(), Settings.System.AUTO_TIME);
    	
    /*	try {
    	String toParse = "2-9-2015" + " " + "20:50"; // Results in "2-5-2012 20:43"
    	SimpleDateFormat formatter = new SimpleDateFormat("d-M-yyyy hh:mm"); // I assume d-M, you may refer to M-d for month-day instead.
    	Date date = formatter.parse(toParse); // You will need try/catch around this
    	long millis = date.getTime();
    	
    
    	String data = formatter.format(new Date(millis));
    	
    	    Runtime.getRuntime().exec("date -s " + data);
    	} catch (IOException e) {
    	} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
    	
    }
}