package com.example.intentcomextras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView txt_resultado;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txt_resultado = findViewById(R.id.txt_resultado);

        intent = getIntent();
        String nome = intent.getExtras().getString("keyNome");
        txt_resultado.setText("Olá "+nome);
    }
}