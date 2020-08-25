/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ASUS
 */
public class ConexionDB {

    private String url = "jdbc:postgresql://tiendamotospgs.csvkszv7bls2.us-east-1.rds.amazonaws.com:5432/tienda_motos";
    private String userName = "postgres";
    private String password = "admin1234";

    private static Connection connection = null;

    private ConexionDB() {
        
        try {
            Runtime.getRuntime().addShutdownHook(new getClose());
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, userName, password);
//            System.out.println("Se genera la conexión");

        } catch (ClassNotFoundException | SQLException e) {
//            System.out.println(e.getMessage());
            throw new RuntimeException("Conexión fallida", e);
        }
//        System.out.println("fin");
    }

    public static Connection getConnection() {
        if (connection == null) {
            new ConexionDB();
        }
//        System.out.println(connection);
        return connection;
    }

    static class getClose extends Thread {

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

    public void desconectar() {
        connection = null;
    }
}
