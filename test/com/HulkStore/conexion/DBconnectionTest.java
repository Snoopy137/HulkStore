/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.HulkStore.conexion;

import java.sql.Connection;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author linux
 */
public class DBconnectionTest {
    
    public DBconnectionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of conectar method, of class DBconnection.
     */
    @Test
    public void testConectar() {
        System.out.println("conectar");
        Connection expResult = null;
        Connection result = DBconnection.conectar();
        assertNotEquals(expResult, result);
    }

    /**
     * Test of close method, of class DBconnection.
     */
    @Test
    public void testClose() {
        System.out.println("close");
        DBconnection.close();
    }
    
}
