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

    public void guardar(Palabra p)
    {
        this.ejecutarSentencia("INSERT INTO Palabra (NombreP,DescripcionP,Nivel,ReferenciaP) "+ "VALUES " +
                "('"+ p.getNombreP()+"', '"+ p.getDescripcionP() +"', "+ p.getNivel() +", '"+ p.getReferenciaP()+"')");
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
            palabra.setIdP(c.getInt(0));
            palabra.setNombreP(c.getString(1));
            palabra.setDescripcionP(c.getString(2));
            palabra.setNivel(c.getInt(3));
            palabra.setReferenciaP(c.getString(4));
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
}
