package com.example.menipostavke;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class teme extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teme);

        RadioButton radioButton = findViewById(R.id.radio_light);
        radioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "U budućnosti 😁", Toast.LENGTH_LONG).show();

            }
        });

        RadioButton radioButton1 = findViewById(R.id.radio_dark);
        radioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Odabrali ste tamnu temu (niste) 😇", Toast.LENGTH_LONG).show();

            }
        });
    }
}

