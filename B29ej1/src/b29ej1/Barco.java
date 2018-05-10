/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b29ej1;

/**
 *
 * @author quique
 */
public abstract class Barco {

    float eslora;
    String matricula;
    private float modulo;
    int dias;

    public Barco(float eslora, String matricula,int dias) {
        this.eslora = eslora;
        this.matricula = matricula;
        this.dias = dias;
    }
    

    public abstract void aluguer(Barco b);

//    public float moduloBase() {
//        return modulo = eslora * 10;
//    }
//    
//    public void calcularPrecio(){}
}
