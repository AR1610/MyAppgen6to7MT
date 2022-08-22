package com.myappgen6to7mt.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.myappgen6to7mt.R;
import com.myappgen6to7mt.model.LangModel;

import java.util.ArrayList;

public class RecyclerviewActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String strLang[] = {"Android","Java","PHP","C","C++","IOS","Python"};
    int imgLang[] = {R.mipmap.ic_launcher_round,R.drawable.ic_java,
            R.drawable.ic_php,R.drawable.ic_c,R.drawable.ic_cc,
            R.drawable.ic_ios,R.drawable.ic_php};

    ArrayList<LangModel> langModelArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        recyclerView = findViewById(R.id.recycler_view);

        langModelArrayList = new ArrayList<LangModel>();
        for (int i = 0; i <strLang.length ; i++){

            LangModel langModel = new LangModel(strLang[i], imgLang[i]);
            langModelArrayList.add(langModel);
        }


        MyRecyclerAdapter myRecyclerAdapter = new MyRecyclerAdapter(this,langModelArrayList);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        layoutManager.setReverseLayout(false);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(myRecyclerAdapter);

    }
}