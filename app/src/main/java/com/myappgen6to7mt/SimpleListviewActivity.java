package com.myappgen6to7mt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SimpleListviewActivity extends AppCompatActivity {

    ListView listView;
    String strData[] = {"Product 1","Product 2","Product 3","Product 4","Product 5",
            "Product 6","Product 7","Product 8"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_listview);
        listView = findViewById(R.id.list_view);
        ArrayAdapter<String> arrayAdapter = new
                ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,strData);
        listView.setAdapter(arrayAdapter);



    }
}