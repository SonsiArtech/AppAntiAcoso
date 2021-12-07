package com.example.anti_acoso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




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