package com.example.creating_random_number_generator_gui_ex2_4;

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

    public void onGenerateRandomNumberClick(View v){
        EditText low = findViewById(R.id.etLowerBound);
        EditText upper = findViewById(R.id.etUpperBound);
        TextView num = findViewById(R.id.tvRandomNumber);


        String maxNum = upper.getText().toString();
        String minNum = low.getText().toString();

        int max = Integer.parseInt(maxNum);
        int min = Integer.parseInt(minNum);


        int ranNum = (int)(Math.random() * (max - min + 1)) + min;
        String numTxt = ranNum + "";
        num.setText(numTxt);


    }
}