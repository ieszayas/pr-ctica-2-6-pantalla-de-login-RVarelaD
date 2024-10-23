package Modelo;

import java.sql.*;

public class Base_de_Datos {

    private static final String url = "jdbc:mysql://localhost:3306/";
    private static final String usuario_BD = "root";
    private static final String contra_BD = null;
    private static final String nombre_BBDD = "usuarios_bd";

    public static Connection conectarBd() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url + nombre_BBDD, usuario_BD, contra_BD);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return con;
    }

    public static boolean actualizarContrasena(String username, String nuevaContrasena) {

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String query = "UPDATE usuarios SET passwd = ? WHERE nombre_user = ?";
        try {
            conn = conectarBd();
            pstmt = conn.prepareStatement(query);

            pstmt.setString(1, nuevaContrasena);
            pstmt.setString(2, username);
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean listarUsuario() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        boolean resultado = false;

        String query = "SELECT * FROM usuarios";

        try {
            conn = conectarBd();
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                resultado = true; // Si encuentra una coincidencia, devuelve true
            }

        } catch (SQLException e) {
            resultado = false;
            System.out.println("Error al verificar usuario: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar recursos: " + e.getMessage());
            }
        }
        return resultado;
    }

    public static boolean verificarLogin(String nombre_user, String passwd) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        boolean resultado = false;

        // Consulta que busca el nombre de usuario y la contraseña
        String query = "SELECT * FROM usuarios WHERE nombre_user = ? AND passwd = ?";

        try {
            con = conectarBd();
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, nombre_user); // Nombre de usuario
            pstmt.setString(2, passwd);       // Contraseña
            rs = pstmt.executeQuery();

            // Si hay un registro con el nombre de usuario y la contraseña, devuelve true
            if (rs.next()) {
                resultado = true; // Credenciales correctas
            }
        } catch (SQLException e) {
            System.out.println("Error al verificar login: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar recursos: " + e.getMessage());
            }
        }
        return resultado; // Devuelve si el login fue exitoso o no
    }

    public static boolean verificarUsuarioBd(String nombre_user) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        boolean resultado = false;

        // Consulta que solo busca el nombre de usuario
        String query = "SELECT * FROM usuarios WHERE nombre_user = ?";

        try {
            con = conectarBd();
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, nombre_user); // Solo pasamos el nombre de usuario
            rs = pstmt.executeQuery();

            // Si hay un registro con el nombre de usuario, devuelve true
            if (rs.next()) {
                resultado = true; //
            }
        } catch (SQLException e) {
            System.out.println("Error al verificar usuario: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar recursos: " + e.getMessage());
            }
        }
        return resultado; // Devuelve si el usuario ya existe o no
    }

    public static boolean registrarUsuario(String nombre_user, String passwd, String nombre, String apellidos, String correo, Date fecha_nac) {

        Connection conn = null;
        PreparedStatement pstmt = null;
        boolean resultado = false;

        String query = "INSERT IGNORE INTO usuarios (nombre_user, passwd, nombre, apellido, correo, fecha_nac) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            conn = conectarBd();
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, nombre_user);
            pstmt.setString(2, passwd);
            pstmt.setString(3, nombre);
            pstmt.setString(4, apellidos);
            pstmt.setString(5, correo);
            pstmt.setDate(6, fecha_nac);

            pstmt.executeUpdate();
            resultado = true; // Registro exitoso
        } catch (SQLException e) {
            System.out.println("Error al registrar usuario: " + e.getMessage());
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar recursos: " + e.getMessage());
            }
        }
        return resultado;
    }
}
