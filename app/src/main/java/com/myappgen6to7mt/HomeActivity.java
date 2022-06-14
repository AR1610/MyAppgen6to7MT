package com.myappgen6to7mt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView tvUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tvUsername = findViewById(R.id.tv_username);

        Intent i = getIntent();
        String strUsername = i.getStringExtra("KEY_USERNAME");
        String strRadio = i.getStringExtra("KEY_Gender");
        tvUsername.setText("Welcome " + strUsername +"Gender "+strRadio);


    }
}