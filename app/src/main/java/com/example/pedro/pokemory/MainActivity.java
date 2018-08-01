package com.example.pedro.pokemory;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
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
    public Button buttonNewGame, buttonRanking, buttonMultiplayer, buttonLogin;
    private ImageButton buttonSound;
    private SharedPreferences preferences;
    private FirebaseAuth firebaseAuth;
    private AlertDialog.Builder dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences = getSharedPreferences("settings", Context.MODE_PRIVATE);

        buttonNewGame = findViewById(R.id.buttonNewGame);
        buttonRanking = findViewById(R.id.buttonRanking);
        buttonMultiplayer = findViewById(R.id.buttonMultiplayer);
        buttonSound = findViewById(R.id.buttonSound);
        buttonLogin = findViewById(R.id.buttonLogin);
        checkPreferences(preferences);
        checkLogin();

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

                firebaseAuth = FirebaseSettings.getFirebaseAuth();
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

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                firebaseAuth = FirebaseSettings.getFirebaseAuth();

                if (firebaseAuth.getCurrentUser() != null) {

                    setDialog();

                } else {

                    Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(intent);

                }

            }
        });

    }

    private void setDialog() {

        dialog = new AlertDialog.Builder(MainActivity.this);

        dialog.setTitle("Exit");
        dialog.setMessage("Deseja realmente sair?");
        dialog.setCancelable(false);
        dialog.setIcon(android.R.drawable.ic_delete);

        dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });

        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                firebaseAuth = FirebaseSettings.getFirebaseAuth();
                firebaseAuth.signOut();
                Toast.makeText(MainActivity.this, "Sucesso ao sair", Toast.LENGTH_SHORT).show();
                checkLogin();

            }
        });

        dialog.create();
        dialog.show();

    }

    private void checkLogin() {

        firebaseAuth = FirebaseAuth.getInstance();

        if (firebaseAuth.getCurrentUser() != null) {

            buttonLogin.setText("Exit");

        } else {

            buttonLogin.setText("Login");
        }

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
