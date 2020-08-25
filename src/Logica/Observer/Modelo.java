/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Observer;

import Logica.Decorator.MotocicletaExploradoras;
import Logica.Decorator.MotocicletaMaletero;
import Logica.Usuario;
import java.util.ArrayList;
import Logica.fabrica.*;
import Vistas.VentanaMenu;
import Vistas.Moto.VistaMoto;
import Vistas.Moto.fabricaVistaMoto;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import database.UsuarioDB;
import Vistas.IniciarSesion;
import Vistas.RegistroUsuario;
import Vistas.Alert;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory;
import javax.swing.BoxLayout;
import javax.swing.event.ChangeListener;
import Logica.Decorator.Item;
//import com.sun.org.apache.xml.internal.security.encryption.AgreementMethod;

/**
 *
 * @author thord
 */
public class Modelo implements Observer {

    public static ImageIcon EXITO;
    public static ImageIcon ERROR;
    public static ImageIcon ONLINE;
    public static ImageIcon OFFLINE;
    private IniciarSesion ventanaInicioSesion;
    private RegistroUsuario ventanaRegistro;
    private VentanaMenu ventanaMenu;
    private Tienda tienda;

    public Modelo() {
        tienda = new Tienda();
        tienda.getObservadores().add(this);
        this.ventanaInicioSesion = null;
        this.ventanaRegistro = null;
        this.EXITO = cargarImg("/img/exito.png", 80, 80);
        this.ERROR = cargarImg("/img/error.png", 80, 80);
        this.ONLINE = cargarImg("/img/online.png", 20, 20);
        this.OFFLINE = cargarImg("/img/offline.png", 20, 20);

    }

    public void agregarAlCarrito(String id) {
        String mensaje = tienda.agregarAlCarrito(id);
        if (mensaje == "null") {
            Alert.mensaje(getVentana(), "PORFAVOR INICIAR SESION", "Error!", ERROR);
        }

    }

    public void modificarMoto(String id) {

    }

