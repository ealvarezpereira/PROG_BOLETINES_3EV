/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b28ej1;

import javax.swing.JOptionPane;

/**
 *
 * @author quique
 */
public class Alumno {

    private String nombre = "Quique";
    private int nota = 9;
    Direccion dir = new Direccion();

    public Alumno() {
    }

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }

    public void mostrar() {

        System.out.println(dir.toString());
    }

    public void cambiar() {
        dir.cambiarCalle();
    }

    private class Direccion {

        private String calle = "Camiño do Outeiro";
        private int numero = 17;

        public Direccion() {
        }

        public Direccion(String calle, int numero) {
            this.calle = calle;
            this.numero = numero;
        }

        public String getCalle() {
            return calle;
        }

        public int getNumero() {
            return numero;
        }

        public void cambiarCalle() {
            calle = JOptionPane.showInputDialog("Nueva calle:");
        }

        @Override
        public String toString() {
            return "Calle: " + calle + ", Número: " + numero;
        }

    }

    public void cambiarNota() {
        nota = Integer.parseInt(JOptionPane.showInputDialog("Nueva nota:"));
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Nota: " + nota;
    }

}
