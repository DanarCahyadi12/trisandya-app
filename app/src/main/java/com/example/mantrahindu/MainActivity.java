package com.example.mantrahindu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.app.NotificationChannel;
import android.app.NotificationManager;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import com.example.mantrahindu.databinding.ActivityMainBinding;

import java.time.LocalTime;


public class MainActivity extends AppCompatActivity {

    int hour;
    ActivityMainBinding binding;
    LocalTime localTime = LocalTime.now();
    private TextView pujaTrisandyaText;
    private TextView approachingTime;
    private TextView dateText;
    private TrisandyaAlarm  trisandyaAlarm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        createChannel();
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new HomeFragment());

        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
            if(item.getItemId() == R.id.home_menu_item) {
                replaceFragment(new HomeFragment());
            }else if(item.getItemId()== R.id.sloka_menu_item) {
                replaceFragment(new SlokaFragment());
            }else {
                replaceFragment(new DoaFragment());
            }

            return true;
        });

        dateText = findViewById(R.id.date);
        pujaTrisandyaText = findViewById(R.id.pujaTrisandyaText);
        approachingTime = findViewById(R.id.approaching);
        pujaTrisandyaText = findViewById(R.id.pujaTrisandyaText);
        dateText = findViewById(R.id.date);
        trisandyaAlarm = new TrisandyaAlarm(MainActivity.this);
        TrisandyaCountdown trisandyaCountdown = new TrisandyaCountdown(MainActivity.this, approachingTime,pujaTrisandyaText);
        hour = localTime.getHour();

        trisandyaAlarm.setAlarm();

        if(hour >= 6 &&  hour < 12 ) {
            trisandyaCountdown.startPujaTrisandya(11, 59 ,59);
        }else if(hour >= 12 && hour < 18) {
            trisandyaCountdown.startPujaTrisandya(17, 59 ,59);
        }else{
            trisandyaCountdown.startPujaTrisandya(5,59,59);
        }

        String currentDate = Date.getCurrentDate();
        String currentDateWithProvince = "Bali, " + currentDate;
        dateText.setText(currentDateWithProvince);



    }

    private void replaceFragment (Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.commit();
    }

    private void createChannel() {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            CharSequence name = "Puja Trisandya Channel";
            String description = "Puja Trisandya channel description";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;


            NotificationChannel notificationChannel = new NotificationChannel("pujatrisandya", name , importance);
            notificationChannel.setDescription(description);

            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(notificationChannel);
        }

    }
}