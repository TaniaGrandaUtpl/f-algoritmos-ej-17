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
public class Asignatura_Presencial extends Asignatura {
    private int num_horas;

    public int getNum_horas() {
        return num_horas;
    }

    public void setNum_horas(int n_h) {
        num_horas = n_h;
    }

    public Asignatura_Presencial(String n, String t, double c, int n_h) {
        super(n, t, c);
        num_horas = n_h;
    }

    @Override
    public String toString() {
        return String.format("\nAsignatura Presencial:\n"
                + "%s\n Número horas:%s", super.toString(), getNum_horas());
    }
    
    
    
}
