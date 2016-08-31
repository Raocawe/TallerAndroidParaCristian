package Dominio;

import android.content.Context;

import java.text.ParseException;
import java.util.ArrayList;

import Persistencia.PerPalabra;

/**
 * Created by cristian castro on 04/08/2016.
 */
public class Ahorcado {

    public Ahorcado(){}

    // USUARIO PUBLICO
    public boolean existeUsuarioUsuarioPublico (UsuarioPublico pUp, Context pContext)
    {
        UsuarioPublico up = new UsuarioPublico();
        return up.existeUsuarioU(pUp,pContext);
    }
    public boolean guardarUsuarioPublico (UsuarioPublico pUp, Context pContext)
    {
        UsuarioPublico up = new UsuarioPublico();
        return  up.guardar(pUp,pContext);
    }
    public UsuarioPublico SeleccionarEspecificaUsuarioPublico(UsuarioPublico pup, Context pContext)
    {
        UsuarioPublico up = new UsuarioPublico();
        return up.SeleccionarEspecifica(pup,pContext);
    }
    public ArrayList<UsuarioPublico> UsuarioPublicos(Context pContext)
    {
        UsuarioPublico up = new UsuarioPublico();
        return up.UsuarioPublicos(pContext);
    }
    public UsuarioPublico SeleccionarEspecificaUsuarioPublicoPorId(UsuarioPublico pup, Context pContext)
    {
        UsuarioPublico up = new UsuarioPublico();
        return up.SeleccionarEspecificaPorId(pup,pContext);
    }

    //USUARIO PRIVADO
    public UsuarioPrivado SeleccionarEspecificaUsuarioPrivado(UsuarioPrivado pUp, Context pContext)
    {
        UsuarioPrivado up = new UsuarioPrivado();
        return up.SeleccionarEspecifica(pUp,pContext);
    }

    //PARTIDA
    public boolean guardarPartida(Partida p, Context pContext)
    {
        Partida par = new Partida();
        return par.guardar(p,pContext);
    }
    public Partida SeleccionarEspecificasPartida(String x, Context pContext) throws ParseException
    {
        Partida par = new Partida();
        return par.SeleccionarEspecificas(x,pContext);
    }
    public ArrayList<Partida> Partidas(Context pContext) throws ParseException
    {
        Partida par = new Partida();
        return par.Partidas(pContext);
    }
    public ArrayList<Partida> TopCincoMejoresPartidas(Context pContext) throws ParseException
    {
        Partida par = new Partida();
        return par.TopCincoMejores(pContext);
    }

    //PALABRA
    public boolean guardarPalabra(Palabra p, Context pContext)
    {
        Palabra pp = new Palabra();
        return pp.guardar(p,pContext);
    }

    public ArrayList<Palabra> SeleccionarPorNivelPalabra(String x, Context pContext)
    {
        Palabra pp = new Palabra();
        return pp.SeleccionarPorNivel(x,pContext);
    }

    public boolean ModificarPalabra(Palabra p, Context pContext)
    {
        Palabra pp = new Palabra();
        return pp.ModificarPalabra(p,pContext);
    }

    public boolean ExistePalabra(Palabra p, Context pContext)
    {
        Palabra pp = new Palabra();
        return pp.existePalabra(p,pContext);
    }
}
