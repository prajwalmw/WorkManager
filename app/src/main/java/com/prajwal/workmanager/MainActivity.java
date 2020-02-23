package com.prajwal.workmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;

import android.os.Bundle;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    // OneTimeWorkRequest oneTimeWorkRequest;
    public static PeriodicWorkRequest periodicWorkRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // TextView textView = findViewById(R.id.text);

        /*oneTimeWorkRequest = new OneTimeWorkRequest.Builder(MyWorker.class)
                .setConstraints(new Constraints.Builder()
                        .setRequiredNetworkType(NetworkType.METERED)
                        .build())
                .build();


        WorkManager.getInstance().enqueue(oneTimeWorkRequest);*/


        periodicWorkRequest = new PeriodicWorkRequest.Builder(MyWorker.class,15, TimeUnit.MINUTES)
                .setConstraints(new Constraints.Builder()
                        .setRequiredNetworkType(NetworkType.METERED)
                        .build())
                .build();

        WorkManager.getInstance().enqueue(periodicWorkRequest);
    }
}
