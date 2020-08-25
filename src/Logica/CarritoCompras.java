/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Logica.fabrica.Motocicleta;
import java.util.ArrayList;

/**
 *
 * @author Familia-PC
 */
public class CarritoCompras {

    ArrayList<Motocicleta> lista;

    public CarritoCompras() {
        lista = new ArrayList<>();
    }

    public ArrayList<Motocicleta> getLista() {
        return lista;
    }

    public void vaciarCarrito() {
        lista.removeAll(lista);
    }

    public void agregarMotocicleta(Motocicleta moto) {
        Motocicleta aux = buscarMoto(moto);
        if (aux != null) {
            aux.setCantidad(aux.getCantidad() + 1);
        } else {
            lista.add(moto);
        }
    }

    public Motocicleta buscarMoto(Motocicleta moto) {
        for (int i = 0; i < lista.size(); i++) {
            if (moto.getId() == lista.get(i).getId()) {
                return lista.get(i);
            }
        }
        return null;
    }

    public Motocicleta buscarMoto(String id) {
        for (int i = 0; i < lista.size(); i++) {
            if (Integer.parseInt(id) == lista.get(i).getId()) {
                return lista.get(i);
            }
        }
        return null;
    }

    public void eliminarPorId(String id) {
        Motocicleta moto = buscarMoto(id);
        if (moto.getCantidad() == 1) {
            lista.remove(moto);
        }else if(moto.getCantidad()==0){
            lista.remove(moto);
        }else if(moto.getCantidad()>1){
            moto.setCantidad(moto.getCantidad()-1);
        }
    }

}
