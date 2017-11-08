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
public class Estudiante extends Persona{
    private Asignatura_Presencial[] asignaturas_presenciales;

    public Asignatura_Presencial[] getAsignaturas_presenciales() {
        return asignaturas_presenciales;
    }

    public void setAsignaturas_presenciales(Asignatura_Presencial[] a_p) {
        asignaturas_presenciales = a_p;
    }

    public Estudiante(String n, String a, int e, Asignatura_Presencial[] a_p) {
        super(n, a, e);
        asignaturas_presenciales = a_p;
    }
    
    @Override
    public void setEdad(int e){
        if(e<18){
            edad = 18;
        }else{
            edad = e;
        }
    }
    
    public double obtener_valor_matricula(){
        int valor=0;
        for (int i = 0; i < asignaturas_presenciales.length; i++) {
            valor += asignaturas_presenciales[i].getCosto();  
        }
        return valor;
    }
    
    public String obtener_cadena(){
        String valor = "";
        for (int i = 0; i < asignaturas_presenciales.length; i++) {
            valor += asignaturas_presenciales[i];  
        }
        return valor;
        
        
    }
    
    @Override
    public String toString(){
    
        return String.format("%s\n"
                + "Costo Matricula: %s\n"
                + "\nListado de Asignaturas: %s\n", super.toString(),obtener_valor_matricula(), obtener_cadena());
    }
    
    
    // @Override
    // public String toString(){
    
    //    return String.format("%s - %f", getApellido(), getMatricula());
    // }
}
