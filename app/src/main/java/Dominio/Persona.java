package Dominio;

/**
 * Created by cristian castro on 04/08/2016.
 */
public class Persona {
    private String UsuarioU;
    private String ContraseñaU;
    private String NombreU;
    private String ApellidoU;

    public Persona(String pUsuarioU, String pContraseñaU, String pNombreU, String pApellidoU) {
        this.ApellidoU = pApellidoU;
        this.ContraseñaU = pContraseñaU;
        this.NombreU = pNombreU;
        this.ApellidoU = pApellidoU;
    }

    public Persona(){}

    public String getUsuarioU() {
        return UsuarioU;
    }

    public void setUsuarioU(String usuarioU) {
        UsuarioU = usuarioU;
    }

    public String getContraseña() {
        return ContraseñaU;
    }

    public void setContraseñaU(String contraseñaU) {
        ContraseñaU = contraseñaU;
    }

    public String getNombreU() {
        return NombreU;
    }

    public void setNombreU(String nombreU) {
        NombreU = nombreU;
    }

    public String getApellidoU() {
        return ApellidoU;
    }

    public void setApellidoU(String apellidoU) {
        ApellidoU = apellidoU;
    }


}
