
package ejemplos2;

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
}
