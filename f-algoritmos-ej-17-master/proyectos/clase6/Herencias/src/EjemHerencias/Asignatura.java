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
public class Asignatura {
    private String nombre;
    private String tipo;
    private double costo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        tipo = t;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double c) {
        costo = c;
    }

    public Asignatura(String n, String t, double c) {
        nombre = n;
        tipo = t;
        costo = c;
    }

    @Override
    public String toString() {
        return String.format("%s\n %s\n $%s", 
                getNombre(), getTipo(), getCosto());
    }
    
    
    
    
}
