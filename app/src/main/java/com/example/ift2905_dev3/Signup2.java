package com.example.ift2905_dev3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;


public class Signup2 extends AppCompatActivity {
    private Spinner clubsSpinner;
    private Spinner programsSpinner;
    private TextView backButton;
    private Button connectButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup2);

        getSupportActionBar().hide();

        programsSpinner =  findViewById(R.id.program);
        clubsSpinner =  findViewById(R.id.club);
        backButton =  findViewById(R.id.backButton);

        backButton.setOnClickListener(v -> {
            Intent myIntent = new Intent(Signup2.this, Signup.class);
            Signup2.this.startActivity(myIntent);
        });

        String[] textSizes = getResources().getStringArray(R.array.clubs);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, textSizes);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        clubsSpinner.setAdapter(adapter);


        String[] textSizes2 = getResources().getStringArray(R.array.programs);
        ArrayAdapter adapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, textSizes2);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        programsSpinner.setAdapter(adapter2);

        connectButton = findViewById(R.id.connectButton);

        connectButton.setOnClickListener(v ->{
            Intent myIntent = new Intent(Signup2.this, searchFriends.class);
            Signup2.this.startActivity(myIntent);
        });

    }
}