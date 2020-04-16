package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
  EditText name;
  EditText password;
  Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      name=(EditText)findViewById(R.id.text1);
        password=(EditText)findViewById(R.id.text2);
        login=(Button)findViewById(R.id.button1);
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
