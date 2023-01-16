package com.bikramshahi228.recyclerviewbikram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreen1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen1);

        Thread thread = new Thread(){
            public void run() {
                try {
                    sleep(2000);

                }catch (Exception e){
                    e.printStackTrace();

                }finally {
                    Intent intent = new Intent(SplashScreen1.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        };  thread.start();
    }
}