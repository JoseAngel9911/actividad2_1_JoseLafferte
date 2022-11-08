package com.programacionandroid.actividad2_1_joselafferte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView nombreImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nombreImagen = findViewById(R.id.tRecibir);

        Intent intentRecibir = getIntent();

        String nombreImagenPar = intentRecibir.getExtras().getString("NombreImagenPar");
        nombreImagen.setText("Nombre de la Imagen" + nombreImagenPar);

    }
}