/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.HulkStore.datos;

/**
 *
 * @author linux
 */
public class Producto {
    //atributos de procutos
    private String descripcion;
    private int stockActual;
    private String codigo;

    //constructor sin parametros
    public Producto() {
    }

    //constructor parametros definidos
    public Producto(String descripcion, int stockActual, String codigo) {
        this.descripcion = descripcion;
        this.stockActual = stockActual;
        this.codigo = codigo;
    }

    //setters y getters para atributos de productos
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}
