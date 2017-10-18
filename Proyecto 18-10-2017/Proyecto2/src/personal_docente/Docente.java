/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal_docente;
import institucion.Asignatura;
import personal_docente.Titulo;
/**
 *
 * @author Usuario
 */
public class Docente {
    private String nombres;
    private String apellidos;
    private Asignatura asignatura_1;
    private Asignatura asignatura_2;
    private Titulo titulo_3er_nivel;
    private Titulo titulo_4to_nivel;
    
    public void establecer_nombres(String nom){
        nombres = nom;
    }
    public String obtener_nombres(){
        return nombres;
    }
    
    public void establecer_apellidos(String apell){
        apellidos = apell;
    }
    public String obtener_apellidos(){
        return apellidos;
    }
    
    public void establecer_asignatura_1(Asignatura as_1){
        asignatura_1 = as_1;
    }
    public Asignatura obtener_asignatura_1(){
        return asignatura_1;
    }
    
    public void establecer_asignatura_2(Asignatura as_2){
        asignatura_2 = as_2;
    }
    public Asignatura obtener_asignatura_2(){
        return asignatura_2;
    }
    
    public void establecer_titulo_3er_nivel(Titulo t_3_n){
        titulo_3er_nivel = t_3_n;
    }
    public Titulo obtener_titulo_3er_nivel(){
        return titulo_3er_nivel;
    }
    
    public void establecer_titulo_4to_nivel(Titulo t_4_n){
        titulo_4to_nivel = t_4_n;
    }
    public Titulo obtener_titulo_4to_nivel(){
        return titulo_4to_nivel;
    }

    @Override
    public String toString() {
        String cadena1 = String.format("Datos Docente:\n"
                + "Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Tiene las siguientes asignaturas:\n"
                + "Asignatura 1: %s\n"
                + "Asignatura 2: %s\n"
                + "Titulo 3er nivel: %s\n "
                + "Titulo 4to nivel: %s", obtener_nombres(), obtener_apellidos(),
                obtener_asignatura_1(), obtener_asignatura_2(), obtener_titulo_3er_nivel(), obtener_titulo_4to_nivel());
        return cadena1;
    }
    
    
}
