/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Logica.Decorator.Casco;
import Logica.Decorator.Impermeable;
import Logica.Decorator.ObjetosPedido;
import Logica.Decorator.Pedido;
import Logica.fabrica.Motocicleta;
import Logica.fabrica.farbicaMotocicleta;
import Vistas.Moto.fabricaVistaMoto;
import java.util.ArrayList;
import database.MotosDB;
import java.sql.ResultSet;
import Logica.fabrica.farbicaMotocicleta;
import database.UsuarioDB;
import java.math.BigInteger;

/**
 *
 * @author thord
 */
public class Tienda {

    Usuario usuario;
    ArrayList<Motocicleta> catalogo;
    ArrayList carritoCompra;

    public Tienda() {
        catalogo = new ArrayList<>();
    }

    public ArrayList<Motocicleta> getCatalogo() {
        actualizarCatalogo();
        return catalogo;
    }

    private void actualizarCatalogo() {
        MotosDB daoMoto = new MotosDB();
        try {
            ResultSet motos = daoMoto.getMoto();
            while (motos.next()) {
                int id = Integer.parseInt(motos.getString("idmoto"));
                String titulo = motos.getString("linea");
                String imagen = motos.getString("imagen");
                String descripcion = motos.getString("descripcion");
                String color = motos.getString("color");
                int precio = Integer.parseInt(motos.getString("precio"));
                String categoria = motos.getString("categoria");
                int cilindraje = Integer.parseInt(motos.getString("cilindraje"));
                String marca = motos.getString("marca");
                String modelo = motos.getString("modelo");
//                System.out.println("ID:" + id + "\n" + titulo + "- \n" + categoria + "-\n" + descripcion + " \n \n");
                Motocicleta nuevaMoto = farbicaMotocicleta.construir(id, marca, titulo, modelo, color, precio, descripcion, cilindraje, categoria, imagen);

                catalogo.add(nuevaMoto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void agregarCasco() {
        ObjetosPedido pedido = new Pedido();
        pedido = new Casco(pedido);
        System.out.println(pedido.getDescripcion());
        System.out.println("Precio : " + pedido.getPrecio());
    }

    public void agregarImpermeable() {
        ObjetosPedido pedido = new Pedido();
        pedido = new Impermeable(pedido);
        System.out.println(pedido.getDescripcion());
        System.out.println("Precio : " + pedido.getPrecio());
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

    }

    public void agregarAlCarrito() {

    }

    void registrarUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String registrarUsuario(long cedula, String nombre, String correo, String cargo, String userName, char[] password, long telefono) {
        try {
            UsuarioDB usuarioDB = new UsuarioDB();
            return usuarioDB.insertarUsuario(cedula, nombre, correo, cargo, userName, password, telefono);
            
        } catch (Exception e) {
            return e.getMessage();
        }

    }
}
