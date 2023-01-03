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
    public void testLogu() {
        System.out.println("logu");
        String nombre_user = "a";
        String passw_user = "a";
        user_func instance = new user_func();
        //usuarios expResult = null;
        usuarios result = instance.logu(nombre_user, passw_user);
        //assertEquals( result);
        if(result != null){
          assertNotNull(result);  
        }else{
        fail("The test case is a prototype.");    
        }
        
        
    }
    
}
