/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Estrategia;

import Logica.Motos;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import database.MotosDB;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class GenerarPDFDetallado extends DocumentoDetallado{

    @Override
    void generarDocumentoDetallado() {
        try {
            System.out.println("Generar documento simple");
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(GenerarPDFSimple.class.getName()).log(Level.SEVERE, null, ex);
        }
        List<Motos> listamotos = new ArrayList<Motos>();
        
        listamotos.add(new Motos(900, "Yamaha","FSZ","2021","Rojo"));
        listamotos.add(new Motos(900, "Yamaha","FSZ","2021","Azul"));        
        listamotos.add(new Motos(900, "Yamaha","FSZ","2021","Negro"));
        listamotos.add(new Motos(900, "Yamaha","FSZ","2021","Gris"));
        listamotos.add(new Motos(900, "Yamaha","FSZ","2021", "Verde"));
        
        System.out.println("Se encontraron "+listamotos.size()+" registros");
        
       
        Motos m = new Motos() {};
        MotosDB motosdb = new MotosDB();
        ResultSet res = null;
        
        try {
            crearPDF(listamotos);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GenerarPDFSimple.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(GenerarPDFSimple.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void crearPDF(List<Motos> lista) throws FileNotFoundException, DocumentException, BadElementException {
        // Se crea el documento
        Document documento = new Document();
        
        // El OutPutStream para el fichero donde crearemos el PDF
        FileOutputStream ficheroPDF = new FileOutputStream("ListaMotosDetallado.pdf");
        
        // Se asocia el documento de OutPutStream
        PdfWriter.getInstance(documento, ficheroPDF);
        
        // Se abre el documento
        documento.open();
        
        // Titulo
        Paragraph titulo = new Paragraph("Motos detalle \n\n",
                FontFactory.getFont("arial",
                                    22,
                                    Font.BOLD,
                                    BaseColor.RED
                                    )
        );
        
        // Parrafo
        Paragraph parrafo = new Paragraph(""
                + "A continuación se lista de manera general "
                + "el consolidado de motos diponibles en nuestro consecionario."
                + "\n\n",
                FontFactory.getFont("arial",
                                    12,
                                    Font.PLAIN,
                                    BaseColor.GRAY
                                    )
        );        
        
        // Creamos una tabla
        PdfPTable tabla = new PdfPTable(5);
        tabla.addCell("Linea");
        tabla.addCell("Marca");
        tabla.addCell("Color");
        tabla.addCell("Modelo");
        tabla.addCell("Valor");                
        
        for(int i = 0 ; i < lista.size() ; i++) {
            tabla.addCell(lista.get(i).getLinea());
            tabla.addCell(lista.get(i).getMarca());
            tabla.addCell(lista.get(i).getColor());
            tabla.addCell(String.valueOf(lista.get(i).getModelo()));
            tabla.addCell(String.valueOf(lista.get(i).getPrecio()));
        }
        
           
        
        
        
        // Añadimos el titulo, arrafo y tabla al documento
        documento.add(titulo);
        documento.add(parrafo);
        
        // Instanciando Imagen
        try {    
            Image imagen = Image.getInstance("fotografias/Bajaj/Boxer/Bajaj-Boxer-boxerct100cargo.png");
            imagen.setAlignment(Element.ALIGN_CENTER);
            imagen.setAbsolutePosition(0f, 0f);
            //imagen.scaleAbsoluteHeight(450f);            
            //imagen.scaleAbsoluteWidth(600f);
            documento.add(imagen);
        } catch (BadElementException ex) {
            Logger.getLogger(GenerarPDFDetallado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GenerarPDFDetallado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        documento.add(tabla);
        System.out.println("Se añade información de las motos almacenadas en la base de datos");
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(GenerarPDFSimple.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Se cierra el documento
        documento.close();        
        System.out.println("Se realiza el cierre del documento");
    }
    
    public void listaDeMotos(){
        /*
        List<Motos> listamotos = new ArrayList<Motos>();
        
        for (int i = 0; i < listamotos.size(); i++) {
                listamotos.add(new Motos(9,"Campo1","Campo2","Campo3",""));
            }*/
    }
}