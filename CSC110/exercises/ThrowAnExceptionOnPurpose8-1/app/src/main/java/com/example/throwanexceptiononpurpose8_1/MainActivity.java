package com.example.throwanexceptiononpurpose8_1;

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
    private TextView tvResult;
    private EditText etDividend;
    private EditText etDivisor;
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
        init();
    }
    public void init(){
        etDividend = findViewById(R.id.etDividend);
        etDivisor = findViewById(R.id.etDivisor);
        tvResult = findViewById(R.id.tvResult);
    }

    public void onDivide(View v) throws IllegalAccessException, NumberFormatException{
        DivisionProblem prob1 = new DivisionProblem();

        try {
            prob1.setDividendFromString(etDividend.getText().toString());
        } catch (NumberFormatException nfe){
            tvResult.setText("Please input a valid number value for your dividend. \n");
            return;
        }


        try {
            prob1.setDivisorFromString(etDivisor.getText().toString());
            prob1.calculateResult();
            tvResult.setText(Double.toString(prob1.getResult()));
        } catch (NumberFormatException nfe){
            tvResult.setText("Please input a valid number value for your divisor\n");
        }catch (IllegalAccessException iae){
            tvResult.setText("Hey you cannot divide by 0 buddy, please try anything else\n");
        }



    }

}