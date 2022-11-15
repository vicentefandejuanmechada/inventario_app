/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.user_func;
import modelo.usuarios;
import org.mariadb.jdbc.Connection;

/**
 *
 * @author admin1
 */
public class edit_users extends javax.swing.JFrame {
    
    usuarios us = new usuarios();
    Connection conn;
    Conexion cn = new Conexion();
    user_func usfun = new user_func();
    PreparedStatement ps ;
       ResultSet rs;
    public edit_users() {
        initComponents();
        CargarTabla();
    }

    public void CargarTabla(){
        CleanTable();
            try {
                
               String url = "jdbc:mariadb://localhost:3306/inventario";
               String usuario = "root";
               String pass = "root";
               Connection cnew;
               Class.forName("org.mariadb.jdbc.Driver");
               cnew = (Connection) DriverManager.getConnection(url,usuario,pass);
                org.mariadb.jdbc.Statement st = cnew.createStatement();
                //String sql = "SELECT * FROM users ";
                String sql ="SELECT u.id_user, u.nombre_user , u.passw_user, tdu.tipo_de_user, u.e_mail_user   FROM inventario.users u inner join inventario.tipos_de_user tdu on tdu.id_del_tipo_de_user = u.id_del_tipo_de_user;";
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                   String iduser = String.valueOf(rs.getInt("u.id_user"));
                   String idtipouser = rs.getString("tipo_de_user");
                   String username = rs.getString("u.nombre_user");
                   String userpassw = rs.getString("u.passw_user");
                   String mailuser = rs.getString("u.e_mail_user");
                
                  String tabladb [] = {iduser,idtipouser,username,userpassw,mailuser};
                   DefaultTableModel tableModel =(DefaultTableModel)tableuser.getModel();
                    //agrega los datos
                    tableModel.addRow(tabladb);
                }
               
                //System.out.println("a");
            } catch (ClassNotFoundException | SQLException e) {
                System.err.println(e);
        }
        
        
    }
    
    
       public void CleanTable(){
    DefaultTableModel tableModel = (DefaultTableModel)tableuser.getModel();
    tableModel.setRowCount(0);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        txtedituser = new javax.swing.JLabel();
        btn_eliminar_user = new javax.swing.JButton();
        edit_btn_user = new javax.swing.JButton();
        username_editxt = new javax.swing.JTextField();
        id_txtuser = new javax.swing.JTextField();
        usermailtxt = new javax.swing.JTextField();
        userpass_editxt2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableuser = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        volverbtn = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        txtedituser.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtedituser.setForeground(new java.awt.Color(255, 255, 255));
        txtedituser.setText("Editar usuarios");
        txtedituser.setToolTipText("");
        txtedituser.setMaximumSize(new java.awt.Dimension(50, 30));
        txtedituser.setMinimumSize(new java.awt.Dimension(50, 30));

        btn_eliminar_user.setText("eliminar usuario");
        btn_eliminar_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliminar_userMouseClicked(evt);
            }
        });

        edit_btn_user.setText("Editar usuario");
        edit_btn_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_btn_userMouseClicked(evt);
            }
        });

        id_txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_txtuserActionPerformed(evt);
            }
        });

        tableuser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID de usuario", "Tipo de user", "Username", "Contraseña", "e-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableuserMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableuser);

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Contraseña");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre de usuarios");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Correo de contacto");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Eliminar por id");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtedituser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(usermailtxt)
                                    .addComponent(edit_btn_user, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_eliminar_user))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(username_editxt)
                                    .addComponent(userpass_editxt2, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id_txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)))))
                        .addGap(51, 51, 51))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(txtedituser, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username_editxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userpass_editxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(id_txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usermailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btn_eliminar_user))
                .addGap(27, 27, 27)
                .addComponent(edit_btn_user)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        jMenu3.setText("File");

        volverbtn.setText("volver");
        volverbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverbtnActionPerformed(evt);
            }
        });
        jMenu3.add(volverbtn);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

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

    private void id_txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_txtuserActionPerformed
        
    }//GEN-LAST:event_id_txtuserActionPerformed

    private void btn_eliminar_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminar_userMouseClicked
        if(!"".equals(id_txtuser.getText()) ){
            int iduser = Integer.parseInt(id_txtuser.getText());
            usfun.Eliminaruser(iduser);
            CargarTabla();
        }
    }//GEN-LAST:event_btn_eliminar_userMouseClicked

    private void tableuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableuserMouseClicked
       Connection conn = null;
        try {
            int row = tableuser.getSelectedRow();
            String tablaClick=(tableuser.getModel().getValueAt(row,0).toString());
             conn = (Connection) cn.getConn();
             String sql="SELECT * FROM users where id_user ='"+tablaClick+"'";
           ps = conn.prepareStatement(sql);
           rs = ps.executeQuery();
            if(rs.next()){
                String agrega1 =rs.getString("id_user");
                id_txtuser.setText(agrega1);
                String agrega2 =rs.getString("nombre_user");
                username_editxt.setText(agrega2);
                String agrega3 =rs.getString("passw_user");
                userpass_editxt2.setText(agrega3);
                String agrega4 =rs.getString("e_mail_user");
                usermailtxt.setText(agrega4);
                
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tableuserMouseClicked

    private void volverbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverbtnActionPerformed
           inicio_administrador gn = new inicio_administrador();
        gn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverbtnActionPerformed

    private void edit_btn_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_btn_userMouseClicked
        
        
        try {
            conn = (Connection) cn.getConn();
            String newusername = username_editxt.getText();
            String passwuser = userpass_editxt2.getText();
            String mailuser = usermailtxt.getText();
            String iduser = id_txtuser.getText();
            String sql ="UPDATE users SET nombre_user='"+newusername+"',passw_user='"+passwuser+"',e_mail_user='"+mailuser+"' WHERE id_user='"+iduser+"'";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.executeUpdate();
            System.out.println("        funciono la edicion");
            CargarTabla();
        } catch (SQLException e) {
            System.out.println("    no funciono la edicion");
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_edit_btn_userMouseClicked

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
            java.util.logging.Logger.getLogger(edit_users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(edit_users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(edit_users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(edit_users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new edit_users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar_user;
    private javax.swing.JButton edit_btn_user;
    private javax.swing.JTextField id_txtuser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tableuser;
    private javax.swing.JLabel txtedituser;
    private javax.swing.JTextField usermailtxt;
    private javax.swing.JTextField username_editxt;
    private javax.swing.JTextField userpass_editxt2;
    private javax.swing.JMenuItem volverbtn;
    // End of variables declaration//GEN-END:variables
}
