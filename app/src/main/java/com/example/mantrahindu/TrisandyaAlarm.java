package com.example.mantrahindu;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import java.util.Calendar;

public class TrisandyaAlarm {
    private  Calendar calendar;
    private  AlarmManager alarmManager;
    private  Intent alarmIntent;
    private  PendingIntent pendingIntent;

    public  TrisandyaAlarm(Context ctx) {
        alarmManager = (AlarmManager) ctx.getSystemService(Context.ALARM_SERVICE);
        alarmIntent = new Intent(ctx, TrisandyaReceiver.class);
        pendingIntent = PendingIntent.getBroadcast(ctx,0, alarmIntent, PendingIntent.FLAG_UPDATE_CURRENT);

    }
    public  void setAlarm() {
        calendar = Calendar.getInstance();
        int currentHour = calendar.get(Calendar.HOUR_OF_DAY);   
        int targetHour;

        if (currentHour >= 6 && currentHour < 12) {
            targetHour = 11;
        } else if (currentHour >= 12 && currentHour < 18) {
            targetHour = 17;
        } else {
            targetHour = 5;
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }


        calendar.set(Calendar.HOUR_OF_DAY, targetHour);
        calendar.set(Calendar.MINUTE,59);
        calendar.set(Calendar.SECOND,59);

        if(alarmManager != null) {
            alarmManager.setExact(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pendingIntent);
        }


    }

    public void cancelAlarm() {
        if(alarmManager != null) {
            alarmManager.cancel(pendingIntent);


        }

    }




}
