/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo3;

/**
 *
 * @author Usuario
 */
public class Computadora {
    private double velocidad_procesador; // variable global
    
    public void establecer_velocidad_procesador(double velo){//establece un valor
//        velocidad_procesador = velo;
        if (velo > 5){
            velocidad_procesador = 5.0;
        }else{
            velocidad_procesador = velo;
        }
    }
    
    public double obtener_velocidad_procesador(){//retorna un valor
        return velocidad_procesador;
    }
    
    @Override
    public String toString(){  //sobrescribir un metodo
        String cadena = String.format("Computadora con\n"
                + "velocidad %f", obtener_velocidad_procesador());
        
        String cadena1 = String.format("Computadora con\n"
                + "velocidad %f", velocidad_procesador);
        return cadena1;
    }
}
