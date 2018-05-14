/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b30ej1;

/**
 *
 * @author quique
 */
public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol {

    int id;
    String nombre;
    String apellidos;
    int edad;

    public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Apellidos: " + apellidos + ", Edad: " + edad;
    }
    
    
    

}
