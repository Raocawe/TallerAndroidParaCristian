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
    TextView PalabraAModificar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificarpalabra);
        MiContext = getApplicationContext();
        PalabraAModificar = (TextView) findViewById(R.id.txtPalabra);
    }

    public void Enviar(View e)
    {
        if (ValidarCampos()) {

            TextView Palabra = (TextView) findViewById(R.id.txtPalabra);
            TextView Referencia = (TextView) findViewById(R.id.lblReferencia);
            TextView Descripcion = (TextView) findViewById(R.id.txtDefinicion);

            Dominio.Palabra pal = new Palabra();
            pal.setNombreP(Palabra.getText().toString());
            pal.setReferenciaP(Referencia.getText().toString());
            pal.setDescripcionP(Descripcion.getText().toString());
            pal.setCantidadLetras(Palabra.getText().toString().length());

            Ahorcado ahorcado = new Ahorcado();

            if (ahorcado.ExistePalabra(pal,MiContext)) {
                ahorcado.ModificarPalabra(pal,MiContext);
                Toast.makeText(MiContext, "Palabra Modificada", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MiContext, "Palabra No Encontrada", Toast.LENGTH_SHORT).show();
            }
        }
        else
        {
            Toast.makeText(MiContext, "Completar Todos los Campos", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean ValidarCampos()
    {
        TextView Palabra = (TextView) findViewById(R.id.txtPalabra);
        TextView Referencia = (TextView) findViewById(R.id.lblReferencia);
        TextView Descripcion = (TextView) findViewById(R.id.txtDefinicion);

        return (!PalabraAModificar.getText().toString().isEmpty() && !Palabra.getText().toString().isEmpty() && !Referencia.getText().toString().isEmpty() &&
                !Descripcion.getText().toString().isEmpty());
    }
}
