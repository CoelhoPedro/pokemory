package com.example.pedro.pokemory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class JogoActivity extends AppCompatActivity {

    public ImageView Button1,Button2,Button3,Button4,Button5,Button6,Button7,Button8,
            Button9,Button10,Button11,Button12;
    public int[][] matriz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo);

        Button1 =findViewById(R.id.ImageView1Id);
        Button2 =findViewById(R.id.ImageView2Id);
        Button3 =findViewById(R.id.ImageView3Id);
        Button4 =findViewById(R.id.ImageView4Id);
        Button5 =findViewById(R.id.ImageView5Id);
        Button6 =findViewById(R.id.ImageView6Id);
        Button7 =findViewById(R.id.ImageView7Id);
        Button8 =findViewById(R.id.ImageView8Id);
        Button9 =findViewById(R.id.ImageView9Id);
        Button10 =findViewById(R.id.ImageView10Id);
        Button11 =findViewById(R.id.ImageView11Id);
        Button12 =findViewById(R.id.ImageView12Id);

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valorImagem = matriz[0][0];

                switch (valorImagem){
                    case 0:
                        Button1.setImageDrawable(getResources().getDrawable(R.drawable.pikachu));
                        break;
                    case 1:
                        Button1.setImageDrawable(getResources().getDrawable(R.drawable.bulbasaur));
                        break;
                    case 2:
                        Button1.setImageDrawable(getResources().getDrawable(R.drawable.charmander));
                        break;
                    case 3:
                        Button1.setImageDrawable(getResources().getDrawable(R.drawable.eevee));
                        break;
                    case 4:
                        Button1.setImageDrawable(getResources().getDrawable(R.drawable.squirtle));
                        break;
                    case 5:
                        Button1.setImageDrawable(getResources().getDrawable(R.drawable.meowth));
                        break;
                }

            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valorImagem = matriz[0][1];

                switch (valorImagem){
                    case 0:
                        Button2.setImageDrawable(getResources().getDrawable(R.drawable.pikachu));
                        break;
                    case 1:
                        Button2.setImageDrawable(getResources().getDrawable(R.drawable.bulbasaur));
                        break;
                    case 2:
                        Button2.setImageDrawable(getResources().getDrawable(R.drawable.charmander));
                        break;
                    case 3:
                        Button2.setImageDrawable(getResources().getDrawable(R.drawable.eevee));
                        break;
                    case 4:
                        Button2.setImageDrawable(getResources().getDrawable(R.drawable.squirtle));
                        break;
                    case 5:
                        Button2.setImageDrawable(getResources().getDrawable(R.drawable.meowth));
                        break;
                }

            }
        });

        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valorImagem = matriz[0][2];

                switch (valorImagem){
                    case 0:
                        Button3.setImageDrawable(getResources().getDrawable(R.drawable.pikachu));
                        break;
                    case 1:
                        Button3.setImageDrawable(getResources().getDrawable(R.drawable.bulbasaur));
                        break;
                    case 2:
                        Button3.setImageDrawable(getResources().getDrawable(R.drawable.charmander));
                        break;
                    case 3:
                        Button3.setImageDrawable(getResources().getDrawable(R.drawable.eevee));
                        break;
                    case 4:
                        Button3.setImageDrawable(getResources().getDrawable(R.drawable.squirtle));
                        break;
                    case 5:
                        Button3.setImageDrawable(getResources().getDrawable(R.drawable.meowth));
                        break;
                }

            }
        });
        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valorImagem = matriz[1][0];

                switch (valorImagem){
                    case 0:
                        Button4.setImageDrawable(getResources().getDrawable(R.drawable.pikachu));
                        break;
                    case 1:
                        Button4.setImageDrawable(getResources().getDrawable(R.drawable.bulbasaur));
                        break;
                    case 2:
                        Button4.setImageDrawable(getResources().getDrawable(R.drawable.charmander));
                        break;
                    case 3:
                        Button4.setImageDrawable(getResources().getDrawable(R.drawable.eevee));
                        break;
                    case 4:
                        Button4.setImageDrawable(getResources().getDrawable(R.drawable.squirtle));
                        break;
                    case 5:
                        Button4.setImageDrawable(getResources().getDrawable(R.drawable.meowth));
                        break;
                }

            }
        });
        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valorImagem = matriz[1][1];

                switch (valorImagem){
                    case 0:
                        Button5.setImageDrawable(getResources().getDrawable(R.drawable.pikachu));
                        break;
                    case 1:
                        Button5.setImageDrawable(getResources().getDrawable(R.drawable.bulbasaur));
                        break;
                    case 2:
                        Button5.setImageDrawable(getResources().getDrawable(R.drawable.charmander));
                        break;
                    case 3:
                        Button5.setImageDrawable(getResources().getDrawable(R.drawable.eevee));
                        break;
                    case 4:
                        Button5.setImageDrawable(getResources().getDrawable(R.drawable.squirtle));
                        break;
                    case 5:
                        Button5.setImageDrawable(getResources().getDrawable(R.drawable.meowth));
                        break;
                }

            }
        });
        Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valorImagem = matriz[1][2];

                switch (valorImagem){
                    case 0:
                        Button6.setImageDrawable(getResources().getDrawable(R.drawable.pikachu));
                        break;
                    case 1:
                        Button6.setImageDrawable(getResources().getDrawable(R.drawable.bulbasaur));
                        break;
                    case 2:
                        Button6.setImageDrawable(getResources().getDrawable(R.drawable.charmander));
                        break;
                    case 3:
                        Button6.setImageDrawable(getResources().getDrawable(R.drawable.eevee));
                        break;
                    case 4:
                        Button6.setImageDrawable(getResources().getDrawable(R.drawable.squirtle));
                        break;
                    case 5:
                        Button6.setImageDrawable(getResources().getDrawable(R.drawable.meowth));
                        break;
                }

            }
        });
        Button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valorImagem = matriz[2][0];

                switch (valorImagem){
                    case 0:
                        Button7.setImageDrawable(getResources().getDrawable(R.drawable.pikachu));
                        break;
                    case 1:
                        Button7.setImageDrawable(getResources().getDrawable(R.drawable.bulbasaur));
                        break;
                    case 2:
                        Button7.setImageDrawable(getResources().getDrawable(R.drawable.charmander));
                        break;
                    case 3:
                        Button7.setImageDrawable(getResources().getDrawable(R.drawable.eevee));
                        break;
                    case 4:
                        Button7.setImageDrawable(getResources().getDrawable(R.drawable.squirtle));
                        break;
                    case 5:
                        Button7.setImageDrawable(getResources().getDrawable(R.drawable.meowth));
                        break;
                }

            }
        });
        Button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valorImagem = matriz[2][1];

                switch (valorImagem){
                    case 0:
                        Button8.setImageDrawable(getResources().getDrawable(R.drawable.pikachu));
                        break;
                    case 1:
                        Button8.setImageDrawable(getResources().getDrawable(R.drawable.bulbasaur));
                        break;
                    case 2:
                        Button8.setImageDrawable(getResources().getDrawable(R.drawable.charmander));
                        break;
                    case 3:
                        Button8.setImageDrawable(getResources().getDrawable(R.drawable.eevee));
                        break;
                    case 4:
                        Button8.setImageDrawable(getResources().getDrawable(R.drawable.squirtle));
                        break;
                    case 5:
                        Button8.setImageDrawable(getResources().getDrawable(R.drawable.meowth));
                        break;
                }

            }
        });
        Button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valorImagem = matriz[2][2];

                switch (valorImagem){
                    case 0:
                        Button9.setImageDrawable(getResources().getDrawable(R.drawable.pikachu));
                        break;
                    case 1:
                        Button9.setImageDrawable(getResources().getDrawable(R.drawable.bulbasaur));
                        break;
                    case 2:
                        Button9.setImageDrawable(getResources().getDrawable(R.drawable.charmander));
                        break;
                    case 3:
                        Button9.setImageDrawable(getResources().getDrawable(R.drawable.eevee));
                        break;
                    case 4:
                        Button9.setImageDrawable(getResources().getDrawable(R.drawable.squirtle));
                        break;
                    case 5:
                        Button9.setImageDrawable(getResources().getDrawable(R.drawable.meowth));
                        break;
                }

            }
        });
        Button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valorImagem = matriz[3][0];

                switch (valorImagem){
                    case 0:
                        Button10.setImageDrawable(getResources().getDrawable(R.drawable.pikachu));
                        break;
                    case 1:
                        Button10.setImageDrawable(getResources().getDrawable(R.drawable.bulbasaur));
                        break;
                    case 2:
                        Button10.setImageDrawable(getResources().getDrawable(R.drawable.charmander));
                        break;
                    case 3:
                        Button10.setImageDrawable(getResources().getDrawable(R.drawable.eevee));
                        break;
                    case 4:
                        Button10.setImageDrawable(getResources().getDrawable(R.drawable.squirtle));
                        break;
                    case 5:
                        Button10.setImageDrawable(getResources().getDrawable(R.drawable.meowth));
                        break;
                }

            }
        });
        Button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valorImagem = matriz[3][1];

                switch (valorImagem){
                    case 0:
                        Button11.setImageDrawable(getResources().getDrawable(R.drawable.pikachu));
                        break;
                    case 1:
                        Button11.setImageDrawable(getResources().getDrawable(R.drawable.bulbasaur));
                        break;
                    case 2:
                        Button11.setImageDrawable(getResources().getDrawable(R.drawable.charmander));
                        break;
                    case 3:
                        Button11.setImageDrawable(getResources().getDrawable(R.drawable.eevee));
                        break;
                    case 4:
                        Button11.setImageDrawable(getResources().getDrawable(R.drawable.squirtle));
                        break;
                    case 5:
                        Button11.setImageDrawable(getResources().getDrawable(R.drawable.meowth));
                        break;
                }

            }
        });
        Button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int valorImagem = matriz[3][2];

                switch (valorImagem){
                    case 0:
                        Button12.setImageDrawable(getResources().getDrawable(R.drawable.pikachu));
                        break;
                    case 1:
                        Button12.setImageDrawable(getResources().getDrawable(R.drawable.bulbasaur));
                        break;
                    case 2:
                        Button12.setImageDrawable(getResources().getDrawable(R.drawable.charmander));
                        break;
                    case 3:
                        Button12.setImageDrawable(getResources().getDrawable(R.drawable.eevee));
                        break;
                    case 4:
                        Button12.setImageDrawable(getResources().getDrawable(R.drawable.squirtle));
                        break;
                    case 5:
                        Button12.setImageDrawable(getResources().getDrawable(R.drawable.meowth));
                        break;
                }

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
}


