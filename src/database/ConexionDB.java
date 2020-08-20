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
    static String url = "jdbc:mysql://tiendademotos.csvkszv7bls2.us-east-1.rds.amazonaws.com:3306/tienda_motos";
    static String mensaje = "";

    static String dbName = System.getenv("tienda_motos");
    static String userName = System.getenv("gerente");
    static String password = System.getenv("admin#M0t0s2020");
    static String hostname = System.getenv("tiendademotos.csvkszv7bls2.us-east-1.rds.amazonaws.com");
    static String port = System.getenv("3306");
    static Statement StatementConnection;

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
            /* Opción 2 */
            /*if (connection == null) {
                 Runtime.getRuntime().addShutdownHook(new getClose());
                 Class.forName("com.mysql.jdbc.Driver");
                 String jdbcUrl = "jdbc:mysql://" + hostname + ":" + port + "/" 
                                   + dbName + "?user=" + userName
                                   + "&password=" + password;
                 connection = DriverManager.getConnection(jdbcUrl);
                 System.out.println("Se genera la conexión");
             }*/
            return connection;
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
    
    
    /* Clase Privada interna responsable de instanciar la instancia única del singleton */
    private static class ConexionDBManagerHolder {
        private final static ConexionDB instance = new ConexionDB();
    }

    /**
     * @return
     * Método público, el cual es el único autorizado a devolver una instancia del singleton (aquí la instancia es la conexión a la base de datos). 
     */
    public static ConexionDB getInstance() {
        try {
            return ConexionDBManagerHolder.instance;
        } catch (ExceptionInInitializerError ex) {

        }
        return null;
    }
    /**
    *
    * Enviar una consulta a la base de datos:
    * String sqlString = "SELECT id, nombre, apellidos FROM personas" ;
    * ResultSet result = state.executeQuery(sqlString);
    */
    public static Statement getStatement() {
        return StatementConnection;
    }
    /**
     * Metodo para retornar mensajes de control
     * @return 
     */
    public static String getMensaje() {
        return mensaje;
    }
    
    /**
     * Metodo para setear mensajes de control
     * @param mensaje 
     */
    public static void setMensaje(String mensaje) {
        ConexionDB.mensaje = mensaje;
    }
     
    /**
     * metodo que retorna la conexion a la bd
     * @return 
     */
    public Connection getConexion(){
        return connection;
    }

    /**
     * metodo que desconecta la base de datos
     */
    public void desconectar(){
        connection = null;
    }
}
