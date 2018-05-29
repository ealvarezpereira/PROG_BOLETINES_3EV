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
public class JefeDeZona extends Empregado {

    String despacho;
    Secretario s;
    List<Vendedores> listaVendedores = new ArrayList<Vendedores>();
    Coche c;

    public JefeDeZona(String nombre, String apellidos, String dni, String direccion,
            String telefono, double salario, String despacho, Secretario s,
            ArrayList<Vendedores> listaVendedores, Coche c) {

        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.despacho = despacho;
        this.s = s;
        this.listaVendedores = listaVendedores;
        this.c = c;
    }

    @Override
    public String imprimir() {

        return null;
    }

    @Override
    public void incrementarSalario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void cambiarDeSecretario(){
    this.s = new Secretario("Pacho","Ramirez","222","Calle false","489341",30000.0,"PachoElDespacho","543887");
    }
    
    public void cambiarDeCoche(){
    this.c = new Coche("1300GTR","Nissan","GTR-R35");
    }
    
    public void darDeAltaVendedor(){}
    
    public void darDeBajaVendedor(){}

    private static class Vendedores {

        String nombre;
        String dni;

        public Vendedores(String nombre, String dni) {
            this.nombre = nombre;
            this.dni = dni;
        }
    }

}
