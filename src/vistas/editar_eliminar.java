/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;
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
public class editar_eliminar extends javax.swing.JFrame {
 
    Producto pro = new Producto();
   //llama a la productosfunc para llamar sus sentencias como el insert
   productosfunc proFunc = new productosfunc();
   //llama funcion conectar 
   Connection conn;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    /**
     * Creates new form editar_eliminar
     */
    public editar_eliminar() {
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
                   DefaultTableModel tableModel =(DefaultTableModel)TableProd.getModel();
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
    DefaultTableModel tableModel = (DefaultTableModel)TableProd.getModel();
    tableModel.setRowCount(0);
        
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jFileChooser1 = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        a = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        name_prod_editxt = new javax.swing.JTextField();
        cantidadprod_editxt = new javax.swing.JTextField();
        precioedit_txt = new javax.swing.JTextField();
        fechavencimiento_edit_txt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableProd = new javax.swing.JTable();
        edit_prod_btn = new javax.swing.JButton();
        eliminarprodbt = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        ideliminar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nuorden_editxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        descripcion_edit_txt = new javax.swing.JTextField();
        merma_btn = new javax.swing.JButton();
        idlabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        Volver_a_home_editdelete = new javax.swing.JCheckBoxMenuItem();
        jMenu8 = new javax.swing.JMenu();

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("nombre");

        jTextField1.setText("jTextField1");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("correo electronico");

        jTextField2.setText("jTextField2");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("nombre de usuario");

        jTextField4.setText("jTextField4");

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("contraseña");

        jTextField5.setText("jTextField5");

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

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        a.setBackground(new java.awt.Color(153, 153, 255));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("nombre producto");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Cantidad productos");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Precio Producto");

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Fecha vencimiento");

        TableProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Nu identificador", "Nombre producto", "Precio (por cantidad)", "Cantidad", "Fecha vencimiento", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableProd.setColumnSelectionAllowed(true);
        TableProd.getTableHeader().setReorderingAllowed(false);
        TableProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableProdMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableProd);
        TableProd.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (TableProd.getColumnModel().getColumnCount() > 0) {
            TableProd.getColumnModel().getColumn(0).setResizable(false);
            TableProd.getColumnModel().getColumn(1).setResizable(false);
            TableProd.getColumnModel().getColumn(2).setResizable(false);
            TableProd.getColumnModel().getColumn(3).setResizable(false);
            TableProd.getColumnModel().getColumn(4).setResizable(false);
            TableProd.getColumnModel().getColumn(5).setResizable(false);
            TableProd.getColumnModel().getColumn(6).setResizable(false);
        }

        edit_prod_btn.setText("editar");
        edit_prod_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_prod_btnMouseClicked(evt);
            }
        });
        edit_prod_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_prod_btnActionPerformed(evt);
            }
        });

        eliminarprodbt.setBackground(new java.awt.Color(0, 0, 0));
        eliminarprodbt.setForeground(new java.awt.Color(255, 0, 0));
        eliminarprodbt.setText("X");
        eliminarprodbt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarprodbtMouseClicked(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("confirmar edicion");

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("ID a elimnar");

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("confirmar eliminacion");

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Nu identificador");

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("ID de producto que desea editar");

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Descripcion");

        merma_btn.setText("mermar producto");
        merma_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                merma_btnMouseClicked(evt);
            }
        });

        idlabel.setForeground(new java.awt.Color(0, 0, 0));
        idlabel.setText("-");
        idlabel.setMaximumSize(new java.awt.Dimension(7, 16));
        idlabel.setMinimumSize(new java.awt.Dimension(7, 16));

        jButton1.setText("ver tabla merma");

        javax.swing.GroupLayout aLayout = new javax.swing.GroupLayout(a);
        a.setLayout(aLayout);
        aLayout.setHorizontalGroup(
            aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aLayout.createSequentialGroup()
                .addGroup(aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(aLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(aLayout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(idlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(aLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(edit_prod_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechavencimiento_edit_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(precioedit_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(cantidadprod_editxt)
                    .addComponent(name_prod_editxt, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuorden_editxt, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descripcion_edit_txt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(ideliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(eliminarprodbt, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(aLayout.createSequentialGroup()
                        .addComponent(merma_btn)
                        .addGap(27, 27, 27)
                        .addComponent(jButton1)))
                .addGap(83, 83, 83))
            .addGroup(aLayout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        aLayout.setVerticalGroup(
            aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(aLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ideliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(aLayout.createSequentialGroup()
                        .addGroup(aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(nuorden_editxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name_prod_editxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aLayout.createSequentialGroup()
                        .addGroup(aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cantidadprod_editxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(precioedit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fechavencimiento_edit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(aLayout.createSequentialGroup()
                        .addComponent(eliminarprodbt)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)))
                .addGap(18, 18, 18)
                .addGroup(aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(descripcion_edit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(merma_btn)
                    .addComponent(jButton1))
                .addGap(5, 5, 5)
                .addComponent(edit_prod_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenu7.setText("File");

        Volver_a_home_editdelete.setSelected(true);
        Volver_a_home_editdelete.setText("Volver");
        Volver_a_home_editdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver_a_home_editdeleteActionPerformed(evt);
            }
        });
        jMenu7.add(Volver_a_home_editdelete);

        jMenuBar4.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar4.add(jMenu8);

        setJMenuBar(jMenuBar4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarprodbtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarprodbtMouseClicked
        if(!"".equals(ideliminar.getText())){
            int id = Integer.parseInt(ideliminar.getText());
            proFunc.EliminarProd(id);
            CargarTabla();
        }
        
        
    }//GEN-LAST:event_eliminarprodbtMouseClicked

    private void Volver_a_home_editdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver_a_home_editdeleteActionPerformed
        Inicio_app GN = new Inicio_app();
        GN.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Volver_a_home_editdeleteActionPerformed

    private void edit_prod_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_prod_btnMouseClicked
       
    }//GEN-LAST:event_edit_prod_btnMouseClicked

 
    
    private void TableProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableProdMouseClicked
       //con esta funcion cuando clickeamos en la tabla se rellenaran los campos a editar
        Connection conn = null;
        try {
            int row = TableProd.getSelectedRow();
            String tablaClick=(TableProd.getModel().getValueAt(row,0).toString());
             conn = (Connection) cn.getConn();
             String sql="SELECT * FROM productos where id ='"+tablaClick+"'";
           ps = conn.prepareStatement(sql);
           rs = ps.executeQuery();
            if(rs.next()){
                String agrega1 =rs.getString("id");
                //id_editprod_txt.setText(agrega1);
                String agrega2 =rs.getString("orden_producto");
                nuorden_editxt.setText(agrega2);
                String agrega3 =rs.getString("nombre_producto");
                name_prod_editxt.setText(agrega3);
                String agrega4 =rs.getString("precio_prod");
                precioedit_txt.setText(agrega4);
                String agrega5 =rs.getString("cantidad_producto");
                cantidadprod_editxt.setText(agrega5);
                String agrega6 =rs.getString("fecha_vencimiento");
                fechavencimiento_edit_txt.setText(agrega6);
                String agrega7 =rs.getString("descripcion");
                descripcion_edit_txt.setText(agrega7);
                idlabel.setText(agrega1);
                
                
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_TableProdMouseClicked

    private void edit_prod_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_prod_btnActionPerformed
            
        
          try {
            conn = (Connection) cn.getConn();
             
             
             String nu_orden_edit = nuorden_editxt.getText();
             String id_captura_edit = idlabel.getText();
             //String id_captura_edit = id_editprod_txt.getText();
             String nombre_edit = name_prod_editxt.getText();
             String precio_edit = precioedit_txt.getText();
             String cantidad_edit = cantidadprod_editxt.getText();
             String fechavenci = fechavencimiento_edit_txt.getText();
             String descrip_edit = descripcion_edit_txt.getText();
             String sql = "UPDATE productos SET orden_producto='"+nu_orden_edit+"', nombre_producto='"+nombre_edit+"', precio_prod='"+precio_edit+"', cantidad_producto='"+cantidad_edit+"', fecha_vencimiento='"+fechavenci+"', descripcion='"+descrip_edit+"'  WHERE id='"+id_captura_edit+"'";
             PreparedStatement pstm = conn.prepareStatement(sql);

             pstm.executeUpdate();
             System.out.println("Funciono la edicion");
             CargarTabla();
             conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
  
    }//GEN-LAST:event_edit_prod_btnActionPerformed

    private void merma_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_merma_btnMouseClicked
    Connection conn = null;
        try {
                conn = (Connection) cn.getConn();
                String nombre_merma =name_prod_editxt.getText();
                String cantidad_a_mermar = cantidadprod_editxt.getText();
                String precio_merma = precioedit_txt.getText();
                int resultadomulti = Integer.valueOf(precio_merma) * Integer.valueOf(cantidad_a_mermar)  ;
                String resultado_cantidadxprecio =  String.valueOf(resultadomulti);
                String id_prod = idlabel.getText();
                
                String sql = "INSERT INTO merma_tabla(nombre_prod_mermado,cantidad_productos_mermados,precio_prod_mermados,id_producto) Values ('"+nombre_merma+"','"+cantidad_a_mermar+"','"+resultado_cantidadxprecio+"','"+id_prod+"')";
                PreparedStatement pss = conn.prepareStatement(sql);
                System.out.println("        Funciono el ingreso a tabla merma ");
                System.out.println(resultado_cantidadxprecio);
                pss.execute();
                
        } catch (SQLException e) {
            System.out.println(e);
        }
                // TODO add your handling code here:
    }//GEN-LAST:event_merma_btnMouseClicked

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
            java.util.logging.Logger.getLogger(editar_eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editar_eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editar_eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editar_eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editar_eliminar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableProd;
    private javax.swing.JCheckBoxMenuItem Volver_a_home_editdelete;
    private javax.swing.JPanel a;
    private javax.swing.JTextField cantidadprod_editxt;
    private javax.swing.JTextField descripcion_edit_txt;
    private javax.swing.JButton edit_prod_btn;
    private javax.swing.JButton eliminarprodbt;
    private javax.swing.JTextField fechavencimiento_edit_txt;
    private javax.swing.JTextField ideliminar;
    private javax.swing.JLabel idlabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JButton merma_btn;
    private javax.swing.JTextField name_prod_editxt;
    private javax.swing.JTextField nuorden_editxt;
    private javax.swing.JTextField precioedit_txt;
    // End of variables declaration//GEN-END:variables


}
