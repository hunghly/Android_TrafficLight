package com.example.traffic_lights;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Get your ImageView elements */
        final ImageView redLight = findViewById(R.id.red_light);
        final ImageView yellowLight = findViewById(R.id.yellow_light);
        final ImageView greenLight = findViewById(R.id.green_light);
        Button redBtn = findViewById(R.id.red_btn);
        Button yellowBtn = findViewById(R.id.yellow_btn);
        Button greenBtn = findViewById(R.id.green_btn);

        final int redLightImg = getResources().getIdentifier("@drawable/red_on", null, getPackageName());
        final int yellowLightImg = getResources().getIdentifier("@drawable/yellow_on", null, getPackageName());
        final int greenLightImg = getResources().getIdentifier("@drawable/green_on", null, getPackageName());
        final int offLightImg = getResources().getIdentifier("@drawable/light_off", null, getPackageName());


        redBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        redLight.setImageResource(redLightImg);
                        yellowLight.setImageResource(offLightImg);
                        greenLight.setImageResource(offLightImg);
                    }
                }
        );

        yellowBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        redLight.setImageResource(offLightImg);
                        yellowLight.setImageResource(yellowLightImg);
                        greenLight.setImageResource(offLightImg);
                    }
                }
        );

        greenBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        redLight.setImageResource(offLightImg);
                        yellowLight.setImageResource(offLightImg);
                        greenLight.setImageResource(greenLightImg);
                    }
                }
        );
    }
}