package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;

import android.view.View;

public class MainActivity extends AppCompatActivity {
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.score=0 ;
    }


    public void NextScreen(View view) {
        Intent seguir = new Intent(this, P1.class);
        seguir.putExtra("Score", this.score);
        startActivity(seguir);
    }
}