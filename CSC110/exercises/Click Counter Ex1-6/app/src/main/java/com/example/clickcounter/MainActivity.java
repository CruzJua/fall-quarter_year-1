package com.example.clickcounter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
        Button click = findViewById(R.id.Clicker);
        String num = click.getText().toString();

        int parsedNum = Integer.parseInt(num);
        parsedNum = parsedNum + 1;
        String total = parsedNum + ""; //way1 to parse Concatenation

        click.setText(total);

        //Use the ValeOf method from the string class
       // String way2 = String.valueOf(parsedNum);
        //use the toString method from the primitive class
       // String way3 = Integer.toString(parsedNum);


    }
}