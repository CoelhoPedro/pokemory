package com.example.pedro.pokemory;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public boolean isOn = true;
    public Button buttonNewGame, buttonRanking, buttonSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonNewGame = findViewById(R.id.buttonNewGame);
        buttonRanking = findViewById(R.id.buttonRanking);
        buttonSound = findViewById(R.id.buttonSound);

        buttonNewGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, JogoActivity.class);

                if(isOn){
                    intent.putExtra("som", "ativado");
                } else{
                    intent.putExtra("som", "desativado");
                }

                startActivity(intent);
            }
        });

        buttonRanking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, RankingActivity.class);
                startActivity(intent);
            }
        });

        buttonSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(isOn){

                    isOn = false;
                    buttonSound.setText("Ativar Som");

                } else{

                    isOn = true;
                    buttonSound.setText("Desativar Som");

                }

            }
        });

    }
}
