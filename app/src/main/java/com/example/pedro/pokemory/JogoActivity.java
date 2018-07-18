package com.example.pedro.pokemory;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class JogoActivity extends AppCompatActivity {

    public ImageView Button1,Button2,Button3,Button4,Button5,Button6,Button7,Button8,
            Button9,Button10,Button11,Button12;

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
                Button1.setImageDrawable(getResources().getDrawable(R.drawable.pikachu));
            }
        });

    }

}
