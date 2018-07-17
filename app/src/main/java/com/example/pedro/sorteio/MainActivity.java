package com.example.pedro.sorteio;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends Activity {

    private EditText edtMin;
    private EditText edtMax;
    private TextView txtNumber;
    private Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtMin = findViewById(R.id.edtMin);
        edtMax = findViewById(R.id.edtMax);
        txtNumber = findViewById(R.id.txtNumber);
    }

    public void gerar(View view) {

       String s =  edtMin.getText().toString();

       if(s.isEmpty()){
           Toast.makeText(this, "o valor mínimo é obrigatório", Toast.LENGTH_SHORT).show();
           return;
       }

       int min = Integer.parseInt(s);

       s =  edtMax.getText().toString();

        if(s.isEmpty()){
            Toast.makeText(this, "o valor máximo é obrigatório", Toast.LENGTH_SHORT).show();
            return;
        }
       int max = Integer.parseInt(s);

       int num = random.nextInt(max - min + 1) + min;

       txtNumber.setText(String.valueOf(num));

    }
}
