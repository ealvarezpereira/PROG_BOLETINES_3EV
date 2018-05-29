/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b31ej1;

/**
 *
 * @author quique
 */
public abstract class Empregado {
    
    String nombre;
    String apellidos;
    String dni;
    String direccion;
    String telefono;
    double salario;
    int añosAntiguedad;

    public Empregado(String nombre, String apellidos, String dni, String direccion, String telefono, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
    }
    
    public abstract String imprimir();
    
    public abstract void incrementarSalario();

    
}
