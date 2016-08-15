package Dominio;

/**
 * Created by cristian castro on 04/08/2016.
 */
public class Palabra {
    private int IdP;
    private String NombreP;
    private String DescripcionP;
    private int Nivel;
    private String ReferenciaP;

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

}
