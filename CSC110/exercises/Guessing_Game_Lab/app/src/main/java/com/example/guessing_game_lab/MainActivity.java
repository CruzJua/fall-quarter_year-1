package com.example.guessing_game_lab;

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

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private EditText upper;
    private EditText lower;
    private EditText userGuess;
    private TextView userPrompts;
    private GuessingGame guess1;
    private Button start;
    private Button makeGuess;

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
    public void init (){
        upper = findViewById(R.id.editTextUpperBounds);
        lower = findViewById(R.id.editTextLowBounds);
        userGuess = findViewById(R.id.editTextGuess);
        userPrompts = findViewById(R.id.tvOutput);
        start = findViewById(R.id.btnStart);
        makeGuess = findViewById(R.id.btnGuess);


        guess1 = new GuessingGame();
        guess1.setHowManyGuessesAreLeft(3);
        guess1.setGameStatus(1);
    }

    public void onStart (View v){
        guess1.getRanNum(upper.getText().toString(), lower.getText().toString());
//        userPrompts.setText(guess1.getNumToBeGuessed() + "");
        start.setEnabled(false);
        upper.setEnabled(false);
        lower.setEnabled(false);
        userPrompts.setText("Great, now make your guess, but be careful you only have 3 tries");



    }
    public void onGuess (View v){
        userPrompts.setText(guess1.isTheGuessCorrect(userGuess.getText().toString()));
        if (guess1.getGameStatus() == 0) {
            upper.setText("");
            lower.setText("");
            userGuess.setText("");
            start.setEnabled(false);
            makeGuess.setEnabled(false);
            userGuess.setEnabled(false);
        } else {
            userGuess.setText("");
        }
    }
    public void onCreateNewGame (View v){
        upper.setText("");
        lower.setText("");
        userGuess.setText("");
        userPrompts.setText("");
        start.setEnabled(true);
        makeGuess.setEnabled(true);
        upper.setEnabled(true);
        lower.setEnabled(true);
        userGuess.setEnabled(true);
        guess1.setHowManyGuessesAreLeft(3);
        guess1.setGameStatus(1);
    }
}