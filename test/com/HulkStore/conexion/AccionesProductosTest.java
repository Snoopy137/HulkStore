/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.HulkStore.conexion;

import com.HulkStore.datos.ListaProductos;
import com.HulkStore.datos.Producto;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author linux
 */
public class AccionesProductosTest {
    
    public AccionesProductosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of agregaNuevoProducto method, of class AccionesProductos.
     */
    @Test
    public void testAgregaNuevoProducto() throws Exception {
        System.out.println("agregaNuevoProducto");
        Producto prod = new Producto("iron man",0,"IM1");;
        int expResult = 0;
        int result = AccionesProductos.agregaNuevoProducto(prod);
        assertEquals(expResult, result);
    }

    /**
     * Test of ingresoMercaderia method, of class AccionesProductos.
     */
    @Test
    public void testIngresoMercaderia() throws Exception {
        System.out.println("ingresoMercaderia");
        Producto prod = new Producto("iron man",0,"IM1");;
        int compra = 0;
        int expResult = 1;
        int result = AccionesProductos.ingresoMercaderia(prod, compra);
        assertEquals(expResult, result);
    }

    /**
     * Test of ventaMercaderia method, of class AccionesProductos.
     */
    @Test
    public void testVentaMercaderia() throws Exception {
        System.out.println("ventaMercaderia");
        Producto prod = new Producto("iron man",0,"IM1");
        int venta = 0;
        int expResult = 1;
        int result = AccionesProductos.ventaMercaderia(prod, venta);
        assertEquals(expResult, result);
    }

    /**
     * Test of listarProductos method, of class AccionesProductos.
     */
    @Test
    public void testListarProductos() {
        System.out.println("listarProductos");
        String producto = "I";
        String criterioBusqueda = "Codigo";
        ListaProductos result = AccionesProductos.listarProductos(producto, criterioBusqueda);
        assertNotNull(result);
    }
    
}
