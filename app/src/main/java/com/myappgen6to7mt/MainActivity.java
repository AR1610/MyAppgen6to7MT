package com.myappgen6to7mt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtUserName;
    TextView tvUsername;
    ImageView imageView;
    Button btnLogin,btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUserName = findViewById(R.id.edt_username);
        btnLogin = findViewById(R.id.btn_login);
        tvUsername = findViewById(R.id.tv_login);
        imageView = findViewById(R.id.img_logo);
        btnSend = findViewById(R.id.btn_send);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com"));
              startActivity(i);


            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strUserName = edtUserName.getText().toString();
                tvUsername.setText(strUserName);
                imageView.setImageResource(R.drawable.ic_person);
                Toast.makeText(MainActivity.this, "UserName is " + strUserName, Toast.LENGTH_SHORT).show();

                // Explicit Intent
                Intent i = new Intent(MainActivity.this, HomeActivity.class);
                i.putExtra("KEY_USERNAME",strUserName);
                startActivity(i);
                // over Explicit Intent


            }
        });

    }
}