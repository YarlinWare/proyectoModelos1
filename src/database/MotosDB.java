/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Logica.Motos;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author ASUS
 */
public class MotosDB {
    Connection cn = ConexionDB.getConnection();
    
    public MotosDB() {
        //cn = new ConexionDB();
    }

    public ResultSet getMotoById(int id) throws SQLException {
//        PreparedStatement pstm = ConexionDB.getConnection();
        PreparedStatement pstm = cn.prepareStatement("SELECT "
                + " idmoto, "
                + " marca, "
                + " linea, "
                + " modelo, "
                + " imagen, "
                + " color, "
                + " precio,"
                + " descripcion,"
                + " cilindraje,"
                + " categoria,"
                + " cantidad "
                + " FROM moto "
                + " WHERE idmoto = ? ");
        pstm.setInt(1, id);

        ResultSet res = pstm.executeQuery();
        /*
         res.close();	
         */

        return res;
    }

    /**
     * trae todos los registros de la tabla Moto
     */
    public ResultSet getMoto() throws SQLException {
        PreparedStatement pstm = cn.prepareStatement("SELECT "
                + " idmoto, "
                + " marca, "
                + " linea, "
                + " modelo, "
                + " imagen, "
                + " color, "
                + " precio,"
                + " descripcion,"
                + " cilindraje,"
                + " categoria,"
                + " cantidad "
                + " FROM moto"
                + " ORDER BY marca, linea, modelo ");


        ResultSet res = pstm.executeQuery();
        return res;
    }

    public void insertarMoto(Motos m) {
        try {
            PreparedStatement pstm = cn.prepareStatement("insert into moto "
                    + "(marca, "
                    + " linea,"
                    + " modelo,"
                    + " imagen,"
                    + " color,"
                    + " precio,"
                    + " descripcion,"
                    + " cilindraje,"
                    + " cantidad,"
                    + " categoria)"
                    + " values(?,?,?,?,?,?,?,?,?,?)");
            pstm.setString(1, m.getMarca());
            pstm.setString(2, m.getLinea());
            pstm.setString(3, m.getModelo());
            pstm.setString(4, m.getImagen());
            pstm.setString(5, m.getColor());
            pstm.setInt(6, m.getPrecio());
            pstm.setString(7, m.getDescripcion());
            pstm.setInt(8, m.getCilindraje());
            pstm.setInt(9, m.getCantidad());
            pstm.setString(10, m.getCategoria());

            pstm.executeUpdate();


        } catch (SQLException e) {
            System.out.println(e);
        }

    }
    
    public void actualizarMoto(Motos m) {

        try {            
            PreparedStatement pstm = cn.prepareStatement("update moto set "
                    + " marca = ?, "
                    + " linea = ?,"
                    + " modelo = ?,"
                    + " imagen = ?,"
                    + " color = ?,"
                    + " precio = ?,"
                    + " descripcion = ?,"
                    + " cilindraje = ?,"
                    + " cantidad = ?,"
                    + " categoria = ?"
                    + " where idmoto = ?");
            pstm.setString(1, m.getMarca());
            pstm.setString(2, m.getLinea());
            pstm.setString(3, m.getModelo());
            pstm.setString(4, m.getImagen());
            pstm.setString(5, m.getColor());
            pstm.setInt(6, m.getPrecio());
            pstm.setString(7, m.getDescripcion());
            pstm.setInt(8, m.getCilindraje());
            pstm.setInt(9, m.getCantidad());
            pstm.setString(10, m.getCategoria());
            
            

            pstm.executeUpdate();


        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void borrarMoto(Motos m) {

        try {
            PreparedStatement pstm = cn.prepareStatement("delete from moto "
                    + " where idmoto = ?");

            pstm.setInt(1, m.getIdMoto());

            pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }


    }
    
    
}
