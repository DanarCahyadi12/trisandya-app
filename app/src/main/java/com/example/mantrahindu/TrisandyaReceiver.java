package com.example.mantrahindu;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.util.Log;

import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;


public class TrisandyaReceiver extends BroadcastReceiver {
    private TrisandyaAlarm trisandyaAlarm;

    @Override
    public void onReceive(Context ctx, Intent intent) {
        Intent nextActivity = new Intent(ctx, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);

        trisandyaAlarm = new TrisandyaAlarm(ctx);
        trisandyaAlarm.setAlarm();

        PendingIntent pendingIntent = PendingIntent.getActivity(ctx, 0, nextActivity, PendingIntent.FLAG_IMMUTABLE);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(ctx, "pujatrisandya")
                .setSmallIcon(R.drawable.pray)
                .setContentTitle("Mantra Hindu")
                .setContentText("Saatnya Puja Trisandya")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setContentIntent(pendingIntent)
                .setSilent(true);

        MediaPlayer mediaPlayer = MediaPlayer.create(ctx, R.raw.trisandya);
        mediaPlayer.start();


        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mediaPlayer.release();
            }
        });
        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(ctx);
        notificationManagerCompat.notify(123, builder.build());
        Log.d("Receive", "Trisandya time");





    }

}
