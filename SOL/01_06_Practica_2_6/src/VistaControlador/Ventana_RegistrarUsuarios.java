package VistaControlador;

import Modelo.Base_de_Datos;
import static Modelo.Base_de_Datos.registrarUsuario;
import Modelo.Login;
import Modelo.Usuario;
import com.toedter.calendar.JDateChooser;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ventana_RegistrarUsuarios extends javax.swing.JFrame {

    private JDateChooser fechaNacimientoChooser;

    public static JDateChooser crearDateChooser() {
        // Crear el JDateChooser
        JDateChooser dateChooser = new JDateChooser();

        // Configurar el formato de fecha
        dateChooser.setDateFormatString("yyyy-MM-dd"); // Formato de fecha que se usará

        return dateChooser;
    }

    public Ventana_RegistrarUsuarios() {
        initComponents();

        fechaNacimientoChooser = crearDateChooser();

        // Agregar el DateChooser al panel en el lugar adecuado
        jPanel1.add(fechaNacimientoChooser);
        fechaNacimientoChooser.setBounds(195, 225, 150, 25);
    }

    public void cerrarVentanaAbrirLogin() {
        Ventana_Login ventanaLogin = new Ventana_Login();  // Crear la nueva ventana
        ventanaLogin.setVisible(true);
        this.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelUsuario = new javax.swing.JLabel();
        labelContra = new javax.swing.JLabel();
        laberConfirmarContra = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelInfoAdicional = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelApellido = new javax.swing.JLabel();
        labelCorreo = new javax.swing.JLabel();
        labelFecha = new javax.swing.JLabel();
        texto_Usuario = new javax.swing.JTextField();
        texto_Nombre = new javax.swing.JTextField();
        texto_Apellido = new javax.swing.JTextField();
        texto_Correo = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        botonVolver = new javax.swing.JButton();
        texto_Contra = new javax.swing.JPasswordField();
        texto_ConfirmarContra = new javax.swing.JPasswordField();
        checkBoxVerContra = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agregar Nuevo Usuario");
        setResizable(false);

        labelUsuario.setText("Usuario");

        labelContra.setText("Contraseña");

        laberConfirmarContra.setText("Confirmar Contraseña");

        labelInfoAdicional.setText("Informacion Opcional del Usuario");
        labelInfoAdicional.setEnabled(false);

        labelNombre.setText("Nombre");

        labelApellido.setText("Apellido");

        labelCorreo.setText("Correo Electronico");

        labelFecha.setText("Fecha de Nacimiento");

        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        checkBoxVerContra.setText("Mostrar");
        checkBoxVerContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxVerContraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(laberConfirmarContra)
                            .addComponent(labelContra, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelUsuario, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(texto_Usuario)
                            .addComponent(texto_Contra)
                            .addComponent(texto_ConfirmarContra, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkBoxVerContra))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(labelInfoAdicional))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelFecha)
                            .addComponent(labelApellido)
                            .addComponent(labelNombre)
                            .addComponent(labelCorreo)
                            .addComponent(botonVolver))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(texto_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(texto_Apellido)
                            .addComponent(texto_Correo))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonAgregar)
                .addGap(100, 100, 100))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsuario)
                    .addComponent(texto_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelContra)
                    .addComponent(texto_Contra, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(laberConfirmarContra)
                    .addComponent(texto_ConfirmarContra, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkBoxVerContra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelInfoAdicional)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(texto_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texto_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregar)
                    .addComponent(botonVolver))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed

        String passwd = String.valueOf(texto_Contra.getPassword());
        String confirmarPasswd = String.valueOf(texto_ConfirmarContra.getPassword());
        boolean resultado = true;
        Usuario aux = null;

        // Obtener la fecha seleccionada y formatearla
        Date fechaNacimiento = fechaNacimientoChooser.getDate();
        
        String contraString = String.valueOf(texto_Contra.getPassword());
        String confirmarContraString = String.valueOf(texto_ConfirmarContra.getPassword());
        
        if (texto_Usuario.getText().isEmpty() || contraString.isEmpty() || confirmarContraString.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, los valores usuario y contraseña no pueden estar vacios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (fechaNacimiento == null) {
            JOptionPane.showMessageDialog(this, "Por favor selecciona una fecha de nacimiento.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (texto_Apellido.getText().isEmpty() || texto_Nombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor introduzca valores en los campos nombre/apellidos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Convertir java.util.Date a java.sql.Date
        java.sql.Date sqlFechaNacimiento = new java.sql.Date(fechaNacimiento.getTime());

        // Crear el objeto Usuario usando la fecha formateada
        aux = new Usuario(texto_Usuario.getText(), passwd, texto_Nombre.getText(), texto_Apellido.getText(), texto_Correo.getText(), sqlFechaNacimiento);

        if (!passwd.equalsIgnoreCase(confirmarPasswd)) {
            resultado = false;
            javax.swing.JOptionPane.showMessageDialog(this, "Error, no coinciden las contraseñas.", "Error.", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Verificar si el usuario ya existe
        if (Base_de_Datos.verificarUsuarioBd(texto_Usuario.getText())) {
            resultado = false;
            javax.swing.JOptionPane.showMessageDialog(this, "Error, un usuario con ese nombre de usuario ya está registrado.", "Error.", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if(!aux.getCorreo().matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")){
            resultado = false;
            javax.swing.JOptionPane.showMessageDialog(this, "Error, el formato de correo es incorreto.", "Error.", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Registro del usuario
        if (resultado) {
            // Si pasamos todas las verificaciones, registrar el nuevo usuario
            Login.arr_Users.add(aux);
            resultado = Base_de_Datos.registrarUsuario(texto_Usuario.getText(), passwd, texto_Nombre.getText(), texto_Apellido.getText(), texto_Correo.getText(), sqlFechaNacimiento); // Usa el objeto sql.Date directamente
            if (resultado) {
                cerrarVentanaAbrirLogin();
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Error al registrar el usuario.", "Error.", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_botonAgregarActionPerformed


    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        cerrarVentanaAbrirLogin();
    }//GEN-LAST:event_botonVolverActionPerformed

    private void checkBoxVerContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxVerContraActionPerformed
        if (checkBoxVerContra.isSelected()) {
            texto_Contra.setEchoChar((char) 0);
            texto_ConfirmarContra.setEchoChar((char) 0);
        } else {
            texto_Contra.setEchoChar('•');
            texto_ConfirmarContra.setEchoChar('•');
        }
    }//GEN-LAST:event_checkBoxVerContraActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana_RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace(); // Manejo de excepciones
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_RegistrarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JCheckBox checkBoxVerContra;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelContra;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelInfoAdicional;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelUsuario;
    private javax.swing.JLabel laberConfirmarContra;
    private javax.swing.JTextField texto_Apellido;
    private javax.swing.JPasswordField texto_ConfirmarContra;
    private javax.swing.JPasswordField texto_Contra;
    private javax.swing.JTextField texto_Correo;
    private javax.swing.JTextField texto_Nombre;
    private javax.swing.JTextField texto_Usuario;
    // End of variables declaration//GEN-END:variables
}
