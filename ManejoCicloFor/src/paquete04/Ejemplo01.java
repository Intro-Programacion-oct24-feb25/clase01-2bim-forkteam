/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import java.util.Scanner;
import paquete01.*;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        int contador = 0;
        int op;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese hasta que numero de tabla quieres realizar");
        numero = entrada.nextInt();
        while (contador < numero) {
            contador += 1;
            op = contador * numero;
            numero +=1;
            System.out.println(contador + "x" + numero + "=" + op);
        }
    }

}
