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
public class Carrera {
    private String nombre;
    private String modalidad;

    public Carrera(String nom, String mod) {
        nombre = nom;
        modalidad = mod;
    }

    public void establecer_nombre(String nom){
        nombre = nom;
    }

    public void establecer_modalidad(String n){
        modalidad = n;
    }
    
    public String obtener_nombre(){
        return nombre;
    }
    
    public String obtener_modalidad(){
        return modalidad;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%s\n"
                + "Modalidad: %s",
                obtener_nombre(),obtener_modalidad());
        return cadena;
    }

}
