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
public class B31ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empregado em1 = new JefeDeZona("Antonio", "Lopez", "AAA3", "Direccion falsa", "666333493", 5000.0, "Despacho1", new Secretario(
                "Fernando", "Lopez", "BBB2", "Direccion cierta", "666333493", 2000.0, "Despacho secretario", "Numero fax 3"), new Coche(
                "44433DDD", "Audi", "A5"));
        
        Empregado em2 = new Secretario( "Ramiro", "Lopez", "CCC4", "Direccion falsa", "666333493", 7000.0, "Despacho secretario 2", "Numero fax 1");
        
        Empregado em3 = new Vendedor("Paco", "Lopez", "111A", "Calle falsa 123", "95439039", 10000.0, new Coche("1123DDF", "Ford", "Fiesta"), "Area 2");
          
        em1.imprimir();
        em2.imprimir();
        em3.imprimir();
        
        em1.incrementarSalario();
        em2.incrementarSalario();
        em3.incrementarSalario();

    }

}
