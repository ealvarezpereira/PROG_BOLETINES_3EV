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
public class Futbolista extends SeleccionFutbol {

    int dorsal;
    String demarcacion;

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    @Override
    public void concentrarse() {
        JOptionPane.showMessageDialog(null, "Se concentra el futbolista");
    }

    @Override
    public void viajar() {
        JOptionPane.showMessageDialog(null, "Viaja el futbolista");

    }

    @Override
    public void entrenar() {
        JOptionPane.showMessageDialog(null, "Entrena el futbolista");

    }

    @Override
    public void jugarPartido() {
        JOptionPane.showMessageDialog(null, "Juega el futbolista");

    }

    @Override
    public String toString() {
        return "ID: "+id +", Nombre: "+nombre+", Apellidos: "+apellidos+", Edad: "+edad+
                ", Dorsal: " + dorsal + ", Demarcacion: " + demarcacion;
    }
    
    

}
