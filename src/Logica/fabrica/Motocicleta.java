/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.fabrica;

/**
 *
 * @author thord
 */
public abstract class Motocicleta {
    String marca;
    String linea;
    String modelo;
    String imagen;
    String color;
    double precio;
    String descripcion;
    String categoria;
//    int cantidad;
    
    public Motocicleta(String marca,String linea,String modelo,String descipcion){
        this.marca = marca;
        this.linea = linea;
        this.modelo = modelo;
        this.descripcion = descipcion;
    }
    
}
