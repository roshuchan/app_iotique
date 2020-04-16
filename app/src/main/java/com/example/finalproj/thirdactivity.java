package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class thirdactivity extends AppCompatActivity {
    Button bedroom, kitchen, hall, dining;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdactivity);
        bedroom = (Button) findViewById(R.id.button1);
        kitchen = (Button) findViewById(R.id.button2);
        hall = (Button) findViewById(R.id.button3);
        dining = (Button) findViewById(R.id.button4);


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