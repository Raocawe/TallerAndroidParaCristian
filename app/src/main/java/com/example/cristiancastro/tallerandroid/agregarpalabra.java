package com.example.cristiancastro.tallerandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import Dominio.Ahorcado;
import Dominio.Palabra;
import Dominio.UsuarioPublico;

public class agregarpalabra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregarpalabra);

    }

    public void Enviar(View e)
    {
        if (ValidarCampos()) {
            TextView Palabra = (TextView) findViewById(R.id.txtPalabra);
            TextView Referencia = (TextView) findViewById(R.id.txtReferencia );
            TextView Descripcion = (TextView) findViewById(R.id.txtDescripcion);

            Palabra pal = new Palabra();
            pal.setNombreP(Palabra.toString());
            pal.setReferenciaP(Palabra.toString());
            pal.setDescripcionP(Palabra.toString());

            Ahorcado ahorcado = new Ahorcado();

            if (ahorcado.ExistePalabra(pal)) {
                Toast.makeText(getApplicationContext(), "Ya existe esa Palabra", Toast.LENGTH_SHORT).show();
            } else {
                ahorcado.guardarPalabra(pal);
                Toast.makeText(getApplicationContext(), "Usuario Agregado", Toast.LENGTH_SHORT).show();
            }
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Completar todos los campos", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean ValidarCampos()
    {
        return (findViewById(R.id.txtPalabra).toString() != "" && findViewById(R.id.txtDescripcion).toString() != "" && findViewById(R.id.txtReferencia).toString() != "");
    }
}