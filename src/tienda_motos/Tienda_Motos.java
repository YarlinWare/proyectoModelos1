/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda_motos;

import Logica.Modelo;
import Logica.Tienda;
import database.ConexionDB;
import database.MotosDB;
import java.sql.SQLException;
/**
 *
 * @author thord
 */
public class Tienda_Motos {
    
    public Tienda_Motos(){
        Modelo miApp = new Modelo();
        miApp.iniciar();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
//        ConexionDB cn = ConexionDB.getInstance();
//        System.out.println(cn);
//        ConexionDB cn2 = ConexionDB.getInstance();
//        System.out.println(cn2);
         new Tienda_Motos();
//           Tienda t = new Tienda();
//           t.getCatalogo();
    }
    
}
