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
public class Secretario extends Empregado {

    String despacho;
    String numFax;

    public Secretario(String nombre, String apellidos, String dni, String direccion, String telefono, double salario, String despacho, String nfax) {
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.despacho = despacho;
        this.numFax = nfax;
    }

    @Override
    public String imprimir() {

        return  "despacho=" + despacho + ", numFax=" + numFax
                + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni 
                + ", direccion=" + direccion + ", telefono=" + telefono + ", salario=" 
                + salario;
    }

    @Override
    public void incrementarSalario() {

        
    }

}
