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
    List<Vendedor> listaVendedores = new ArrayList<Vendedor>();
    Coche c;

    public JefeDeZona(String nombre, String apellidos, String dni, String direccion,
            String telefono, double salario, String despacho, Secretario s,
            Coche c) {

        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.despacho = despacho;
        this.s = s;
        this.c = c;
    }

    @Override
    public String imprimir() {
        return toString();
    }

    @Override
    public void incrementarSalario() {
        salario = salario + 100.0;
    }

    public void cambiarDeSecretario() {
        this.s = new Secretario("Pacho", "Ramirez", "222", "Calle false", "489341", 30000.0, "PachoElDespacho", "543887");
    }

    public void cambiarDeCoche() {
        this.c = new Coche("1300GTR", "Nissan", "GTR-R35");
    }

    public void darDeAltaVendedor() {
        listaVendedores.add(new Vendedor("Antonio", "Lopez", "111A", "Calle falsa 123", "665449664", 2300.0, new Coche("1123DDF", "Subaru", "Impreza WRX"), "Area 1"));
    }

    public void darDeBajaVendedor() {
        listaVendedores.clear();
    }

}
