package com.example.anti_acoso;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Publicacion extends AppCompatActivity {

    private ArrayList publicaciones = new ArrayList();
    private ArrayAdapter adaptador;
    private ListView listaPublicacion;
    private EditText etPubli;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publicacion);

        llenar();

        adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_1, publicaciones);
        listaPublicacion = findViewById(R.id.lvPublicaciones);
        listaPublicacion.setAdapter(adaptador);

        etPubli = findViewById(R.id.etPublicaciones);

        listaPublicacion.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int i, long id) {

                int posicion = i;
                AlertDialog.Builder dialogo = new AlertDialog.Builder( Publicacion.this);

                dialogo.setTitle("Importante");
                dialogo.setMessage("¿Eliminar este Producto?");
                dialogo.setCancelable(false);

                dialogo.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    publicaciones.remove(posicion);
                    adaptador.notifyDataSetChanged();
                    Toast.makeText(Publicacion.this, "Producto eliminado", Toast.LENGTH_SHORT).show();
                    }
                });
                dialogo.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    Toast.makeText(Publicacion.this, "Operación cancelada", Toast.LENGTH_SHORT).show();
                    }
                });
                dialogo.show();
                return false;
            }
        });

    }

    public void agregar(View view){

        publicaciones.add(etPubli.getText().toString());
        adaptador.notifyDataSetChanged();
        etPubli.setText("");

    }

    public void llenar(){
        publicaciones.add("Hola como estan");
        publicaciones.add("Buen dia para todes");
        publicaciones.add("Fuerza a todas las mujeres");
        publicaciones.add("Pronto se aceptara el");
        publicaciones.add("Hola soy nuevo");
        publicaciones.add("Marcha feminista proximo jueves");
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
                break;
            case R.id.opDenuncia:
                Toast.makeText(this,"Denuncia seleccionado",Toast.LENGTH_SHORT).show();
                finish();
                Intent intent2 = new Intent(this, Denuncia.class);
                startActivity(intent2);
                break;
            case R.id.opNoticias:
                Toast.makeText(this,"Noticias seleccionado",Toast.LENGTH_SHORT).show();
                finish();
                Intent intent3 = new Intent(this, Noticias.class);
                startActivity(intent3);
                break;
            case R.id.opAyuda:
                Toast.makeText(this,"Ayuda seleccionado",Toast.LENGTH_SHORT).show();
                finish();
                Intent intent4 = new Intent(this, Ayuda.class);
                startActivity(intent4);
                break;
            case R.id.opCerrarSesion:
                Toast.makeText(this,"Cerrando Sesión",Toast.LENGTH_SHORT).show();
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}