    public void iniciarSesion(String usuario, char[] password) {

        String user = "";
        String clave = "";
        String nombre = "";
        String correo = "";
        String cargo = "";
        long cedula = 0;
        long telefono = 0;

        try {
            UsuarioDB usuarioDB = new UsuarioDB();
            usuarioDB.getUsuarioByUsuario(usuario);
            ResultSet usu = usuarioDB.getUsuarioByUsuario(usuario);
            System.out.println(usu);
            while (usu.next()) {
                cedula = usu.getLong("cedula");
                nombre = usu.getString("nombre");
                correo = usu.getString("correo");
                telefono = usu.getLong("telefono");
                cargo = usu.getString("cargo");
                user = usu.getString("usuario");
                clave = usu.getString("password");

            }
            System.out.println(user);
            if (usu != null) {

//                String user = usu.getString("usuario");
//                String clave = usu.getString("password");
                if (usuario.equals(user)) {
                    String pass = "";
                    for (int i = 0; i < password.length; i++) {
                        pass += password[i];
                    }
                    if (pass.equals(clave)) {
                        Usuario us = new Usuario(cedula, nombre, correo, cargo, user, pass, telefono);

                        tienda.iniciarSesion(us);
                        Alert.mensaje(getVentanaIniciarSesion(), "Has iniciado sesion : " + nombre, "Iniciar sesion", EXITO);
                        getVentanaIniciarSesion().cerrar();
                    } else {
                        Alert.mensaje(getVentanaIniciarSesion(), "Contraseña incorrecta", "Error contraseña", ERROR);
                    }
                } else {
                    Alert.mensaje(getVentanaIniciarSesion(), "Usuario no encontrado", "Error usuario", ERROR);
                }
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void cerrarSesion() {
        tienda.cerrarSesion();
    }

    public void registrarUsuario(long cedula, String nombre, String correo, String cargo, String userName, char[] password, long telefono) {
        String mensaje = tienda.registrarUsuario(cedula, nombre, correo, cargo, userName, password, telefono);
        if (mensaje.equals("true")) {
            Alert.mensaje(getVentanaRegistro(), "Registrado.", "Exito!!", EXITO);
            getVentanaRegistro().cerrar();
        } else {
            Alert.mensaje(getVentanaRegistro(), "No registrado.Error: " + mensaje, "Error!!!", ERROR);
        }

    }

    public void cargarVentanaMenu() {
        ArrayList<Motocicleta> listaMotos = tienda.getCatalogo();
        getVentana().getjPanelCatalogo().setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        int gridx = 0, gridy = 0;

        for (int x = 0; x < listaMotos.size(); x++) {
            VistaMoto a = fabricaVistaMoto.construir("catalogo", this);
            String id = listaMotos.get(x).getId() + "";
            a.setId(id);
            //per...
            a.getjLabelTituloMoto().setText("<html>" + listaMotos.get(x).getLinea() + "</html>");
            a.getjPanelTitulo().setPreferredSize(new Dimension(300, listaMotos.get(x).getLinea().length() / 2));
            a.getjLabelDescripcion().setText("<html>" + listaMotos.get(x).getDescripcion() + "</html>");
            a.getjPanelDescripcion().setPreferredSize(new Dimension(10, listaMotos.get(x).getDescripcion().length() / 2));

            try {

                Image imagenInterna = new ImageIcon(getClass().
                        getResource(listaMotos.get(x).getImagen())).getImage();
                Image newimg = imagenInterna.getScaledInstance(250, 180, Image.SCALE_SMOOTH); // scale it the smooth way
                ImageIcon icon = new ImageIcon(newimg);
                a.getjLabelImagen().setIcon(icon);
                a.getjLabelImagen().setHorizontalAlignment(a.getjLabelImagen().CENTER);
                a.getjLabelImagen().setVerticalAlignment(a.getjLabelImagen().CENTER);
                a.getjLabelImagen().setText("");
            } catch (Exception e) {
            }

            gbc.gridx = gridx;
            gbc.gridy = gridy;
            gbc.gridwidth = 1;
            gbc.gridheight = 1;
            gbc.weightx = 1.0;
            gbc.weighty = 1.0;
            gbc.fill = GridBagConstraints.BOTH;
            getVentana().getjPanelCatalogo().add(a, gbc);

            if (gridx == 1) {
                gridy += 1;
                gridx = 0;
            } else {
                gridx += 1;
            }
            getVentana().getjPanelCatalogo().setPreferredSize(new Dimension(600, gridy * 450));
            a.setClassName();
            a.eventos();
        }

        getVentana().getjPanelCatalogo().revalidate();
        getVentana().getjPanelCatalogo().repaint();
    }

    public VentanaMenu getVentana() {
        if (ventanaMenu == null) {
            this.ventanaMenu = new VentanaMenu(this);
        }
        return ventanaMenu;
    }

    public IniciarSesion getVentanaIniciarSesion() {
        if (ventanaInicioSesion == null) {
            ventanaInicioSesion = new IniciarSesion(getVentana(), true, this);
        }
        return ventanaInicioSesion;
    }

    public RegistroUsuario getVentanaRegistro() {
        if (ventanaRegistro == null) {
            ventanaRegistro = new RegistroUsuario(getVentana(), true, this);
        }
        return ventanaRegistro;
    }

    public void ventanaIniciarSesion() {
        getVentanaIniciarSesion().setVisible(true);
    }

    public void ventanaRegistro() {
        getVentanaRegistro().setVisible(true);
    }

    public ImageIcon cargarImg(String url, int x, int y) {
        Image imagenInterna = new ImageIcon(getClass().
                getResource(url)).getImage();
        Image newimg = imagenInterna.getScaledInstance(x, y, Image.SCALE_SMOOTH); // scale it the smooth way
        ImageIcon icon = new ImageIcon(newimg);
        return icon;
    }

    public void iniciar() {
        getVentana().setLocationRelativeTo(null);
        getVentana().setVisible(true);
        getVentana().getjLabelImagenEstado().setIcon(OFFLINE);
        cargarVentanaMenu();

    }

    @Override
    public void update() {
        actualizarCarrito();

    }

    private void actualizarCarrito() {
        ArrayList<Motocicleta> listaMotos = tienda.getCarritoCompra();
        getVentana().getjPanelCarritoCompra().removeAll();
        getVentana().getjPanelCarritoCompra().setLayout(new BoxLayout(getVentana().getjPanelCarritoCompra(), BoxLayout.PAGE_AXIS));
        int gridy = 1;
        for (int x = 0; x < listaMotos.size(); x++) {

            VistaMoto a = fabricaVistaMoto.construir("carrito", this);
            String id = listaMotos.get(x).getId() + "";
            a.setId(id);
            System.out.println("OBJETO DE TIPO:" + listaMotos.get(x));
            //per...
            a.getjLabelTituloMoto().setText("<html>" + listaMotos.get(x).getLinea() + "</html>");
            a.getjPanelTitulo().setPreferredSize(new Dimension(300, listaMotos.get(x).getLinea().length() / 2));
            a.getjLabelDescripcion().setText("<html>" + listaMotos.get(x).getDescripcion() + "</html>");
            a.getjPanelDescripcion().setPreferredSize(new Dimension(10, listaMotos.get(x).getDescripcion().length() / 2));
            a.configSnipper(0, 50);
            a.getjSpinnerCantidad().setValue(listaMotos.get(x).getCantidad());

            a.getjLabelPrecio().setText("$ " + listaMotos.get(x).getPrecio());
            a.getjLabelTotal().setText("$ " + new BigDecimal(listaMotos.get(x).getTotal()));
            if (listaMotos.get(x) instanceof MotocicletaMaletero) {
                a.getjCheckBoxMaletero().setSelected(true);
                a.getjCheckBoxMaletero().setEnabled(false);
                a.getjCheckBoxExploradoras().setEnabled(false);
            }
            if (listaMotos.get(x) instanceof MotocicletaExploradoras) {
                a.getjCheckBoxExploradoras().setSelected(true);
                a.getjCheckBoxExploradoras().setEnabled(false);
                a.getjCheckBoxMaletero().setEnabled(false);
            }
            
            try {

                Image imagenInterna = new ImageIcon(getClass().
                        getResource(listaMotos.get(x).getImagen())).getImage();
                Image newimg = imagenInterna.getScaledInstance(250, 180, Image.SCALE_SMOOTH); // scale it the smooth way
                ImageIcon icon = new ImageIcon(newimg);
                a.getjLabelImagen().setIcon(icon);
                a.getjLabelImagen().setHorizontalAlignment(a.getjLabelImagen().CENTER);
                a.getjLabelImagen().setVerticalAlignment(a.getjLabelImagen().CENTER);
                a.getjLabelImagen().setText("");
            } catch (Exception e) {
            }

            getVentana().getjPanelCarritoCompra().add(a);

            getVentana().getjPanelCarritoCompra().setPreferredSize(new Dimension(800, gridy * 250));
            a.setClassName();
            a.eventos();
            gridy += 1;
        }

        getVentana().getjPanelCarritoCompra().revalidate();
        getVentana().getjPanelCarritoCompra().repaint();
    }

    private void agregarMotoPorId(String id) {
        tienda.agregarAlCarrito(id);

    }

    private void quitarMotoPorId(String id) {
        tienda.quitarDelCarrito(id);
    }

    public void agregarExploradoras(String id) {
        tienda.agregarExploradoras(id);

    }

    public void agregarMaletero(String id) {
        tienda.agregarMaletero(id);

    }

    @Override
    public void updateUsuario() {
        actualizarAcceso(tienda.getUsuario());

    }

    public void actualizarAcceso(Usuario usuario) {
        if (usuario != null) {
            getVentana().getjLEspacioCargo().setVisible(true);
            getVentana().getjLabelEspacioNombre().setVisible(true);
            getVentana().getjLabelNombre().setVisible(true);
            getVentana().getJlabelCargo().setVisible(true);
            String cargo = usuario.getCargo();
            switch (cargo) {
                case "ASESOR1":
                    getVentana().getJlabelCargo().setText(usuario.getCargo());
                    getVentana().getjLabelNombre().setText(usuario.getNombre());
                    getVentana().getjLabelImagenEstado().setIcon(ONLINE);
                    getVentana().getjMenuItemIniciarSesion().setEnabled(false);
                    getVentana().getjMenuItemCerrarSesion().setEnabled(true);
                    getVentana().getjMenuItemModificarCatalogo().setEnabled(false);
                    getVentana().getjMenuItemRegistrarNuevoUsuario().setEnabled(false);
                    getVentana().getjMenuItemSalirApp().setEnabled(true);
                    break;

                case "ASESOR2":
                    getVentana().getJlabelCargo().setText(usuario.getCargo());
                    getVentana().getjLabelNombre().setText(usuario.getNombre());
                    getVentana().getjLabelImagenEstado().setIcon(ONLINE);
                    getVentana().getjMenuItemIniciarSesion().setEnabled(false);
                    getVentana().getjMenuItemCerrarSesion().setEnabled(true);
                    getVentana().getjMenuItemModificarCatalogo().setEnabled(false);
                    getVentana().getjMenuItemRegistrarNuevoUsuario().setEnabled(false);
                    getVentana().getjMenuItemSalirApp().setEnabled(true);
                    break;

                case "JEFE":
                    getVentana().getJlabelCargo().setText(usuario.getCargo());
                    getVentana().getjLabelNombre().setText(usuario.getNombre());
                    getVentana().getjLabelImagenEstado().setIcon(ONLINE);
                    getVentana().getjMenuItemIniciarSesion().setEnabled(false);
                    getVentana().getjMenuItemCerrarSesion().setEnabled(true);
                    getVentana().getjMenuItemModificarCatalogo().setEnabled(true);
                    getVentana().getjMenuItemRegistrarNuevoUsuario().setEnabled(false);
                    getVentana().getjMenuItemSalirApp().setEnabled(true);
                    break;

                case "ADMINISTRADOR":
                    getVentana().getJlabelCargo().setText(usuario.getCargo());
                    getVentana().getjLabelNombre().setText(usuario.getNombre());
                    getVentana().getjLabelImagenEstado().setIcon(ONLINE);
                    getVentana().getjMenuItemIniciarSesion().setEnabled(false);
                    getVentana().getjMenuItemCerrarSesion().setEnabled(true);
                    getVentana().getjMenuItemModificarCatalogo().setEnabled(true);
                    getVentana().getjMenuItemRegistrarNuevoUsuario().setEnabled(true);
                    getVentana().getjMenuItemSalirApp().setEnabled(true);
                    break;

                default:

                    break;
            }
        } else {
            getVentana().getjLabelImagenEstado().setIcon(OFFLINE);
            getVentana().getjMenuItemIniciarSesion().setEnabled(true);
            getVentana().getjMenuItemCerrarSesion().setEnabled(false);
            getVentana().getjMenuItemModificarCatalogo().setEnabled(false);
            getVentana().getjMenuItemRegistrarNuevoUsuario().setEnabled(false);
            getVentana().getjMenuItemSalirApp().setEnabled(true);
            getVentana().getjLEspacioCargo().setVisible(false);
            getVentana().getjLabelEspacioNombre().setVisible(false);
            getVentana().getjLabelNombre().setVisible(false);
            getVentana().getJlabelCargo().setVisible(false);
        }

    }

    public void actualizarCantidadMoto(String id, int cantidad) {

        Motocicleta moto = tienda.buscarMotoEnCarrito(id);
        if (cantidad > moto.getCantidad()) {
            agregarMotoPorId(id);
        } else if (cantidad < moto.getCantidad()) {
            quitarMotoPorId(id);
        }
    }

}
