///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package database;
//
//import static database.ConexionDB.StatementConnection;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
///**
// *
// * @author ASUS
// */
//public class Conexion {
//    private static String url;
//    private static String mensaje;
//
//    private static String dbName;
//    private static String userName;
//    private static String password;
//    private static String hostname;
//    private static String port;
//    private static Statement connection;
//    static Statement StatementConnection;
//
//    //private static Connection connection;
//
//    
//    private Conexion(){
//        /* 
//        *Parámetros por defecto de la base de datos 
//        */
//        url = "jdbc:mysql://tiendademotos.csvkszv7bls2.us-east-1.rds.amazonaws.com:3306/tienda_motos";
//        mensaje = "";
//        dbName = System.getenv("tienda_motos");
//        userName = System.getenv("gerente");
//        password = System.getenv("admin#M0t0s2020");
//        hostname = System.getenv("tiendademotos.csvkszv7bls2.us-east-1.rds.amazonaws.com");
//        port = System.getenv("3306");
//        /* Creación de una instancia del estado de la conexión*/
//        connection = getConnection();
//    }
//
//    public static Statement getConnection(){
//        try {
//            java.sql.Connection conn = DriverManager.getConnection(url,userName,password);
//            //Creación del objeto Estado (Statement)
//            java.sql.Statement state = conn.createStatement();
//            return (Statement) state;
//            
//            /*if (connection == null) {
//                Runtime.getRuntime().addShutdownHook(new getClose());
//            }*/
//        } catch (SQLException ex) {
//            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return null;
//    }
//
//    static class getClose extends Thread{
//        @Override
//        public void run() {
//            try {
//                Connection conn = ConexionDB.getConnection();
//                conn.close();
//            } catch (SQLException ex) {
//                throw new RuntimeException(ex);
//            }
//        }
//    }
//    /* Clase Privada interna responsable de instanciar la instancia única del singleton */
//    private static class ConexionManagerHolder {
//        private final static Conexion instance = new Conexion();
//    }
//
//    /**
//     * @return
//     * Método público, el cual es el único autorizado a devolver una instancia del singleton (aquí la instancia es la conexión a la base de datos). 
//     */
//    public static Conexion getInstance() {
//        try {
//            return ConexionManagerHolder.instance;
//        } catch (ExceptionInInitializerError ex) {
//
//        }
//        return null;
//    }
//    /**
//    *
//    * Enviar una consulta a la base de datos:
//    * String sqlString = "SELECT id, nombre, apellidos FROM personas" ;
//    * ResultSet result = state.executeQuery(sqlString);
//    */
//    public static Statement getStatement() {
//        return StatementConnection;
//    }
//}
