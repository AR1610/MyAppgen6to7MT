package com.myappgen6to7mt.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.myappgen6to7mt.R;
import com.myappgen6to7mt.model.LangModel;

import java.util.ArrayList;

public class GridAdapter extends BaseAdapter {

    Context context;
    ArrayList<LangModel> langModelArrayList;

    public GridAdapter(Context context, ArrayList<LangModel> langModelArrayList) {
        this.context = context;
        this.langModelArrayList = langModelArrayList;
    }

    @Override
    public int getCount() {
        return langModelArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return langModelArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(R.layout.raw_cutm_grid,null);

        ImageView imgData = view.findViewById(R.id.img_data);
        TextView tvData = view.findViewById(R.id.tv_data);

        imgData.setImageResource(langModelArrayList.get(i).getImgLang());
        tvData.setText(langModelArrayList.get(i).getStrLang());

      /*  view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String data =  langModelArrayList.get(i).getStrLang();

                Intent i = new Intent(context,HomeActivity.class);
                i.putExtra("KEY_DATA",data);
                context.startActivity(i);
            }
        });*/

        return view;
    }
}
