/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;
import EjemHerencias.Asignatura_Presencial;
/**
 *
 * @author reroes
 */
public class Herencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Estudiante e = new Estudiante("Juan", "Salinas", 24, 100.2);
//        System.out.println(e);
//        
//        Profesor p = new Profesor("Rene", "Elizalde", 28, 50.55);
//        System.out.println(p);
//        
//        Profesor p1 = new Profesor(1000.1);
//        System.out.println(p1.getNombre());
//        
//        Profesor p2 = new Profesor();
//        System.out.println(p2.getNombre()); 
        Asignatura_Presencial a_s[] = new Asignatura_Presencial[2];
        a_s[0]=new Asignatura_Presencial("Programacion", "Comun", 100, 180);
        a_s[1]=new Asignatura_Presencial("Literatura", "Troncal", 300, 200);
        
        Estudiante e = new Estudiante("Tania", "Granda", 20, a_s);
        
        System.out.println(e);
        
    }
    
}
