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
public abstract class EncargadoAprobar {

    protected EncargadoAprobar siguiente;

    public void setSiguiente(EncargadoAprobar siguiente) {
        this.siguiente = siguiente;
    }

    public void solicitarAprobacion(Venta venta, Usuario usuario) {
    }
;
}
