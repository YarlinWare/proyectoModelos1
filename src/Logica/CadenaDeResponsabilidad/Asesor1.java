/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.CadenaDeResponsabilidad;

import Logica.Usuario;
import Logica.Venta;

/**
 *
 * @author Familia-PC
 */
public class Asesor1 extends EncargadoAprobar {

    private EncargadoAprobar siguiente;
    String mensaje;

    public EncargadoAprobar getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(EncargadoAprobar siguiente) {
        this.siguiente = siguiente;
    }

    public void solicitarAprobacion(Venta venta, Usuario usuario) {

        if (venta.getCantidadTotal() <= 5 && venta.getCantidadTotal() > 0) {
            if (usuario.getCargo().equals("ASESOR1")) {
                // Alert.mensaje(ventana, mensaje, mensaje, img);
                mensaje = "Solicitud aprobada por el " + usuario.getCargo() + " " + usuario.getNombre();
                venta.setInfoAprobacion(mensaje);
               // System.out.println(mensaje);
                venta.setAprobada(true);
            } else {
                mensaje = "Contactar al ASESOR1 para aprobar la compra";
                venta.setInfoAprobacion(mensaje);
            }
        } else {
            mensaje = "Contactar al ASESOR2";
            venta.setInfoAprobacion(mensaje);
            siguiente.solicitarAprobacion(venta, usuario);
        }
    }

}
