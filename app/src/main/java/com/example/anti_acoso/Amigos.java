package com.example.anti_acoso;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Amigos extends AppCompatActivity {

    private ArrayList<ClaseAmigos> listaAmigos = new ArrayList<ClaseAmigos>();
    private ListView lvAmigos;
    private TextView tvRutAmigos;
    private ImageView imgAvatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amigos);

        llenar();
        lvAmigos = findViewById(R.id.lvAmigos);

        AdaptadorPersona adaptador = new AdaptadorPersona(this);
        lvAmigos.setAdapter(adaptador);

        lvAmigos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(Amigos.this,listaAmigos.get(i).getNombre()+" "+listaAmigos.get(i).getApellido(), Toast.LENGTH_SHORT).show();
            }
        });

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
                finish();
                Intent intent = new Intent(this, Home.class);
                startActivity(intent);
                break;
            case R.id.opPublicacion:
                Toast.makeText(this,"Publicaciones seleccionado",Toast.LENGTH_SHORT).show();
                finish();
                Intent intent2 = new Intent(this, Publicacion.class);
                startActivity(intent2);
                break;
            case R.id.opDenuncia:
                Toast.makeText(this,"Denuncia seleccionado",Toast.LENGTH_SHORT).show();
                finish();
                Intent intent3 = new Intent(this, Denuncia.class);
                startActivity(intent3);
                break;
            case R.id.opAmigos:
                Toast.makeText(this,"Amigos seleccionado",Toast.LENGTH_SHORT).show();
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

    class AdaptadorPersona extends ArrayAdapter<ClaseAmigos>{

        AppCompatActivity appCompatActivity;
        public AdaptadorPersona(AppCompatActivity context) {
            super(context, R.layout.amigos, listaAmigos);

            appCompatActivity = context;
        }

        public View getView(int posicion, View view , ViewGroup group){
            LayoutInflater inflater = appCompatActivity.getLayoutInflater();
            View item = inflater.inflate(R.layout.amigos, null);

            tvRutAmigos = item.findViewById(R.id.tvRutAmigo);
            tvRutAmigos.setText(listaAmigos.get(posicion).getRut());

            imgAvatar = item.findViewById(R.id.imageView);
            if(listaAmigos.get(posicion).getGenero().equals("nb")){
                imgAvatar.setImageResource(R.mipmap.advertencia);
            } else if (listaAmigos.get(posicion).getGenero().equals("f")){
                imgAvatar.setImageResource(R.mipmap.ayudar);
            } else {
                imgAvatar.setImageResource(R.mipmap.hogar);
            }

            return  item;
        }

    }
    public void llenar(){
        listaAmigos.add(new ClaseAmigos("1-1", "Nicolas", "Lara", "nb"));
        listaAmigos.add(new ClaseAmigos("1-2", "Bastian", "Silva", "m"));
        listaAmigos.add(new ClaseAmigos("1-3", "Vanesa", "Hurtado", "f"));
        listaAmigos.add(new ClaseAmigos("1-4", "Cecilia", "Sanhueza", "f"));
        listaAmigos.add(new ClaseAmigos("1-5", "Elisandro", "Gutierres", "nb"));
        listaAmigos.add(new ClaseAmigos("1-6", "Guaguillo", "Salas", "nb"));
    }
}