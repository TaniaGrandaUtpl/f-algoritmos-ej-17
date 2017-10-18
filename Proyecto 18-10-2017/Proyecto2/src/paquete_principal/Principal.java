/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_principal;

import institucion.Asignatura;
import personal_docente.Docente;
import personal_docente.Titulo;
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
        Asignatura a = new Asignatura();
        Asignatura a1 = new Asignatura();
        Asignatura a2 = new Asignatura();
        Asignatura a3 = new Asignatura();
        
        a.establecer_nombre("Matemáticas");
        a.establecer_creditos(8);
        a1.establecer_nombre("Fisica");
        a1.establecer_creditos(6);
        a2.establecer_nombre("Sociales");
        a2.establecer_creditos(9);
        a3.establecer_nombre("Literatura");
        a3.establecer_creditos(10);
        
        
        Titulo t = new Titulo();
        Titulo t1 = new Titulo();
        Titulo t2 = new Titulo();
        Titulo t3 = new Titulo();
        
        t.establecer_nombre("Licenciado en Físico Matemáticas");
        t.establecer_nombre_universidad("Universidad Politécnica");
        t1.establecer_nombre("Magister en Docencia Matemática");
        t1.establecer_nombre_universidad("Universidad Valenciana");
        t2.establecer_nombre("Licenciado en Ciencias Sociales");
        t2.establecer_nombre_universidad("Universidad Salesiana");
        t3.establecer_nombre("Magister en Docencia Social");
        t3.establecer_nombre_universidad("Universidad Cataluña");
        
        Docente d = new Docente();
        d.establecer_nombres("Luis V.");
        d.establecer_apellidos("Perez J.");
        d.establecer_asignatura_1(a);
        d.establecer_asignatura_2(a1);
        d.establecer_titulo_3er_nivel(t);
        d.establecer_titulo_4to_nivel(t1);
        
        Docente d1 = new Docente();
        d1.establecer_nombres("Ana M.");
        d1.establecer_apellidos("Velez P.");
        d1.establecer_asignatura_1(a2);
        d1.establecer_asignatura_2(a3);
        d1.establecer_titulo_3er_nivel(t2);
        d1.establecer_titulo_4to_nivel(t3);
        
        System.out.println(d);
        System.out.println(d1);
    }
    
}
