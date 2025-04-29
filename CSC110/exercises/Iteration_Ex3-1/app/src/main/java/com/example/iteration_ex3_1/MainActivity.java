package com.example.iteration_ex3_1;

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

    EditText inputIterations;
    TextView allRanNumbers;

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

        initialize();
    }


    public void initialize(){
        inputIterations = findViewById(R.id.etxtNumsBeingGenerated);
        allRanNumbers = findViewById(R.id.tvWhereTheNummbersWillBeShown);
    }
    public void onGenerate(View v){
//        int quantity = 0;
//        for (int i = 0, i < quantity, i++){
//
//        }
//
        String endResult = "";

        int numOfIterations = Integer.parseInt(inputIterations.getText().toString());

        if (numOfIterations > 0){
            for (int i = numOfIterations; i > 0; i--){
                if (i == 1) {
                    int ranNum = (int) (Math.random() * (20 + 1));
                    endResult += ranNum + "";

                }else {
                    int ranNum = (int) (Math.random() * (20 + 1));
                    endResult += ranNum + ", ";

                }
            }

            allRanNumbers.setText(endResult);

        } else{
            allRanNumbers.setText("Input a number greater that 0 please");
        }
    }

//    public int generateRandomNum(int lower, int upper){
//        int ranNum = (int) (Math.random() * (upper - lower + 1)) + lower;
//        return ranNum
//    }

}
