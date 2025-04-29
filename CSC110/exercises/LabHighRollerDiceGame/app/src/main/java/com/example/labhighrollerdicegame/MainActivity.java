package com.example.labhighrollerdicegame;


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
    TextView tvScore1;
    TextView tvScore2;
    TextView tvScore3;
    TextView rolledDie1;
    TextView rolledDie2;
    TextView rolledDie3;
    TextView rolledDie4;
    TextView turnDisplay;
    EditText etxtPlayerName1;
    EditText etxtPlayerName2;
    EditText etxtPlayerName3;
    Button btnNextStep;
    Button newGame;
    Die die1;
    Die die2;
    Die die3;
    Die die4;
    Player player1;
    Player player2;
    Player player3;
    Game game;
    String turn;

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
        tvScore1 = findViewById(R.id.tvPlayerScore1);
        tvScore2 = findViewById(R.id.tvPlayerScore2);
        tvScore3 = findViewById(R.id.tvPlayerScore3);
        turnDisplay = findViewById(R.id.tvTurnDisplay);
        rolledDie1 = findViewById(R.id.tvDie1);
        rolledDie2 = findViewById(R.id.tvDie2);
        rolledDie3 = findViewById(R.id.tvDie3);
        rolledDie4 = findViewById(R.id.tvDie4);
        etxtPlayerName1 = findViewById(R.id.etxtPlayerName1);
        etxtPlayerName2 = findViewById(R.id.etxtPlayerName2);
        etxtPlayerName3 = findViewById(R.id.etxtPlayerName3);
        btnNextStep = findViewById(R.id.btnNextStep);
        newGame = findViewById(R.id.btnNewGame);
        die1 = new Die();
        die2 = new Die();
        die3 = new Die();
        die4 = new Die();
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();
        game = new Game();

    }
    public void onClick(View view){
        Button btnClicked = (Button)view;
        String btnText = btnClicked.getText().toString();


        if(game.getRound() != 4) {
            switch (btnText){
                case "Start the game":
                    player1.setName(etxtPlayerName1.getText().toString());
                    player2.setName(etxtPlayerName2.getText().toString());
                    player3.setName(etxtPlayerName3.getText().toString());
                    tvScore1.setText(player1.getScore() + "");
                    tvScore2.setText(player2.getScore() + "");
                    tvScore3.setText(player3.getScore() + "");
                    btnNextStep.setText("Roll the dice");
                    etxtPlayerName1.setEnabled(false);
                    etxtPlayerName2.setEnabled(false);
                    etxtPlayerName3.setEnabled(false);
                    game.setPlayerTurn1(true);
                    game.setRound(1);
                    turnDisplay.setVisibility(View.VISIBLE);
                    turnDisplay.setText("It's " + player1.getName() + "'s turn to roll");
                    break;
                case "Roll the dice":
                    if(game.isPlayerTurn1()){
                        die1.roll();
                        die2.roll();
                        die3.roll();
                        die4.roll();
                        rolledDie1.setText( String.valueOf(die1.getDieFace()));
                        rolledDie2.setText( String.valueOf(die2.getDieFace()));
                        rolledDie3.setText( String.valueOf(die3.getDieFace()));
                        rolledDie4.setText( String.valueOf(die4.getDieFace()));
                        rolledDie1.setVisibility(View.VISIBLE);
                        rolledDie2.setVisibility(View.VISIBLE);
                        rolledDie3.setVisibility(View.VISIBLE);
                        rolledDie4.setVisibility(View.VISIBLE);
                        player1.setScore(player1.getScore() + die1.getDieFace() + die2.getDieFace() + die3.getDieFace() + die4.getDieFace());
                        tvScore1.setText(String.valueOf(player1.getScore()));
                        game.setPlayerTurn1(false);
                        game.setPlayerTurn2(true);
                        game.setPlayerTurn3(false);
                        turn = "It's " + player2.getName() + "'s turn to roll";
                        turnDisplay.setText(turn);
                    } else if (game.isPlayerTurn2()) {
                        die1.roll();
                        die2.roll();
                        die3.roll();
                        die4.roll();
                        rolledDie1.setText( String.valueOf(die1.getDieFace()));
                        rolledDie2.setText( String.valueOf(die2.getDieFace()));
                        rolledDie3.setText( String.valueOf(die3.getDieFace()));
                        rolledDie4.setText( String.valueOf(die4.getDieFace()));
                        player2.setScore(player2.getScore() + die1.getDieFace() + die2.getDieFace() + die3.getDieFace() + die4.getDieFace());
                        tvScore2.setText(String.valueOf(player2.getScore()));
                        game.setPlayerTurn1(false);
                        game.setPlayerTurn2(false);
                        game.setPlayerTurn3(true);
                        turn ="It's " + player3.getName() + "'s turn to roll";
                        turnDisplay.setText(turn);
                    } else if (game.isPlayerTurn3()) {
                        die1.roll();
                        die2.roll();
                        die3.roll();
                        die4.roll();
                        rolledDie1.setText( String.valueOf(die1.getDieFace()));
                        rolledDie2.setText( String.valueOf(die2.getDieFace()));
                        rolledDie3.setText( String.valueOf(die3.getDieFace()));
                        rolledDie4.setText( String.valueOf(die4.getDieFace()));
                        player3.setScore(player3.getScore() + die1.getDieFace() + die2.getDieFace() + die3.getDieFace() + die4.getDieFace());
                        tvScore3.setText(String.valueOf(player3.getScore()));
                        game.setPlayerTurn1(true);
                        game.setPlayerTurn2(false);
                        game.setPlayerTurn3(false);
                        game.setRound(game.getRound() + 1);
                        if ( game.getRound() == 4){
                            turnDisplay.setText("GAME OVER");
                            break;
                        }
                        turn ="It's " + player1.getName() + "'s turn to roll";
                        turnDisplay.setText(turn);
                    }
                    break;
                case "Show Results":
                    break;
                default:
                    btnNextStep.setText("This should not happen");
            }
        }
        if (player1.getScore() > player2.getScore() && player1.getScore() > player3.getScore() && game.getRound() == 4) {
            turn = "the game is over, " + player1.getName() + " is the winner!!!";
            turnDisplay.setText(turn);
            btnNextStep.setEnabled(false);
        } else if (player2.getScore() > player3.getScore() && player2.getScore() > player1.getScore() && game.getRound() == 4) {
            turn = "the game is over, " + player2.getName() + " is the winner!!!";
            turnDisplay.setText(turn);
            btnNextStep.setEnabled(false);
        } else if (game.getRound() == 4) {
            turn = "the game is over, " + player3.getName() + " is the winner!!!";
            turnDisplay.setText(turn);
            btnNextStep.setEnabled(false);
        }
    }
    public void onNewGame(View v){
        die1 = new Die();
        die2 = new Die();
        die3 = new Die();
        die4 = new Die();
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();
        game = new Game();
        tvScore1.setText("");
        tvScore2.setText("");
        tvScore3.setText("");
        rolledDie1.setVisibility(View.GONE);
        rolledDie2.setVisibility(View.GONE);
        rolledDie3.setVisibility(View.GONE);
        rolledDie4.setVisibility(View.GONE);
        etxtPlayerName1.setText("");
        etxtPlayerName2.setText("");
        etxtPlayerName3.setText("");
        btnNextStep.setText("Start the game");
        etxtPlayerName1.setEnabled(true);
        etxtPlayerName2.setEnabled(true);
        etxtPlayerName3.setEnabled(true);
        btnNextStep.setEnabled(true);
        game.setPlayerTurn1(true);
        game.setRound(1);
        turnDisplay.setVisibility(View.GONE);

    }
}