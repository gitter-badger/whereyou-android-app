package com.skynox.whereyou.app;

/**
 * Автор: Алексей Плешков (AlekseySkynox)
 * Проект: WhereYou
 * Дата: 28.11.2015
 */

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import com.skynox.whereyou.app.activity.MapActivity;

public class MainActivity extends AppCompatActivity {

    private int layout = R.layout.activity_main;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout);
    }


    @Override
    public void onStart() {
        super.onStart();
        new CountDownTimer(2000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                goToMapActivity();
            }
        }.start();
    }


    public void goToMapActivity() {
        Intent intent = new Intent(this, MapActivity.class);
        startActivity(intent);
    }

}