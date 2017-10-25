/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructores;

/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carrera c = new Carrera();
        System.out.println("1er CONSTRUCTOR");
        c.establecer_nombre("Informática");
        c.establecer_modalidad("Distancia");
        System.out.println(c);
        
        Carrera c1 = new Carrera("Electrónica");
        System.out.println("SEGUNDO CONSTRUCTOR");
        System.out.println(c1.obtener_nombre());
        
        Carrera c2 = new Carrera("Sistemas", "Semipresencial");
        System.out.println("TERCER CONSTRUCTOR");
        System.out.println(c2.obtener_nombre()+" "+c2.obtener_modalidad());
        c2.establecer_modalidad("Distancia");
        System.out.println(c2.obtener_modalidad());
        c2.establecer_modalidad(c2.obtener_modalidad().toUpperCase());
        System.out.println(c2.obtener_modalidad());
    }
    
}
