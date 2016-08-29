package com.example.cristiancastro.tallerandroid;

import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

import Dominio.Ahorcado;
import Dominio.UsuarioPublico;
import Persistencia.SqlLite;

public class Maininicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maininicio);
        SqlLite sqlite = new SqlLite(this);
    }

    public void Registro(View v)
    {
        try{
            Class<?> clase = Class.forName("com.example.cristiancastro.tallerandroid.registroActivity");
            Intent i = new Intent(this, clase);
            startActivity(i);
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public void Enviar(View v)//SYC :D
    {
        if(ValidarEntrada())
        {
        TextView Usuario = (TextView) findViewById(R.id.txtUsuario);
        TextView Contraseña = (TextView) findViewById(R.id.txtContraseña);
        Ahorcado ahorcado = new Ahorcado();
        UsuarioPublico up = new UsuarioPublico();

        up.setContraseñaU(Contraseña.toString());
        up.setUsuarioU(Usuario.toString());

        up = ahorcado.SeleccionarEspecificaUsuarioPublico(up);

            if (up != null) {
                        try {
                            Class<?> clase = Class.forName("com.example.cristiancastro.tallerandroid.inicio");
                            Intent i = new Intent(this, clase);
                            i.putExtra("Usuario", up.getIdUP());
                            startActivity(i);

                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
            } else {
                Toast.makeText(getApplicationContext(), "Usuario o Contraseña Incorrecto", Toast.LENGTH_SHORT).show();
            }
        }
        else
        {
            Toast.makeText(getApplicationContext(), "Rellene todos los campos", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean ValidarEntrada()
    {
        return (findViewById(R.id.txtUsuario).toString() != "" && findViewById(R.id.txtContraseña).toString()!= "");
    }

}
