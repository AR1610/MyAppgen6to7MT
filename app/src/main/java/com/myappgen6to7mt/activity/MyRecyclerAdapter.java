package com.myappgen6to7mt.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.myappgen6to7mt.R;
import com.myappgen6to7mt.model.LangModel;

import java.util.ArrayList;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder> {

    Context context;
    ArrayList<LangModel> langModelArrayList;

    public MyRecyclerAdapter(Context context, ArrayList<LangModel> langModelArrayList) {

        this.context = context;
        this.langModelArrayList = langModelArrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View myView = LayoutInflater.from(context).inflate(R.layout.raw_cutm_list, null);
        return new MyViewHolder(myView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.imgData.setImageResource(langModelArrayList.get(position).getImgLang());
        holder.tvData.setText(langModelArrayList.get(position).getStrLang());
        holder.tvData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, langModelArrayList.get(position).getStrLang(), Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public int getItemCount() {
        return langModelArrayList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imgData;
        TextView tvData;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imgData = itemView.findViewById(R.id.img_data);
            tvData = itemView.findViewById(R.id.tv_data);
        }
    }
}
