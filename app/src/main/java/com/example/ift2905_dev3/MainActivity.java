package com.example.ift2905_dev3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button connectionButton;
    private Button signUpButton;
    private TextView forgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        connectionButton =  findViewById(R.id.connectButton);
        signUpButton = findViewById(R.id.createAccountButton);
        forgotPassword =  findViewById(R.id.forgotLabel);

        forgotPassword.setOnClickListener(v -> {
            Intent myIntent = new Intent(MainActivity.this, forgotPassword.class);
            MainActivity.this.startActivity(myIntent);
        });

        signUpButton.setOnClickListener( v->
        {
            Intent myIntent = new Intent(MainActivity.this, Signup.class);
            MainActivity.this.startActivity(myIntent);
        });

        connectionButton.setOnClickListener(v -> {
            Intent myIntent = new Intent(MainActivity.this, searchFriends.class);
            MainActivity.this.startActivity(myIntent);
        });
    }
}