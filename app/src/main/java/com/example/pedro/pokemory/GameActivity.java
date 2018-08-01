package com.example.pedro.pokemory;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class GameActivity extends Activity {

    private TextView textViewScore, textViewTries;
    public MediaPlayer mediaPlayer;
    public ImageView ImageView_1, imageView_2, imageView_3, imageView_4, imageView_5, imageView_6,
            imageView_7, imageView_8, imageView_9, imageView_10, imageView_11, imageView_12,
            lastImageViewClicked;
    public int[][] matriz;
    private boolean boolean1, boolean2, boolean3, boolean4, boolean5, boolean6, boolean7, boolean8,
            boolean9, boolean10, boolean11, boolean12, flipped = false;
    private int imageValueFlipped, playerScore = 0, playerTries = 0, cardsFlipped = 0, cardsUp = 6;
    private final static int DELAY_TIME = 1000;
    private String lastBooleanClicked;
    Dialog DialogEndGame;
    long startTime = System.currentTimeMillis();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        DialogEndGame = new Dialog(this);

        checkSoundStatus("inGame");

        setViews();

        String scoreText = getString(R.string.score) + ": " + Integer.toString(playerScore);
        textViewScore.setText(scoreText);
        String triesText = getString(R.string.tries) + ": " + Integer.toString(playerTries);
        textViewTries.setText(triesText);

        ImageView_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean1) {
                        if (!flipped) {
                            int imageValue = matriz[0][0];
                            boolean1 = flipTheCard(imageValue, ImageView_1, "boolean1");
                        } else {
                            int imageValue = matriz[0][0];
                            boolean1 = compareCards(imageValue, ImageView_1);
                        }
                    }
                }
            }
        });

        imageView_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean2) {
                        if (!flipped) {
                            int imageValue = matriz[0][1];
                            boolean2 = flipTheCard(imageValue, imageView_2, "boolean2");
                        } else {
                            int imageValue = matriz[0][1];
                            boolean2 = compareCards(imageValue, imageView_2);
                        }
                    }
                }
            }
        });

        imageView_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean3) {
                        if (!flipped) {
                            int imageValue = matriz[0][2];
                            boolean3 = flipTheCard(imageValue, imageView_3, "boolean3");
                        } else {
                            int imageValue = matriz[0][2];
                            boolean3 = compareCards(imageValue, imageView_3);
                        }
                    }
                }
            }
        });
        imageView_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean4) {
                        if (!flipped) {
                            int imageValue = matriz[1][0];
                            boolean4 = flipTheCard(imageValue, imageView_4, "boolean4");
                        } else {
                            int imageValue = matriz[1][0];
                            boolean4 = compareCards(imageValue, imageView_4);
                        }
                    }
                }
            }
        });
        imageView_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean5) {
                        if (!flipped) {
                            int imageValue = matriz[1][1];
                            boolean5 = flipTheCard(imageValue, imageView_5, "boolean5");
                        } else {
                            int imageValue = matriz[1][1];
                            boolean5 = compareCards(imageValue, imageView_5);
                        }
                    }
                }
            }
        });
        imageView_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean6) {
                        if (!flipped) {
                            int imageValue = matriz[1][2];
                            boolean6 = flipTheCard(imageValue, imageView_6, "boolean6");
                        } else {
                            int imageValue = matriz[1][2];
                            boolean6 = compareCards(imageValue, imageView_6);
                        }
                    }
                }
            }
        });
        imageView_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean7) {
                        if (!flipped) {
                            int imageValue = matriz[2][0];
                            boolean7 = flipTheCard(imageValue, imageView_7, "boolean7");
                        } else {
                            int imageValue = matriz[2][0];
                            boolean7 = compareCards(imageValue, imageView_7);
                        }

                    }
                }
            }
        });
        imageView_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean8) {
                        if (!flipped) {
                            int imageValue = matriz[2][1];
                            boolean8 = flipTheCard(imageValue, imageView_8, "boolean8");
                        } else {
                            int imageValue = matriz[2][1];
                            boolean8 = compareCards(imageValue, imageView_8);
                        }
                    }
                }
            }
        });
        imageView_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean9) {
                        if (!flipped) {
                            int imageValue = matriz[2][2];
                            boolean9 = flipTheCard(imageValue, imageView_9, "boolean9");
                        } else {
                            int imageValue = matriz[2][2];
                            boolean9 = compareCards(imageValue, imageView_9);
                        }
                    }
                }
            }
        });
        imageView_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean10) {
                        if (!flipped) {
                            int imageValue = matriz[3][0];
                            boolean10 = flipTheCard(imageValue, imageView_10, "boolean10");
                        } else {
                            int imageValue = matriz[3][0];
                            boolean10 = compareCards(imageValue, imageView_10);
                        }
                    }
                }
            }
        });
        imageView_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean11) {
                        if (!flipped) {
                            int imageValue = matriz[3][1];
                            boolean11 = flipTheCard(imageValue, imageView_11, "boolean11");
                        } else {
                            int imageValue = matriz[3][1];
                            boolean11 = compareCards(imageValue, imageView_11);
                        }
                    }
                }
            }
        });
        imageView_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean12) {
                        if (!flipped) {
                            int imageValue = matriz[3][2];
                            boolean12 = flipTheCard(imageValue, imageView_12, "boolean12");
                        } else {
                            int imageValue = matriz[3][2];
                            boolean12 = compareCards(imageValue, imageView_12);
                        }
                    }
                }
            }
        });

        matriz = sorteiaPecas();

    }

    public int[][] sorteiaPecas() {

        int[][] matriz = new int[4][3];

        Random rnd = new Random();

        int zero = 0, um = 0, dois = 0, tres = 0, quatro = 0, cinco = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {

                int rand = rnd.nextInt(6);

                switch (rand) {
                    case 0:
                        if (zero < 2) {
                            matriz[i][j] = rand;
                            zero = zero + 1;
                        } else {
                            j--;
                        }
                        break;
                    case 1:
                        if (um < 2) {
                            matriz[i][j] = rand;
                            um = um + 1;
                        } else {
                            j--;
                        }
                        break;
                    case 2:
                        if (dois < 2) {
                            matriz[i][j] = rand;
                            dois = dois + 1;
                        } else {
                            j--;
                        }
                        break;
                    case 3:
                        if (tres < 2) {
                            matriz[i][j] = rand;
                            tres = tres + 1;
                        } else {
                            j--;
                        }
                        break;
                    case 4:
                        if (quatro < 2) {
                            matriz[i][j] = rand;
                            quatro = quatro + 1;
                        } else {
                            j--;
                        }
                        break;

                    case 5:
                        if (cinco < 2) {
                            matriz[i][j] = rand;
                            cinco = cinco + 1;
                        } else {
                            j--;
                        }
                        break;
                }
            }
        }

        return matriz;
    }

    public void setImage(int imageValue, ImageView buttonToChange) {
        switch (imageValue) {
            case 0:
                buttonToChange.setImageDrawable(getResources().getDrawable(R.drawable.pikachu));
                break;
            case 1:
                buttonToChange.setImageDrawable(getResources().getDrawable(R.drawable.bulbasaur));
                break;
            case 2:
                buttonToChange.setImageDrawable(getResources().getDrawable(R.drawable.charmander));
                break;
            case 3:
                buttonToChange.setImageDrawable(getResources().getDrawable(R.drawable.eevee));
                break;
            case 4:
                buttonToChange.setImageDrawable(getResources().getDrawable(R.drawable.squirtle));
                break;
            case 5:
                buttonToChange.setImageDrawable(getResources().getDrawable(R.drawable.meowth));
                break;
        }
    }

    private void setImageBack(ImageView image) {
        image.setImageDrawable(getResources().getDrawable(R.drawable.cardbackground));
    }

    private boolean compareCards(int imageValuePressed, final ImageView imagePressed) {

        playerTries++;
        String triesText = getString(R.string.tries) + ": " + Integer.toString(playerTries);
        textViewTries.setText(triesText);

        if (imageValuePressed == imageValueFlipped) {
            cardsUp--;
            cardsFlipped = 2;
            playCardSound("correct");
            sumPoint();
            flipped = false;
            setImage(imageValuePressed, imagePressed);
            delay("correctPair", imagePressed);

            if (cardsUp == 0)
                ShowEndGamePopUp();

            return true;
        } else {
            flipped = false;
            playCardSound("wrong");
            setImage(imageValuePressed, imagePressed);
            cardsFlipped = 2;
            resetLastBooleanClicked(lastBooleanClicked);
            delay("wrongPair", imagePressed);

            return false;
        }
    }

    private void sumPoint(){
        long difference = System.currentTimeMillis() - startTime;
        playerScore += 20 - difference / 1000;
        startTime=System.currentTimeMillis();
    }

    private void delay (String TypeOfPause,final ImageView imageToChange){

        switch (TypeOfPause){
            case "correctPair":
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        String scoreText = getString(R.string.score) + ": " + Integer.toString(playerScore);
                        textViewScore.setText(scoreText);
                        imageToChange.setVisibility(View.INVISIBLE);
                        lastImageViewClicked.setVisibility(View.INVISIBLE);
                        lastImageViewClicked = null;
                        cardsFlipped = 0;
                    }
                }, DELAY_TIME);
                break;

            case "wrongPair":
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        setImageBack(imageToChange);
                        setImageBack(lastImageViewClicked);
                        lastImageViewClicked = null;
                        cardsFlipped = 0;
                    }
                }, DELAY_TIME);
                break;

        }
    }

    private boolean flipTheCard(int imageValue, ImageView buttonPressed, String bool) {
        flipped = true;
        imageValueFlipped = imageValue;
        setImage(imageValue, buttonPressed);
        lastImageViewClicked = buttonPressed;
        lastBooleanClicked = bool;
        cardsFlipped = 1;
        return true;
    }

    private void resetLastBooleanClicked(String lastBooleanClicked){
        switch (lastBooleanClicked) {
            case "boolean1":
                boolean1 = false;
                break;
            case "boolean2":
                boolean2 = false;
                break;
            case "boolean3":
                boolean3 = false;
                break;
            case "boolean4":
                boolean4 = false;
                break;
            case "boolean5":
                boolean5 = false;
                break;
            case "boolean6":
                boolean6 = false;
                break;
            case "boolean7":
                boolean7 = false;
                break;
            case "boolean8":
                boolean8 = false;
                break;
            case "boolean9":
                boolean9 = false;
                break;
            case "boolean10":
                boolean10 = false;
                break;
            case "boolean11":
                boolean11 = false;
                break;
            case "boolean12":
                boolean12 = false;
                break;
        }
    }

    private void setViews() {
        textViewScore = findViewById(R.id.textViewScore);
        textViewTries = findViewById(R.id.textViewTries);
        ImageView_1 = findViewById(R.id.ImageView1Id);
        imageView_2 = findViewById(R.id.ImageView2Id);
        imageView_3 = findViewById(R.id.ImageView3Id);
        imageView_4 = findViewById(R.id.ImageView4Id);
        imageView_5 = findViewById(R.id.ImageView5Id);
        imageView_6 = findViewById(R.id.ImageView6Id);
        imageView_7 = findViewById(R.id.ImageView7Id);
        imageView_8 = findViewById(R.id.ImageView8Id);
        imageView_9 = findViewById(R.id.ImageView9Id);
        imageView_10 = findViewById(R.id.ImageView10Id);
        imageView_11 = findViewById(R.id.ImageView11Id);
        imageView_12 = findViewById(R.id.ImageView12Id);
    }

    public void checkSoundStatus(String typeMusic) {
        Bundle extra = getIntent().getExtras();
        String text = extra.getString("som");
        if (extra != null) {
            if (text.equals("ativado")) {
                if(typeMusic.equalsIgnoreCase("inGame")){
                playMusic("inGame");
                }else{
                    playMusic("endGame");
                }
            }
        }
    }

    public void playMusic(String typeMusic) {

        switch (typeMusic) {
            case "inGame":
                mediaPlayer = MediaPlayer.create(GameActivity.this, R.raw.ingamemusic);
                mediaPlayer.start();
                mediaPlayer.setLooping(true);
                break;
//          A ARRUMAR
          case "endGame":
              mediaPlayer.stop();
              mediaPlayer = MediaPlayer.create(GameActivity.this, R.raw.endgamemusic);
              mediaPlayer.start();
              break;
        }
    }

    public void playCardSound(String soundType) {

        switch (soundType) {
            case "correct":
                MediaPlayer soundCorrect = MediaPlayer.create(this, R.raw.correctsound);
                soundCorrect.start();
                break;
            case "wrong":
                MediaPlayer soundWrong = MediaPlayer.create(this, R.raw.failedsound);
                soundWrong.start();
        }
    }

    public void ShowEndGamePopUp() {

        TextView textViewPointsEndGame;

        DialogEndGame.setContentView(R.layout.end_game_popup);
        Button buttonMenu = DialogEndGame.findViewById(R.id.ButtonBackId);
        Button buttonNewGame = DialogEndGame.findViewById(R.id.ButtonNewGameId);
        textViewPointsEndGame = DialogEndGame.findViewById(R.id.textViewPoints);

        checkSoundStatus("endGame");

        DialogEndGame.setCanceledOnTouchOutside(false);
        textViewPointsEndGame.setText(Integer.toString(playerScore));
        DialogEndGame.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        DialogEndGame.show();

        buttonMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        buttonNewGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recreate();
            }
        });
    }

    @Override
    protected void onDestroy() {

        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }

        super.onDestroy();
    }

    @Override
    protected void onStop() {

        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
        }

        super.onStop();
    }

    @Override
    protected void onRestart() {

        if (mediaPlayer != null && !mediaPlayer.isPlaying()) {
            mediaPlayer.start();
        }

        super.onRestart();

    }

}


