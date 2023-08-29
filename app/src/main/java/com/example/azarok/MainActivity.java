package com.example.azarok;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        TextView text = findViewById(R.id.textoCC);

        if (Moneda.lanzar() == 1)
            text.setText("Cara");
        else
            text.setText("Cruz");
    }

    public void onClickLetra(View view) {
        TextView text = findViewById(R.id.textLetra);
        text.setText("Tu letra es la " + Letra.LetraAleatoria());
    }

    @SuppressLint("SetTextI18n")
    public void onClickRandom(View view) {
        TextView text = findViewById(R.id.resultadoRandom);

        EditText et1;
        EditText et2;



        et1 = (EditText)findViewById(R.id.numAleatorio1);
        String texto1 = et1.getText().toString();
        int numero1 = Integer.parseInt(texto1);

        et2 = (EditText)findViewById(R.id.numAleatorio2);
        String texto2 = et2.getText().toString();
        int numero2 = Integer.parseInt(texto2);
        int aleatorio1 = (int)(Math.random()*(numero2-(numero1 +1))+numero1);
        text.setText("Tu número aleatorio es el " + ThreadLocalRandom.current().nextInt(numero1, numero2));
    }
}
