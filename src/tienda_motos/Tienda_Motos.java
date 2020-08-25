/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda_motos;

import Logica.Estrategia.GenerarContexto;
import Logica.Estrategia.GenerarPDFDetallado;
import Logica.Observer.Modelo;
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
    
    public static void main(String[] args){
        new Tienda_Motos();        
        GenerarContexto contexto = new GenerarContexto(new GenerarPDFDetallado());
        contexto.ejecutar();
//        ConexionDB cn = ConexionDB.getInstance();
//        System.out.println(cn);
//        ConexionDB cn2 = ConexionDB.getInstance();
//        System.out.println(cn2);
    }
    
}
