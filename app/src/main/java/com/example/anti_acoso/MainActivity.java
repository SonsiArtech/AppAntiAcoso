package com.example.anti_acoso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //Animaciones
        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);


        Button inicio = findViewById(R.id.btnIniciarSesion);
        Button registro = findViewById(R.id.btnIRegistrarse);
        ImageView logo = findViewById(R.id.ivLogo);

        inicio.setAnimation(animation1);
        registro.setAnimation(animation1);
        logo.setAnimation(animation2);


    }

    public void abrir(View view){
        Intent intent = new Intent(this, IniciarSesion.class);
        startActivity(intent);
    }
    public void abrirRegistrarse(View view){
        Intent intent = new Intent(this, Registrarse.class);
        startActivity(intent);
    }



}