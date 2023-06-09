package com.hgalvarado.registropersona;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityResultado extends AppCompatActivity {

    TextView nombre,apellido,edad,correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        nombre = (TextView) findViewById(R.id.lblNombrePersona);
        apellido = (TextView) findViewById(R.id.lblApellidoPersona);
        edad = (TextView) findViewById(R.id.lblEdadPersona);
        correo = (TextView) findViewById(R.id.lblCorreoPersona);

        nombre.setText("Nombre: " +  getIntent().getStringExtra("nombre"));
        apellido.setText("Apellido: " + getIntent().getStringExtra("apellido"));
        edad.setText("Edad: " + getIntent().getStringExtra("edad") + " Años");
        correo.setText("Correo: " + getIntent().getStringExtra("correo"));
    }
}