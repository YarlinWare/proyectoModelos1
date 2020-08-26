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
public class MotocicletaElectrica extends Motocicleta implements Cloneable{
    
    
    int potencia;

    public MotocicletaElectrica(String id,String marca, String linea, String modelo,String color,int precio, String descipcion,int potencia,String imagen,int cantidad) {
        super(id,marca, linea, modelo, descipcion,imagen,precio,cantidad);
        this.categoria = "Electrica";
        this.potencia = potencia;
        
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

     @Override
    public Motocicleta clone() {
        MotocicletaElectrica motoClone = null;
        try {
            motoClone = (MotocicletaElectrica) super.clone();
            motoClone.setCategoria(categoria);
            motoClone.setColor(color);
            motoClone.setDescripcion(descripcion);
            motoClone.setId(id);
            motoClone.setImagen(imagen);
            motoClone.setLinea(linea);
            motoClone.setMarca(marca);
            motoClone.setModelo(modelo);
            motoClone.setPrecio(precio);
            motoClone.setPotencia(potencia);
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
