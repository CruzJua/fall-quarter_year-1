package com.example.functional_calculator_lab2;

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


    public void onCalculate(View v){
        EditText num1 = findViewById(R.id.etxtNum1);
        EditText num2 = findViewById(R.id.etxtNum2);
        TextView answers = findViewById(R.id.tvCalculations);

        String first = num1.getText().toString();
        String second = num2.getText().toString();

        int firstNum = Integer.parseInt(first);
        int secondNum = Integer.parseInt(second);
        String result = "Add: " + doAdditionEquation(firstNum, secondNum) + "\nSubtract: " + doSubtractionEquation(firstNum, secondNum) + "\nMultiply: " + doMultiplicationEquation(firstNum, secondNum) + "\nDivide: " + doDivisionEquation(firstNum, secondNum) + "\nMod: " + doModulusEquation(firstNum, secondNum);
        answers.setText(result);

    }

    public void onRandomNum1(View v){
        EditText num1 = findViewById(R.id.etxtNum1);

        int ranNum = (int)(Math.random() * (20 + 1));
        String numTxt = ranNum + "";
        num1.setText(numTxt);

    }

    public void onRandomNum2(View v){
        EditText num2 = findViewById(R.id.etxtNum2);

        int ranNum = (int)(Math.random() * (20 + 1));
        String numTxt = ranNum + "";
        num2.setText(numTxt);

    }

    public static String doAdditionEquation(int int1, int int2){
        int sum = int1 + int2;
        String formula = int1 + " + " + int2 + " = " + sum;
        return formula;
    }
    public static String doSubtractionEquation(int int1, int int2){
        int difference = int1 - int2;
        String formula = int1 + " - " + int2 + " = " + difference;
        return formula;
    }
    public static String doMultiplicationEquation(int int1, int int2){
        int product = int1 * int2;
        String formula = int1 + " * " + int2 + " = " + product;
        return formula;
    }

    public static String doDivisionEquation(int int1, int int2){
        float quotient;
        if (int2 !=- 0){
             quotient = (float) int1 / int2;
        }else {
             quotient = -1.0f;
        }
        String formula = int1 + " / " + int2 + " = " + quotient;
        return formula;
    }

    public static String doModulusEquation(int int1, int int2){
        int remainder;
        if (int2 > 0){
            remainder = int1 % int2;
        }else {
            remainder = 0;
        }
        String formula = int1 + " % " + int2 + " = " + remainder;
        return formula;
    }
}