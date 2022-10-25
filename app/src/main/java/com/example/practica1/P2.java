package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class P2 extends AppCompatActivity {


    int score;
    ImageButton IM1,IM2,IM3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p2);
        this.score = 0 ;
        //Recogemos la puntuación
        this.score=(int)getIntent().getExtras().getInt("Score");

    }

    public void FotoBuena(View view){
        Toast.makeText(this, "Has acertado, +3 puntos", Toast.LENGTH_SHORT).show();
        this.score=this.score + 3;
        Intent seguir = new Intent(this,P3.class);
        seguir.putExtra("Score",this.score);
        startActivity(seguir);
    }

    public void FotoMala(View view){
        //Mensaje por pantalla del fallo
        Toast.makeText(this, "Has fallado, -2 puntos", Toast.LENGTH_SHORT).show();
        //Se le resta 2 puntos
        this.score = this.score - 2;

        //Empezamos a tratar el cambio de pantalla
        Intent fallo = new Intent(this,PantallaError.class);
        fallo.putExtra("Score",this.score);
        fallo.putExtra("Pregunta", 2);
        startActivity(fallo);

    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this,"Acaba la partida para poder salir",Toast.LENGTH_SHORT).show();
    }
}