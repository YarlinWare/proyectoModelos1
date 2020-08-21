/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.fabrica;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author thord
 */

//    String marca;
//    String linea;
//    String modelo;
//    String imagen;
//    String color;
//    double precio;
//    String descripcion;
//    String categoria;


public class farbicaMotocicleta {
    public static Motocicleta construir(String marca, String linea, String modelo,String color,int precio, String descipcion,int potencia,String tipo){
        switch(tipo){
            case "gasolina":
                return new MotocicletaGasolina(marca,linea,modelo,color,precio,descipcion,potencia);
            case "electrica":
                return new MotocicletaElectrica(marca,linea,modelo,color,precio,descipcion,potencia);
            default:
                return null;
        }
    }
}
