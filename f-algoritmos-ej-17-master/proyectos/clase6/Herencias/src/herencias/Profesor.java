/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author Usuario
 */
public class Profesor extends Persona{
    private double sueldo;

    public Profesor(String n, String a, int e, double s) {
        super(n, a, e);
        setSueldo(s);
    }
    
    @Override
    public void setEdad(int e){
        if(e<30){
            edad = 30;
        }else{
            edad = e;
        }
    }
    
    public Profesor(double s) {
        super("Rene", "Elzialde", 34);
        setSueldo(s);
    }

    public Profesor() {
        super("Rita", "Eras", 34);
    }
       
    public void setSueldo(double s){
        sueldo = s;
    }
    
    public double get_Sueldo(){
        return sueldo;
    }

    @Override
    public String toString() {
        return String.format("%s - %f", super.toString(), get_Sueldo());
    }
    
    
}
