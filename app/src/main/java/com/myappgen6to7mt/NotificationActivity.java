package com.myappgen6to7mt;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.myappgen6to7mt.activity.CustomGridViewActivity;
import com.myappgen6to7mt.activity.CustomListViewActivity;

public class NotificationActivity extends AppCompatActivity {

    Button btnNotification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        btnNotification = findViewById(R.id.btn_notification);

        btnNotification.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {

                NotificationChannel notificationChannel =
                        new NotificationChannel("CHANNEL_ID","CHANNEL_NAME", NotificationManager.IMPORTANCE_HIGH);

                Intent i = new Intent(NotificationActivity.this, CustomListViewActivity.class);
                PendingIntent pendingIntent =
                        PendingIntent.getActivity(NotificationActivity.this,1,i,PendingIntent.FLAG_ONE_SHOT);

                NotificationCompat.Builder builder = new NotificationCompat.Builder(NotificationActivity.this);
                builder.setSmallIcon(R.drawable.android);
                builder.setContentTitle("MyAPP_Gen_6to7");
                builder.setContentText("No Lecture Today");
                builder.setContentIntent(pendingIntent);
                builder.setChannelId("CHANNEL_ID");

                NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                notificationManager.createNotificationChannel(notificationChannel);
                notificationManager.notify(1,builder.build());


            }
        });
    }
}