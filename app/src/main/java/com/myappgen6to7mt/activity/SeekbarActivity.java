package com.myappgen6to7mt.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

import com.myappgen6to7mt.R;

public class SeekbarActivity extends AppCompatActivity {

    private SeekBar seekbar;
    RatingBar ratingBar;
    private TextView tvSeekbar,tvRatingbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar);
        seekbar = (SeekBar)findViewById(R.id.seekbar);
        tvSeekbar = (TextView)findViewById(R.id.tv_seekbar);
        ratingBar = findViewById(R.id.ratingbar);
        tvRatingbar = findViewById(R.id.tv_ratingbar);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                tvRatingbar.setText(String.valueOf(rating));
            }
        });
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                tvSeekbar.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}