package com.example.cristiancastro.tallerandroid;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import Dominio.Ahorcado;
import Dominio.Palabra;

public class modificarpalabra extends AppCompatActivity {

    Context MiContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificarpalabra);
        MiContext = getApplicationContext();
    }

    public void Enviar(View e)
    {
        if (ValidarCampos()) {
            TextView Palabra = (TextView) findViewById(R.id.txtPalabra);
            TextView Referencia = (TextView) findViewById(R.id.lblReferencia);
            TextView Descripcion = (TextView) findViewById(R.id.txtDescripcion);

            Dominio.Palabra pal = new Palabra();
            pal.setNombreP(Palabra.getText().toString());
            pal.setReferenciaP(Referencia.getText().toString());
            pal.setDescripcionP(Descripcion.getText().toString());

            Ahorcado ahorcado = new Ahorcado();

            if (ahorcado.ExistePalabra(pal,MiContext)) {
                Toast.makeText(MiContext, "Ya existe esa Palabra", Toast.LENGTH_SHORT).show();
            } else {
                ahorcado.guardarPalabra(pal,MiContext);
                Toast.makeText(MiContext, "Palabra Agregada", Toast.LENGTH_SHORT).show();
            }
        }
        else
        {
            Toast.makeText(MiContext, "Completar todos los campos", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean ValidarCampos()
    {
        TextView Palabra = (TextView) findViewById(R.id.txtPalabra);
        TextView Referencia = (TextView) findViewById(R.id.lblReferencia);
        TextView Descripcion = (TextView) findViewById(R.id.txtDescripcion);

        return (!Palabra.getText().toString().isEmpty() && !Referencia.getText().toString().isEmpty()
                && !Descripcion.getText().toString().isEmpty());
    }
}
