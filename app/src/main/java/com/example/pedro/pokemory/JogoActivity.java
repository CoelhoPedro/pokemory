package com.example.pedro.pokemory;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.wajahatkarim3.easyflipview.EasyFlipView;

import java.util.Random;

public class JogoActivity extends Activity {

    public ImageView button1,button2,button3,button4,button5,button6,button7,button8,
            button9,button10,button11,button12, button1front, button2front,button3front,
            button4front,button5front, button6front,button7front, button8front,button9front,
            button10front,button11front, button12front;
    public int[][] matriz;
    public MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo);

        verificaSom();

        button1 = findViewById(R.id.ImageViewBack1Id);
        button1front = findViewById(R.id.ImageViewFront1Id);
        button2 = findViewById(R.id.ImageViewBack2Id);
        button2front = findViewById(R.id.ImageViewFront2Id);
        button3 = findViewById(R.id.ImageViewBack3Id);
        button3front = findViewById(R.id.ImageViewFront3Id);
        button4 = findViewById(R.id.ImageViewBack4Id);
        button4front = findViewById(R.id.ImageViewFront4Id);
        button5 = findViewById(R.id.ImageViewBack5Id);
        button5front = findViewById(R.id.ImageViewFront5Id);
        button6 = findViewById(R.id.ImageViewBack6Id);
        button6front = findViewById(R.id.ImageViewFront6Id);
        button7 = findViewById(R.id.ImageViewBack7Id);
        button7front = findViewById(R.id.ImageViewFront7Id);
        button8 = findViewById(R.id.ImageViewBack8Id);
        button8front = findViewById(R.id.ImageViewFront8Id);
        button9 = findViewById(R.id.ImageViewBack9Id);
        button9front = findViewById(R.id.ImageViewFront9Id);
        button10 = findViewById(R.id.ImageViewBack10Id);
        button10front = findViewById(R.id.ImageViewFront10Id);
        button11 = findViewById(R.id.ImageViewBack11Id);
        button11front = findViewById(R.id.ImageViewFront11Id);
        button12 = findViewById(R.id.ImageViewBack12Id);
        button12front = findViewById(R.id.ImageViewFront12Id);

        final EasyFlipView flip1 = findViewById(R.id.flip1);
        final EasyFlipView flip2 = findViewById(R.id.flip2);
        final EasyFlipView flip3 = findViewById(R.id.flip3);
        final EasyFlipView flip4 = findViewById(R.id.flip4);
        final EasyFlipView flip5 = findViewById(R.id.flip5);
        final EasyFlipView flip6 = findViewById(R.id.flip6);
        final EasyFlipView flip7 = findViewById(R.id.flip7);
        final EasyFlipView flip8 = findViewById(R.id.flip8);
        final EasyFlipView flip9 = findViewById(R.id.flip9);
        final EasyFlipView flip10 = findViewById(R.id.flip10);
        final EasyFlipView flip11 = findViewById(R.id.flip11);
        final EasyFlipView flip12 = findViewById(R.id.flip12);

        matriz = sorteiaPecas();

        setDrawables(matriz[0][0], button1front);
        setDrawables(matriz[0][1], button2front);
        setDrawables(matriz[0][2], button3front);
        setDrawables(matriz[1][0], button4front);
        setDrawables(matriz[1][1], button5front);
        setDrawables(matriz[1][2], button6front);
        setDrawables(matriz[2][0], button7front);
        setDrawables(matriz[2][1], button8front);
        setDrawables(matriz[2][2], button9front);
        setDrawables(matriz[3][0], button10front);
        setDrawables(matriz[3][1], button11front);
        setDrawables(matriz[3][2], button12front);

        flip1.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
            @Override
            public void onViewFlipCompleted(EasyFlipView flipView, EasyFlipView.FlipState newCurrentSide) {
//                int imageValue = matriz[0][0];
//                setDrawables(imageValue, button1front);
            }
        });

        flip2.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
            @Override
            public void onViewFlipCompleted(EasyFlipView flipView, EasyFlipView.FlipState newCurrentSide) {
//                int imageValue = matriz[0][1];
//                setDrawables(imageValue, button2front);
            }
        });

        flip3.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
            @Override
            public void onViewFlipCompleted(EasyFlipView flipView, EasyFlipView.FlipState newCurrentSide)
            {

//                int imageValue = matriz[0][2];
//                setDrawables(imageValue, button3front);

            }
        });
        flip4.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
            @Override
            public void onViewFlipCompleted(EasyFlipView flipView, EasyFlipView.FlipState newCurrentSide)
            {

//                int imageValue = matriz[1][0];
//                setDrawables(imageValue, button4front);
            }
        });
        flip5.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
            @Override
            public void onViewFlipCompleted(EasyFlipView flipView, EasyFlipView.FlipState newCurrentSide)
            {

//                int imageValue = matriz[1][1];
//                setDrawables(imageValue, button5front);

            }
        });
        flip6.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
            @Override
            public void onViewFlipCompleted(EasyFlipView flipView, EasyFlipView.FlipState newCurrentSide)
            {

//                int imageValue = matriz[1][2];
//                setDrawables(imageValue, button6front);

            }
        });

        flip7.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
            @Override
            public void onViewFlipCompleted(EasyFlipView flipView, EasyFlipView.FlipState newCurrentSide)
            {

//                int imageValue = matriz[2][0];
//                setDrawables(imageValue, button7front);

            }
        });
        flip8.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
            @Override
            public void onViewFlipCompleted(EasyFlipView flipView, EasyFlipView.FlipState newCurrentSide)
            {
//
//                int imageValue = matriz[2][1];
//                setDrawables(imageValue, button8front);

            }
        });
        flip9.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
            @Override
            public void onViewFlipCompleted(EasyFlipView flipView, EasyFlipView.FlipState newCurrentSide)
            {

//                int imageValue = matriz[2][2];
//                setDrawables(imageValue, button9front);

            }
        });
        flip10.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
            @Override
            public void onViewFlipCompleted(EasyFlipView flipView, EasyFlipView.FlipState newCurrentSide)
            {

//                int imageValue = matriz[3][0];
//                setDrawables(imageValue, button10front);

            }
        });
        flip11.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
            @Override
            public void onViewFlipCompleted(EasyFlipView flipView, EasyFlipView.FlipState newCurrentSide)
            {

//                int imageValue = matriz[3][1];
//                setDrawables(imageValue, button11front);

            }
        });
        flip12.setOnFlipListener(new EasyFlipView.OnFlipAnimationListener() {
            @Override
            public void onViewFlipCompleted(EasyFlipView flipView, EasyFlipView.FlipState newCurrentSide)
            {

//                int imageValue = matriz[3][2];
//                setDrawables(imageValue, button12front);

            }
        });



    }

    public int[][] sorteiaPecas(){

        int [][] matriz = new int[4][3];

        Random rnd = new Random();

        int zero=0,um=0,dois=0,tres=0,quatro=0,cinco=0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {

                int rand = rnd.nextInt(6);

                switch(rand) {
                    case 0:
                        if(zero<2) {
                            matriz[i][j] = rand;
                            zero= zero+1;
                        }else {
                            j--;
                        }
                        break;
                    case 1:
                        if(um<2) {
                            matriz[i][j] = rand;
                            um = um+1;
                        }else {
                            j--;
                        }
                        break;
                    case 2:
                        if(dois<2) {
                            matriz[i][j] = rand;
                            dois= dois+ 1;
                        }else {
                            j--;
                        }
                        break;
                    case 3:
                        if(tres<2) {
                            matriz[i][j] = rand;
                            tres = tres + 1;
                        }else {
                            j--;
                        }
                        break;
                    case 4:
                        if(quatro<2) {
                            matriz[i][j] = rand;
                            quatro = quatro+1;
                        }else {
                            j--;
                        }
                        break;

                    case 5:
                        if(cinco<2) {
                            matriz[i][j] = rand;
                            cinco = cinco+1;
                        }else {
                            j--;
                        }
                        break;
                }
            }
        }

        return matriz;
    }

    public void setDrawables(int imgValue, ImageView button){
        switch (imgValue){
            case 0:
                button.setImageDrawable(getResources().getDrawable(R.drawable.pikachu));
                break;
            case 1:
                button.setImageDrawable(getResources().getDrawable(R.drawable.bulbasaur));
                break;
            case 2:
                button.setImageDrawable(getResources().getDrawable(R.drawable.charmander));
                break;
            case 3:
                button.setImageDrawable(getResources().getDrawable(R.drawable.eevee));
                break;
            case 4:
                button.setImageDrawable(getResources().getDrawable(R.drawable.squirtle));
                break;
            case 5:
                button.setImageDrawable(getResources().getDrawable(R.drawable.meowth));
                break;
        }
    }

    public void verificaSom(){

        Bundle extra = getIntent().getExtras();
        String textoPassado = extra.getString("som");

        if(extra != null){

            if(textoPassado.equals("ativado")){
                tocarMusica();
            }

        }

    }

    public void tocarMusica(){

        mediaPlayer = MediaPlayer.create(JogoActivity.this, R.raw.pokemontheme);
        mediaPlayer.start();
        mediaPlayer.setLooping(true);

    }

    @Override
    protected void onDestroy() {

        if(mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }

        super.onDestroy();
    }
}


