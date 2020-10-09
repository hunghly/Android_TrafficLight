package com.example.traffic_lights;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends Activity implements View.OnClickListener {

    private ImageView redLight;
    private ImageView yellowLight;
    private ImageView greenLight;
    private Button redBtn;
    private Button yellowBtn;
    private Button greenBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Get your ImageView elements */
       /* final ImageView redLight = findViewById(R.id.red_light);
        final ImageView yellowLight = findViewById(R.id.yellow_light);
        final ImageView greenLight = findViewById(R.id.green_light);
        Button redBtn = findViewById(R.id.red_btn);
        Button yellowBtn = findViewById(R.id.yellow_btn);
        Button greenBtn = findViewById(R.id.green_btn);*/


/*        final int redLightImg = getResources().getIdentifier("@drawable/red_on", null, getPackageName());
        final int yellowLightImg = getResources().getIdentifier("@drawable/yellow_on", null, getPackageName());
        final int greenLightImg = getResources().getIdentifier("@drawable/green_on", null, getPackageName());
        final int offLightImg = getResources().getIdentifier("@drawable/light_off", null, getPackageName());*/


        /*redBtn.setOnClickListener(
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
        );*/


        // Version 2
        redLight = findViewById(R.id.red_light);
        yellowLight = findViewById(R.id.yellow_light);
        greenLight = findViewById(R.id.green_light);
        redBtn = findViewById(R.id.red_btn);
        yellowBtn = findViewById(R.id.yellow_btn);
        greenBtn = findViewById(R.id.green_btn);

        // Set on click listener by implementing on onClickListener
        redBtn.setOnClickListener(this);
        yellowBtn.setOnClickListener(this);
        greenBtn.setOnClickListener(this);
        turnOffLights();
    }

    @Override
    public void onClick(View v) {
        // check what was clicked
        turnOffLights();
        if (v == redBtn) {
            turnOnRedLight();
        } else if (v == yellowBtn) {
            turnOnYellowLight();
        } else if (v == greenBtn) {
            turnOnGreenLight();
        }
    }

    private void turnOffLights() {
        redLight.setImageResource(R.drawable.light_off);
        greenLight.setImageResource(R.drawable.light_off);
        yellowLight.setImageResource(R.drawable.light_off);
    }

    private void turnOnRedLight() {
        redLight.setImageResource(R.drawable.red_on);
    }

    private void turnOnYellowLight() {
        yellowLight.setImageResource(R.drawable.yellow_on);
    }

    private void turnOnGreenLight() {
        greenLight.setImageResource(R.drawable.green_on);
    }
}