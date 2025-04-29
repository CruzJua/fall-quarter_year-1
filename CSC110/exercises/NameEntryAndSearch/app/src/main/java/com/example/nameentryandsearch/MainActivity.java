package com.example.nameentryandsearch;

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
String[] names;
String name;
Button btnAdd;
Button btnSearch;
EditText etxtName;
TextView tvSearchedNames;
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
        names = new String[50];
        btnAdd = findViewById(R.id.btnAdd);
        btnSearch = findViewById(R.id.btnSearch);
        etxtName = findViewById(R.id.etxtName);
        tvSearchedNames = findViewById(R.id.tvSearchedNames);
    }
    public void onAdd(View v){
//    When the button is clicked if there is no name in the text field then do nothing.

        if (etxtName.getText().toString().isBlank()){
            return;
        }else {
            name = etxtName.getText().toString();
            for (int i = 0; i < names.length; i++){
//    If there is a name in the text field then add it to the next available spot in the array
//      and clear the text out of the text field.
                if (names[i] == null){
                    names[i] = name;
                    etxtName.setText("");
                    break;
                }
            }

        }
    }
public void onSearch (View v){
//    When the search button is clicked iterate through the array looking for any names that contain (case-insensitive)
//      the provided search string.  Any matches should be appended to a control visible on the GUI (maybe a text area or similar).
    tvSearchedNames.setText("");
    if (etxtName.getText().toString().isBlank()){
        return;
    }else {
        name = etxtName.getText().toString();
        etxtName.setText("");
        for (String name:names){
            if (name == null){
                break;
            } else if (name.equalsIgnoreCase(this.name)) {
                String listOfSearchedNames = this.name;
                tvSearchedNames.setText(tvSearchedNames.getText().toString() + listOfSearchedNames + "\n");
            }
        }

    }
}

}



