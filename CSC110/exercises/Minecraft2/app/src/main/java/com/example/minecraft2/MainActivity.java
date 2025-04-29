package com.example.minecraft2;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView tvCurrentBlockDisplay;
    TextView tvInventory;
    Game minecraftTwoElectricBoogaloo;
    Player player;


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
        tvInventory = findViewById(R.id.tvInventory);
        tvCurrentBlockDisplay = findViewById(R.id.tvCurrentBlockDisplay);
        minecraftTwoElectricBoogaloo = new Game();
        player = new Player(23);
    }

    public void onWalk (View v ){
        minecraftTwoElectricBoogaloo.playerWalk(player.getWalkingSpeed());
        tvCurrentBlockDisplay.setText(minecraftTwoElectricBoogaloo.getCurrentBlock().toString());
    }
    public void onMine (View v ){
        minecraftTwoElectricBoogaloo.playerMine();
        tvCurrentBlockDisplay.setText(minecraftTwoElectricBoogaloo.getCurrentBlock().toString());
        tvInventory.setText(minecraftTwoElectricBoogaloo.toString());

    }
}