package com.missionedappdev.missoned;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN_TIME_OUT=2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /* new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               Intent i = new Intent(MainActivity.this,onboarding.class);
               startActivity(i);
               finish();
           }
       },SPLASH_SCREEN_TIME_OUT);*/

      startActivity(new Intent(MainActivity.this,HomeScreen.class));

    }
}
