package com.myappgen6to7mt.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.myappgen6to7mt.R;

public class HomeActivity extends AppCompatActivity {

    TextView tvUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tvUsername = findViewById(R.id.tv_username);

        Intent i = getIntent();
        String strUsername = i.getStringExtra("KEY_DATA");
       // String strRadio = i.getStringExtra("KEY_Gender");
        tvUsername.setText(strUsername );


    }
}