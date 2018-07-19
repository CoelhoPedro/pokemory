package com.example.pedro.pokemory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class JogoActivity extends AppCompatActivity {

    public ImageView button1,button2,button3,button4,button5,button6,button7,button8,
            button9,button10,button11,button12;
    public int[][] matriz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo);

        button1 = findViewById(R.id.ImageView1Id);
        button2 = findViewById(R.id.ImageView2Id);
        button3 = findViewById(R.id.ImageView3Id);
        button4 = findViewById(R.id.ImageView4Id);
        button5 = findViewById(R.id.ImageView5Id);
        button6 = findViewById(R.id.ImageView6Id);
        button7 = findViewById(R.id.ImageView7Id);
        button8 = findViewById(R.id.ImageView8Id);
        button9 = findViewById(R.id.ImageView9Id);
        button10 = findViewById(R.id.ImageView10Id);
        button11 = findViewById(R.id.ImageView11Id);
        button12 = findViewById(R.id.ImageView12Id);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int imageValue = matriz[0][0];
                setDrawables(imageValue, button1);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int imageValue = matriz[0][1];
                setDrawables(imageValue, button2);

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int imageValue = matriz[0][2];
                setDrawables(imageValue, button3);

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int imageValue = matriz[1][0];
                setDrawables(imageValue,button4);

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int imageValue = matriz[1][1];
                setDrawables(imageValue, button5);

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int imageValue = matriz[1][2];
                setDrawables(imageValue, button6);

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int imageValue = matriz[2][0];
                setDrawables(imageValue, button7);

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int imageValue = matriz[2][1];
                setDrawables(imageValue, button8);

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int imageValue = matriz[2][2];
                setDrawables(imageValue, button9);

            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int imageValue = matriz[3][0];
                setDrawables(imageValue, button10);

            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int imageValue = matriz[3][1];
                setDrawables(imageValue, button11);

            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int imageValue = matriz[3][2];
                setDrawables(imageValue, button12);

            }
        });

        matriz = sorteiaPecas();

    }


   // getResources().getDrawable(R.drawable.pikachu)

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
}


