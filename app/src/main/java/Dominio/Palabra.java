package Dominio;

import android.content.Context;

import java.util.ArrayList;
import Persistencia.PerPalabra;
/**
 * Created by cristian castro on 04/08/2016.
 */
public class Palabra {
    private int IdP;
    private String NombreP;
    private String DescripcionP;
    private int Nivel;
    private String ReferenciaP;
    public Context context;

    public Palabra(int pIdP,String pNombreP,String pDescripcionP,int pNivel,String pReferenciaP)
    {
        this.IdP = pIdP;
        this.NombreP = pNombreP;
        this.DescripcionP = pDescripcionP;
        this.Nivel = pNivel;
        this.ReferenciaP = pReferenciaP;
    }

    public Palabra(){}

    public int getIdP() {
        return IdP;
    }

    public void setIdP(int idP) {
        IdP = idP;
    }

    public String getNombreP() {
        return NombreP;
    }

    public void setNombreP(String nombreP) {
        NombreP = nombreP;
    }

    public String getDescripcionP() {
        return DescripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        DescripcionP = descripcionP;
    }

    public String getReferenciaP() {
        return ReferenciaP;
    }

    public void setReferenciaP(String referenciaP) {
        ReferenciaP = referenciaP;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int nivel) {
        Nivel = nivel;
    }

    public boolean guardar(Palabra p,Context pContext)
    {
        PerPalabra pp = new PerPalabra(pContext);
        return pp.guardar(p);
    }
    public ArrayList<Palabra> SeleccionarPorNivel(String x,Context pContext)
    {
        PerPalabra pp = new PerPalabra(pContext);
        return pp.SeleccionarPorNivel(x);
    }
    public boolean ModificarPalabra(Palabra p,Context pContext)
    {
        PerPalabra pp = new PerPalabra(pContext);
        return pp.ModificarPalabra(p);
    }

    public boolean existePalabra(Palabra p,Context pContext)
    {
        PerPalabra pp = new PerPalabra(pContext);
        return pp.existePalabra(p);
    }

    public int DevolverLevel (Palabra pPalabra)
    {
        int retorno = -1;
        int aux = pPalabra.getNombreP().toString().length();

        switch (aux)
        {
            case aux = 4

        }
        return retorno;
    }
}
