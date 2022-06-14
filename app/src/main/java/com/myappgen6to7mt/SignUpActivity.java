package com.myappgen6to7mt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    EditText edtFn,edtLn,edtEmail,edtPassword,edtContact;
    Button btnSignup;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        edtFn = findViewById(R.id.edt_fn);
        edtLn = findViewById(R.id.edt_ln);
        edtEmail = findViewById(R.id.edt_email);

        btnSignup =findViewById(R.id.btn_signUp);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String strFn = edtFn.getText().toString();
                String strLn = edtLn.getText().toString();
                String strEmail = edtEmail.getText().toString();

                if (strFn.equals("")){
                    Toast.makeText(SignUpActivity.this, "Please enter first Name", Toast.LENGTH_SHORT).show();
                }else  if(strLn.equals("")){
                    Toast.makeText(SignUpActivity.this, "Please enter Last Name", Toast.LENGTH_SHORT).show();
                }else  if (strEmail.equals("")){
                    Toast.makeText(SignUpActivity.this, "Please enter Email", Toast.LENGTH_SHORT).show();

                }else  if (!strEmail.matches(emailPattern)){
                    Toast.makeText(SignUpActivity.this, "Please enter valid Email", Toast.LENGTH_SHORT).show();

                }
                else {
                    // intent code  login page
                }
            }
        });
    }
}