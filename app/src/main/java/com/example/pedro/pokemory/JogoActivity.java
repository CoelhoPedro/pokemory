package com.example.pedro.pokemory;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class JogoActivity extends AppCompatActivity {

    private TextView textViewScore;
    public ImageView button1,button2,button3,button4,button5,button6,button7,button8,
            button9,button10,button11,button12, lastButtonClicked;
    public int[][] matriz;
    private boolean boolean1, boolean2, boolean3, boolean4, boolean5, boolean6, boolean7, boolean8,
            boolean9, boolean10, boolean11, boolean12, flipped = false;
    private int valueFlippedImage, playerScore = 0, cardsFlipped = 0;
    private final static int DELAY_TIME = 1500;
    private String lastBooleanClicked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo);

        setViews();
        String scoreText = getString(R.string.score) + ": " + Integer.toString(playerScore);
        textViewScore.setText(scoreText);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean1) {
                        if (!flipped) {
                            int imageValue = matriz[0][0];
                            boolean1 = isNotFlipped(imageValue, button1, "boolean1");
                        } else {
                            int imageValue = matriz[0][0];
                            boolean1 = compareCards(imageValue, button1);
                        }
                    }
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean2) {
                        if (!flipped) {
                            int imageValue = matriz[0][1];
                            boolean2 = isNotFlipped(imageValue, button2, "boolean2");
                        } else {
                            int imageValue = matriz[0][1];
                            boolean2 = compareCards(imageValue, button2);
                        }
                    }
                }

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean3) {
                        if (!flipped) {
                            int imageValue = matriz[0][2];
                            boolean3 = isNotFlipped(imageValue, button3, "boolean3");
                        } else {
                            int imageValue = matriz[0][2];
                            boolean3 = compareCards(imageValue, button3);
                        }
                    }
                }

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean4) {
                        if (!flipped) {
                            int imageValue = matriz[1][0];
                            boolean4 = isNotFlipped(imageValue, button4, "boolean4");
                        } else {
                            int imageValue = matriz[1][0];
                            boolean4 = compareCards(imageValue, button4);
                        }
                    }
                }

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean5) {
                        if (!flipped) {
                            int imageValue = matriz[1][1];
                            boolean5 = isNotFlipped(imageValue, button5, "boolean5");
                        } else {
                            int imageValue = matriz[1][1];
                            boolean5 = compareCards(imageValue, button5);
                        }
                    }
                }

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean6) {
                        if (!flipped) {
                            int imageValue = matriz[1][2];
                            boolean6 = isNotFlipped(imageValue, button6, "boolean6");
                        } else {
                            int imageValue = matriz[1][2];
                            boolean6 = compareCards(imageValue, button6);
                        }
                    }
                }

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean7) {
                        if (!flipped) {
                            int imageValue = matriz[2][0];
                            boolean7 = isNotFlipped(imageValue, button7, "boolean7");
                        } else {
                            int imageValue = matriz[2][0];
                            boolean7 = compareCards(imageValue, button7);
                        }

                    }
                }

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean8) {
                        if (!flipped) {
                            int imageValue = matriz[2][1];
                            boolean8 = isNotFlipped(imageValue, button8, "boolean8");
                        } else {
                            int imageValue = matriz[2][1];
                            boolean8 = compareCards(imageValue, button8);
                        }
                    }
                }

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean9) {
                        if (!flipped) {
                            int imageValue = matriz[2][2];
                            boolean9 = isNotFlipped(imageValue, button9, "boolean9");
                        } else {
                            int imageValue = matriz[2][2];
                            boolean9 = compareCards(imageValue, button9);
                        }
                    }
                }

            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean10) {
                        if (!flipped) {
                            int imageValue = matriz[3][0];
                            boolean10 = isNotFlipped(imageValue, button10, "boolean10");
                        } else {
                            int imageValue = matriz[3][0];
                            boolean10 = compareCards(imageValue, button10);
                        }
                    }
                }

            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean11) {
                        if (!flipped) {
                            int imageValue = matriz[3][1];
                            boolean11 = isNotFlipped(imageValue, button11, "boolean11");
                        } else {
                            int imageValue = matriz[3][1];
                            boolean11 = compareCards(imageValue, button11);
                        }
                    }
                }

            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean12) {
                        if (!flipped) {
                            int imageValue = matriz[3][2];
                            boolean12 = isNotFlipped(imageValue, button12, "boolean12");
                        } else {
                            int imageValue = matriz[3][2];
                            boolean12 = compareCards(imageValue, button12);
                        }
                    }
                }

            }
        });

        matriz = sorteiaPecas();

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

    private void setDrawableBack(ImageView image){
        image.setImageDrawable(getResources().getDrawable(R.drawable.cardbackground));
    }

    private boolean compareCards(int imageValue, final ImageView image){

        if (imageValue == valueFlippedImage){
            cardsFlipped = 2;
            playerScore++;
            flipped = false;
            setDrawables(imageValue, image);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    String scoreText = getString(R.string.score) + ": " + Integer.toString(playerScore);
                    textViewScore.setText(scoreText);
                    image.setVisibility(View.INVISIBLE);
                    lastButtonClicked.setVisibility(View.INVISIBLE);
                    lastButtonClicked = null;
                    cardsFlipped = 0;
                }
            }, DELAY_TIME);

            return true;
        }
        else {
            flipped = false;
            setDrawables(imageValue, image);
            cardsFlipped = 2;
            switch (lastBooleanClicked){
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
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    setDrawableBack(image);
                    setDrawableBack(lastButtonClicked);
                    lastButtonClicked = null;
                    cardsFlipped = 0;
                }
            }, DELAY_TIME);
            return false;
        }
    }

    private boolean isNotFlipped(int imageValue, ImageView buttonName, String bool){
        flipped = true;
        valueFlippedImage = imageValue;
        setDrawables(imageValue, buttonName);
        lastButtonClicked = buttonName;
        lastBooleanClicked = bool;
        cardsFlipped = 1;
        return true;
    }

    private void setViews(){
        textViewScore = findViewById(R.id.textViewScore);
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
    }
}


