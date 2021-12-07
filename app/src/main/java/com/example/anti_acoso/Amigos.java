package com.example.anti_acoso;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
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