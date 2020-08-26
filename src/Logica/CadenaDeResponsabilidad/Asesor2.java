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
public class Asesor2 extends EncargadoAprobar {

    private EncargadoAprobar siguiente;
    String mensaje;

    public EncargadoAprobar getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(EncargadoAprobar siguiente) {
        this.siguiente = siguiente;
    }

    public void solicitarAprobacion(Venta venta, Usuario usuario) {
        if (venta.getCantidadTotal() > 5 && venta.getCantidadTotal() <= 10) {
            if (usuario.getCargo().equals("ASESOR2")) {
                mensaje = "Solicitud aprobada por el "+usuario.getCargo()+" "+usuario.getNombre();
                venta.setInfoAprobacion(mensaje);
                venta.setAprobada(true);
            } else {
                mensaje = "Contactar al ASESOR2 para aprobar la compra";
                venta.setInfoAprobacion(mensaje);
            }
        } else {
            mensaje = "Contactar al Jefe de ventas";
            venta.setInfoAprobacion(mensaje);
            siguiente.solicitarAprobacion(venta, usuario);
        }
    }
}
