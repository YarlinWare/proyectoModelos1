/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda_motos;

import database.Conexion;
import database.ConexionDB;
/**
 *
 * @author thord
 */
public class Tienda_Motos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConexionDB condb = (ConexionDB) ConexionDB.getConnection();
        System.out.println(condb);
    }
    
}
