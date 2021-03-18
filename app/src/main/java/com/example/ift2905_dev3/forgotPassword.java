package com.example.ift2905_dev3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class forgotPassword extends AppCompatActivity {

    private TextView backButton;
    private Button sendEmail;
    private Button connect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        getSupportActionBar().hide();

        backButton =  findViewById(R.id.backButton);
        sendEmail = findViewById(R.id.sendEmailButon);
        connect = findViewById(R.id.connectButton);

        backButton.setOnClickListener(v -> {
            Intent myIntent = new Intent(forgotPassword.this, MainActivity.class);
            forgotPassword.this.startActivity(myIntent);
        });


        sendEmail.setOnClickListener(v -> {
            Snackbar snackBar = Snackbar .make(v, "Le Email a été envoyé!", Snackbar.LENGTH_LONG);
            snackBar.show();
        });

        connect.setOnClickListener(v -> {
            Intent myIntent = new Intent(forgotPassword.this, searchFriends.class);
            forgotPassword.this.startActivity(myIntent);
        });

    }
}