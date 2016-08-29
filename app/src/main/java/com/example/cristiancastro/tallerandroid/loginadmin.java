package com.example.cristiancastro.tallerandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class loginadmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginadmin);
    }

    public void CrearPalabra()
    {
        try{
            Class<?> clase = Class.forName("com.example.cristiancastro.tallerandroid.agregarpalabra");
            Intent i = new Intent(this, clase);
            startActivity(i);
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public void ModificarPalabra()
    {

        try{
            Class<?> clase = Class.forName("com.example.cristiancastro.tallerandroid.modificarpalabra");
            Intent i = new Intent(this, clase);
            startActivity(i);
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
