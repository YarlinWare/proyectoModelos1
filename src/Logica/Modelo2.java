/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Logica.CadenaDeResponsabilidad.Aprobacion;
import Logica.Decorator.Casco;
import Logica.Decorator.Impermeable;
import Logica.Decorator.ObjetosPedido;
import Logica.Decorator.Pedido;
import java.util.ArrayList;

/**
 *
 * @author thord
 */
public class Modelo2 {

    Usuario usuario;
    ArrayList catalogo;
    ArrayList carritoCompra;

    public void listarCatalogo() {
        //....
    }

    public void listarMotos() {

    }

    public void comprar() {

    }

    public void ModificarMoto() {

    }

    public void ModificarCatalogo() {

    }

    public void iniciarSesion() {

    }

    public void cerrarSesion() {

    }

    public void procesarCompra() {
      Aprobacion aprobar = new Aprobacion();
      aprobar.solicitarAprobacion(1);
    }

    public void agregarAlCarrito() {

    }

    public void agregarCasco() {
        ObjetosPedido pedido = new Pedido();
        pedido = new Casco(pedido);
        System.out.println(pedido.getDescripcion());
        System.out.println("Precio : "+ pedido.getPrecio());
    }
    public void agregarImpermeable() {
        ObjetosPedido pedido = new Pedido();
        pedido = new Impermeable(pedido);
        System.out.println(pedido.getDescripcion());
        System.out.println("Precio : "+ pedido.getPrecio());
    }
}
