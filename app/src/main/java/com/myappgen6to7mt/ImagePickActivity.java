package com.myappgen6to7mt;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImagePickActivity extends AppCompatActivity {

    Button btnGallery, btnCamera;
    private ImageView imgDp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_pick);
        btnGallery = findViewById(R.id.btn_gallery);
        imgDp = (ImageView) findViewById(R.id.img_dp);
        btnCamera = findViewById(R.id.btn_camera);

        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent  i = new Intent();
                i.setAction(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i,12);

            }
        });
        btnGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent();
                i.setType("image/*");
                i.setAction(Intent.ACTION_PICK);
                startActivityForResult(i, 11);

            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 11) {

            Uri uri = data.getData();
            imgDp.setImageURI(uri);
        }

        if (requestCode == 12){

            Bitmap bitmap = (Bitmap) data.getExtras().get("data");
            imgDp.setImageBitmap(bitmap);
        }

    }
}