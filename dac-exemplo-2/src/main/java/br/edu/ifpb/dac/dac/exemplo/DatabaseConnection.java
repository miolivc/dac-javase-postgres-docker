/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.dac.exemplo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author miolivc
 */
public class DatabaseConnection {
//    private static String url = "jdbc:postgresql://localhost:5432/crud-user";
    private static String url = "jdbc:postgresql://host-database:5432/crud-user";
    private static String user = "postgres";
    private static String password = "postgres";
    
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return conn;
    }
    
    
}
