package com.example.pedro.pokemory;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    public boolean isOn = true;
    public Button buttonNewGame, buttonRanking, buttonMultiplayer;
    private ImageButton buttonSound;
    private SharedPreferences preferences;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences = getSharedPreferences("settings", Context.MODE_PRIVATE);

        buttonNewGame = findViewById(R.id.buttonNewGame);
        buttonRanking = findViewById(R.id.buttonRanking);
        buttonMultiplayer = findViewById(R.id.buttonMultiplayer);
        buttonSound = findViewById(R.id.buttonSound);
        checkPreferences(preferences);


        buttonNewGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, GameActivity.class);

                if(isOn){
                    intent.putExtra("som", "ativado");
                } else{
                    intent.putExtra("som", "desativado");
                }

                startActivity(intent);
            }
        });

        buttonMultiplayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firebaseAuth = FirebaseAuth.getInstance();
                Toast.makeText(MainActivity.this, firebaseAuth.toString(), Toast.LENGTH_SHORT).show();
                if (firebaseAuth.getCurrentUser() != null){
                    Intent intent = new Intent(MainActivity.this, GameActivity.class);
                    if (isOn) intent.putExtra("som", "ativado");
                    else intent.putExtra("som", "desativado");
                    startActivity(intent);
                }
                else {
                    Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(intent);
                }
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
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("sound", "off");
                    editor.apply();
                    buttonSound.setBackgroundResource(R.drawable.sound_off);

                } else{

                    isOn = true;
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("sound", "on");
                    editor.apply();
                    buttonSound.setBackgroundResource(R.drawable.sound_on);

                }

            }
        });

    }

    private void checkPreferences(SharedPreferences sharedPreferences){
        String soundStatus = sharedPreferences.getString("sound", "on");
        if (soundStatus.equals("on")){
            buttonSound.setBackgroundResource(R.drawable.sound_on);
            isOn = true;
        }
        else {
            buttonSound.setBackgroundResource(R.drawable.sound_off);
            isOn = false;
        }
    }
}
