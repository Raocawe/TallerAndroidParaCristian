package com.example.cristiancastro.tallerandroid;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;

import Dominio.Ahorcado;
import Dominio.UsuarioPublico;

public class inicio extends AppCompatActivity {

    Bundle b;
    UsuarioPublico u;
    Context MiContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        MiContext = getApplicationContext();

        b = getIntent().getExtras();
        Ahorcado aho = new Ahorcado();
        u = new UsuarioPublico();
        u.setIdUP(b.getInt("Usuario"));
        u = aho.SeleccionarEspecificaUsuarioPublicoPorId(u,MiContext);
        TextView Titulo = (TextView)findViewById(R.id.lblBienvenida);
        Titulo.setText("Bienvenido Usuario "+ u.getUsuarioU());

    }

    public void Jugar(View v) throws IOException
    {
        try{
            Class<?> clase = Class.forName("com.example.cristiancastro.tallerandroid.partidaActivity");
            Intent i = new Intent(this, clase);
            i.putExtra("Usuario",u.getIdUP());
            startActivity(i);
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public void Salir(View v) throws IOException
    {
        try{
            Class<?> clase = Class.forName("com.example.cristiancastro.tallerandroid.Maininicio");
            Intent i = new Intent(this, clase);
            startActivity(i);
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public void MPU(View v) throws IOException
    {
        try{
            Class<?> clase = Class.forName("com.example.cristiancastro.tallerandroid.mejorespuntajesusuario");
            Intent i = new Intent(this, clase);
            i.putExtra("Usuario",u.getIdUP());
            startActivity(i);
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public void MPC(View v) throws IOException
    {
        try{
            Class<?> clase = Class.forName("com.example.cristiancastro.tallerandroid.mejorespuntajescelular");
            Intent i = new Intent(this, clase);
            startActivity(i);
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
