/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Logica.fabrica.Motocicleta;
import Logica.fabrica.farbicaMotocicleta;
import java.util.ArrayList;
import database.MotosDB;
import java.sql.ResultSet;
/**
 *
 * @author thord
 */
public class Tienda {
    Usuario usuario;
    ArrayList catalogo;
    ArrayList carritoCompra;

    public ArrayList<Moto> getCatalogo() {
        MotosDB daoMoto = new MotosDB();
        try {
            ResultSet motos = daoMoto.getMoto();
            while(motos.next()){
                System.out.println(motos.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public void listarMotos(){
        
    }
    
    public void comprar(){
        
    }
    
    public void ModificarMoto(){
        
    }
    
    public void ModificarCatalogo(){
        
    }
    
    public void iniciarSesion(){
        
    }
    
    public void cerrarSesion(){
        
    }
    
    public void procesarCompra(){
        
    }
    
    public void agregarAlCarrito(){
        
    }
}
