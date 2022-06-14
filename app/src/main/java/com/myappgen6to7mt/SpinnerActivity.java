package com.myappgen6to7mt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class SpinnerActivity extends AppCompatActivity {

    Spinner spinner;
    TextView tvSpinner;
    String strLang[] = {"Android","java",".net","PHP","Flutter","IOS","Python"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        spinner = findViewById(R.id.spinner);
        tvSpinner = findViewById(R.id.tv_selected_item);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,strLang);
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String strData = parent.getItemAtPosition(position).toString();
                tvSpinner.setText("Selected item is "+strData);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




    }
}