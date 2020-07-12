package com.example.intentservice;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;


public class MyIntentService extends IntentService {

    private static final String TAG = "mytag";

    public MyIntentService() {
        super("MyIntentService");
    }


    @Override
    public void onCreate() {
        super.onCreate();
        setIntentRedelivery(true);
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        String song = intent.getStringExtra(MainActivity.MY_INTENT_KEY).toUpperCase();
        downloadSong(song);

    }

    private void downloadSong(String song) {
        Log.d(TAG, "downloadSong: " + song + "started");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Log.d(TAG, "downloadSong: " + song + "downloaded");
    }



}
