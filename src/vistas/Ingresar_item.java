/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;


//import java.sql.Connection;
import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.Producto;
import modelo.productosfunc;
import org.mariadb.jdbc.Connection;
import org.mariadb.jdbc.Driver;
import java.sql.*;

/**
 *
 * @author admin1
 */
public class Ingresar_item extends javax.swing.JFrame {
   //llama los constructores
    Producto pro = new Producto();
   //llama a la productosfunc para llamar sus sentencias como el insert
   productosfunc proFunc = new productosfunc();
   //llama funcion conectar 
    Conexion conn = new Conexion();
    
    PreparedStatement ps ;
           
 
   
   
    public Ingresar_item() {
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
                String sql = "SELECT * FROM productos";
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                   String id = String.valueOf(rs.getInt("id"));
                   String orde_nu = String.valueOf(rs.getInt("orden_producto"));
                   String Nombreprod = rs.getString("nombre_producto");
                   String precioprod = String.valueOf(rs.getInt("precio_prod"));
                   String cantidadprod = String.valueOf(rs.getInt("cantidad_producto"));
                   String fechavencimiento = rs.getString("fecha_vencimiento");
                   String tabladb [] = {id,orde_nu,Nombreprod,precioprod,cantidadprod,fechavencimiento};
                   DefaultTableModel tableModel =(DefaultTableModel)tabladatosprod.getModel();
                    //agrega los datos
           tableModel.addRow(tabladb);
                }
               
                //System.out.println("a");
            } catch (ClassNotFoundException | SQLException e) {
                System.err.println(e);
        }
        
        
    }
    
    public void CleanTable(){
    DefaultTableModel tableModel = (DefaultTableModel)tabladatosprod.getModel();
    tableModel.setRowCount(0);
        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        ingresar_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nu_serie = new javax.swing.JTextField();
        nombre_prod = new javax.swing.JTextField();
        precio_prod = new javax.swing.JTextField();
        cantidad_prod = new javax.swing.JTextField();
        fecha_vencimiento = new javax.swing.JTextField();
        actualizar_btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabladatosprod = new javax.swing.JTable();
        descripciontxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Volver_a_inicio = new javax.swing.JRadioButtonMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jLabel6.setText("jLabel6");

        jPasswordField1.setText("jPasswordField1");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        ingresar_btn.setText("INGRESAR PRODUCTO");
        ingresar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresar_btnActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre producto:");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Precio producto:");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Cantidad de producto:");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Fecha de vencimiento:");

        nu_serie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nu_serieActionPerformed(evt);
            }
        });

        actualizar_btn.setText("ACTUALIZAR LISTA");
        actualizar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizar_btnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("INGRESO DE PRODUCTOS");
        jLabel7.setToolTipText("");
        jLabel7.setMaximumSize(new java.awt.Dimension(50, 30));
        jLabel7.setMinimumSize(new java.awt.Dimension(50, 30));

        tabladatosprod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "ID(cliente)", "Nombre producto", "Precio", "Cantidad", "Fecha vencimiento", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabladatosprod);

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Descripcion:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(464, 464, 464)
                        .addComponent(ingresar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(actualizar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(precio_prod, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                    .addComponent(nombre_prod)
                                    .addComponent(nu_serie)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(fecha_vencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(cantidad_prod)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(descripciontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(98, 98, 98))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nu_serie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombre_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(precio_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cantidad_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fecha_vencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ingresar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actualizar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descripciontxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(259, 259, 259))
        );

        jMenu1.setText("File");

        Volver_a_inicio.setSelected(true);
        Volver_a_inicio.setText("Volver");
        Volver_a_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Volver_a_inicioMouseClicked(evt);
            }
        });
        Volver_a_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver_a_inicioActionPerformed(evt);
            }
        });
        jMenu1.add(Volver_a_inicio);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Volver_a_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver_a_inicioActionPerformed
       
        Inicio_app GN = new Inicio_app();
        GN.setVisible(true);
        
        Ingresar_item ingresar_item = new Ingresar_item();
 
        this.dispose();
    }//GEN-LAST:event_Volver_a_inicioActionPerformed

    private void Volver_a_inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Volver_a_inicioMouseClicked
       
    }//GEN-LAST:event_Volver_a_inicioMouseClicked

    private void actualizar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizar_btnActionPerformed
       // DefaultTableModel tableModel =(DefaultTableModel)tabladatosprod.getModel();
        CargarTabla();
        
    }//GEN-LAST:event_actualizar_btnActionPerformed

    private void nu_serieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nu_serieActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_nu_serieActionPerformed

    private void ingresar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresar_btnActionPerformed
       //se llama al metodo para poder insertar un nuevo producto
       //se determinan los valores por los jtexfield dandoles un valor a cado uno
        if(!"".equals(nu_serie.getText()) || !"".equals(nombre_prod.getText())|| !"".equals(precio_prod.getText())|| !"".equals(cantidad_prod.getText())|| !"".equals(fecha_vencimiento.getText()))
        {
            pro.setOrden_producto(Integer.parseInt(nu_serie.getText()));
            pro.setNombre_producto(nombre_prod.getText());
            pro.setPrecio_prod(Integer.parseInt(precio_prod.getText()));
            pro.setCantidad_producto(Float.parseFloat(cantidad_prod.getText()));
            pro.setFecha_vencimiento(fecha_vencimiento.getText());
            proFunc.InsertarProd(pro);

        }else{
            JOptionPane.showMessageDialog(null,"Porfavor rellene los campos");
        }

    }//GEN-LAST:event_ingresar_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Ingresar_item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresar_item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresar_item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresar_item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresar_item().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButtonMenuItem Volver_a_inicio;
    private javax.swing.JButton actualizar_btn;
    private javax.swing.JTextField cantidad_prod;
    private javax.swing.JTextField descripciontxt;
    private javax.swing.JTextField fecha_vencimiento;
    private javax.swing.JButton ingresar_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nombre_prod;
    private javax.swing.JTextField nu_serie;
    private javax.swing.JTextField precio_prod;
    public javax.swing.JTable tabladatosprod;
    // End of variables declaration//GEN-END:variables
}
