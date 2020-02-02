/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.HulkStore.conexion;

import com.HulkStore.datos.ListaProductos;
import com.HulkStore.datos.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author linux
 */
public class AccionesProductos {
    //carga inicial de un itme nuevo
    public static int agregaNuevoProducto (Producto prod) throws SQLException{
        Connection con = new DBconnection().conectar();
        System.out.println(con);
        try {
            //rechazar codigo de item duplicado
            PreparedStatement pstexiste = con.prepareStatement("SELECT * FROM Productos WHERE Codigo = '"+prod.getCodigo()+"'" );
            ResultSet existe = pstexiste.executeQuery();
            if (existe.next()){
                System.out.println("Este producto ya existe, puede realizar operaciones con el, no es necsraio crearlo");
                return 0;
            }
            else {
                PreparedStatement pstagregar = con.prepareStatement("INSERT INTO Productos VALUES("+null+",'"+prod.getCodigo()+"', '"+prod.getDescripcion()+"',"+prod.getStockActual()+" )");
                int resultado =  pstagregar.executeUpdate();
                System.out.println("Ya puede operar con su producto");
                return resultado;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccionesProductos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Ocurrio un error durante el proceso. \nDetalles:"+ex);
            return 2;
        }
        finally {
            con.close();
        }
    }
    
    //registrar compra de productos
    public static int ingresoMercaderia (Producto prod, int compra) throws SQLException{
        Connection con = new DBconnection().conectar();
        try {
            //verifica que el producto existe
            PreparedStatement pstexiste = con.prepareStatement("SELECT * FROM Productos WHERE Codigo = '"+prod.getCodigo()+"'");
            ResultSet existe = pstexiste.executeQuery();
            if (existe.next()){
                int stock = prod.getStockActual()+compra;
                PreparedStatement pst = con.prepareStatement("UPDATE Productos SET Stock ="+stock+" WHERE Codigo = '"+prod.getCodigo()+"' ");
                System.out.println("Ingreso exitoso");
                return pst.executeUpdate();
            }
            else {
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccionesProductos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Ocurrio un error durante el proceso. \nDetalles:"+ex);
            return 2;
        }
        finally {
            con.close();
        }
    }
    
    //vender articulos
    public static int ventaMercaderia (Producto prod, int venta) throws SQLException{
        Connection con = new DBconnection().conectar();
        try {
            //reducir stock al realizar venta
            int stock = prod.getStockActual()-venta;
            if (stock < 0){
                System.out.println("No puede vender mas que el stock existente");
                return 3;
            }
            PreparedStatement pst = con.prepareStatement("UPDATE Productos SET Stock="+stock+" WHERE Codigo ='"+prod.getCodigo()+"'");
            int resultado = pst.executeUpdate();
            System.out.println("Venta registrada");
            return resultado;
        } catch (SQLException ex) {
            Logger.getLogger(AccionesProductos.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Ocurrio un error durante el proceso. \nDetalles:"+ex);
            return 2;
        }
        finally {
            con.close();
        }
    }
    
    public static ListaProductos listarProductos (String producto, String criterioBusqueda){
        ListaProductos prods = new ListaProductos();
        try {
            Connection con = new DBconnection().conectar();
            //seleccionar todo lo que coincida con la busqeda ingresada
            PreparedStatement pst = con.prepareStatement("SELECT * FROM Productos WHERE "+criterioBusqueda+" LIKE '%"+producto+"%' ");
            ResultSet rs = pst.executeQuery();
            ResultSetMetaData rm = rs.getMetaData();
            while (rs.next()){
                Producto prod = new Producto(rs.getString("Descripcion"), rs.getInt("Stock"), rs.getString("Codigo"));
                prods.agregaProducto(prod);
            }
        } catch (SQLException ex) {
            System.out.println("Error en proceso de busqueda \nDetalles:"+ex);
            Logger.getLogger(AccionesProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return prods;
    }
}
