/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import org.junit.Test;
import static org.junit.Assert.*;
import modelo.Conexion;

/**
 *
 * @author admin1
 */
public class ConexionTest {

    public ConexionTest() {
    }

    @Test
    public void testGetConn() throws Exception {
        System.out.println("getConn");
        Conexion instance = new Conexion();

        Connection result = instance.getConn();
        
        if (result != null) {
            assertNotNull(result);
        } else {
            fail("The test case is a prototype.");
        }
    }

}
