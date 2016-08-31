package com.example.cristiancastro.tallerandroid;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.text.ParseException;
import java.util.ArrayList;

import Dominio.Ahorcado;
import Dominio.Partida;
import Dominio.UsuarioPublico;

public class mejorespuntajescelular extends AppCompatActivity {

    Context MiContext;
    Bundle b;
    UsuarioPublico u;

    ArrayAdapter<Partida> adaptador;
    ArrayList<Partida> listaDePartidas;

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

        //CARGA LISTA A MOSTRAR
        try {
            listaDePartidas = aho.TopCincoMejoresPartidas(MiContext);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        ListView list = (ListView)findViewById(R.id.lstVerMejoresPuntajesCelular);
        adaptador = new ArrayAdapter<Partida>(MiContext,android.R.layout.simple_spinner_item,listaDePartidas);
        list.setAdapter(adaptador);

    }
}
