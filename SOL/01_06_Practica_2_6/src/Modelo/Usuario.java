package Modelo;

public class Usuario {

    private String nombre_user = "nombreUserDefault";
    private String passwd = "12345678";
    private String nombre = "nombreDefault";
    private String apellidos = "apellidoDefault";
    private String correo = "nombreDefault@gmail.com";
    private String fecha_nac = "01/01/2001";

    public Usuario() {
    }
    
    public Usuario(String nombre_user_e, String passwd_e, String nombre_e, String apellidos_e, String correo_e, String fecha_nac_e) {
        this.nombre_user = nombre_user_e;
        this.passwd = passwd_e;
        this.nombre = nombre_e;
        this.apellidos = apellidos_e;
        this.correo = correo_e;
        this.fecha_nac = fecha_nac_e;
    }
    
    public Usuario(String nombre_user_e, String passwd_e) {
        this.nombre_user = nombre_user_e;
        this.passwd = passwd_e;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombre_user() {
        return nombre_user;
    }

    public void setNombre_user(String nombre_user) {
        this.nombre_user = nombre_user;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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
