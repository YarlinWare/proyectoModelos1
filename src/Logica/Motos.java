/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author ASUS
 */
public class Motos {
    int idMoto;
    int precio;
    String marca;
    String linea;
    String modelo;
    String imagen;
    String color;    
    String descripcion;
    String categoria;
    int cilindraje;
    int cantidad;

    public Motos() {
    }

    public Motos(int idMoto, int precio, String marca, String linea, String modelo, String imagen, String descripcion, String categoria, int cilindraje, int cantidad) {
        this.idMoto = idMoto;
        this.precio = precio;
        this.marca = marca;
        this.linea = linea;
        this.modelo = modelo;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.cilindraje = cilindraje;
        this.cantidad = cantidad;
    }
    
    

    public int getIdMoto() {
        return idMoto;
    }

    public int getPrecio() {
        return precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getLinea() {
        return linea;
    }

    public String getModelo() {
        return modelo;
    }

    public String getImagen() {
        return imagen;
    }

    public String getColor() {
        return color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setIdMoto(int idMoto) {
        this.idMoto = idMoto;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
}
