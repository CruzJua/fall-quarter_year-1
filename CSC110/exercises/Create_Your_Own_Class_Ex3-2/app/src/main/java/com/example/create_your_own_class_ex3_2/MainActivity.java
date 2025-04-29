package com.example.create_your_own_class_ex3_2;
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
    private Movie mov1, mov2, mov3;
    private TextView whereDataWillDisplay;

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

    public void initialize() {
        whereDataWillDisplay = findViewById(R.id.tvDataDisplay);

        mov1 = new Movie("Your Name", 112, 8.4f);

        mov2 = new Movie("Silent Voice", 129, 8.1f);

        mov3 = new Movie("Spider-Man 2", 135, 7.5f);
    }


    public void onMovieDisplay (View v) {
        Button buttonclicked = (Button)v;
        String buttonText = buttonclicked.getText().toString();
        String movieString = "";

        switch (buttonText) {
            case "Movie 1":
                movieString = buildMovieString(mov1);
                break;
            case "Movie 2":
                movieString = buildMovieString(mov2);
                break;
            case "Movie 3":
                movieString = buildMovieString(mov3);
                break;
            default:
                movieString = "We don't know that movie";
        }
        whereDataWillDisplay.setText(movieString);
    }
    public String buildMovieString(Movie selectedMovie){
        String movieString = "Title: " + selectedMovie.getTitle()
                + "\nRating Score: " + selectedMovie.getRatingScore()
                + "\nRuntime: " + selectedMovie.getRunTimeInMinutes() + " mins";
        return movieString;
    }
}