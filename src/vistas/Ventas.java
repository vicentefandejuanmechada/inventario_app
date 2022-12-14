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
import modelo.Producto;
import modelo.productosfunc;
import org.mariadb.jdbc.Connection;

/**
 *
 * @author admin1
 */
public class Ventas extends javax.swing.JFrame {
Producto pro = new Producto();
   //llama a la productosfunc para llamar sus sentencias como el insert
   productosfunc proFunc = new productosfunc();
   //llama funcion conectar 
   Connection conn;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    /**
     * Creates new form Ventas
     */
    public Ventas() {
        initComponents();
        CargarTabla();
    }
    
     //funcion para cagar la tabla
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
                String sql = "SELECT * FROM productos";
                ResultSet rs = st.executeQuery(sql);
                //establece cada valor en cada opcion
                while(rs.next()){
                   String id = String.valueOf(rs.getInt("id"));
                   String orde_nu = String.valueOf(rs.getInt("orden_producto"));
                   String Nombreprod = rs.getString("nombre_producto");
                   String precioprod = String.valueOf(rs.getInt("precio_prod"));
                   String cantidadprod = String.valueOf(rs.getInt("cantidad_producto"));
                   String fechavencimiento = rs.getString("fecha_vencimiento");
                   String descripcion = rs.getString("descripcion");
                   ////==
                   String tabladb [] = {id,orde_nu,Nombreprod,precioprod,cantidadprod,fechavencimiento,descripcion};
                   DefaultTableModel tableModel =(DefaultTableModel)tabla_ventas_prod.getModel();
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
    DefaultTableModel tableModel = (DefaultTableModel)tabla_ventas_prod.getModel();
    tableModel.setRowCount(0);
        
    }
   public void Seleccionardatos(){
        Connection conn = null;
        try {
            int row = tabla_ventas_prod.getSelectedRow();
            String tablaClick=(tabla_ventas_prod.getModel().getValueAt(row,0).toString());
             conn = (Connection) cn.getConn();
             String sql="SELECT * FROM productos where id ='"+tablaClick+"'";
           ps = conn.prepareStatement(sql);
           rs = ps.executeQuery();
            if(rs.next()){
                String agrega1 =rs.getString("id");
                id_producto_formventatxt.setText(agrega1);
              
                String agrega3 =rs.getString("nombre_producto");
                nombre_ventasformstx.setText(agrega3);
                
                String agrega5 =rs.getString("cantidad_producto");
                cantidad_prod_form_ventatxt.setText(agrega5);
              
                
                
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
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
        Cantidad = new javax.swing.JPanel();
        id_producto_formventatxt = new javax.swing.JTextField();
        cantidad_prod_form_ventatxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_ventas_prod = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        nombre_ventasformstx = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cantidad.setBackground(new java.awt.Color(153, 153, 255));

        tabla_ventas_prod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nu identificador", "Nombre Product", "Precio ", "Cantidad", "Fecha vencimiento", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_ventas_prod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_ventas_prodMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_ventas_prod);

        jButton1.setText("Salida");

        jButton2.setText("terminar dia");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cantidad de productos");

        jButton3.setText("Realizar venta");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre producto");

        javax.swing.GroupLayout CantidadLayout = new javax.swing.GroupLayout(Cantidad);
        Cantidad.setLayout(CantidadLayout);
        CantidadLayout.setHorizontalGroup(
            CantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CantidadLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(CantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(CantidadLayout.createSequentialGroup()
                        .addGroup(CantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(CantidadLayout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cantidad_prod_form_ventatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_producto_formventatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre_ventasformstx, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(CantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        CantidadLayout.setVerticalGroup(
            CantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CantidadLayout.createSequentialGroup()
                .addGroup(CantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CantidadLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(CantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id_producto_formventatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(CantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cantidad_prod_form_ventatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(CantidadLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jButton3)))
                .addGroup(CantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CantidadLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(CantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre_ventasformstx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(CantidadLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(CantidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Cantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabla_ventas_prodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_ventas_prodMouseClicked
        Seleccionardatos();
    }//GEN-LAST:event_tabla_ventas_prodMouseClicked

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
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cantidad;
    private javax.swing.JTextField cantidad_prod_form_ventatxt;
    private javax.swing.JTextField id_producto_formventatxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre_ventasformstx;
    private javax.swing.JTable tabla_ventas_prod;
    // End of variables declaration//GEN-END:variables
}
