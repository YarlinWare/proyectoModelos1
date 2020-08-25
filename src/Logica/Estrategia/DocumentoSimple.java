/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Estrategia;

/**
 *
 * @author ASUS
 */
public abstract class DocumentoSimple implements InterfaceStrategy{
    
    public void generarDocumento(){
        generarDocumentoSimple();
    }
    
    abstract void generarDocumentoSimple();
}
