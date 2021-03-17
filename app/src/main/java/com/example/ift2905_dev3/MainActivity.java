package com.example.ift2905_dev3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button connectionButton;
    private Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connectionButton =  findViewById(R.id.connectButton);
        signUpButton = findViewById(R.id.createAccountButton);


        signUpButton.setOnClickListener( v->
        {
            Intent myIntent = new Intent(MainActivity.this, Signup.class);
            MainActivity.this.startActivity(myIntent);
        });
    }
}