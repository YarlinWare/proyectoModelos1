/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.CadenaDeResponsabilidad;

/**
 *
 * @author Familia-PC
 */
public class JefeVentas extends EncargadoAprobar {

    private EncargadoAprobar siguiente;

    public EncargadoAprobar getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(EncargadoAprobar siguiente) {
        this.siguiente = siguiente;
    }

    public void solicitarAprobacion(int cantidad) {
        if (cantidad > 5) {
            System.out.println("Solicitud aprobada por el jefe de ventas");
        }
    }
}
