package com.example.pedro.pokemory;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {

    private EditText editTextEmailLogin, editTextPasswordLogin;
    private Button buttonLogin;
    private TextView textViewRegister;
    private FirebaseAuth auth;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextEmailLogin = findViewById(R.id.editTextEmailLogin);
        editTextPasswordLogin = findViewById(R.id.editTextPasswordLogin);
        textViewRegister = findViewById(R.id.textViewRegister);
        buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (hasConnection()){
                    if (!editTextEmailLogin.getText().toString().trim().isEmpty()
                            && !editTextPasswordLogin.getText().toString().trim().isEmpty()){
                        String email = editTextEmailLogin.getText().toString();
                        String password = editTextPasswordLogin.getText().toString();
                        user = new User();
                        user.setEmail(email);
                        user.setPassword(password);

                        loginValidation();
                    }
                    else {
                        Toast.makeText(LoginActivity.this, "Dados incompletos", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(LoginActivity.this, "Sem conexão com a internet", Toast.LENGTH_SHORT).show();
                }
            }
        });
        textViewRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }

    private void loginValidation(){

        auth = FirebaseSettings.getFirebaseAuth();
        auth.signInWithEmailAndPassword(
                user.getEmail(),
                user.getPassword()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Toast.makeText(LoginActivity.this, "Login efetuado com sucesso", Toast.LENGTH_SHORT).show();
                    openMainMenu();
                }
                else {
                    Toast.makeText(LoginActivity.this, "Dados incorretos", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void openMainMenu(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public boolean hasConnection() {
        ConnectivityManager manager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = manager.getActiveNetworkInfo();
        return info != null && info.isConnected();
    }

}
