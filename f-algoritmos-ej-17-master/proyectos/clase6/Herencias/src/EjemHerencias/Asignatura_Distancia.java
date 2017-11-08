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
public class Asignatura_Distancia extends Asignatura{
    private int num_creditos;

    public int getNum_creditos() {
        return num_creditos;
    }

    public void setNum_creditos(int n_c) {
        num_creditos = n_c;
    }

    public Asignatura_Distancia(String n, String t, double c, int n_c) {
        super(n, t, c);
        num_creditos = n_c;
    }

    @Override
    public String toString() {
        return String.format("Asignatura Distancia:\n"
                + "%s\n Numero Creditos:%s", super.toString(), getNum_creditos());
    }
    
    
}
