package com.example.madliblab;

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
    private EditText num1;
    private EditText wrd1;
    private EditText wrd2;
    private EditText wrd3;
    private EditText wrd4;
    private EditText wrd5;
    private EditText wrd6;
    private EditText wrd7;
    private EditText wrd8;
    private TextView event;
    private Button button;
    private MadLib story1;

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
        num1 = findViewById(R.id.digit);
        wrd1 = findViewById(R.id.w1);
        wrd2 = findViewById(R.id.w2);
        wrd3 = findViewById(R.id.w3);
        wrd4 = findViewById(R.id.w4);
        wrd5 = findViewById(R.id.w5);
        wrd6 = findViewById(R.id.w6);
        wrd7 = findViewById(R.id.w7);
        wrd8 = findViewById(R.id.w8);
        event = findViewById(R.id.story);
        button = findViewById(R.id.start);

        story1 = new MadLib();
    }


    public void onCreateMadLib (View v) {
        story1.setAdjective(wrd1.getText().toString());
        story1.setPluralNoun1(wrd2.getText().toString());
        story1.setPluralNoun2(wrd3.getText().toString());
        story1.setPluralNoun3(wrd4.getText().toString());
        story1.setPluralNoun4(wrd5.getText().toString());
        story1.setAdverb(wrd6.getText().toString());
        story1.setNoun1(wrd7.getText().toString());
        story1.setNoun2(wrd8.getText().toString());
        story1.setNum(num1.getText().toString());

        wrd1.setVisibility(View.INVISIBLE);
        wrd2.setVisibility(View.INVISIBLE);
        wrd3.setVisibility(View.INVISIBLE);
        wrd4.setVisibility(View.INVISIBLE);
        wrd5.setVisibility(View.INVISIBLE);
        wrd6.setVisibility(View.INVISIBLE);
        wrd7.setVisibility(View.INVISIBLE);
        wrd8.setVisibility(View.INVISIBLE);
        num1.setVisibility(View.INVISIBLE);
        button.setVisibility(View.INVISIBLE);
        event.setVisibility(View.VISIBLE);

        event.setText(story1.getMadLib());
    }
}