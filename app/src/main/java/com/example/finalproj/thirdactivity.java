package com.example.finalproj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class thirdactivity extends AppCompatActivity {
    Button bedroom, kitchen, hall, dining;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdactivity);
        bedroom = findViewById(R.id.bedroom);
        kitchen = findViewById(R.id.kitchen);
        hall = findViewById(R.id.hall);
        dining = findViewById(R.id.dining);


        bedroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(thirdactivity.this, fourthactivity.class);
                startActivity(intent);


            }
        });
        kitchen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(thirdactivity.this, fourthactivity.class);
                startActivity(intent);


            }
        });
        hall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(thirdactivity.this, fourthactivity.class);
                startActivity(intent);


            }
        });
        dining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(thirdactivity.this, fourthactivity.class);
                startActivity(intent);


            }
        });
    }
}