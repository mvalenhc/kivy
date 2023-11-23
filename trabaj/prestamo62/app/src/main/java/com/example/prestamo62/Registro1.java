package com.example.prestamo62;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Registro1 extends AppCompatActivity {
    String user = "";
    String contra = "";
    String correo = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro1);
        TextView nombre;
        TextView correo;
        TextView contasena;
        Button registrar;
        Button cancelar;

        nombre = (TextView) findViewById(R.id.nombre);
        correo = (TextView) findViewById(R.id.correo);
        contasena = (TextView) findViewById(R.id.contasena);
        registrar = (Button) findViewById(R.id.registrar);
        cancelar = (Button) findViewById(R.id.cancelar);

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Registro1.this, "Registro exitoso", Toast.LENGTH_LONG).show();
                Intent sme = new Intent(Registro1.this, Ventabalones.class);
                startActivity(sme);
            }
        });
        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sme = new Intent(Registro1.this, Login.class);
                startActivity(sme);
            }
        });
    }
}