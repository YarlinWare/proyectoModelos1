/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;
import Logica.fabrica.*;
import Vistas.Moto.VistaMoto;
import Vistas.Moto.VistaMotoCatalogo;
import Vistas.VentanaMenu;
import Vistas.Moto.VistaMoto;
import Vistas.Moto.VistaMotoCarrito;
import Vistas.Moto.fabricaVistaMoto;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

/**
 *
 * @author thord
 */
public class Modelo {

    private VentanaMenu ventanaMenu;
    private Tienda tienda;

    public Modelo() {
        tienda = new Tienda();
    }

    public void cargarVentanaMenu() {
//        getVentana().getjPanelCatalogo().setLayout(new GridBagLayout());
//
//        getVentana().getjPanelCatalogo().setPreferredSize(new Dimension(830, 500));
//        for (int x = 0; x < 10; x++) {
//            VistaMoto a = fabricaVistaMoto.construir("catalogo");
//            getVentana().getjPanelCatalogo().add(a);
//        }

        VistaMoto a = fabricaVistaMoto.construir("catalogo");
        getVentana().getjPanelCatalogo().add(a);

        getVentana().getjPanelCatalogo().revalidate();
        getVentana().getjPanelCatalogo().repaint();
    }

    public VentanaMenu getVentana() {
        if (ventanaMenu == null) {
            this.ventanaMenu = new VentanaMenu(this);
        }
        return ventanaMenu;
    }

    public void iniciar() {
        getVentana().setLocationRelativeTo(null);
        getVentana().setVisible(true);
        cargarVentanaMenu();
    }

}
