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
public class Asignatura {
    private String nombre;
    private int creditos;
    private Carrera carrera;
    
    public void establecer_nombre(String nom){
        nombre = nom;
    }
    public String obtener_nombre(){
        return nombre;
    }
    
    public void establecer_creditos(int cred){
        creditos = cred;
    }
    public int obtener_creditos(){
        return creditos;
    }
    
    public void establecer_carrera(Carrera carr){
        carrera = carr;
    }
    public Carrera obtener_carrera(){
        return carrera;
    }

    public Asignatura(Carrera c) {
        carrera = c;
        nombre = "Informatica";
        creditos = 5;
    }

    

    @Override
    public String toString() {
       String cadena = String.format("Asignatura:\n"
               + "Nombre: %s\n"
               + "Creditos: %s\n"
               + "Carrera: %s\n",obtener_nombre(),obtener_creditos(),obtener_carrera());
        return cadena;
    }
}
    
    
    

