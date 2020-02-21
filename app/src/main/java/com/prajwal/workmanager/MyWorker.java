package com.prajwal.workmanager;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class MyWorker extends Worker {
   //Context mcontext;
   // WorkerParameters workerParameters_s;

    public MyWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
   //     this.mcontext = context;
       // this.workerParameters_s = workerParams;
    }


    @NonNull
    @Override
    public Result doWork() {
        Log.d("TAG","WORK: ");
        //my actual work....
        //Toast.makeText(getApplicationContext(), "Bitch, Learning Work Manager!", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(getApplicationContext(), NewScreen.class);
       getApplicationContext().startActivity(intent);

        return Result.success(); //true - success / false - failure
    }
}
