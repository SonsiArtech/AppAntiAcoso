package com.example.anti_acoso;

 import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
 import android.view.View;

public class Registrarse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrase);
    }

    public void salirRegistrarse(View view){
        finish();
    }
}