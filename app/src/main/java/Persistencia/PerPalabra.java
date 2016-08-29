package Persistencia;

import android.content.Context;

import java.util.ArrayList;

import Dominio.Palabra;

/**
 * Created by cristian castro on 04/08/2016.
 */
public class PerPalabra extends SqlLite {

    public PerPalabra(Context contexto) {
        super(contexto);
    }

    public boolean guardar(Palabra p)
    {
        boolean retorno = false;
        if(p != null) {
            this.ejecutarSentencia("INSERT INTO Palabra (NombreP,DescripcionP,Nivel,ReferenciaP) " + "VALUES " +
                    "('" + p.getNombreP() + "', '" + p.getDescripcionP() + "', " + p.getNivel() + ", '" + p.getReferenciaP() + "')");
        retorno = true;
        }
        return retorno;
    }

    public ArrayList<Palabra> SeleccionarPorNivel(String x)
    {
        Palabra palabra;
        ArrayList<Palabra> Palabras = new ArrayList<Palabra>();
        //Lo retornado se asigna al cursor que se encuantra en SQLite
        this.seleccionar("SELECT * FROM Palabra where Nivel = "+ x);
        while(this.c.isAfterLast() == false)
        {
            palabra = new Palabra();
            palabra.setIdP(c.getInt(4));
            palabra.setNombreP(c.getString(0));
            palabra.setDescripcionP(c.getString(1));
            palabra.setNivel(c.getInt(2));
            palabra.setReferenciaP(c.getString(3));
            Palabras.add(palabra);
            this.c.moveToNext();
        }
        this.c.close();
        return Palabras;
    }

    public boolean ModificarPalabra(Palabra p)
    {
        boolean retorno = false;
        if (p != null)
        {
            this.ejecutarSentencia("UPDATE Palabra SET NombreP = '" + p.getNombreP() +
                    "', DescripcionP = '" + p.getDescripcionP() +
                    "', Nivel = " + p.getNivel() +
                    ", ReferenciaP = '" + p.getReferenciaP() + "' WHERE NombreP = '" + p.getNombreP() + "')");
            retorno = true;
        }
        return retorno;
    }

    public boolean existePalabra(Palabra p)
    {
        boolean existe = false;
        //Lo retornado se asigna al cursor que se encuantra en SQLite
        this.seleccionar("SELECT * FROM Palabra "+ "where NombreP = '"+ p.getNombreP() + "'");
        while(this.c.isAfterLast() == false)
        {
            existe = true;
            this.c.moveToNext();
        }
        this.c.close();
        return existe;
    }
}
