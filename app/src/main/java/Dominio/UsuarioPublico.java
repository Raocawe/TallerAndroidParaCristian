package Dominio;
import android.content.Context;

import java.util.ArrayList;

import Persistencia.PerUsuarioPublico;

public class UsuarioPublico  extends Persona{
    private int IdUP ;
    private int EdadUP ;
    private String EmailUP ;
    private String NacionalidadUP ;
    public  Context context;

    public UsuarioPublico(int pIdUP,int pEdadUP,String pEmailUP,String pNacionalidadUP,String pUsuarioU, String pContraseñaU, String pNombreU, String pApellidoU) {
        super(pUsuarioU, pContraseñaU, pNombreU, pApellidoU);
        this.IdUP = pIdUP;
        this.EdadUP = pEdadUP;
        this.EmailUP = pEmailUP;
        this.setNacionalidadUP(pNacionalidadUP);
    }

    public UsuarioPublico(){}

    public int getIdUP() {
        return IdUP;
    }

    public void setIdUP(int idUP) {
        IdUP = idUP;
    }

    public int getEdadUP() {
        return EdadUP;
    }

    public void setEdadUP(int edadUP) {
        EdadUP = edadUP;
    }

    public String getEmailUP() {
        return EmailUP;
    }

    public void setEmailUP(String emailUP) {
        EmailUP = emailUP;
    }

    public String getNacionalidadUP() {
        return NacionalidadUP;
    }

    public void setNacionalidadUP(String nacionalidadUP) {
        NacionalidadUP = nacionalidadUP;
    }

    public boolean guardar (UsuarioPublico pUp,Context pContext)
    {
        PerUsuarioPublico per = new PerUsuarioPublico(pContext);
        return per.guardar(pUp);
    }

    public boolean existeUsuarioU (UsuarioPublico pUp,Context pContext)
    {
        PerUsuarioPublico per = new PerUsuarioPublico(pContext);
        return  per.existeUsuarioU(pUp.getUsuarioU());
    }

    public UsuarioPublico SeleccionarEspecifica(UsuarioPublico up,Context pContext)
    {
        PerUsuarioPublico per = new PerUsuarioPublico(pContext);
        return per.SeleccionarEspecifica(up);
    }

    public ArrayList<UsuarioPublico> UsuarioPublicos(Context pContext)
    {
        PerUsuarioPublico per = new PerUsuarioPublico(pContext);
        return per.UsuarioPublicos();
    }

    public UsuarioPublico SeleccionarEspecificaPorId(UsuarioPublico up,Context pContext)
    {
        PerUsuarioPublico per = new PerUsuarioPublico(pContext);
        return  per.SeleccionarEspecificaPorId(up);
    }
}
