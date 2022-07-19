package com.myappgen6to7mt.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import com.myappgen6to7mt.R;

public class SimpleGridViewActivity extends AppCompatActivity {

    GridView gridView;
    String strLang[] = {"Android","Java",".net","PHP","C","C++","Python","IOS"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_grid_view);
        gridView = findViewById(R.id.grid_view);

/*        ArrayAdapter<String> arrayAdapter = new
                ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,strLang);*/
        ArrayAdapter<String> arrayAdapter = new
                ArrayAdapter<String>(this, R.layout.raw_grid,R.id.tv_data,strLang);
        gridView.setAdapter(arrayAdapter);


    }
}