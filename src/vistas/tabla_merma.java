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
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import org.mariadb.jdbc.Connection;

/**
 *
 * @author admin1
 */
public class tabla_merma extends javax.swing.JFrame {
  Connection conn;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public tabla_merma() {
        initComponents();
        CargarTabla();
    }


    public void CargarTabla(){
         ///llama la funcion limpiar tabla para evitar redundancia de datos.
        CleanTable();
            try {
                //reitera la conexion nuevamente para mostrar los datos
               String url = "jdbc:mariadb://localhost:3306/inventario";
               String usuario = "root";
               String pass = "root";
               Connection cnew2;
               Class.forName("org.mariadb.jdbc.Driver");
               //conexion getCon.. url+usuario+contraseña
               cnew2 = (Connection) DriverManager.getConnection(url,usuario,pass);
                org.mariadb.jdbc.Statement st = cnew2.createStatement();
                //sentencia sql
                String sql = "SELECT * FROM merma_tabla";
                ResultSet rs = st.executeQuery(sql);
                //establece cada valor en cada opcion
                while(rs.next()){
                   String id = String.valueOf(rs.getInt("id_merma"));
                   String orde_nu = rs.getString("nombre_prod_mermado");
                   String Nombreprod = rs.getString("precio_prod_mermados");
                   String precioprod = String.valueOf(rs.getInt("id_producto"));
                   String cantidadprod = String.valueOf(rs.getInt("cantidad_productos_mermados"));

                   String tabladb [] = {id,orde_nu,Nombreprod,precioprod,cantidadprod};
                   DefaultTableModel tableModel =(DefaultTableModel)tablamerma.getModel();
                    //agrega los datos
                    //agrega las columnas a funcion de las columnas
           tableModel.addRow(tabladb);
                }
               
                //System.out.println("a");
            } catch (ClassNotFoundException | SQLException e) {
                System.err.println(e);
        }
        
        
    }
    
    public void CleanTable(){
        ///limpia la tabla 
    DefaultTableModel tableModel = (DefaultTableModel)tablamerma.getModel();
    tableModel.setRowCount(0);
        
    }
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablamerma = new javax.swing.JTable();
        titlemerma = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        tablamerma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id merma", "Nombre Producto", "Total merma", "id producto", "Cantidad producto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablamerma);

        titlemerma.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        titlemerma.setForeground(new java.awt.Color(255, 255, 255));
        titlemerma.setText("Tabla Merma");
        titlemerma.setToolTipText("");
        titlemerma.setMaximumSize(new java.awt.Dimension(50, 30));
        titlemerma.setMinimumSize(new java.awt.Dimension(50, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(titlemerma, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(titlemerma, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
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
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(tabla_merma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabla_merma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabla_merma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabla_merma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tabla_merma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablamerma;
    private javax.swing.JLabel titlemerma;
    // End of variables declaration//GEN-END:variables
}
