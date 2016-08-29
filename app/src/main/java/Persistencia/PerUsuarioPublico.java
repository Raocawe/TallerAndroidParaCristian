package Persistencia;

import android.content.Context;

import java.util.ArrayList;

import Dominio.UsuarioPublico;

/**
 * Created by cristian castro on 04/08/2016.
 */
public class PerUsuarioPublico extends SqlLite{
    public PerUsuarioPublico(Context contexto) {
        super(contexto);
    }
    public boolean guardar(UsuarioPublico up)
    {
        boolean retorno = false;
        if(up != null) {
            this.ejecutarSentencia("INSERT INTO UsuarioPublico (EmailUP,NacionalidadUP,ApellidoU,ContraseñaU, NombreU, UsuarioU, EdadUP) " + "VALUES " +
                    "('" + up.getEmailUP() + "', '" + up.getNacionalidadUP() + "', '" + up.getApellidoU() + "', '" + up.getContraseña()
                    + "', '" + up.getNombreU() + "', '" + up.getUsuarioU() + "', '" + up.getEdadUP() + "')");
            retorno = true;
        }
        return retorno;
    }
    public boolean existeUsuarioU(String x)
    {
        boolean existe = false;
        //Lo retornado se asigna al cursor que se encuantra en SQLite
        this.seleccionar("SELECT * FROM UsuarioPublico "+ "where UsuarioU = '"+ x + "'");
        while(this.c.isAfterLast() == false)
        {
            existe = true;
            this.c.moveToNext();
        }
        this.c.close();
        return existe;
    }
    public UsuarioPublico SeleccionarEspecifica(UsuarioPublico up)
    {
        UsuarioPublico retorno;
        this.seleccionar("SELECT * FROM UsuarioPublico "+ "where UsuarioU = '"+ up.getUsuarioU() + "' and ContraseñaU = '"+ up.getContraseña()+"'");
        if(this.c.isAfterLast() == false)
        {
            retorno = new UsuarioPublico();
            retorno.setApellidoU(c.getString(2));
            retorno.setNombreU(c.getString(4));
            retorno.setContraseñaU(c.getString(3));
            retorno.setUsuarioU(c.getString(5));
            retorno.setIdUP(c.getInt(7));
            retorno.setEdadUP(c.getInt(6));
            retorno.setEmailUP(c.getString(0));
            retorno.setNacionalidadUP(c.getString(1));
        }
        else
        {
            retorno = null;
        }
        this.c.close();
        return retorno;
    }
    public UsuarioPublico SeleccionarEspecificaPorId(UsuarioPublico up)
    {
        UsuarioPublico retorno;
        this.seleccionar("SELECT * FROM UsuarioPublico "+ "where IdUP = '"+ up.getIdUP() + "'");
        if(this.c.isAfterLast() == false)
        {
            retorno = new UsuarioPublico();
            retorno.setApellidoU(c.getString(2));
            retorno.setNombreU(c.getString(4));
            retorno.setContraseñaU(c.getString(3));
            retorno.setUsuarioU(c.getString(5));
            retorno.setIdUP(c.getInt(7));
            retorno.setEdadUP(c.getInt(6));
            retorno.setEmailUP(c.getString(0));
            retorno.setNacionalidadUP(c.getString(1));
        }
        else
        {
            retorno = null;
        }
        this.c.close();
        return retorno;
    }
    public ArrayList<UsuarioPublico> UsuarioPublicos()
    {
        ArrayList<UsuarioPublico> UsuarioPublicos = new ArrayList<UsuarioPublico>();
        UsuarioPublico UsuarioPublico;
        //Loretornado se asigna al cursor que se encuentra en SQLite
        this.seleccionar("SELECT * FROM UsuarioPublico ");
        //Recorremos el cursor y agregamos cada elemento a un ArrayList
        while(c.isAfterLast() == false)
        {
            UsuarioPublico = new UsuarioPublico();
            UsuarioPublico.setApellidoU(c.getString(0));
            UsuarioPublico.setNombreU(c.getString(1));
            UsuarioPublico.setContraseñaU(c.getString(2));
            UsuarioPublico.setUsuarioU(c.getString(3));
            UsuarioPublico.setIdUP(c.getInt(4));
            UsuarioPublico.setEdadUP(c.getInt(5));
            UsuarioPublico.setEmailUP(c.getString(6));
            UsuarioPublico.setNacionalidadUP(c.getString(7));
            UsuarioPublicos.add(UsuarioPublico);
            this.c.moveToNext();
        }
        this.c.close();
        return UsuarioPublicos;
    }
}
