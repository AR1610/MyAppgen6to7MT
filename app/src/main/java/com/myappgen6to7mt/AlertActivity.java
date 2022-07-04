package com.myappgen6to7mt;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AlertActivity extends AppCompatActivity {

    Button btnAlert, btnCustomAlert, btnCustomToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);

        btnAlert = findViewById(R.id.btn_alert);
        btnCustomAlert = findViewById(R.id.btn_ctm_alert);
        btnCustomToast = findViewById(R.id.btn_ctm_toast);

        btnCustomToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater layoutInflater = getLayoutInflater();
                View myToast = layoutInflater.inflate(R.layout.raw_toast, null);
                Toast toast = new Toast(AlertActivity.this);
                toast.setView(myToast);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        btnCustomAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LayoutInflater layoutInflater = getLayoutInflater();
                View myview = layoutInflater.inflate(R.layout.raw_custom_dialog, null);
                AlertDialog.Builder builder = new AlertDialog.Builder(AlertActivity.this);
                AlertDialog alertDialog = builder.create();
                alertDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                alertDialog.setView(myview);
                Button btnCancel = myview.findViewById(R.id.btn_cancel);
                Button btnSearch = myview.findViewById(R.id.btn_search);
                EditText edtUsername = myview.findViewById(R.id.edt_email);
                btnSearch.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        
                        if (alertDialog.isShowing()){
                            alertDialog.dismiss();
                        }
                        String strEmail = edtUsername.getText().toString();
                        View myToast = layoutInflater.inflate(R.layout.raw_toast, null);
                        Toast toast = new Toast(AlertActivity.this);
                        TextView tvData = myToast.findViewById(R.id.tv_data);
                        tvData.setText(strEmail);
                        toast.setView(myToast);
                        toast.setDuration(Toast.LENGTH_SHORT);
                        toast.show();
                    }
                });
                btnCancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (alertDialog.isShowing()) {
                            alertDialog.dismiss();
                        }
                    }
                });
                alertDialog.show();
            }
        });

        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder = new AlertDialog.Builder(AlertActivity.this);
                builder.setIcon(R.drawable.customer);
                builder.setTitle("Alert Dialog");
                builder.setMessage("Are you sure, you want to delete this file ?");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(AlertActivity.this, "Yes is clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                builder.setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(AlertActivity.this, "No", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNeutralButton("finish", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();
                    }
                });

                builder.show();


            }
        });
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();

        AlertDialog.Builder builder = new AlertDialog.Builder(AlertActivity.this);
        builder.setIcon(R.drawable.customer);
        builder.setTitle("Alert Dialog");
        builder.setMessage("Are you sure, you want to Exit?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

              finish();
            }
        });

        builder.setNegativeButton(R.string.no, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            dialog.dismiss();
            }
        });
        builder.show();
    }
}