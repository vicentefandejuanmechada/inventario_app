/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.Connection;

/**
 *
 * @author admin1
 */
public class productosfuncTest {

    public productosfuncTest() {
    }

    @Test
    public void testInsertarProd() {
        System.out.println("InsertarProd");
        Producto pro = new Producto(6, 2, "itemtest", 1, 2, "11", "a");
        productosfunc instance = new productosfunc();
        //boolean expResult = false;
        boolean result = instance.InsertarProd(pro);

        if (result) {
            assertFalse(!result);
        } else {
            fail("fallo");
        }
    }

    @Test
    public void testEliminarProd() {
        System.out.println("EliminarProd");
        int id = 0;
        productosfunc instance = new productosfunc();
        //boolean expResult = false;
        boolean result = instance.EliminarProd(id);
        if (result){
        assertNotNull(!result);    
        }else{
          fail("The test case is a prototype.");  
        }
        
       
    }
      
}
