package com.hgalvarado.registropersona;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txtNombre, txtApellido, txtEdad, txtCorreo;
    Button btnEnviarInformacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = (EditText) findViewById(R.id.txtNombres);
        txtApellido = (EditText) findViewById(R.id.txtApellidos);
        txtEdad = (EditText) findViewById(R.id.txtEdad);
        txtCorreo = (EditText) findViewById(R.id.txtCorreo);
        btnEnviarInformacion = (Button) findViewById(R.id.btnEnviarInformacion);

        btnEnviarInformacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ActivityResultado.class);
                intent.putExtra("nombre",txtNombre.getText().toString());
                intent.putExtra("apellido",txtApellido.getText().toString());
                intent.putExtra("edad",txtEdad.getText().toString());
                intent.putExtra("correo",txtCorreo.getText().toString());
                startActivity(intent);
            }
        });




    }
}