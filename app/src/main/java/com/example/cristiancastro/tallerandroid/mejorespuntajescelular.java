package com.example.cristiancastro.tallerandroid;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import Dominio.Ahorcado;
import Dominio.UsuarioPublico;

public class mejorespuntajescelular extends AppCompatActivity {

    Context MiContext;
    Bundle b;
    UsuarioPublico u;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mejorespuntajescelular);
        MiContext = getApplicationContext();

        b = getIntent().getExtras();
        Ahorcado aho = new Ahorcado();
        u = new UsuarioPublico();
        u.setIdUP(b.getInt("Usuario"));
        u = aho.SeleccionarEspecificaUsuarioPublicoPorId(u,MiContext);
    }
}
