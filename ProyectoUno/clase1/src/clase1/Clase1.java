/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Clase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num, res;
        System.out.println("Ingrese un numero: ");
        num = s.nextInt();
        System.out.println("Tabla de Multiplicar del: "+num);
        for (int i = 0; i <= 12; i++) {
            res = num*i;
            System.out.println(num+"*"+i+"="+res);
        }
    }
    
}
