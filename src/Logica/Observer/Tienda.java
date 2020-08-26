/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Observer;

import Logica.CadenaDeResponsabilidad.Aprobacion;
import Logica.CarritoCompras;
import Logica.Usuario;
import Logica.fabrica.Motocicleta;
import Logica.fabrica.MotocicletaElectrica;
import Logica.fabrica.MotocicletaGasolina;
import java.util.ArrayList;
import database.MotosDB;
import java.sql.ResultSet;
import Logica.fabrica.farbicaMotocicleta;
import database.UsuarioDB;
import java.util.Iterator;
import Logica.Decorator.Item;
import Logica.Estrategia.GenerarContexto;
import Logica.Venta;
import Vistas.Alert;
import Logica.Estrategia.GenerarPDFDetallado;
import Logica.Estrategia.GenerarPDFSencillo;
import java.sql.SQLException;
//import com.sun.org.apache.xml.internal.security.encryption.AgreementMethod;

/**
 *
 * @author thord
 */
public class Tienda extends Sujeto {

    Usuario usuario;
    ArrayList<Motocicleta> catalogo;
    CarritoCompras carritoCompra;
    GenerarPDFDetallado generarPdf;
    Venta venta;

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Tienda() {
        catalogo = new ArrayList<>();
        carritoCompra = new CarritoCompras();
    }

    public ArrayList<Motocicleta> getCatalogo() {
        actualizarCatalogo();
        return catalogo;
    }

    public ArrayList<Motocicleta> getCarritoCompra() {
        return carritoCompra.getLista();
    }

    private void actualizarCatalogo() {
        MotosDB daoMoto = new MotosDB();
        try {
            ResultSet motos = daoMoto.getMoto();
            while (motos.next()) {
                String id = motos.getString("idmoto");
                String titulo = motos.getString("linea");
                String imagen = motos.getString("imagen");
                String descripcion = motos.getString("descripcion");
                String color = motos.getString("color");
                int precio = Integer.parseInt(motos.getString("precio"));
                String categoria = motos.getString("categoria");
                int cilindraje = Integer.parseInt(motos.getString("cilindraje"));
                String marca = motos.getString("marca");
                String modelo = motos.getString("modelo");
                int cantidad = motos.getInt("cantidad");
//                System.out.println("ID:" + id + "\n" + titulo + "- \n" + categoria + "-\n" + descripcion + " \n \n");
                Motocicleta nuevaMoto = farbicaMotocicleta.construir(id, marca, titulo, modelo, color, precio, descripcion, cilindraje, categoria, imagen, cantidad);

                catalogo.add(nuevaMoto);
            }
        } catch (NumberFormatException | SQLException e) {
        }
    }

    public void comprar() {

    }

    public void ModificarMoto() {

    }

    public void ModificarCatalogo() {

    }

    public void iniciarSesion(Usuario user) {
        this.usuario = user;
        notificarUsuario();
    }

    public void cerrarSesion() {
        this.usuario = null;
        notificarUsuario();
    }

    public boolean procesarCompra() {
        Aprobacion aprobar = new Aprobacion();
        Venta venta = new Venta(getCarritoCompra());
        venta.setCantidadTotal(calcularMotosVenta());
        aprobar.solicitarAprobacion(venta, usuario);
        this.venta = venta;
        if (venta.isAprobada() == true) {
            return true;
        } else {
            return false;
        }

    }

    public int calcularMotosVenta() {
        int cantidadTotal = 0;
        ArrayList<Motocicleta> motosCompra = getCarritoCompra();
        for (int i = 0; i < motosCompra.size(); i++) {
            cantidadTotal += motosCompra.get(i).getCantidad();
        }
        return cantidadTotal;
    }

    public String agregarAlCarrito(String id) {
        if (usuario != null) {
            Motocicleta moto = buscarCatalogo(id);
            Motocicleta nuevaMoto = null;
            if (moto instanceof MotocicletaElectrica) {
                nuevaMoto = ((MotocicletaElectrica) moto).clone();
            } else if (moto instanceof MotocicletaGasolina) {
                nuevaMoto = ((MotocicletaGasolina) moto).clone();
            }
            nuevaMoto.setCantidad(1);
            carritoCompra.agregarMotocicleta(nuevaMoto);
            this.notificarUsuario();
            this.notificar();
            return "true";
        } else {
            this.notificar();
            return "null";
        }

    }

    public String quitarDelCarrito(String id) {
        if (usuario != null) {
            Motocicleta moto = carritoCompra.buscarMoto(id);
            Motocicleta nuevaMoto = null;
            if (moto instanceof MotocicletaElectrica) {
                nuevaMoto = ((MotocicletaElectrica) moto).clone();
            } else if (moto instanceof MotocicletaGasolina) {
                nuevaMoto = ((MotocicletaGasolina) moto).clone();
            }
            carritoCompra.quitarMotocicleta(nuevaMoto);
            this.notificarUsuario();
            this.notificar();
            return "true";
        } else {
            this.notificar();
            return "null";
        }
    }

    public void imprimirPropiedades() {

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

    private Motocicleta buscarCatalogo(String id) {
        for (Iterator<Motocicleta> iterator = catalogo.iterator(); iterator.hasNext();) {
            Motocicleta next = iterator.next();
            if (next.getId().equals(id)) {
                return next;
            }
        }
        return null;
    }

    public Motocicleta buscarMotoEnCarrito(String id) {
        return carritoCompra.buscarMoto(id);
    }

    public void agregarExploradoras(String id) {
        carritoCompra.agregarExploradoras(id);
        notificar();

    }

    public void agregarMaletero(String id) {
        carritoCompra.agregarMaletero(id);
        notificar();

    }

    void backUp() {
        int tamanio = carritoCompra.getTamanioBrackup();
        if (tamanio > 0) {
            carritoCompra.getBackup(tamanio - 1);
            notificar();
        } else {
            System.out.println("Error se desborda el arreglo");
        }

    }

    void eliminarMotoCarrito(String id) {
        Motocicleta moto = carritoCompra.buscarMoto(id);
        System.out.println("ID DE LA MOTO A ELIMINAR: "+ id);
        carritoCompra.borrarMotocicleta(moto);
        notificar();
    }

    public void generarPdfSencillo(){
        Motocicleta moto = catalogo.get(2);
        GenerarContexto nuevoPdf = new GenerarContexto(new GenerarPDFSencillo());
        System.out.println("Cargando Catálogo sencillo en documento pdf");
        nuevoPdf.ejecutar(catalogo);

    }
    public void generarPdfDetallado(){
        Motocicleta moto = catalogo.get(2);
       GenerarContexto nuevoPdf = new GenerarContexto(new GenerarPDFDetallado());
        System.out.println("Cargando Catálogo detallado en documento pdf");
       nuevoPdf.ejecutar(catalogo);

    }

}
