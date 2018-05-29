/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b31ej1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author quique
 */
public class Vendedor extends Empregado {

    Coche c;
    String areaVenta;
    List<Clientes> listaclientes = new ArrayList<Clientes>();

    public Vendedor(String nombre, String apellidos, String dni, String direccion, String telefono, double salario, Coche c, String areaVenta, ArrayList<Clientes> listaClientes) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.c = c;
        this.areaVenta = areaVenta;
        this.listaclientes = listaClientes;
    }

    public void altaNuevoCliente() {
        listaclientes.add(new Clientes("ELPEPAS", "1234"));
    }

    public void bajaCliente() {

    }

    public void cambiarDeCoche() {
        this.c = new Coche("1221FGT", "Lamborghini", "Gallardo");
    }

    @Override
    public String imprimir() {
        return "Coche=" + c + ", areaVenta=" + areaVenta + ", listaclientes=" + listaclientes + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni
                + ", direccion=" + direccion + ", telefono=" + telefono + ", salario="
                + salario;
    }

    @Override
    public void incrementarSalario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class Clientes {

        String nombre;
        String dni;

        public Clientes(String nombre, String dni) {
            this.nombre = nombre;
            this.dni = dni;
        }
    }
}
