package Persistencia;

import android.content.Context;

import java.util.ArrayList;

import Dominio.UsuarioPrivado;

/**
 * Created by cristian castro on 04/08/2016.
 */
public class PerUsuarioPrivado extends SqlLite{
    public PerUsuarioPrivado(Context contexto) {
        super(contexto);
    }
    public UsuarioPrivado SeleccionarEspecifica(UsuarioPrivado up)
    {
        UsuarioPrivado retorno;
        this.seleccionar("SELECT * FROM UsuarioPublico "+ "where UsuarioU = '"+ up.getUsuarioU() + "' and ContraseñaU = '"+ up.getContraseña()+"'");
        if(this.c.isAfterLast() == false)
        {
            retorno = new UsuarioPrivado();
            retorno.setApellidoU(c.getString(4));
            retorno.setNombreU(c.getString(3));
            retorno.setContraseñaU(c.getString(2));
            retorno.setUsuarioU(c.getString(1));
            retorno.setIdUPRIV(c.getInt(0));
        }
        else
        {
            retorno = null;
        }
        this.c.close();
        return retorno;
    }
}
