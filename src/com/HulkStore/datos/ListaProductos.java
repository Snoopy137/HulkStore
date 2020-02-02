/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.HulkStore.datos;

import java.util.ArrayList;

/**
 *
 * @author linux
 */

//clase para manejar datos masivos de productos
public class ListaProductos {
    //lista de productos
    private ArrayList <Producto> Productos = new ArrayList<Producto>();
    //constructor de una lista de productos con conjunto predefinido
    public ListaProductos (ArrayList<Producto> Producto){
        super();
        this.Productos = Producto;
    }
    //constructor de lista sin elementos
    public ListaProductos (){
        super();
        this.Productos=new ArrayList <Producto>();
    }
    //obtener lenght de lista de productos
    public int getSize(){
        return Productos.size();
    }
    //eliminar todos los productos de una lista
    public void clean(){
        Productos.clear();
    }
    //obtener un lista de productos
    public ArrayList<Producto> getProducto(){
        return Productos;
    }
    //obtener producto desde una list en la posicion elegida
    public Producto getProducto(int i){
        return Productos.get(i);
    }
    //ingresar una lista a un objeto de productos lista vacio
    public void setProductos (ArrayList <Producto> Productos){
        this.Productos = Productos;
    }
    //agregar un producto a una lista existente
    public void agregaProducto(Producto prod){
        Productos.add(prod);
    }
}
