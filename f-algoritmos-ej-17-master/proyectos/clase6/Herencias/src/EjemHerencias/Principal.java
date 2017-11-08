/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemHerencias;

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
        Asignatura_Presencial a_p = new Asignatura_Presencial("Programación", "Común", 100, 180);
        System.out.println(a_p);
        
        Asignatura_Distancia a_d = new Asignatura_Distancia("Literatura", "Troncal", 300, 6);
        System.out.println(a_d);
    }
    
}
