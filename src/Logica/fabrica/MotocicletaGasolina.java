/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.fabrica;

/**
 *
 * @author thord
 */
public class MotocicletaGasolina extends Motocicleta implements Cloneable {

    int cilindraje;

    public MotocicletaGasolina(String id, String marca, String linea, String modelo, String color, int precio, String descipcion, int cilindraje, String imagen, int cantidad) {
        super(id, marca, linea, modelo, descipcion, imagen, precio, cantidad);
        this.categoria = "Gasolina";
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public Motocicleta clone() {
        MotocicletaGasolina motoClone = null;
        try {
            motoClone = (MotocicletaGasolina) super.clone();
            motoClone.setCategoria(categoria);
            motoClone.setColor(color);
            motoClone.setDescripcion(descripcion);
            motoClone.setId(id);
            motoClone.setImagen(imagen);
            motoClone.setLinea(linea);
            motoClone.setMarca(marca);
            motoClone.setModelo(modelo);
            motoClone.setPrecio(precio);
            motoClone.setCilindraje(cilindraje);
            motoClone.setCantidad(cantidad);
            motoClone.setTotal(total);
        } catch (Exception e) {
            System.out.println("Error al clonar"+e.getMessage());
        }
        return motoClone;
    }

    @Override
    public double getTotal() {
        return cantidad*precio;
    }

}
