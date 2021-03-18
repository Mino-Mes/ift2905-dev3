package com.example.ift2905_dev3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Signup extends AppCompatActivity {

    private Button next;
    private TextView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        getSupportActionBar().hide();

        next = findViewById(R.id.connectButton);
        back = findViewById(R.id.backButton);

        next.setOnClickListener(v -> {
            Intent myIntent = new Intent(Signup.this, Signup2.class);
            Signup.this.startActivity(myIntent);
        });

        back.setOnClickListener(v -> {
            Intent myIntent = new Intent(Signup.this, MainActivity.class);
            Signup.this.startActivity(myIntent);
        });

    }
}