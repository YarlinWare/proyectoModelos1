/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Estrategia;

import Logica.fabrica.Motocicleta;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public interface InterfaceStrategy {
    void generarDocumento(ArrayList<Motocicleta> catalogo);
}
