package com.myappgen6to7mt.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.myappgen6to7mt.R;

public class TypeofMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typeof_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.item_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.item_add){
            Toast.makeText(this, "Add is Selected", Toast.LENGTH_SHORT).show();
        }else if (id ==R.id.item_delete )
        {
            Toast.makeText(this, "Delete is Selected", Toast.LENGTH_SHORT).show();

        }
        return super.onOptionsItemSelected(item);
    }
}