package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class P5 extends AppCompatActivity {

    //Inicializamos puntuación
    int score;
    //Creamos los botones para poder trabajar con ellos
    RadioButton R1,R2,R3,R4,R5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p5);
        this.score= 0;
        //Recogemos la puntuación
        this.score=(int)getIntent().getExtras().getInt("Score");
        R1 = (RadioButton) findViewById(R.id.Button3);
        R2 = (RadioButton) findViewById(R.id.Button2);
        R3 = (RadioButton) findViewById(R.id.Button8);
        R4 = (RadioButton) findViewById(R.id.Button6);
        R5 = (RadioButton) findViewById(R.id.Button1);
    }

    public void comprobar(View view){
        //Trataremos los errores promero
        if(R1.isChecked() || R2.isChecked() ||R3.isChecked()||R5.isChecked()){
            //Mensaje por pantalla del fallo
            Toast.makeText(this, "Has fallado, -2 puntos", Toast.LENGTH_SHORT).show();
            //Se le resta 2 puntos
            this.score = this.score - 2;

            //Empezamos a tratar el cambio de pantalla
            Intent fallo = new Intent(this,PantallaError.class);
            fallo.putExtra("Score",this.score);
            fallo.putExtra("Pregunta", 5);
            startActivity(fallo);

        }else if(R4.isChecked()){
            //Mensaje por pantalla el acierto
            Toast.makeText(this, "Has acertado, +3 puntos", Toast.LENGTH_SHORT).show();
            //Se le suma 3 puntos
            this.score = this.score + 3;
            //Empezamos a tratar el cambio de pantalla
            Intent seguir = new Intent(this,PantallaFinal.class);
            seguir.putExtra("Score",this.score);
            seguir.putExtra("Pregunta", 5);
            startActivity(seguir);
        }
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(this,"Acaba la partida para poder salir",Toast.LENGTH_SHORT).show();
    }
}