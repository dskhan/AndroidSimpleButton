package com.justaitry;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button touchMeButton;
    private TextView touchedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find views by ID
        touchMeButton = findViewById(R.id.touchMeButton);
        touchedText = findViewById(R.id.touchedText);

        // Set click listener on button
        touchMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (touchedText.getVisibility() == View.GONE) {
                    touchedText.setVisibility(View.VISIBLE);
                } else {
                    touchedText.setVisibility(View.GONE);
                }
            }
        });
    }
}
