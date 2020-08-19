/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ASUS
 */
public class ConexionDB {
    static String url = "jdbc:mysql://tiendademotos.csvkszv7bls2.us-east-1.rds.amazonaws.com:3306/tienda_demotos";
    static String mensaje = "";

    static String dbName = System.getenv("tienda_motos");
    static String userName = System.getenv("gerente");
    static String password = System.getenv("admin#M0t0s2020");
    static String hostname = System.getenv("tiendademotos.csvkszv7bls2.us-east-1.rds.amazonaws.com");
    static String port = System.getenv("3306");

    private static Connection connection;

    ConexionDB(){
    }

    public static Connection getConnection(){
        try {
            if (connection == null) {
                Runtime.getRuntime().addShutdownHook(new getClose());
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(url,userName,password);
                System.out.println("Se genera la conexión");
            }
            return connection;
            /* Opción 2 */
            // if (connection == null) {
                // Runtime.getRuntime().addShutdownHook(new getClose());
                // Class.forName("com.mysql.jdbc.Driver");
                // String jdbcUrl = "jdbc:mysql://" + hostname + ":" + port + "/" 
                //                  + dbName + "?user=" + userName
                //                  + "&password=" + password;
                // connection = DriverManager.getConnection(jdbcUrl);
                // System.out.println("Se genera la conexión");
            // }
            // return connection;
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Conexión fallida", e);
        }
    }

    static class getClose extends Thread{
        @Override
        public void run() {
            try {
                Connection conn = ConexionDB.getConnection();
                conn.close();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
