package com.myappgen6to7mt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ServiceActivity extends AppCompatActivity
        implements View.OnClickListener {
    Button btnStart, btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
        btnStart = findViewById(R.id.btn_start);
        btnStop = findViewById(R.id.btn_stop);
        btnStart.setOnClickListener(this);
        btnStop.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        int id = view.getId();

        if (id == R.id.btn_start){

            Intent i = new Intent(ServiceActivity.this,MyService.class);
            startService(i);

        }else if (id == R.id.btn_stop){

            Intent i = new Intent(ServiceActivity.this,MyService.class);
            stopService(i);
        }
    }
}