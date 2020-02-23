package com.prajwal.workmanager;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;


public class MyWorker extends Worker {
    Context mcontext;

    public MyWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
        this.mcontext = context;
    }


    @NonNull
    @Override
    public Result doWork() {
        Log.d("TAG","WORK: ");
        //my actual work....

        new Handler(Looper.getMainLooper()).post(new Runnable() {
            @Override
            public void run() {
                //Intent intent = new Intent(mcontext, NewScreen.class);
               // intent.setFlags(FLAG_ACTIVITY_NEW_TASK);
                //mcontext.startActivity(intent);
                Toast.makeText(mcontext, "Every 1 minutes", Toast.LENGTH_SHORT).show();
            }
        });


        return Result.success(); //true - success / false - failure
    }
}
