package com.myappgen6to7mt.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.myappgen6to7mt.R;
import com.myappgen6to7mt.fragments.AFragment;
import com.myappgen6to7mt.fragments.BFragment;

public class Task2Activity extends AppCompatActivity {

    Button btnChat,btnStatus,btnCall;
    View vChat,vSatus,vCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2);

        btnChat = findViewById(R.id.btn_chat);
        btnStatus = findViewById(R.id.btn_status);
        btnCall = findViewById(R.id.btn_call);

        vChat = findViewById(R.id.v_chat);
        vSatus = findViewById(R.id.v_status);
        vCall = findViewById(R.id.v_call);


        btnChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AFragment aFragment = new AFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.frame,aFragment);
                fragmentTransaction.commit();

                vChat.setVisibility(View.VISIBLE);
                vSatus.setVisibility(View.INVISIBLE);
                vCall.setVisibility(View.INVISIBLE);

            }
        });



        btnStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                BFragment bFragment = new BFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.frame,bFragment);
                fragmentTransaction.commit();

                vChat.setVisibility(View.INVISIBLE);
                vSatus.setVisibility(View.VISIBLE);
                vCall.setVisibility(View.INVISIBLE);

            }
        });


    }
}