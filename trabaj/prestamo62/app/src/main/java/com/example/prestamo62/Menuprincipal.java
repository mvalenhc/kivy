package com.example.prestamo62;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Menuprincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuprincipal);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menuprincipal.this, Ventabalones.class);
                startActivity(intent);
            }
        });

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent sme = new Intent(Menuprincipal.this, Venderr.class);
                startActivity(sme);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuprincipal, menu);
        return true;
    };




    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.msalir:
                finish();
                return true;
            case R.id.mventa:
                Intent irventa = new Intent(Menuprincipal.this, Ventabalones.class);
                startActivity(irventa);
                return true;
            case R.id.mregistro:
                Intent irRegis = new Intent(Menuprincipal.this, Registro1.class);
                startActivity(irRegis);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}