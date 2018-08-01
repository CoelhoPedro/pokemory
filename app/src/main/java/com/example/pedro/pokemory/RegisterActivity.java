package com.example.pedro.pokemory;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseAuthWeakPasswordException;
import com.google.firebase.auth.FirebaseUser;

public class RegisterActivity extends AppCompatActivity {

    private Button buttonRegister;
    private EditText editTextNameRegister, editTextEmailRegister, editTextPasswordRegister;
    private User user;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editTextNameRegister = findViewById(R.id.editTextNameRegister);
        editTextEmailRegister = findViewById(R.id.editTextEmailRegister);
        editTextPasswordRegister = findViewById(R.id.editTextPasswordRegister);
        buttonRegister = findViewById(R.id.buttonRegister);

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!editTextNameRegister.getText().toString().trim().isEmpty()
                        && !editTextEmailRegister.getText().toString().trim().isEmpty()
                        && !editTextPasswordRegister.getText().toString().trim().isEmpty()){
                    String name = editTextNameRegister.getText().toString();
                    String email = editTextEmailRegister.getText().toString();
                    String password = editTextPasswordRegister.getText().toString();

                    user = new User();
                    user.setEmail(email);
                    user.setName(name);
                    user.setPassword(password);

                    registerUser();

                }
                else {
                    Toast.makeText(RegisterActivity.this, "Dados incompletos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void registerUser(){
        auth = FirebaseSettings.getFirebaseAuth();
        auth.createUserWithEmailAndPassword(
                user.getEmail(),
                user.getPassword()
        ).addOnCompleteListener(RegisterActivity.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Toast.makeText(RegisterActivity.this, "Conta criada com sucesso", Toast.LENGTH_SHORT).show();

                    String id = FirebaseAuth.getInstance().getCurrentUser().getUid();
                    FirebaseUser firebaseUser = task.getResult().getUser();

                    user.setId(id);
                    user.saveUser();

                    //Preferencias preferencias = new Preferencias(ActRegister.this);
                    //preferencias.saveUserPreferencias(id, users.getNick());

                    openLoginActivity();
                }
                else {
                    String error;

                    try {
                        throw task.getException();
                    }
                    catch (FirebaseAuthWeakPasswordException e){
                        error = "Enter a stronger password with at least 8 characters of letters and numbers";

                    }
                    catch (FirebaseAuthInvalidCredentialsException e){
                        error = "Invalid e-mail";

                    }
                    catch (FirebaseAuthUserCollisionException e){
                        error = "E-mail already registered";
                    }
                    catch (Exception e){
                        error = "Error while registering";
                        e.printStackTrace();
                    }

                    Toast.makeText(RegisterActivity.this, "Error: " + error, Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void openLoginActivity(){
        Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
