/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.HulkStore.conexion;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mis_p
 */
public class DBconnection {

    static String path;
    static Connection connect;

    //crear base de datos para nuevo programa
    public static void crearBase() throws IOException {
            File f = new File("");
            path = f.getCanonicalPath();
            File base = new File(path + "/Base/Hulk.db");
            if (base.exists() == false) {
                base.createNewFile();
                crearTabla();
            }
    }
    private static void crearTabla(){
        try {
            Connection con = conectar();
            PreparedStatement pst = con.prepareStatement("CREATE TABLE \"Productos\" ( `ID` INTEGER PRIMARY KEY AUTOINCREMENT, `Codigo` TEXT, `Descripcion` TEXT, `Stock` INTEGER )");
            int resultado = pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //conexion a base de datos de productos mediante absolute pat
    public static Connection conectar() {
        try {
            File f = new File("");
            path = f.getCanonicalPath();
            String ret = System.getProperty("file.separator");
            String url = "jdbc:sqlite:"+path+ret+"Base"+ret+"Hulk.db";
            Class.forName("org.sqlite.JDBC");
            connect = DriverManager.getConnection(url);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return connect;
    }

    public static void close() {
        try {
            connect.close();
            connect = null;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
