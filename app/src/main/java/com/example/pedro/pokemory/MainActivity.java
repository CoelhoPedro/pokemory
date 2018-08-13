package com.example.pedro.pokemory;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
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
    private Dialog dialogLogout, dialogGameSelection;
    private static final String ARQUIVO_PREFERENCIA = "settings";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SQLiteDatabase bancoDados = openOrCreateDatabase("pokemory", MODE_PRIVATE, null);

        dialogLogout = new Dialog(this);
        dialogGameSelection = new Dialog(this);

        preferences = getSharedPreferences(ARQUIVO_PREFERENCIA, Context.MODE_PRIVATE);

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
/*
                Intent intent = new Intent(MainActivity.this, GameHardActivity.class);

                if(isOn){
                    intent.putExtra("som", "ativado");
                } else{
                    intent.putExtra("som", "desativado");
                }
                dialogGameSelection.dismiss();
                startActivity(intent);*/

                 ShowGameSelectionTypePopUp(); //DESCOMENTAR QUANDO OS MODOS DE JOGO ESTIVEREM PRONTOS
            }
        });

        buttonMultiplayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                firebaseAuth = FirebaseSettings.getFirebaseAuth();
                Toast.makeText(MainActivity.this, firebaseAuth.toString(), Toast.LENGTH_SHORT).show();
                if (firebaseAuth.getCurrentUser() != null){

                    Intent intent = new Intent(MainActivity.this, GameActivity.class);

                    if(isOn){
                        intent.putExtra("som", "ativado");
                    } else{
                        intent.putExtra("som", "desativado");
                    }
                    dialogGameSelection.dismiss();
                    startActivity(intent);

                    //ShowGameSelectionPopUp(); DESCOMENTAR QUANDO OS MODOS DE JOGO ESTIVEREM PRONTOS
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
                    buttonSound.setBackgroundResource(R.drawable.sound_off_blue);
                } else{
                    isOn = true;
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("sound", "on");
                    editor.apply();
                    buttonSound.setBackgroundResource(R.drawable.sound_on_blue);
                }
            }
        });

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                firebaseAuth = FirebaseSettings.getFirebaseAuth();

                if (firebaseAuth.getCurrentUser() != null) {

                    ShowLogoutPopUp();

                } else {

                    Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(intent);
                }
            }
        });

    }

    private void ShowGameSelectionTypePopUp(){

        dialogGameSelection.setContentView(R.layout.game_type_selection_popup);

        Button buttonNomal = dialogGameSelection.findViewById(R.id.ButtonNormalGameId);
        Button buttonTime = dialogGameSelection.findViewById(R.id.ButtonTimeGameId);

        buttonNomal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ShowGameSelectionDificultPopUp("Normal");

            }
        });

        buttonTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ShowGameSelectionDificultPopUp("Time");

            }
        });

        dialogGameSelection.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialogGameSelection.show();

    }

    private void ShowGameSelectionDificultPopUp(final String type){

        dialogGameSelection.setContentView(R.layout.game_selection_popup);

        Button buttonEasy = dialogGameSelection.findViewById(R.id.ButtonEasyGameId);
        Button buttonHard = dialogGameSelection.findViewById(R.id.ButtonHardGameId);

        buttonEasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (type){
                    case "Normal":
                        Intent intent = new Intent(MainActivity.this, GameActivity.class);

                        if(isOn){
                            intent.putExtra("som", "ativado");
                        } else{
                            intent.putExtra("som", "desativado");
                        }
                        dialogGameSelection.dismiss();
                        startActivity(intent);
                        break;
                    case "Time":
                        Intent intent2 = new Intent(MainActivity.this, GameEasyTimeActivity.class);

                        if(isOn){
                            intent2.putExtra("som", "ativado");
                        } else{
                            intent2.putExtra("som", "desativado");
                        }
                        dialogGameSelection.dismiss();
                        startActivity(intent2);
                        break;
                }
            }
        });

        buttonHard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (type){
                    case "Normal":
                        Intent intent = new Intent(MainActivity.this, GameHardActivity.class);

                        if(isOn){
                            intent.putExtra("som", "ativado");
                        } else{
                            intent.putExtra("som", "desativado");
                        }
                        dialogGameSelection.dismiss();
                        startActivity(intent);
                        break;
                    case "Time":
                        Intent intent2 = new Intent(MainActivity.this, GameHardTimeActivity.class);

                        if(isOn){
                            intent2.putExtra("som", "ativado");
                        } else{
                            intent2.putExtra("som", "desativado");
                        }
                        dialogGameSelection.dismiss();
                        startActivity(intent2);
                        break;
                }
            }
        });

        dialogGameSelection.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialogGameSelection.show();

    }

    private void ShowLogoutPopUp() {

        dialogLogout.setContentView(R.layout.exit_popup);

        Button buttonYes = dialogLogout.findViewById(R.id.ButtonYesId);
        Button buttonNo = dialogLogout.findViewById(R.id.ButtonNoId);

        dialogLogout.setCanceledOnTouchOutside(false);

        buttonYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firebaseAuth = FirebaseSettings.getFirebaseAuth();
                firebaseAuth.signOut();
                Toast.makeText(MainActivity.this, "Sucesso ao sair", Toast.LENGTH_SHORT).show();
                checkLogin();
                dialogLogout.dismiss();
            }
        });

        buttonNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogLogout.dismiss();
            }
        });

        dialogLogout.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialogLogout.show();

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
            buttonSound.setBackgroundResource(R.drawable.sound_on_blue);
            isOn = true;
        }
        else {
            buttonSound.setBackgroundResource(R.drawable.sound_off_blue);
            isOn = false;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}