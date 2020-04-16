package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fourthactivity extends AppCompatActivity {
    Button fan, light, fridge, ac;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourthactivity);
        fan = (Button) findViewById(R.id.button1);
        light = (Button) findViewById(R.id.button2);
        ac= (Button) findViewById(R.id.button3);
        fridge = (Button) findViewById(R.id.button4);




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
