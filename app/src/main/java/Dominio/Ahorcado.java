package Dominio;

import java.text.ParseException;
import java.util.ArrayList;

import Persistencia.PerPalabra;

/**
 * Created by cristian castro on 04/08/2016.
 */
public class Ahorcado {

    public Ahorcado(){}

    // USUARIO PUBLICO
    public boolean existeUsuarioUsuarioPublico (UsuarioPublico pUp)
    {
        UsuarioPublico up = new UsuarioPublico();
        return up.existeUsuarioU(pUp);
    }
    public boolean guardarUsuarioPublico (UsuarioPublico pUp)
    {
        UsuarioPublico up = new UsuarioPublico();
        return  up.guardar(pUp);
    }
    public UsuarioPublico SeleccionarEspecificaUsuarioPublico(UsuarioPublico pup)
    {
        UsuarioPublico up = new UsuarioPublico();
        return up.SeleccionarEspecifica(pup);
    }
    public ArrayList<UsuarioPublico> UsuarioPublicos()
    {
        UsuarioPublico up = new UsuarioPublico();
        return up.UsuarioPublicos();
    }
    public UsuarioPublico SeleccionarEspecificaUsuarioPublicoPorId(UsuarioPublico pup)
    {
        UsuarioPublico up = new UsuarioPublico();
        return up.SeleccionarEspecificaPorId(pup);
    }

    //USUARIO PRIVADO
    public UsuarioPrivado SeleccionarEspecificaUsuarioPrivado(UsuarioPrivado pUp)
    {
        UsuarioPrivado up = new UsuarioPrivado();
        return up.SeleccionarEspecifica(pUp);
    }

    //PARTIDA
    public boolean guardarPartida(Partida p)
    {
        Partida par = new Partida();
        return par.guardar(p);
    }
    public Partida SeleccionarEspecificasPartida(String x) throws ParseException
    {
        Partida par = new Partida();
        return par.SeleccionarEspecificas(x);
    }
    public ArrayList<Partida> Partidas() throws ParseException
    {
        Partida par = new Partida();
        return par.Partidas();
    }

    //PALABRA
    public boolean guardarPalabra(Palabra p)
    {
        Palabra pp = new Palabra();
        return pp.guardar(p);
    }

    public ArrayList<Palabra> SeleccionarPorNivelPalabra(String x)
    {
        Palabra pp = new Palabra();
        return pp.SeleccionarPorNivel(x);
    }

    public boolean ModificarPalabra(Palabra p)
    {
        Palabra pp = new Palabra();
        return pp.ModificarPalabra(p);
    }
}
