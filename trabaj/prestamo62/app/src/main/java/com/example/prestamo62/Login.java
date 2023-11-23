package com.example.prestamo62;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    String user = "valentina";
    String contra = "2130";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView Tusuario;
        TextView Tcontrasena;
        Button button;
        Button registro;
        Tusuario = (TextView) findViewById(R.id.Tusuario);
        Tcontrasena = (TextView) findViewById(R.id.Tcontrasena);
        button = (Button) findViewById(R.id.button);
        registro = (Button) findViewById(R.id.registro);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Tusuario.getText().toString().equals(user) && Tcontrasena.getText().toString().equals(contra)) {
                    Toast.makeText(Login.this, "Bienvenido", Toast.LENGTH_LONG).show();
                    Intent sme = new Intent(Login.this, Menuprincipal.class);
                    startActivity(sme);
                } else {
                    Toast.makeText(Login.this, "usuario y contraseña no validos", Toast.LENGTH_LONG).show();
                }
            }

        });
        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sme = new Intent (Login.this, Registro1.class);
                startActivity(sme);
            }
        });

    }
}
