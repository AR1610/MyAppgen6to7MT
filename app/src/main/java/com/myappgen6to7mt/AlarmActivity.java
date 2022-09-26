package com.myappgen6to7mt;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AlarmActivity extends AppCompatActivity {
Button btnAlarm;
EditText edtTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
        btnAlarm = findViewById(R.id.btn_alarm);
        edtTime = findViewById(R.id.edt_time);
        btnAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent  i = new Intent(AlarmActivity.this,BroadCast.class);
                PendingIntent pendingIntent = PendingIntent.getBroadcast(AlarmActivity.this,1,i,PendingIntent.FLAG_ONE_SHOT);

                int time = Integer.parseInt(edtTime.getText().toString());
                AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
                alarmManager.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()+(time*1000),pendingIntent);


            }
        });
    }
}