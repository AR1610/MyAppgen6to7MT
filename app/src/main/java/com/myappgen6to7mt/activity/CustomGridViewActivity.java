package com.myappgen6to7mt.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.myappgen6to7mt.adapter.GridAdapter;
import com.myappgen6to7mt.model.LangModel;
import com.myappgen6to7mt.R;

import java.util.ArrayList;

public class CustomGridViewActivity extends AppCompatActivity {
GridView gridView;

    String strLang[] = {"Android","Java","PHP","C","C++","IOS","Python"};
    int imgLang[] = {R.mipmap.ic_launcher_round,R.drawable.ic_java,R.drawable.ic_php,
            R.drawable.ic_c,R.drawable.ic_cc,
            R.drawable.ic_ios,R.drawable.ic_php};
    ArrayList <LangModel> langModelArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_grid_view);
        gridView = findViewById(R.id.grid_view);

        langModelArrayList = new ArrayList<LangModel>();
        for (int i = 0; strLang.length >i ; i++){

            LangModel langModel = new LangModel(strLang[i],imgLang[i]);
            langModelArrayList.add(langModel);

        }

        GridAdapter gridAdapter = new GridAdapter(this,langModelArrayList);
        gridView.setAdapter(gridAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(CustomGridViewActivity.this, "Data is "+langModelArrayList.get(i).getStrLang(),
                        Toast.LENGTH_SHORT).show();
            }
        });


    }
}