package com.example.prestamo62;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Ventabalones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vender);

        TextView idalqui;
        TextView idpersona;
        TextView nombres;
        TextView tipo;
        TextView estado;
        TextView texto1;
        Button button2;

        idalqui = (TextView) findViewById(R.id.idalqui);
        idpersona = (TextView) findViewById(R.id.idpersona);
        nombres = (TextView) findViewById(R.id.nombres);
        tipo = (TextView) findViewById(R.id.tipo);
        texto1 = (TextView) findViewById(R.id.texto1);
        estado = (TextView) findViewById(R.id.estado);

        button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Venderr antonio = new Venderr (Integer.parseInt(idalqui.getText().toString()), idpersona.getText().toString(), nombres.getText().toString(), tipo.getText().toString(), estado.getText().toString());
                        texto1.setText(
                                "ID alquiler: " + antonio.getIdalquiler()+ "\n"
                                        + "ID persona: " + antonio.getIdpersona()+ "\n"
                                        + "Nombres: " + antonio.getNombre() + "\n"
                                        + "Tipo: " + antonio.getTipo() + "\n"
                                        + "estado: " + antonio.getEstado()


                        );

                };

            });
        }

    }

