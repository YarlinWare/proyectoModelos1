/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Moto;

import Logica.Observer.Modelo;

/**
 *
 * @author thord
 */
public class fabricaVistaMoto {
    public static VistaMoto construir(String ventana,Modelo modelo){
        switch(ventana){
            case "carrito":
                return new VistaMotoCarrito(modelo);
            case "catalogo":
                return new VistaMotoCatalogo(modelo);
            default:
                return null;
        }
    }
}
