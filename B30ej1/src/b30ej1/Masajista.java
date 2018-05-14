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
public class Masajista extends SeleccionFutbol {

    String titulacion;
    int anhosExp;

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int anhosExp) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.anhosExp = anhosExp;
    }

    @Override
    public void concentrarse() {
        JOptionPane.showMessageDialog(null, "Se concentra el masajista");
    }

    @Override
    public void viajar() {
        JOptionPane.showMessageDialog(null, "Viaja el masajista");

    }

    @Override
    public void entrenar() {
        JOptionPane.showMessageDialog(null, "Entrena el masajista");

    }

    @Override
    public void jugarPartido() {
        JOptionPane.showMessageDialog(null, "Juega el masajista");

    }

    @Override
    public String toString() {
        return "ID: "+id +", Nombre: "+nombre+", Apellidos: "+apellidos+", Edad: "+edad + 
                ", Titulacion: " + titulacion + ", Años Experiencia: " + anhosExp;
    }
    
    
}
