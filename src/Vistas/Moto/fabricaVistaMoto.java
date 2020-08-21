/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Moto;

/**
 *
 * @author thord
 */
public class fabricaVistaMoto {
    public static VistaMoto construir(String ventana){
        switch(ventana){
            case "carrito":
                return new VistaMotoCarrito();
            case "catalogo":
                return new VistaMotoCatalogo();
            default:
                return null;
        }
    }
}
