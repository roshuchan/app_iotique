package com.example.finalproj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
  EditText name;
  EditText password;
  Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = findViewById(R.id.loginButton);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(name.getText().toString(),password.getText().toString());

            }
        });

    }

    private void validate(String username, String userpassword) {
        if((username.equals("admin"))&&(userpassword.equals("chocolate")))
        {
            Intent intent= new Intent(MainActivity.this,secondactivity.class);
            startActivity(intent);

        }
        else
        {
            System.out.println("not authorised user");
        }
    }
}
