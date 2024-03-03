package com.example.mantrahindu;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.CountDownTimer;
import android.widget.TextView;

import java.time.LocalTime;
import java.util.Calendar;

public class TrisandyaCountdown {
    LocalTime localTime = LocalTime.now();
    int hour;
    int minute;
    int second ;
    TextView pujaTriSandyaText;
    TextView approachingTime;
    public TrisandyaCountdown(Context ctx, TextView approachingTimeParam, TextView pujaTriSandyaTextParam ) {

        pujaTriSandyaText = pujaTriSandyaTextParam;

        approachingTime = approachingTimeParam;
    }


    public void startPujaTrisandya(int HOUR_TARGET, int MINUTE_TARGET, int SECOND_TARGET) {
        localTime = LocalTime.now();
        hour = localTime.getHour();
        minute = localTime.getMinute();
        second = localTime.getSecond();

        setTimePujaTrisandyaText();
        int hourRemaining;
        if(hour >=18 && hour <= 23) {
            hourRemaining = (HOUR_TARGET + 24) - hour;
        }else{
            hourRemaining = Math.abs(HOUR_TARGET - hour);
        }

        int minuteRemaining = Math.abs(MINUTE_TARGET - minute);
        int secondRemaining = Math.abs(SECOND_TARGET - second);
        long countdownDuration = (hourRemaining * 3600000) + (minuteRemaining * 60000) + (secondRemaining * 1000) ;
        new CountDownTimer(countdownDuration, 1000) {
            @Override
            public void onTick(long l) {

                double milToHour = (double) l / (60 * 60 * 1000);
                int fixedHour = (int) Math.floor(milToHour);

                double milToMinutes = (double) (l % (60 * 60 * 1000)) / (60 * 1000);
                int fixedMinute = (int) Math.floor(milToMinutes);


                double milToSecond = (double) (l % (60 * 1000))  / 1000;
                int fixedSecond = (int) Math.floor(milToSecond);

                String timeFormat = fixedHour + " jam " + fixedMinute+ " menit "+ fixedSecond+ " detik menuju Puja Trisandya";
                approachingTime.setText(timeFormat);

            }

            @Override
            public void onFinish() {
                localTime = LocalTime.now();
                hour = localTime.getHour();
                if(hour >= 6 && hour < 12) {
                    startPujaTrisandya(11, 59,59);
                }else if(hour >= 12 && hour < 18) {
                    startPujaTrisandya(17, 59 ,59);
                }else{

                    startPujaTrisandya(5,59,59);
                }

            }
        }.start();

    }

    public void setTimePujaTrisandyaText() {
        if(hour >= 6 && hour < 12) {
            pujaTriSandyaText.setText("Puja Trisandya 12.00 WITA");
        }else if(hour >= 12 && hour < 18) {
            pujaTriSandyaText.setText("Puja Trisandya 18.00 WITA");
        }else{
            pujaTriSandyaText.setText("Puja Trisandya 06.00 WITA");
        }
    }

}
