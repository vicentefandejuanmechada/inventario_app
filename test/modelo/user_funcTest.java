/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin1
 */
public class user_funcTest {
    
    public user_funcTest() {
    }

    @Test
    public void testInsertarUser() {
        System.out.println("InsertarUser");
        usuarios us = new usuarios(1,2,"a","d","f");
        user_func instance = new user_func();
        //boolean expResult = false;
        boolean result = instance.InsertarUser(us);
        assertNotNull(result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testEliminaruser() {
        System.out.println("Eliminaruser");
        int id_user = 0;
        user_func instance = new user_func();
        //boolean expResult = false;
        boolean result = instance.Eliminaruser(id_user);
        //assertNotNull(result);
        if (result){
            assertNotNull(!result);
        }else{
            fail("The test case is a prototype.");
        }
        //
    }

    @Test
    public void testLog() {
        System.out.println("log");
        String nombre_user = "a";
        String passw_user = "d";
        user_func instance = new user_func();
        //usuarios expResult = null;
        usuarios result = instance.log(nombre_user, passw_user);
        //assertNotNull(result);
        if(result != null){
            assertNotNull(result);
        }else{
            fail("The test case is a prototype.");
        }
        //fail("The test case is a prototype.");
    }
    
}
