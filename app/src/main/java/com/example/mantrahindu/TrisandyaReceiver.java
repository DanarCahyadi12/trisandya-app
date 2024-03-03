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
        trisandyaAlarm.cancelAlarm();

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
        if (ActivityCompat.checkSelfPermission(ctx, android.Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        notificationManagerCompat.notify(123, builder.build());





    }

}
