package com.myappgen6to7mt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.textfield.TextInputEditText;

public class MaterialEditTextActivity extends AppCompatActivity {

        TextInputEditText edtEmail,edtpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_edit_text);
        edtEmail = findViewById(R.id.edt_email);
    }
}