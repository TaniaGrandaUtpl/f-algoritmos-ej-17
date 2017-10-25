/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;


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
        Carrera c = new Carrera("Contabilidad", "Presencial");
        Carrera c1 = new Carrera("Economía", "Distancia");
        
        Asignatura a = new Asignatura(c);
        Asignatura a1 = new Asignatura(c1); 
        
        System.out.println(a);
        System.out.println(a1);
        
        
    }
    
}
