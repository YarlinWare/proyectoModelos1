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
    public static Motocicleta construir(String id,String marca, String linea, String modelo,
            String color,int precio, String descipcion,int potencia,String tipo,String imagen,int cantidad){
        switch(tipo){
            case "Gasolina":
                return new MotocicletaGasolina(id,marca,linea,modelo,color,precio,descipcion,potencia,imagen,cantidad);
            case "Electrica":
                return new MotocicletaElectrica(id,marca,linea,modelo,color,precio,descipcion,potencia,imagen,cantidad);
            default:
                return null;
        }
    }
}
