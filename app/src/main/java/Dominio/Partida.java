package Dominio;

import android.content.Context;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import Persistencia.PerPartida;
/**
 * Created by cristian castro on 04/08/2016.
 */
public class Partida {
    private int IdPartida;
    private int IdUP;
    private int PuntajePartida;
    private Date FechaPartidaN;
    public Context context;

    public Partida(int idPartida, int idUP, int puntajePartida, Date fechaPartidaN) {
        IdPartida = idPartida;
        IdUP = idUP;
        PuntajePartida = puntajePartida;
        FechaPartidaN = fechaPartidaN;
    }

    public Partida(){}

    public int getIdPartida() {
        return IdPartida;
    }

    public void setIdPartida(int idPartida) {
        IdPartida = idPartida;
    }

    public int getIdUP() {
        return IdUP;
    }

    public void setIdUP(int idUP) {
        IdUP = idUP;
    }

    public int getPuntajePartida() {
        return PuntajePartida;
    }

    public void setPuntajePartida(int puntajePartida) {
        PuntajePartida = puntajePartida;
    }

    public Date getFechaPartidaN() {
        return FechaPartidaN;
    }

    public void setFechaPartidaN(Date fechaPartidaN) {
        FechaPartidaN = fechaPartidaN;
    }

    public boolean guardar(Partida p)
    {
        PerPartida pp = new PerPartida(context);
        return pp.guardar(p);
    }

    public Partida SeleccionarEspecificas(String x) throws ParseException
    {
        PerPartida pp = new PerPartida(context);
        return pp.SeleccionarEspecificas(x);
    }

    public ArrayList<Partida> Partidas() throws ParseException
    {
        PerPartida pp = new PerPartida(context);
        return pp.Partidas();
    }
}
