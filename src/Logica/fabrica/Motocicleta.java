/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.fabrica;

import Logica.Decorator.Item;

/**
 *
 * @author thord
 */
public abstract class Motocicleta implements Cloneable, Item {

    String id;
    String marca;
    String linea;
    String modelo;
    String imagen;
    String color;
    protected double precio;
    String descripcion;
    String categoria;
    int cantidad;
    double total;

    //Patron decorator...
    private Motocicleta moto;

    public Motocicleta(Motocicleta moto) {
        this.id = moto.getId();
        this.marca = moto.getMarca();
        this.linea = moto.getLinea();
        this.modelo = moto.getModelo();
        this.imagen = moto.getImagen();
        this.color = moto.getColor();
        this.precio = moto.getPrecio();
        this.descripcion = moto.getDescripcion();
        this.categoria = moto.getCategoria();
        this.cantidad = moto.getCantidad();
        this.total = moto.getTotal();
        this.moto = moto;
    }

    protected Motocicleta getMoto() {
        return moto;
    }
    //-----------------------------------------

    //FABRICA CONCRETA-------------------------
    public Motocicleta(String id, String marca, String linea, String modelo, String descipcion, String imagen, double precio, int cantidad) {
        this.id = id;
        this.marca = marca;
        this.linea = linea;
        this.modelo = modelo;
        this.descripcion = descipcion;
        this.imagen = imagen;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public void setTotal(double total) {
        this.total = total;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
