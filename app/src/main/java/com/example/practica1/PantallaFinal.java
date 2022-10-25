package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PantallaFinal extends AppCompatActivity {
    int ContadorPregunta;
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_final);
        this.ContadorPregunta = 0;
        this.score = 0;
        this.score=(int)getIntent().getExtras().getInt("Score");
        this.ContadorPregunta=(int)getIntent().getExtras().getInt("Pregunta");
        TextView scoreTextView = (TextView) findViewById(R.id.textViewPuntuacion);
        scoreTextView.setText("Puntuación obtenida: " + this.score);
        TextView preguntaTextView = (TextView) findViewById(R.id.textViewPuntuacion3);
        preguntaTextView.setText("Preguntas realizadas: " + this.ContadorPregunta);
    }

    public void salir(View view){
        Intent intent;
        intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}