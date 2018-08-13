package com.example.pedro.pokemory;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class MultiplayerActivity extends AppCompatActivity {

    private EditText editTextNickname;
    private Button buttonNewMPGame, buttonLogoff;
    private Dialog dialogLogout;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplayer);

        editTextNickname = findViewById(R.id.editTextNickname);
        buttonNewMPGame = findViewById(R.id.buttonNewMPGame);
        buttonLogoff = findViewById(R.id.buttonLogoff);

        editTextNickname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextNickname.setInputType(InputType.TYPE_TEXT_VARIATION_PERSON_NAME);
            }
        });

        buttonNewMPGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MultiplayerActivity.this, GameActivity.class));
            }
        });

        buttonLogoff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firebaseAuth = FirebaseSettings.getFirebaseAuth();

                if (firebaseAuth.getCurrentUser() != null) {

                    ShowLogoutPopUp();

                } else {

                    Intent intent = new Intent(MultiplayerActivity.this, LoginActivity.class);
                    startActivity(intent);
                }
            }
        });
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
                Toast.makeText(MultiplayerActivity.this, "Sucesso ao sair", Toast.LENGTH_SHORT).show();
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
}
