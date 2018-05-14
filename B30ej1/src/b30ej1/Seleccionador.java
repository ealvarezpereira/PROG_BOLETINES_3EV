/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b30ej1;

import javax.swing.JOptionPane;

/**
 *
 * @author quique
 */
public class Seleccionador extends SeleccionFutbol {

    public Seleccionador(int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
    }

    public void seleccionarJugador() {
    }

    @Override
    public void concentrarse() {
        JOptionPane.showMessageDialog(null, "Se concentra el seleccionador");
    }

    @Override
    public void viajar() {
        JOptionPane.showMessageDialog(null, "Viaja el seleccionador");

    }

    @Override
    public void entrenar() {
        JOptionPane.showMessageDialog(null, "Entrena el seleccionador");

    }

    @Override
    public void jugarPartido() {
        JOptionPane.showMessageDialog(null, "Juega el seleccionador");

    }
}
