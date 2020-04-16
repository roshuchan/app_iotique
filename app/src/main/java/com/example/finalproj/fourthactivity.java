package com.example.finalproj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class fourthactivity extends AppCompatActivity {
    Button fan, light, fridge, ac;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourthactivity);
        fan = findViewById(R.id.fanButton);
        light = findViewById(R.id.lightButton);
        ac = findViewById(R.id.acButton);
        fridge = findViewById(R.id.fridgeButton);

        fan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fourthactivity.this, fifthactivity.class);
                startActivity(intent);
            }
        });

        light.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fourthactivity.this, fifthactivity.class);
                startActivity(intent);
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fourthactivity.this, fifthactivity.class);
                startActivity(intent);
            }
        });
        fridge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(fourthactivity.this, fifthactivity.class);
                startActivity(intent);
            }
        });
    }
}
