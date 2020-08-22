/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Logica.Modelo;
import Vistas.RegistroUsuario;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JButton;
import java.math.BigInteger;
import javax.swing.ImageIcon;

/**
 *
 * @author thord
 */
public class ControladorRegistroUsuario implements ActionListener {

    RegistroUsuario ventana;
    Modelo modelo;

    public ControladorRegistroUsuario(RegistroUsuario ventana) {
        this.ventana = ventana;
        this.modelo = ventana.getModelo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton boton = (JButton) e.getSource();
            if (boton == ventana.getjButtonIniciarSesion()) {
                //CEDULA
                String cadena = ventana.getjTextFieldCedula().getText();
                if (!isCedula(cadena)) {
                    ventana.setWarningMsg("El numero de cedula se encuentra mal dijitado.");
                    return;
                }
                long cedula = Long.parseLong(cadena);
                //NOMBRE
                String nombre = ventana.getjTextFieldNombre().getText();

                //EMAIL
                cadena = ventana.getjTextFieldCorreo().getText();
                if (!isEmail(cadena)) {
                    ventana.setWarningMsg("El Email se encuentra mal dijitado.");
                    return;
                }
                String email = cadena;
                //CARGO
                String cargo = (String) ventana.getjComboBox1().getSelectedItem();
                //USERNAME
                if (ventana.getjTextFieldUsuario().getText().length() < 5) {
                    ventana.setWarningMsg("El usuario debe tener por lo menos 5 caracteres o maximo 15.");
                    return;
                }
                String userName = ventana.getjTextFieldUsuario().getText();
                //CONTRASENA
                char password1[] = ventana.getjPasswordFieldPassword1().getPassword();
                char password2[] = ventana.getjPasswordFieldPassword2().getPassword();

                if (password1.length < 5) {
                    ventana.setWarningMsg("Contraseñas debe tener por lo menos 5 caracteres.");
                    return;
                }
                if (password1.length != password2.length) {
                    ventana.setWarningMsg("Contraseñas diferentes...");
                    return;
                }
                if (!passIguales(password1, password2)) {
                    ventana.setWarningMsg("Contraseñas diferentes...");
                    return;
                }
                cadena = ventana.getjTextFieldTelefono().getText();
                if (!isNumeric(cadena)) {
                    ventana.setWarningMsg("Numero de telefono mal escrito 'SOLO NUMEROS'.");
                    return;
                }
                if (cadena.length() <= 6 || cadena.length() >= 11) {
                    ventana.setWarningMsg("Numero de telefono mal escrito 'longitud'.");
                    return;
                }
                long telefono = Long.parseLong(cadena);
                String mensaje = modelo.registrarUsuario(cedula, nombre, email, cargo, userName, password2, telefono);
                if (mensaje.equals("true")) {
                    ventana.mensaje("Registrado.", "Exito!!", cargarImg("/img/exito.png"));
                    ventana.cerrar();
                } else {
                    ventana.mensaje("No registrado.Error: " + mensaje, "Error!!!", cargarImg("/img/error.png"));
                }
            }

        }
    }

    public ImageIcon cargarImg(String url) {
        Image imagenInterna = new ImageIcon(getClass().
                getResource(url)).getImage();
        Image newimg = imagenInterna.getScaledInstance(80, 80, Image.SCALE_SMOOTH); // scale it the smooth way
        ImageIcon icon = new ImageIcon(newimg);
        return icon;
    }

    public boolean passIguales(char[] pass1, char[] pass2) {
        for (int x = 0; x < pass1.length; x++) {
            if (pass1[x] != pass2[x]) {
                return false;
            }
        }
        return true;
    }

    public boolean isCedula(String cadena) {
        if (!isNumeric(cadena)) {
            return false;
        }
        if (cadena.length() < 4 || cadena.length() > 12) {
            return false;
        }
        return true;
    }

    public boolean isEmail(String cadena) {
        // Patrón para validar el email
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(cadena);

        return mather.find();

    }

    private boolean isNumeric(String cadena) {
        try {
            Long.parseLong(cadena);
            return true;
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
