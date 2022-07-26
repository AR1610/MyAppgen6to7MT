package com.myappgen6to7mt.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.myappgen6to7mt.R;
import com.myappgen6to7mt.fragments.AFragment;
import com.myappgen6to7mt.fragments.BFragment;

public class FragmentLoadActivity extends AppCompatActivity {

    Button btnA,btnB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_load);
        btnA = findViewById(R.id.btn_a);
        btnB = findViewById(R.id.btn_b);

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AFragment aFragment = new AFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.frame,aFragment);
                fragmentTransaction.commit();
            }
        });

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                BFragment bFragment = new BFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.frame,bFragment);
                fragmentTransaction.commit();
            }
        });

    }
}