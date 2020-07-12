package com.example.intentservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String MY_INTENT_KEY = "myintentkey";
    Button btnStart;
    TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = findViewById(R.id.btnStart);
        tvResult = findViewById(R.id.tvResult);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onbtnStartClicked();
            }
        });



    }

    private void onbtnStartClicked() {

        for(String song : Playlist.songs)
        {
            Intent intent = new Intent(this,MyIntentService.class);
            intent.putExtra(MY_INTENT_KEY,song);
            startService(intent);
        }


    }
}
