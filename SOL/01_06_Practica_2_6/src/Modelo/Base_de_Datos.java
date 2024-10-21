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
    
    public static boolean listarUsuario() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        boolean resultado = false;

        String query = "SELECT * FROM usuario";

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

    public static boolean verificarUsuario(String nombre_user, String passwd) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        boolean resultado = false;

        String query = "SELECT * FROM usuario WHERE nombre_user = ? AND passwd = ?";

        try {
            conn = conectarBd();
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, nombre_user);
            pstmt.setString(2, passwd);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                resultado = true; // Si encuentra una coincidencia, devuelve true
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
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.println("Error al cerrar recursos: " + e.getMessage());
            }
        }
        return resultado;
    }

    public static boolean registrarUsuario(String nombre_user, String passwd, String nombre, String apellidos, String correo, String fecha_nac) {

        Connection conn = null;
        PreparedStatement pstmt = null;
        boolean resultado = false;

        String query = "INSERT IGNORE INTO usuario (nombre_user, passwd, nombre, apellido, correo, fecha_nac) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            conn = conectarBd();
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, nombre_user);
            pstmt.setString(2, passwd);
            pstmt.setString(3, nombre);
            pstmt.setString(4, apellidos);
            pstmt.setString(5, correo);
            pstmt.setString(6, fecha_nac);

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
