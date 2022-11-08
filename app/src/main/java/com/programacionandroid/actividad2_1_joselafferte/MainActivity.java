package com.programacionandroid.actividad2_1_joselafferte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView nombreImagen;
    Button unBoton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombreImagen = findViewById(R.id.txtNombre);
        unBoton = findViewById(R.id.btnEnviar);

        unBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent objIntent =  new Intent(getApplicationContext(), MainActivity2.class);

                String stNombreImagen = nombreImagen.getText().toString();

                objIntent.putExtra("NombreImagenPar", stNombreImagen);

                startActivity(objIntent);
            }
        });

    }


}