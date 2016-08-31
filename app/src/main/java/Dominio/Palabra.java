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
    private int CantidadLetras;
    private String ReferenciaP;
    public Context context;

    public Palabra(int pIdP,String pNombreP,String pDescripcionP,int pCantidadLetras,String pReferenciaP)
    {
        this.IdP = pIdP;
        this.NombreP = pNombreP;
        this.DescripcionP = pDescripcionP;
        this.CantidadLetras = pCantidadLetras;
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

    public int getCantidadLetras() {
        return CantidadLetras;
    }

    public void setCantidadLetras(int CantidadLetras) {
        CantidadLetras = CantidadLetras;
    }

    public boolean guardar(Palabra p,Context pContext)
    {
        PerPalabra pp = new PerPalabra(pContext);
        return pp.guardar(p);
    }
    public ArrayList<Palabra> SeleccionarPorNivel(int pint,Context pContext)
    {
        PerPalabra pp = new PerPalabra(pContext);
        return pp.SeleccionarPorNivel(pint);
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
}
