package com.example.traffic_lights;

import androidx.appcompat.app.AppCompatActivity;

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
        ImageView redLight = findViewById(R.id.red_light);
        ImageView yellowLight = findViewById(R.id.yellow_light);
        ImageView greenLight = findViewById(R.id.green_light);
        Button redBtn = findViewById(R.id.red_btn);
        Button yellowBtn = findViewById(R.id.yellow_btn);
        Button greenBtn = findViewById(R.id.green_btn);

        greenBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        System.out.println("Clicked Green Btn!");
                    }
                }
        );


    }
}