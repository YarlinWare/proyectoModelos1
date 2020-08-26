/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Logica.Decorator.MotocicletaExploradoras;
import Logica.Decorator.MotocicletaMaletero;
import Logica.Memento.Memento;
import Logica.fabrica.Motocicleta;
import Logica.fabrica.MotocicletaElectrica;
import Logica.fabrica.MotocicletaGasolina;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Familia-PC
 */
public class CarritoCompras {

    ArrayList<Motocicleta> lista;
    Memento memento;

    public CarritoCompras() {
        lista = new ArrayList<>();
        memento = new Memento();
    }

    public ArrayList<Motocicleta> getLista() {
        return lista;
    }

    public void vaciarCarrito() {
        generarBackup();
        lista.removeAll(lista);
    }

    public void agregarMotocicleta(Motocicleta moto) {

        generarBackup();
        Motocicleta aux = buscarMoto(moto);
        if (aux != null) {
            if (aux instanceof MotocicletaElectrica || aux instanceof MotocicletaGasolina) {
                int cantidad = aux.getCantidad();
                int pos = lista.indexOf(aux);
                lista.remove(aux);
                moto.setCantidad(cantidad + 1);
                lista.add(pos, moto);
            }else{
                lista.add(moto);
            }

        } else {
            lista.add(moto);
        }
    }
    
    public void borrarMotocicleta(Motocicleta moto){
        generarBackup();
//        System.out.println("MOTO A ELIMINAR: "+moto.getId());
        System.out.println(lista.remove(moto));
    }

    public void quitarMotocicleta(Motocicleta moto) {
        generarBackup();
        Motocicleta aux = buscarMoto(String.valueOf(moto.getId()));
        if (moto.getCantidad() == 1) {
            lista.remove(aux);
        } else if (moto.getCantidad() == 0) {
            lista.remove(aux);
        } else if (moto.getCantidad() > 1) {
            int cantidad = aux.getCantidad();
            int pos = lista.indexOf(aux);
            lista.remove(aux);
            moto.setCantidad(cantidad - 1);
            lista.add(pos, moto);
        }
    }

    public Motocicleta buscarMoto(Motocicleta moto) {
        for (int i = 0; i < lista.size(); i++) {
            if (moto.getId().equals(lista.get(i).getId())) {
                return lista.get(i);
            }
        }
        return null;
    }

    public Motocicleta buscarMoto(String id) {
        for (int i = 0; i < lista.size(); i++) {
            if (id.equals(lista.get(i).getId())) {
                return lista.get(i);
            }
        }
        return null;
    }

    public void agregarMaletero(String id) {
        generarBackup();
        int x = 0;
        for (Motocicleta Moto : lista) {
            if (Moto.getId().equals(id)) {
                Moto = new MotocicletaMaletero(Moto);
                Moto.setId(Moto.getId()+"maletero"+x);
                lista.set(x, Moto);
            }
            x++;
        }
    }

    public void agregarExploradoras(String id) {
        generarBackup();
        int x = 0;
        for (Motocicleta Moto : lista) {
            if (Moto.getId().equals(id)) {
                Moto = new MotocicletaExploradoras(Moto);
                Moto.setId(Moto.getId()+"exploradoras"+x);
                lista.set(x, Moto);
            }
            x++;
        }
    }

    //CONTROLADOR DEL MEMENTO
    public void generarBackup() {
        memento.setBackup(lista);
        System.out.println("Se genero un backUp: " + memento.getSize());
    }

    public void getBackup(int i) {
        System.out.println("Lamando al backup: " + i);
        lista = new ArrayList<>();
        memento.getBackup(i).forEach((temp) -> {
            System.out.println("Tamanio moto:" + temp.getId() + " -- " + temp.getCantidad());
            lista.add(temp);
        });
        memento.eliminarBackip(lista);
    }

    public int getTamanioBrackup() {
        return memento.getSize();
    }

}
