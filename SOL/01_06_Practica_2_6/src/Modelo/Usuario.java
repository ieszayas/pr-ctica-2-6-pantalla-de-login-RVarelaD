package Modelo;

import java.util.Date;

public class Usuario {

    private String nombre_user = "nombreUserDefault";
    private String passwd = "12345678";
    private String nombre = "nombreDefault";
    private String apellidos = "apellidoDefault";
    private String correo = "nombreDefault@gmail.com";
    private Date fecha_nac = null;

    public Usuario() {
    }

    public Usuario(String nombre_user_e, String passwd_e, String nombre_e, String apellidos_e, String correo_e, Date fecha_nac_e) {
        this.nombre_user = nombre_user_e;
        this.passwd = passwd_e;
        this.nombre = nombre_e;
        this.apellidos = apellidos_e;
        this.correo = correo_e;
        this.fecha_nac = fecha_nac_e;
    }

    public boolean validarCamposOpcionales(String nombre, String apellido, String email, String fechaNacimiento) {
        if (nombre == null || nombre.trim().isEmpty()) {
            return false;
        }
        if (apellido == null || apellido.trim().isEmpty()) {
            return false;
        }
        if (email == null || email.trim().isEmpty() || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) { // Valida que el correo contenga '@'
            return false;
        }
        if (fechaNacimiento == null || fechaNacimiento.trim().isEmpty()) {
            return false;
        }

        // Si todos los campos opcionales son válidos, retorna true
        return true;
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

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
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
