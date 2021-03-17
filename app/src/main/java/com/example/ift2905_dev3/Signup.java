package com.example.ift2905_dev3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Signup extends AppCompatActivity {
private Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        next = findViewById(R.id.connectButton);

        next.setOnClickListener(v -> {
            Intent myIntent = new Intent(Signup.this, Signup2.class);
            Signup.this.startActivity(myIntent);
        });

    }
}