package com.example.pedro.pokemory.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pedro.pokemory.R;
import com.example.pedro.pokemory.config.FirebaseConfiguration;
import com.example.pedro.pokemory.model.User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RegisterActivity extends AppCompatActivity {

    private EditText name, email, password;
    private Button buttonRegister;
    private User user;
    private FirebaseAuth autentication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        name = findViewById(R.id.editTextNameCadastro);
        email = findViewById(R.id.editTextEmailCadastro);
        password = findViewById(R.id.editTextPasswordCadastro);
        buttonRegister = findViewById(R.id.buttonCadastrar);

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                user = new User();
                user.setName(name.getText().toString());
                user.setEmail(email.getText().toString());
                user.setPassword(password.getText().toString());
                resgisterUser();

            }
        });

    }

    private void resgisterUser() {

        autentication = FirebaseConfiguration.getFirebaseAutention();
        autentication.createUserWithEmailAndPassword(
                user.getEmail(),
                user.getPassword()).addOnCompleteListener(RegisterActivity.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if(task.isSuccessful()) {

                    Toast.makeText(RegisterActivity.this, "Sucesso ao cadastrar usuário", Toast.LENGTH_LONG).show();

                    FirebaseUser userFirebase = task.getResult().getUser();
                    user.setId(userFirebase.getUid());
                    user.save();
                    autentication.signOut();
                    finish();

                } else {
                    Toast.makeText(RegisterActivity.this, "Erro ao cadastrar usuário", Toast.LENGTH_LONG).show();

                }

            }
        });

    }

}
