/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Estrategia;


import Logica.Moto;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import database.MotosDB;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Logica.Decorator.MotoDecorator;
import Logica.Tienda;
import Logica.fabrica.Motocicleta;
/**
 *
 * @author ASUS
 */
public class GenerarPDFSimple extends DocumentoSimple{

    @Override
    void generarDocumentoSimple() {
        System.out.println("Generar documento simple");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(GenerarPDFSimple.class.getName()).log(Level.SEVERE, null, ex);
        }
        List<MotoDecorator> listamotos = new ArrayList<MotoDecorator>();
        
        listamotos.add(new MotoDecorator("FSZ","Yamaha", "Rojo",900));
        listamotos.add(new MotoDecorator("FSZ","Yamaha", "Azul",900));        
        listamotos.add(new MotoDecorator("FSZ","Yamaha", "Negro",900));
        listamotos.add(new MotoDecorator("FSZ","Yamaha", "Gris",900));
        listamotos.add(new MotoDecorator("FSZ","Yamaha", "Verde",900));
        
        System.out.println("Se encontraron "+listamotos.size()+" registros");
        
        Moto m = new Moto() {};
        MotosDB motosdb = new MotosDB();
        ResultSet res = null;
        try {
            res = motosdb.getMoto();
        } catch (SQLException ex) {
            Logger.getLogger(GenerarPDFSimple.class.getName()).log(Level.SEVERE, null, ex);
        }
        try  {
            if (res.next()){
                
            }            
        }catch(Exception e){
            
        }finally {            

        }
        
        try {
            crearPDF(listamotos);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GenerarPDFSimple.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(GenerarPDFSimple.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void crearPDF(List<MotoDecorator> lista) throws FileNotFoundException, DocumentException {
        // Se crea el documento
        Document documento = new Document();
        
        // El OutPutStream para el fichero donde crearemos el PDF
        FileOutputStream ficheroPDF = new FileOutputStream("ListaMotosSimple.pdf");
        
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
                + "La lista de motos diponibles en nuestro consecionario."
                + "\n\n",
                FontFactory.getFont("arial",
                                    12,
                                    Font.PLAIN,
                                    BaseColor.GRAY
                                    )
        );        
        
        // Creamos una tabla
        PdfPTable tabla = new PdfPTable(4);
        tabla.addCell("Marca");
        tabla.addCell("Linea");
        tabla.addCell("Modelo");
        tabla.addCell("Valor");                
        
        for(int i = 0 ; i < lista.size() ; i++) {
            tabla.addCell(lista.get(i).getModelo());
            tabla.addCell(lista.get(i).getMarca());
            tabla.addCell(lista.get(i).getColor());
            tabla.addCell(String.valueOf(lista.get(i).getPrecio()));
        }
        
        // Añadimos el titulo, arrafo y tabla al documento
        documento.add(titulo);
        documento.add(parrafo);
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
        List<MotoDecorator> listamotos = new ArrayList<MotoDecorator>();
        
        for (int i = 0; i < listamotos.size(); i++) {
                listamotos.add(new MotoDecorator("Campo1","Campo2","Campo3",9));
            }
    }
    
}
