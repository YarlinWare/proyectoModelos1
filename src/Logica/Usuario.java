/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author thord
 */
public class Usuario {
    private int cedula;
    private String nombre;
    private String correo;
    private String cargo;
    private String username;
    private String password;
    private int telefono;

    public Usuario(int cedula,String nombre,String correo,String cargo,String userName,String password, int telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
        this.cargo = cargo;
        this.username = userName;
        this.password = password;
        this.telefono = telefono;
    }
    
    
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
  

    
    
}
