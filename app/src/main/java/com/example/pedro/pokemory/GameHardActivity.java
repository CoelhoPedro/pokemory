package com.example.pedro.pokemory;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
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

public class GameHardActivity extends Activity {

    private TextView textViewScore, textViewTries;
    public MediaPlayer mediaPlayer, mediaPlayer2;
    public ImageView ImageView_1,imageView_2,imageView_3,imageView_4,imageView_5,imageView_6,
            imageView_7,imageView_8,imageView_9,imageView_10,imageView_11,imageView_12,imageView_13,
            imageView_14,imageView_15,imageView_16,imageView_17,imageView_18,imageView_19,imageView_20,
            imageView_21,imageView_22,imageView_23,imageView_24,imageView_25,imageView_26,imageView_27,imageView_28,
            imageView_29,imageView_30,imageView_31,imageView_32,imageView_33,imageView_34,imageView_35,
            imageView_36,imageView_37,imageView_38,imageView_39,imageView_40,imageView_41,imageView_42,
            imageView_43,imageView_44,imageView_45,imageView_46,imageView_47,imageView_48,lastImageViewClicked;
    public int[][] matriz;
    private boolean boolean1, boolean2, boolean3, boolean4, boolean5, boolean6, boolean7, boolean8,
            boolean9,boolean10,boolean11,boolean12,boolean13,boolean14,boolean15,boolean16,boolean17,boolean18,
            boolean19,boolean20,boolean21,boolean22,boolean23,boolean24,boolean25,boolean26,boolean27,boolean28,
            boolean29,boolean30,boolean31,boolean32,boolean33,boolean34,boolean35,boolean36,boolean37,boolean38,
            boolean39,boolean40,boolean41,boolean42,boolean43,boolean44,boolean45,boolean46,boolean47,boolean48,
            flipped = false;
    private int imageValueFlipped, playerScore = 0, playerTries = 0, cardsFlipped = 0, cardsUp = 24;
    private final static int DELAY_TIME = 1000;
    private String lastBooleanClicked;
    Dialog DialogEndGame;
    long startTime = System.currentTimeMillis();
    private boolean exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_game_hard_normal);

        DialogEndGame = new Dialog(this);

        Bundle extra = getIntent().getExtras();
        final String text = extra.getString("som");
        checkSoundStatus("inGame");


        setViews();

        matriz = sorteiaPecas();

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
                            boolean1 = compareCards(imageValue, ImageView_1,text);
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
                            boolean2 = compareCards(imageValue, imageView_2,text);
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
                            boolean3 = compareCards(imageValue, imageView_3,text);
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
                            int imageValue = matriz[0][3];
                            boolean4 = flipTheCard(imageValue, imageView_4, "boolean4");
                        } else {
                            int imageValue = matriz[0][3];
                            boolean4 = compareCards(imageValue, imageView_4,text);
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
                            int imageValue = matriz[0][4];
                            boolean5 = flipTheCard(imageValue, imageView_5, "boolean5");
                        } else {
                            int imageValue = matriz[0][4];
                            boolean5 = compareCards(imageValue, imageView_5,text);
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
                            int imageValue = matriz[0][5];
                            boolean6 = flipTheCard(imageValue, imageView_6, "boolean6");
                        } else {
                            int imageValue = matriz[0][5];
                            boolean6 = compareCards(imageValue, imageView_6,text);
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
                            int imageValue = matriz[1][0];
                            boolean7 = flipTheCard(imageValue, imageView_7, "boolean7");
                        } else {
                            int imageValue = matriz[1][0];
                            boolean7 = compareCards(imageValue, imageView_7,text);
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
                            int imageValue = matriz[1][1];
                            boolean8 = flipTheCard(imageValue, imageView_8, "boolean8");
                        } else {
                            int imageValue = matriz[1][1];
                            boolean8 = compareCards(imageValue, imageView_8,text);
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
                            int imageValue = matriz[1][2];
                            boolean9 = flipTheCard(imageValue, imageView_9, "boolean9");
                        } else {
                            int imageValue = matriz[1][2];
                            boolean9 = compareCards(imageValue, imageView_9,text);
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
                            int imageValue = matriz[1][3];
                            boolean10 = flipTheCard(imageValue, imageView_10, "boolean10");
                        } else {
                            int imageValue = matriz[1][3];
                            boolean10 = compareCards(imageValue, imageView_10,text);
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
                            int imageValue = matriz[1][4];
                            boolean11 = flipTheCard(imageValue, imageView_11, "boolean11");
                        } else {
                            int imageValue = matriz[1][4];
                            boolean11 = compareCards(imageValue, imageView_11,text);
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
                            int imageValue = matriz[1][5];
                            boolean12 = flipTheCard(imageValue, imageView_12, "boolean12");
                        } else {
                            int imageValue = matriz[1][5];
                            boolean12 = compareCards(imageValue, imageView_12,text);
                        }
                    }
                }
            }
        });

        imageView_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean13) {
                        if (!flipped) {
                            int imageValue = matriz[2][0];
                            boolean13 = flipTheCard(imageValue, imageView_13, "boolean13");
                        } else {
                            int imageValue = matriz[2][0];
                            boolean13 = compareCards(imageValue, imageView_13,text);
                        }
                    }
                }
            }
        });

        imageView_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean14) {
                        if (!flipped) {
                            int imageValue = matriz[2][1];
                            boolean14 = flipTheCard(imageValue, imageView_14, "boolean14");
                        } else {
                            int imageValue = matriz[2][1];
                            boolean14 = compareCards(imageValue, imageView_14,text);
                        }
                    }
                }
            }
        });

        imageView_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean15) {
                        if (!flipped) {
                            int imageValue = matriz[2][2];
                            boolean15 = flipTheCard(imageValue, imageView_15, "boolean15");
                        } else {
                            int imageValue = matriz[2][2];
                            boolean15 = compareCards(imageValue, imageView_15,text);
                        }
                    }
                }
            }
        });

        imageView_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean16) {
                        if (!flipped) {
                            int imageValue = matriz[2][3];
                            boolean16 = flipTheCard(imageValue, imageView_16, "boolean16");
                        } else {
                            int imageValue = matriz[2][3];
                            boolean16 = compareCards(imageValue, imageView_16,text);
                        }
                    }
                }
            }
        });

        imageView_17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean17) {
                        if (!flipped) {
                            int imageValue = matriz[2][4];
                            boolean17 = flipTheCard(imageValue, imageView_17, "boolean17");
                        } else {
                            int imageValue = matriz[2][4];
                            boolean17 = compareCards(imageValue, imageView_17,text);
                        }
                    }
                }
            }
        });

        imageView_18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean18) {
                        if (!flipped) {
                            int imageValue = matriz[2][5];
                            boolean18 = flipTheCard(imageValue, imageView_18, "boolean18");
                        } else {
                            int imageValue = matriz[2][5];
                            boolean18 = compareCards(imageValue, imageView_18,text);
                        }
                    }
                }
            }
        });

        imageView_19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean19) {
                        if (!flipped) {
                            int imageValue = matriz[3][0];
                            boolean19 = flipTheCard(imageValue, imageView_19, "boolean19");
                        } else {
                            int imageValue = matriz[3][0];
                            boolean19 = compareCards(imageValue, imageView_19,text);
                        }
                    }
                }
            }
        });

        imageView_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean20) {
                        if (!flipped) {
                            int imageValue = matriz[3][1];
                            boolean20 = flipTheCard(imageValue, imageView_20, "boolean20");
                        } else {
                            int imageValue = matriz[3][1];
                            boolean20 = compareCards(imageValue, imageView_20,text);
                        }
                    }
                }
            }
        });

        imageView_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean21) {
                        if (!flipped) {
                            int imageValue = matriz[3][2];
                            boolean21 = flipTheCard(imageValue, imageView_21, "boolean21");
                        } else {
                            int imageValue = matriz[3][2];
                            boolean21 = compareCards(imageValue, imageView_21,text);
                        }
                    }
                }
            }
        });

        imageView_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean22) {
                        if (!flipped) {
                            int imageValue = matriz[3][3];
                            boolean22 = flipTheCard(imageValue, imageView_22, "boolean22");
                        } else {
                            int imageValue = matriz[3][3];
                            boolean22 = compareCards(imageValue, imageView_22,text);
                        }
                    }
                }
            }
        });

        imageView_23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean23) {
                        if (!flipped) {
                            int imageValue = matriz[3][4];
                            boolean23 = flipTheCard(imageValue, imageView_23, "boolean23");
                        } else {
                            int imageValue = matriz[3][4];
                            boolean23 = compareCards(imageValue, imageView_23,text);
                        }
                    }
                }
            }
        });

        imageView_24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean24) {
                        if (!flipped) {
                            int imageValue = matriz[3][5];
                            boolean24 = flipTheCard(imageValue, imageView_24, "boolean24");
                        } else {
                            int imageValue = matriz[3][5];
                            boolean24 = compareCards(imageValue, imageView_24,text);
                        }
                    }
                }
            }
        });

        imageView_25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean25) {
                        if (!flipped) {
                            int imageValue = matriz[4][0];
                            boolean25 = flipTheCard(imageValue, imageView_25, "boolean25");
                        } else {
                            int imageValue = matriz[4][0];
                            boolean25 = compareCards(imageValue, imageView_25,text);
                        }
                    }
                }
            }
        });

        imageView_26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean26) {
                        if (!flipped) {
                            int imageValue = matriz[4][1];
                            boolean26 = flipTheCard(imageValue, imageView_26, "boolean26");
                        } else {
                            int imageValue = matriz[4][1];
                            boolean26 = compareCards(imageValue, imageView_26,text);
                        }
                    }
                }
            }
        });
        imageView_27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean27) {
                        if (!flipped) {
                            int imageValue = matriz[4][2];
                            boolean27 = flipTheCard(imageValue, imageView_27, "boolean27");
                        } else {
                            int imageValue = matriz[4][2];
                            boolean27 = compareCards(imageValue, imageView_27,text);
                        }
                    }
                }
            }
        });

        imageView_28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean28) {
                        if (!flipped) {
                            int imageValue = matriz[4][3];
                            boolean28 = flipTheCard(imageValue, imageView_28, "boolean28");
                        } else {
                            int imageValue = matriz[4][3];
                            boolean28 = compareCards(imageValue, imageView_28,text);
                        }
                    }
                }
            }
        });

        imageView_29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean29) {
                        if (!flipped) {
                            int imageValue = matriz[4][4];
                            boolean29 = flipTheCard(imageValue, imageView_29, "boolean29");
                        } else {
                            int imageValue = matriz[4][4];
                            boolean29 = compareCards(imageValue, imageView_29,text);
                        }
                    }
                }
            }
        });

        imageView_30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean30) {
                        if (!flipped) {
                            int imageValue = matriz[4][5];
                            boolean30 = flipTheCard(imageValue, imageView_30, "boolean30");
                        } else {
                            int imageValue = matriz[4][5];
                            boolean30 = compareCards(imageValue, imageView_30,text);
                        }
                    }
                }
            }
        });

        imageView_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean31) {
                        if (!flipped) {
                            int imageValue = matriz[5][0];
                            boolean31 = flipTheCard(imageValue, imageView_31, "boolean31");
                        } else {
                            int imageValue = matriz[5][0];
                            boolean31 = compareCards(imageValue, imageView_31,text);
                        }
                    }
                }
            }
        });

        imageView_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean32) {
                        if (!flipped) {
                            int imageValue = matriz[5][1];
                            boolean32 = flipTheCard(imageValue, imageView_32, "boolean32");
                        } else {
                            int imageValue = matriz[5][1];
                            boolean32 = compareCards(imageValue, imageView_32,text);
                        }
                    }
                }
            }
        });
        imageView_33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean33) {
                        if (!flipped) {
                            int imageValue = matriz[5][2];
                            boolean33 = flipTheCard(imageValue, imageView_33, "boolean33");
                        } else {
                            int imageValue = matriz[5][2];
                            boolean33 = compareCards(imageValue, imageView_33,text);
                        }
                    }
                }
            }
        });

        imageView_34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean34) {
                        if (!flipped) {
                            int imageValue = matriz[5][3];
                            boolean34 = flipTheCard(imageValue, imageView_34, "boolean34");
                        } else {
                            int imageValue = matriz[5][3];
                            boolean34 = compareCards(imageValue, imageView_34,text);
                        }
                    }
                }
            }
        });

        imageView_35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean35) {
                        if (!flipped) {
                            int imageValue = matriz[5][4];
                            boolean35 = flipTheCard(imageValue, imageView_35, "boolean35");
                        } else {
                            int imageValue = matriz[5][4];
                            boolean35 = compareCards(imageValue, imageView_35,text);
                        }
                    }
                }
            }
        });

        imageView_36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean36) {
                        if (!flipped) {
                            int imageValue = matriz[5][5];
                            boolean36 = flipTheCard(imageValue, imageView_36, "boolean36");
                        } else {
                            int imageValue = matriz[5][5];
                            boolean36 = compareCards(imageValue, imageView_36,text);
                        }
                    }
                }
            }
        });

        imageView_37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean37) {
                        if (!flipped) {
                            int imageValue = matriz[6][0];
                            boolean37 = flipTheCard(imageValue, imageView_37, "boolean37");
                        } else {
                            int imageValue = matriz[6][0];
                            boolean37 = compareCards(imageValue, imageView_37,text);
                        }
                    }
                }
            }
        });

        imageView_38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean38) {
                        if (!flipped) {
                            int imageValue = matriz[6][1];
                            boolean38 = flipTheCard(imageValue, imageView_38, "boolean38");
                        } else {
                            int imageValue = matriz[6][1];
                            boolean38 = compareCards(imageValue, imageView_38,text);
                        }
                    }
                }
            }
        });

        imageView_39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean39) {
                        if (!flipped) {
                            int imageValue = matriz[6][2];
                            boolean39 = flipTheCard(imageValue, imageView_39, "boolean39");
                        } else {
                            int imageValue = matriz[6][2];
                            boolean39 = compareCards(imageValue, imageView_39,text);
                        }
                    }
                }
            }
        });

        imageView_40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean40) {
                        if (!flipped) {
                            int imageValue = matriz[6][3];
                            boolean40 = flipTheCard(imageValue, imageView_40, "boolean40");
                        } else {
                            int imageValue = matriz[6][3];
                            boolean40 = compareCards(imageValue, imageView_40,text);
                        }
                    }
                }
            }
        });

        imageView_41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean41) {
                        if (!flipped) {
                            int imageValue = matriz[6][4];
                            boolean41 = flipTheCard(imageValue, imageView_41, "boolean41");
                        } else {
                            int imageValue = matriz[6][4];
                            boolean41 = compareCards(imageValue, imageView_41,text);
                        }
                    }
                }
            }
        });

        imageView_42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean42) {
                        if (!flipped) {
                            int imageValue = matriz[6][5];
                            boolean42 = flipTheCard(imageValue, imageView_42, "boolean42");
                        } else {
                            int imageValue = matriz[6][5];
                            boolean42 = compareCards(imageValue, imageView_42,text);
                        }
                    }
                }
            }
        });

        imageView_43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean43) {
                        if (!flipped) {
                            int imageValue = matriz[7][0];
                            boolean43 = flipTheCard(imageValue, imageView_43, "boolean43");
                        } else {
                            int imageValue = matriz[7][0];
                            boolean43 = compareCards(imageValue, imageView_43,text);
                        }
                    }
                }
            }
        });

        imageView_44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.i("teste", "click");
                if (cardsFlipped < 2) {
                    if (!boolean44) {
                        if (!flipped) {
                            int imageValue = matriz[7][1];
                            boolean44 = flipTheCard(imageValue, imageView_44, "boolean44");
                        } else {
                            int imageValue = matriz[7][1];
                            boolean44 = compareCards(imageValue, imageView_44,text);
                        }
                    }
                }
            }
        });

        imageView_45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.i("teste", "click");
                if (cardsFlipped < 2) {
                    if (!boolean45) {
                        if (!flipped) {
                            int imageValue = matriz[7][2];
                            boolean45 = flipTheCard(imageValue, imageView_45, "boolean45");
                        } else {
                            int imageValue = matriz[7][2];
                            boolean45 = compareCards(imageValue, imageView_45,text);
                        }
                    }
                }
            }
        });

        imageView_46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean46) {
                        if (!flipped) {
                            int imageValue = matriz[7][3];
                            boolean46 = flipTheCard(imageValue, imageView_46, "boolean46");
                        } else {
                            int imageValue = matriz[7][3];
                            boolean46 = compareCards(imageValue, imageView_46,text);
                        }
                    }
                }
            }
        });

        imageView_47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean47) {
                        if (!flipped) {
                            int imageValue = matriz[7][4];
                            boolean47 = flipTheCard(imageValue, imageView_47, "boolean47");
                        } else {
                            int imageValue = matriz[7][4];
                            boolean47 = compareCards(imageValue, imageView_47,text);
                        }
                    }
                }
            }
        });

        imageView_48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardsFlipped < 2) {
                    if (!boolean48) {
                        if (!flipped) {
                            int imageValue = matriz[7][5];
                            boolean48 = flipTheCard(imageValue, imageView_48, "boolean48");
                        } else {
                            int imageValue = matriz[7][5];
                            boolean48 = compareCards(imageValue, imageView_48,text);
                        }
                    }
                }
            }
        });
    }

    public int[][] sorteiaPecas() {

        int[][] matriz = new int[8][6];

        Random rnd = new Random();

        int zero = 0, um = 0, dois = 0, tres = 0, quatro = 0, cinco = 0, seis = 0, sete = 0, oito = 0, nove = 0,
                dez = 0, onze = 0, doze = 0, treze = 0, quatorze = 0, quinze = 0, dezesseis = 0, dezesete = 0,
                dezoito = 0, dezenove = 0, vinte = 0, vinteEum = 0, vinteEdois = 0, vinteEtres = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {

                int rand = rnd.nextInt(24);

                System.out.println(i + "--" + j + "===" + rand);

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

                    case 6:
                        if (seis < 2) {
                            matriz[i][j] = rand;
                            seis = seis + 1;
                        } else {
                            j--;
                        }
                        break;

                    case 7:
                        if (sete < 2) {
                            matriz[i][j] = rand;
                            sete = sete + 1;
                        } else {
                            j--;
                        }
                        break;

                    case 8:
                        if (oito < 2) {
                            matriz[i][j] = rand;
                            oito = oito + 1;
                        } else {
                            j--;
                        }
                        break;
                    case 9:
                        if (nove < 2) {
                            matriz[i][j] = rand;
                            nove = nove + 1;
                        } else {
                            j--;
                        }
                        break;
                    case 10:
                        if (dez < 2) {
                            matriz[i][j] = rand;
                            dez = dez + 1;
                        } else {
                            j--;
                        }
                        break;

                    case 11:
                        if (onze < 2) {
                            matriz[i][j] = rand;
                            onze = onze + 1;
                        } else {
                            j--;
                        }
                        break;

                    case 12:
                        if (doze < 2) {
                            matriz[i][j] = rand;
                            doze = doze + 1;
                        } else {
                            j--;
                        }
                        break;

                    case 13:
                        if (treze < 2) {
                            matriz[i][j] = rand;
                            treze = treze + 1;
                        } else {
                            j--;
                        }
                        break;

                    case 14:
                        if (quatorze < 2) {
                            matriz[i][j] = rand;
                            quatorze = quatorze + 1;
                        } else {
                            j--;
                        }
                        break;

                    case 15:
                        if (quinze < 2) {
                            matriz[i][j] = rand;
                            quinze = quinze + 1;
                        } else {
                            j--;
                        }
                        break;

                    case 16:
                        if (dezesseis < 2) {
                            matriz[i][j] = rand;
                            dezesseis = dezesseis + 1;
                        } else {
                            j--;
                        }
                        break;

                    case 17:
                        if (dezesete < 2) {
                            matriz[i][j] = rand;
                            dezesete = dezesete + 1;
                        } else {
                            j--;
                        }
                        break;
                    case 18:
                        if (dezoito < 2) {
                            matriz[i][j] = rand;
                            dezoito = dezoito + 1;
                        } else {
                            j--;
                        }
                        break;
                    case 19:
                        if (dezenove < 2) {
                            matriz[i][j] = rand;
                            dezenove = dezenove + 1;
                        } else {
                            j--;
                        }
                        break;
                    case 20:
                        if (vinte < 2) {
                            matriz[i][j] = rand;
                            vinte = vinte + 1;
                        } else {
                            j--;
                        }
                        break;
                    case 21:
                        if (vinteEum < 2) {
                            matriz[i][j] = rand;
                            vinteEum = vinteEum + 1;
                        } else {
                            j--;
                        }
                        break;
                    case 22:
                        if (vinteEdois < 2) {
                            matriz[i][j] = rand;
                            vinteEdois = vinteEdois + 1;
                        } else {
                            j--;
                        }
                        break;

                    case 23:
                        if (vinteEtres < 2) {
                            matriz[i][j] = rand;
                            vinteEtres = vinteEtres + 1;
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
                buttonToChange.setImageDrawable(getResources().getDrawable(R.drawable.bulbasaur));
                break;
            case 1:
                buttonToChange.setImageDrawable(getResources().getDrawable(R.drawable.bellsprout));
                break;
            case 2:
                buttonToChange.setImageDrawable(getResources().getDrawable(R.drawable.caterpi));
                break;
            case 3:
                buttonToChange.setImageDrawable(getResources().getDrawable(R.drawable.charmander));
                break;
            case 4:
                buttonToChange.setImageDrawable(getResources().getDrawable(R.drawable.diglett));
                break;
            case 5:
                buttonToChange.setImageDrawable(getResources().getDrawable(R.drawable.eevee));
                break;
            case 6:
                buttonToChange.setImageDrawable(getResources().getDrawable(R.drawable.geodude));
                break;
            case 7:
                buttonToChange.setImageDrawable(getResources().getDrawable(R.drawable.magnemite));
                break;
            case 8:
                buttonToChange.setImageDrawable(getResources().getDrawable(R.drawable.meowth));
                break;
            case 9:
                buttonToChange.setImageDrawable(getResources().getDrawable(R.drawable.nidoranm));
                break;
            case 10:
                buttonToChange.setImageDrawable(getResources().getDrawable(R.drawable.oddish));
                break;
            case 11:
                buttonToChange.setImageDrawable(getResources().getDrawable(R.drawable.paras));
                break;
            case 12:
                buttonToChange.setImageDrawable(getResources().getDrawable(R.drawable.pidgey));
                break;
            case 13:
                buttonToChange.setImageDrawable(getResources().getDrawable(R.drawable.pikachu));
                break;
            case 14:
                buttonToChange.setImageDrawable(getResources().getDrawable(R.drawable.poliwag));
                break;
            case 15:
                buttonToChange.setImageDrawable(getResources().getDrawable(R.drawable.psyduck));
                break;
            case 16:
                buttonToChange.setImageDrawable(getResources().getDrawable(R.drawable.ratata));
                break;
            case 17:
                buttonToChange.setImageDrawable(getResources().getDrawable(R.drawable.sparow));
                break;
            case 18:
                buttonToChange.setImageDrawable(getResources().getDrawable(R.drawable.squirtle));
                break;
            case 19:
                buttonToChange.setImageDrawable(getResources().getDrawable(R.drawable.tentacool));
                break;
            case 20:
                buttonToChange.setImageDrawable(getResources().getDrawable(R.drawable.venonat));
                break;
            case 21:
                buttonToChange.setImageDrawable(getResources().getDrawable(R.drawable.vulpix));
                break;
            case 22:
                buttonToChange.setImageDrawable(getResources().getDrawable(R.drawable.weedle));
                break;
            case 23:
                buttonToChange.setImageDrawable(getResources().getDrawable(R.drawable.zubat));
                break;
            case 24:
                buttonToChange.setImageDrawable(getResources().getDrawable(R.drawable.ivy));
                break;
        }
    }

    private void setImageBack(ImageView image) {
        image.setImageDrawable(getResources().getDrawable(R.drawable.cardbackground));
    }

    private boolean compareCards(int imageValuePressed, final ImageView imagePressed,String statusMusica) {

        playerTries++;
        String triesText = getString(R.string.tries) + ": " + Integer.toString(playerTries);
        textViewTries.setText(triesText);

        if (imageValuePressed == imageValueFlipped) {
            cardsUp--;
            cardsFlipped = 2;
            playMusic("correct", statusMusica);
            sumPoint();
            flipped = false;
            setImage(imageValuePressed, imagePressed);
            if (cardsUp == 0) {
                ShowEndGamePopUp("Pontuação");
            }else{
                delay("correctPair", imagePressed);
            }

            return true;
        } else {
            flipped = false;
            playMusic("wrong", statusMusica);
            setImage(imageValuePressed, imagePressed);
            cardsFlipped = 2;
            resetLastBooleanClicked(lastBooleanClicked);
            delay("wrongPair", imagePressed);

            return false;
        }
    }

    private void sumPoint(){
        long difference = System.currentTimeMillis() - startTime;
        if (difference > 119000) difference = 119000;
        playerScore += 120 - difference / 1000;
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
            case "boolean13":
                boolean13 = false;
                break;
            case "boolean14":
                boolean14 = false;
                break;
            case "boolean15":
                boolean15 = false;
                break;
            case "boolean16":
                boolean16 = false;
                break;
            case "boolean17":
                boolean17 = false;
                break;
            case "boolean18":
                boolean18 = false;
                break;
            case "boolean19":
                boolean19 = false;
                break;
            case "boolean20":
                boolean20 = false;
                break;
            case "boolean21":
                boolean21 = false;
                break;
            case "boolean22":
                boolean22 = false;
                break;
            case "boolean23":
                boolean23 = false;
                break;
            case "boolean24":
                boolean24 = false;
                break;
            case "boolean25":
                boolean25 = false;
                break;
            case "boolean26":
                boolean26 = false;
                break;
            case "boolean27":
                boolean27 = false;
                break;
            case "boolean28":
                boolean28 = false;
                break;
            case "boolean29":
                boolean29 = false;
                break;
            case "boolean30":
                boolean30 = false;
                break;
            case "boolean31":
                boolean31 = false;
                break;
            case "boolean32":
                boolean32 = false;
                break;
            case "boolean33":
                boolean33 = false;
                break;
            case "boolean34":
                boolean34 = false;
                break;
            case "boolean35":
                boolean35 = false;
                break;
            case "boolean36":
                boolean36 = false;
                break;
            case "boolean37":
                boolean37 = false;
                break;
            case "boolean38":
                boolean38 = false;
                break;
            case "boolean39":
                boolean39 = false;
                break;
            case "boolean40":
                boolean40 = false;
                break;
            case "boolean41":
                boolean41 = false;
                break;
            case "boolean42":
                boolean42 = false;
                break;
            case "boolean43":
                boolean43 = false;
                break;
            case "boolean44":
                boolean44 = false;
                break;
            case "boolean45":
                boolean45 = false;
                break;
            case "boolean46":
                boolean46 = false;
                break;
            case "boolean47":
                boolean47 = false;
                break;
            case "boolean48":
                boolean48 = false;
                break;
        }
    }

    private void setViews() {
        textViewScore = findViewById(R.id.textViewScore);
        textViewTries = findViewById(R.id.textViewTries);
        ImageView_1 = findViewById(R.id.ImageView1HardId);
        imageView_2 = findViewById(R.id.ImageView2HardId);
        imageView_3 = findViewById(R.id.ImageView3HardId);
        imageView_4 = findViewById(R.id.ImageView4HardId);
        imageView_5 = findViewById(R.id.ImageView5HardId);
        imageView_6 = findViewById(R.id.ImageView6HardId);
        imageView_7 = findViewById(R.id.ImageView7HardId);
        imageView_8 = findViewById(R.id.ImageView8HardId);
        imageView_9 = findViewById(R.id.ImageView9HardId);
        imageView_10 = findViewById(R.id.ImageView10HardId);
        imageView_11 = findViewById(R.id.ImageView11HardId);
        imageView_12 = findViewById(R.id.ImageView12HardId);
        imageView_13 = findViewById(R.id.ImageView13HardId);
        imageView_14 = findViewById(R.id.ImageView14HardId);
        imageView_15 = findViewById(R.id.ImageView15HardId);
        imageView_16 = findViewById(R.id.ImageView16HardId);
        imageView_17 = findViewById(R.id.ImageView17HardId);
        imageView_18 = findViewById(R.id.ImageView18HardId);
        imageView_19 = findViewById(R.id.ImageView19HardId);
        imageView_20 = findViewById(R.id.ImageView20HardId);
        imageView_21 = findViewById(R.id.ImageView21HardId);
        imageView_22 = findViewById(R.id.ImageView22HardId);
        imageView_23 = findViewById(R.id.ImageView23HardId);
        imageView_24 = findViewById(R.id.ImageView24HardId);
        imageView_25 = findViewById(R.id.ImageView25HardId);
        imageView_26 = findViewById(R.id.ImageView26HardId);
        imageView_27 = findViewById(R.id.ImageView27HardId);
        imageView_28 = findViewById(R.id.ImageView28HardId);
        imageView_29 = findViewById(R.id.ImageView29HardId);
        imageView_30 = findViewById(R.id.ImageView30HardId);
        imageView_31 = findViewById(R.id.ImageView31HardId);
        imageView_32 = findViewById(R.id.ImageView32HardId);
        imageView_33 = findViewById(R.id.ImageView33HardId);
        imageView_34 = findViewById(R.id.ImageView34HardId);
        imageView_35 = findViewById(R.id.ImageView35HardId);
        imageView_36 = findViewById(R.id.ImageView36HardId);
        imageView_37 = findViewById(R.id.ImageView37HardId);
        imageView_38 = findViewById(R.id.ImageView38HardId);
        imageView_39 = findViewById(R.id.ImageView39HardId);
        imageView_40 = findViewById(R.id.ImageView40HardId);
        imageView_41 = findViewById(R.id.ImageView41HardId);
        imageView_42 = findViewById(R.id.ImageView42HardId);
        imageView_43 = findViewById(R.id.ImageView43HardId);
        imageView_44 = findViewById(R.id.ImageView44HardId);
        imageView_45 = findViewById(R.id.ImageView45HardId);
        imageView_46 = findViewById(R.id.ImageView46HardId);
        imageView_47 = findViewById(R.id.ImageView47HardId);
        imageView_48 = findViewById(R.id.ImageView48HardId);
    }

    public void checkSoundStatus(String typeMusic) {
        Bundle extra = getIntent().getExtras();
        String text = extra.getString("som");
        if (extra != null) {
            if (text.equals("ativado")) {
                if(typeMusic.equalsIgnoreCase("inGame")){
                    playMusic("inGame", "ativado");
                }else{
                    playMusic("endGame","ativado");
                }
            }
        }
    }

    public void playMusic(String typeMusic, String statusMusica) {

        switch (typeMusic) {

            case "inGame":
                mediaPlayer = MediaPlayer.create(this, R.raw.ingamemusic);
                mediaPlayer.start();
                mediaPlayer.setLooping(true);
                break;

            case "endGame":
                mediaPlayer.stop();
                mediaPlayer = MediaPlayer.create(this, R.raw.endgamemusic);
                mediaPlayer.start();
                break;

            case "wrong":
                if(statusMusica.equalsIgnoreCase("ativado")){
                    mediaPlayer2 = MediaPlayer.create(this, R.raw.failedsound);
                    mediaPlayer2.start();
                }
                break;

            case "correct":
                if(statusMusica.equalsIgnoreCase("ativado")){
                    mediaPlayer2 = MediaPlayer.create(this, R.raw.correctsound);
                    mediaPlayer2.start();
                }
                break;
        }
    }

    public void ShowEndGamePopUp(String textTitle) {

        TextView textViewPointsEndGame, textViewTitle;

        DialogEndGame.setContentView(R.layout.end_game_popup);
        Button buttonMenu = DialogEndGame.findViewById(R.id.ButtonBackId);
        Button buttonNewGame = DialogEndGame.findViewById(R.id.ButtonNewGameId);
        textViewPointsEndGame = DialogEndGame.findViewById(R.id.textViewPoints);
        textViewTitle = DialogEndGame.findViewById(R.id.textViewTitle);

        checkSoundStatus("endGame");

        DialogEndGame.setCanceledOnTouchOutside(false);
        textViewPointsEndGame.setText(Integer.toString(playerScore));
        DialogEndGame.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        DialogEndGame.show();

        textViewTitle.setText(textTitle);

        buttonMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        buttonNewGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogEndGame.dismiss();
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

    @Override
    public void onBackPressed() {

        Button buttonYes, buttonNo;

        DialogEndGame.setContentView(R.layout.exit_popup);

        buttonYes = DialogEndGame.findViewById(R.id.ButtonYesId);
        buttonNo = DialogEndGame.findViewById(R.id.ButtonNoId);

        DialogEndGame.setCanceledOnTouchOutside(false);
        DialogEndGame.getWindow().setBackgroundDrawable(new ColorDrawable((Color.TRANSPARENT)));
        DialogEndGame.show();

        buttonYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        buttonNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogEndGame.dismiss();
            }
        });
    }

}


