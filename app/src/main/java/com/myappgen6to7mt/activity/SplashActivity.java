package com.myappgen6to7mt.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.myappgen6to7mt.NavigationActivity;
import com.myappgen6to7mt.utils.GifImageView;
import com.myappgen6to7mt.R;

public class SplashActivity extends AppCompatActivity {

    int time = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
     //   getSupportActionBar().hide();
        GifImageView gifImageView = findViewById(R.id.img_gif);
        gifImageView.setGifImageResource(R.drawable.android);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this, RecyclerviewActivity.class);
                startActivity(i);
                finish();
            }
        }, time);

    }
}