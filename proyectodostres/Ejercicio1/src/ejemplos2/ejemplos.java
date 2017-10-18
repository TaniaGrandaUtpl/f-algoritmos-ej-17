
package ejemplos2;

public class ejemplos {

    public static void main(String[] args) {
        
        ejemplos2.Computadora c = new ejemplos2.Computadora();
        System.out.println(c.obtener_velocidad_procesador());
        c.establecer_velocidad_procesador(8.0);
        System.out.println(c.obtener_velocidad_procesador());
    }
    
}
