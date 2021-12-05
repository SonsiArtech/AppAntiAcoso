package com.example.anti_acoso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IniciarSesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);
    }

    public void salir(View view){
        finish();
    }

    public void abrirRecuperarPass(View view){
        Intent intent = new Intent(this, RecuperarPass.class);
        startActivity(intent);
    }

    public void abrirSesion(View view){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}