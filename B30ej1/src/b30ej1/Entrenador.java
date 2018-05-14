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
public class Entrenador extends SeleccionFutbol {

    int idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, int idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public void planificarEntrenamiento() {
    }

    @Override
    public void concentrarse() {
        JOptionPane.showMessageDialog(null, "Se concentra el entrenador");
    }

    @Override
    public void viajar() {
        JOptionPane.showMessageDialog(null, "Viaja el entrenador");

    }

    @Override
    public void entrenar() {
        JOptionPane.showMessageDialog(null, "Entrena el entrenador");

    }

    @Override
    public void jugarPartido() {
        JOptionPane.showMessageDialog(null, "Juega el entrenador");

    }

    @Override
    public String toString() {
        return "ID: "+id +", Nombre: "+nombre+", Apellidos: "+apellidos+", Edad: "+edad+", ID Federacion: " + idFederacion;
    }
}
