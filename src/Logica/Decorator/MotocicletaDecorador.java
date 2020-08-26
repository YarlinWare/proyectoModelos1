/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Decorator;

import Logica.fabrica.Motocicleta;

/**
 *
 * @author Familia-PC
 */
public abstract class MotocicletaDecorador implements Item {

    private Motocicleta moto;

    public MotocicletaDecorador(Motocicleta moto) {
        this.moto = moto;
    }

    protected Motocicleta getMoto() {
        return moto;
    }

    public int getCantidad() {
        return moto.getCantidad();
    }

    public void setCantidad(int cantidad) {
        moto.setCantidad(cantidad);
    }

    public String getId() {
        return moto.getId();
    }

    public void setId(String id) {
        moto.setId(id);
    }

    public void setTotal(double total) {
        moto.setTotal(total);
    }

    public String getMarca() {
        return moto.getMarca();
    }

    public void setMarca(String marca) {
        moto.setMarca(marca);
    }

    public String getLinea() {
        return moto.getLinea();
    }

    public void setLinea(String linea) {
        moto.setLinea(linea);
    }

    public String getModelo() {
        return moto.getModelo();
    }

    public void setModelo(String modelo) {
        moto.setModelo(modelo);
    }

    public String getImagen() {
        return moto.getImagen();
    }

    public void setImagen(String imagen) {
        moto.setImagen(imagen);
    }

    public String getColor() {
        return moto.getColor();
    }

    public void setColor(String color) {
        moto.setColor(color);
    }

    public double getPrecio() {
        return moto.getPrecio();
    }

    public void setPrecio(double precio) {
        moto.setPrecio(precio);
    }

    public String getDescripcion() {
        return moto.getDescripcion();
    }

    public void setDescripcion(String descripcion) {
        moto.setDescripcion(descripcion);
    }

    public String getCategoria() {
        return moto.getCategoria();
    }

    public void setCategoria(String categoria) {
        moto.setCategoria(categoria);
    }

}
