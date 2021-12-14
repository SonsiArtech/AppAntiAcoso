package com.example.anti_acoso;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    /*
    private TextView tvNombre;
    private TextView tvContrasena;

     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        /*

        tvNombre = findViewById(R.id.tvUsuario);
        tvContrasena = findViewById(R.id.tvPass);

        Bundle bundle = getIntent().getExtras();

        tvNombre.setText(bundle.getString("nombre"));
        tvContrasena.setText(bundle.getString("contrasena"));

         */
    }

    //nos ayuda a colocar el menu en nuestras paginas
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menuop, menu);
        return true;
    }

    //Codigo para seleccionar las opciones del menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id){
            case R.id.opHome:
                Toast.makeText(this,"Home seleccionado",Toast.LENGTH_SHORT).show();
                break;
            case R.id.opPublicacion:
                Toast.makeText(this,"Publicaciones seleccionado",Toast.LENGTH_SHORT).show();
                finish();
                Intent intent = new Intent(this, Publicacion.class);
                startActivity(intent);
                break;
            case R.id.opDenuncia:
                Toast.makeText(this,"Denuncia seleccionado",Toast.LENGTH_SHORT).show();
                finish();
                Intent intent2 = new Intent(this, Denuncia.class);
                startActivity(intent2);
                break;
            case R.id.opAmigos:
                Toast.makeText(this,"Amigos seleccionado",Toast.LENGTH_SHORT).show();
                finish();
                Intent intent3 = new Intent(this, Amigos.class);
                startActivity(intent3);
                break;
            case R.id.opNoticias:
                Toast.makeText(this,"Noticias seleccionado",Toast.LENGTH_SHORT).show();
                finish();
                Intent intent4 = new Intent(this, Noticias.class);
                startActivity(intent4);
                break;
            case R.id.opAyuda:
                Toast.makeText(this,"Ayuda seleccionado",Toast.LENGTH_SHORT).show();
                finish();
                Intent intent5 = new Intent(this, Ayuda.class);
                startActivity(intent5);
                break;
            case R.id.opCerrarSesion:
                Toast.makeText(this,"Cerrando Sesión",Toast.LENGTH_SHORT).show();
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}