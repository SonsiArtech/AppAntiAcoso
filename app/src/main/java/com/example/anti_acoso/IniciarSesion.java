package com.example.anti_acoso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class IniciarSesion extends AppCompatActivity {

    /*
    private EditText etNom;
    private EditText etContra;


     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);

        //Animaciones
        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);

        EditText nombre = findViewById(R.id.etNombre);
        EditText contrasena = findViewById(R.id.etContrasena);
        TextView bienvenido = findViewById(R.id.tvBienvenido);
        ImageView logo = findViewById(R.id.ivLogoInicio);

        nombre.setAnimation(animation1);
        contrasena.setAnimation(animation1);
        logo.setAnimation(animation2);
        bienvenido.setAnimation(animation2);

        /*
        etNom = findViewById(R.id.etNombre);
        etContra = findViewById(R.id.etContrasena);

         */

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
        /*
        //el siguiente codigo nos servira para enviar el texto a la pagina de iniciar sesión
        intent.putExtra("nombre", etNom.getText().toString());
        intent.putExtra("contrasena", etContra.getText().toString());
        //final

         */
        startActivity(intent);
    }
}