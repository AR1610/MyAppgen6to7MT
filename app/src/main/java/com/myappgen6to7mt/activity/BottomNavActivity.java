package com.myappgen6to7mt.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.myappgen6to7mt.R;

public class BottomNavActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_nav);
        bottomNavigationView = findViewById(R.id.bottom_view);
        setSupportActionBar(findViewById(R.id.toolbar));


        bottomNavigationView.setOnNavigationItemSelectedListener
                (new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.item_home){
                    Toast.makeText(BottomNavActivity.this, "Add", Toast.LENGTH_SHORT).show();
                }
               else if (id == R.id.item_profile){
                    Toast.makeText(BottomNavActivity.this, "Profile", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });
    }
}