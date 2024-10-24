package Modelo;

import java.util.ArrayList;

public class Login {

    public static ArrayList<Usuario> arr_Users = new ArrayList();

    public ArrayList<Usuario> getArr_Users() {
        return arr_Users;
    }

    public void setArr_Users(ArrayList<Usuario> arr_Users) {
        this.arr_Users = arr_Users;
    }

    public static void rellenarArr() {
        arr_Users.add(new Usuario("Varela", "12345678"));
        arr_Users.add(new Usuario("Kevin", "12345678"));
        arr_Users.add(new Usuario("Adriana", "12345678"));
        arr_Users.add(new Usuario("Santi", "12345678"));
        arr_Users.add(new Usuario("Pachi", "12345678"));
    }

    public static boolean comprobarNombre(String nomnbre_Caja) {
        boolean correcto = false;

        for (Usuario it : Login.arr_Users) {
            if (it.getNombre().equalsIgnoreCase(nomnbre_Caja)) {
                correcto = true;
                break;
            } 
        }

        return correcto;
    }

    public static boolean comprobarPasswd(String passwd_Caja) {

        boolean correcto = false;

        for (Usuario it : Login.arr_Users) {
            if (it.getPasswd().equalsIgnoreCase(passwd_Caja)) {
                correcto = true;
                break;
            } 
        }

        return correcto;
    }
}
