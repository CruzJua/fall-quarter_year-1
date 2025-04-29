package com.example.excerciseapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void onClick(View v){

        //Get EditText
        EditText f = findViewById(R.id.firstText);
        EditText l = findViewById(R.id.lastText);

        StringBuilder sb = new StringBuilder();

        //Get the text from the EditText TO STRING
        String firstName = f.getText().toString();
        String lastName = l.getText().toString();



        //update the TextView based on the input
        TextView message = findViewById(R.id.message);
        String greeting = String.format("Hello %s %s", firstName, lastName);

        message.setText(greeting);




    }

    }
