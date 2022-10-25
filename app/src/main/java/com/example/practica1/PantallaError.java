package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PantallaError extends AppCompatActivity {

    int ContadorPregunta;
    int score;
    int pasarPagina;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_error);
        this.ContadorPregunta = 0;
        this.score = 0;
        this.score=(int)getIntent().getExtras().getInt("Score");
        this.ContadorPregunta=(int)getIntent().getExtras().getInt("Pregunta");
        TextView scoreTextView = (TextView) findViewById(R.id.textViewPuntuacion);
        scoreTextView.setText("Puntuación obtenida: " + this.score);
        TextView preguntaTextView = (TextView) findViewById(R.id.textViewPuntuacion3);
        preguntaTextView.setText("Preguntas realizadas: " + this.ContadorPregunta);
        pasarPagina=this.ContadorPregunta;
    }

    public void salir(View view){
        Intent intent;
        intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void SeguirJugando(View view){

        switch (pasarPagina){
            case 1:
                Intent P2;
                P2=new Intent(this,P2.class);
                P2.putExtra("Score",this.score);
                startActivity(P2);
                break;
            case 2:
                Intent P3;
                P3=new Intent(this,P3.class);
                P3.putExtra("Score",this.score);
                startActivity(P3);
                break;
            case 3:
                Intent P4;
                P4=new Intent(this,P4.class);
                P4.putExtra("Score",this.score);
                startActivity(P4);
                break;
            case 4:
                Intent P5;
                P5=new Intent(this,P5.class);
                P5.putExtra("Score",this.score);
                startActivity(P5);
                break;
        }
    }

}