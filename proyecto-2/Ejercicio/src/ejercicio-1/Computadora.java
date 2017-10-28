
package ejercicio1;

public class Computadora {
   
    private double velocidad_procesador; // variable global
    
    public void establecer_velocidad_procesador(double velocidad){//establece un valor
        velocidad_procesador = velocidad;
    }
    
    public double obtener_velocidad_procesador(){//retorna un valor
        return velocidad_procesador;
    }
}

