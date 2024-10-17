package VistaControlador;

import Modelo.Login;
import Modelo.Usuario;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Ventana_Login extends javax.swing.JFrame {

    // Método para hacer vibrar la ventana
    public void vibrarPantalla() {
        final int originalX = this.getLocationOnScreen().x;  // Obtener la posición original en X
        final int originalY = this.getLocationOnScreen().y;  // Obtener la posición original en Y

        // Creamos un hilo para que no bloquee el hilo principal de la UI
        new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    // Mover la ventana a posiciones levemente distintas
                    this.setLocation(originalX + (int) (Math.random() * 10 - 5),
                            originalY + (int) (Math.random() * 10 - 5));
                    Thread.sleep(20);  // Pausa breve entre cada movimiento
                }
                // Volver a la posición original al finalizar
                this.setLocation(originalX, originalY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    //Metodo para mostrar mensaje en rojo
    public void mostrarMensajeError() {
        
        
        textoIncorrecto.setForeground(Color.RED); 
        textoIncorrecto.setVisible(true); 
    }

    /**
     * Creates new form Ventana_Login
     */
    public Ventana_Login() {
        initComponents();
        textoIncorrecto.setVisible(false);
        Login.rellenarArr();
        textoPasswd.setEchoChar('•');
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Login = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textoUsuario = new javax.swing.JTextField();
        botonVerPasswd = new javax.swing.JCheckBox();
        botonLogear = new javax.swing.JButton();
        textoPasswd = new javax.swing.JPasswordField();
        textoIncorrecto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);

        jLabel1.setText("Por favor, introduzca sus credenciales para acceder.");

        jLabel2.setText("Usuario");

        jLabel3.setText("Password");

        textoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                textoUsuarioMouseReleased(evt);
            }
        });

        botonVerPasswd.setText("Mostrar");
        botonVerPasswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerPasswdActionPerformed(evt);
            }
        });

        botonLogear.setText("Loguear");
        botonLogear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLogearActionPerformed(evt);
            }
        });

        textoPasswd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                textoPasswdMouseReleased(evt);
            }
        });

        textoIncorrecto.setText("Usuario/Password incorrectos, introduzcalos de nuevo.");

        javax.swing.GroupLayout panel_LoginLayout = new javax.swing.GroupLayout(panel_Login);
        panel_Login.setLayout(panel_LoginLayout);
        panel_LoginLayout.setHorizontalGroup(
            panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_LoginLayout.createSequentialGroup()
                .addGroup(panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_LoginLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_LoginLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1))
                            .addGroup(panel_LoginLayout.createSequentialGroup()
                                .addGroup(panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                    .addComponent(textoPasswd))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonVerPasswd))))
                    .addGroup(panel_LoginLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(textoIncorrecto))
                    .addGroup(panel_LoginLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(botonLogear, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        panel_LoginLayout.setVerticalGroup(
            panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_LoginLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(botonVerPasswd)
                    .addComponent(textoPasswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(textoIncorrecto)
                .addGap(18, 18, 18)
                .addComponent(botonLogear)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonLogearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLogearActionPerformed

        if (Login.arr_Users.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "No hay usuarios registrados.", "Error.", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String contrasena = String.valueOf(textoPasswd.getPassword());

        if (Login.comprobarNombre(textoUsuario.getText()) && Login.comprobarPasswd(contrasena)) {
            //Llamada otra ventana
            Ventana_Principal ventanaPrincipal = new Ventana_Principal();  // Crear la nueva ventana

            //Creo el String de que Usuario_x esta logueado y lo seteo al label
            String saludo = ventanaPrincipal.getTextoUsuarioLogeado().getText();
            saludo = saludo + " " + textoUsuario.getText() + " esta logueado.";
            ventanaPrincipal.getTextoUsuarioLogeado().setText(saludo);

            // Mostrar la nueva ventana
            ventanaPrincipal.setVisible(true);
            // Cerrar la ventana actual (Login)
            this.dispose();
        } else {
            mostrarMensajeError();
            vibrarPantalla();
            return;
        }


    }//GEN-LAST:event_botonLogearActionPerformed

    private void botonVerPasswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerPasswdActionPerformed
        if (botonVerPasswd.isSelected()) {
            textoPasswd.setEchoChar((char) 0);
        } else {
            textoPasswd.setEchoChar('•');
        }

    }//GEN-LAST:event_botonVerPasswdActionPerformed

    private void textoUsuarioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoUsuarioMouseReleased
        textoUsuario.setText("");
    }//GEN-LAST:event_textoUsuarioMouseReleased

    private void textoPasswdMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textoPasswdMouseReleased
        textoPasswd.setText("");
    }//GEN-LAST:event_textoPasswdMouseReleased

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
            java.util.logging.Logger.getLogger(Ventana_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Ventana_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonLogear;
    private javax.swing.JCheckBox botonVerPasswd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panel_Login;
    private javax.swing.JLabel textoIncorrecto;
    private javax.swing.JPasswordField textoPasswd;
    private javax.swing.JTextField textoUsuario;
    // End of variables declaration//GEN-END:variables
}
