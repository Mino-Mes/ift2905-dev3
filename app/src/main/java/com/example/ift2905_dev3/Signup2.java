package com.example.ift2905_dev3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class Signup2 extends AppCompatActivity {
    private Spinner clubsSpinner;
    private Spinner programsSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup2);

        programsSpinner =  findViewById(R.id.program);
        clubsSpinner =  findViewById(R.id.club);

        String[] textSizes = getResources().getStringArray(R.array.clubs);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, textSizes);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        clubsSpinner.setAdapter(adapter);


        String[] textSizes2 = getResources().getStringArray(R.array.programs);
        ArrayAdapter adapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_item, textSizes2);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        programsSpinner.setAdapter(adapter2);


    }
}