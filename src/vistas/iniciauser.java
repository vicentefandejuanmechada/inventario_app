/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modelo.Conexion;
import modelo.user_func;
import modelo.usuarios;
import org.mariadb.jdbc.Connection;

/**
 *
 * @author admin1
 */
public class iniciauser extends javax.swing.JFrame {
 usuarios us = new usuarios();
    Connection conn;
    Conexion cn = new Conexion();
    user_func usfun = new user_func();
    PreparedStatement ps ;
       ResultSet rs;
    /**
     * Creates new form iniciauser
     */
    public iniciauser() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo_login = new javax.swing.JPanel();
        user_name_login = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        contra_tx = new javax.swing.JPasswordField();
        iniciar_sesion = new javax.swing.JButton();
        logintitle = new javax.swing.JLabel();
        atajo_btn = new javax.swing.JButton();
        iniciauser_btn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        iniciarbtn = new javax.swing.JButton();
        cambiartipo = new javax.swing.JButton();
        atajobtn = new javax.swing.JButton();
        txtusern = new javax.swing.JTextField();
        txtpassw = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        logintitle1 = new javax.swing.JLabel();

        fondo_login.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("usuario :");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("contraseña :");

        iniciar_sesion.setText("entrar");
        iniciar_sesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iniciar_sesionMouseClicked(evt);
            }
        });

        logintitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        logintitle.setForeground(new java.awt.Color(255, 255, 255));
        logintitle.setText("Iniciar Sesión");
        logintitle.setToolTipText("");
        logintitle.setMaximumSize(new java.awt.Dimension(50, 30));
        logintitle.setMinimumSize(new java.awt.Dimension(50, 30));

        atajo_btn.setText("atajo");
        atajo_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atajo_btnMouseClicked(evt);
            }
        });

        iniciauser_btn.setText("Iniciar sesion como usuario");

        javax.swing.GroupLayout fondo_loginLayout = new javax.swing.GroupLayout(fondo_login);
        fondo_login.setLayout(fondo_loginLayout);
        fondo_loginLayout.setHorizontalGroup(
            fondo_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo_loginLayout.createSequentialGroup()
                .addGroup(fondo_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondo_loginLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12))
                    .addGroup(fondo_loginLayout.createSequentialGroup()
                        .addGroup(fondo_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondo_loginLayout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fondo_loginLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(atajo_btn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(fondo_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondo_loginLayout.createSequentialGroup()
                        .addGroup(fondo_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logintitle, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(fondo_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(iniciauser_btn)
                                .addGroup(fondo_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(contra_tx)
                                    .addComponent(user_name_login, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(182, Short.MAX_VALUE))
                    .addGroup(fondo_loginLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(iniciar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        fondo_loginLayout.setVerticalGroup(
            fondo_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo_loginLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(logintitle, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(fondo_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_name_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(35, 35, 35)
                .addGroup(fondo_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(contra_tx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addGroup(fondo_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iniciar_sesion)
                    .addComponent(atajo_btn)
                    .addComponent(iniciauser_btn))
                .addGap(31, 31, 31))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        iniciarbtn.setText("iniciar sesion");
        iniciarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarbtnActionPerformed(evt);
            }
        });

        cambiartipo.setText("inicia como admin");

        atajobtn.setText("inicia");
        atajobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atajobtnActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("usuario");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("contraseña");

        logintitle1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        logintitle1.setForeground(new java.awt.Color(255, 255, 255));
        logintitle1.setText("Iniciar Sesión usuario");
        logintitle1.setToolTipText("");
        logintitle1.setMaximumSize(new java.awt.Dimension(50, 30));
        logintitle1.setMinimumSize(new java.awt.Dimension(50, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(atajobtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(cambiartipo)
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpassw)
                            .addComponent(txtusern))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iniciarbtn)
                .addGap(83, 83, 83))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(logintitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(logintitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtusern, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpassw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iniciarbtn)
                    .addComponent(cambiartipo)
                    .addComponent(atajobtn))
                .addGap(65, 65, 65))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciar_sesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciar_sesionMouseClicked
       
    }//GEN-LAST:event_iniciar_sesionMouseClicked

    private void atajo_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atajo_btnMouseClicked
        Inicio_app iniap = new Inicio_app();
        iniap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_atajo_btnMouseClicked

    private void iniciarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarbtnActionPerformed
         String user = txtusern.getText();
        String contra = txtpassw.getText();
         if (!"".equals(user) || !"".equals(contra)){
          us = usfun.logu(user, contra);
          if(us.getNombre_user()!= null && us.getPassw_user() !=null){
              Inicio_user iniad = new Inicio_user();
              iniad.setVisible(true);
              this.dispose();
              
          }else{
              JOptionPane.showMessageDialog(null,"credenciales incorrecta");
          }
          
        }
    }//GEN-LAST:event_iniciarbtnActionPerformed

    private void atajobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atajobtnActionPerformed
            Inicio_app iniap = new Inicio_app();
        iniap.setVisible(true);
        this.dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_atajobtnActionPerformed

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
            java.util.logging.Logger.getLogger(iniciauser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(iniciauser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(iniciauser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(iniciauser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new iniciauser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atajo_btn;
    private javax.swing.JButton atajobtn;
    private javax.swing.JButton cambiartipo;
    private javax.swing.JPasswordField contra_tx;
    private javax.swing.JPanel fondo_login;
    private javax.swing.JButton iniciar_sesion;
    private javax.swing.JButton iniciarbtn;
    private javax.swing.JButton iniciauser_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logintitle;
    private javax.swing.JLabel logintitle1;
    private javax.swing.JPasswordField txtpassw;
    private javax.swing.JTextField txtusern;
    private javax.swing.JTextField user_name_login;
    // End of variables declaration//GEN-END:variables
}
