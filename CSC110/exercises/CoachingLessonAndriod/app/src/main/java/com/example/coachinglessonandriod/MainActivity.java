package com.example.coachinglessonandriod;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnAdd;
    EditText etxtInput;

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
        System.out.println("hey");
    }

    public void init(){
        btnAdd = findViewById(R.id.btnAdd);
        etxtInput = findViewById(R.id.etxtInput);

    }

    public void onClickAdd(View v){
        String strInput = etxtInput.getText().toString();
        System.out.println(strInput);
        if (strInput.isBlank()){
            System.out.println("IT IS THE THE");
        }else {
            System.out.println("IT IS NOT THE THE");
        }

    }
}