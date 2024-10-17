package Modelo;

public class Usuario {

    private String nombre = "nombreDefault";
    private String passwd = "12345678";

    public Usuario() {
    }
    
    public Usuario(String nombre_e, String contraseña_e) {
        this.nombre = nombre_e;
        this.passwd = contraseña_e;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    
}
