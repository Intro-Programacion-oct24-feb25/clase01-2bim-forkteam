/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class ejemploWhile {
    
    public static void main(String[] args) {
    
       Scanner entrada = new Scanner(System.in);
       entrada.useLocale(Locale.US);
       
       int num1 = 1;
       int num2 = 1;
       int limite1;
       int limite2;
       
       String cadena = "";
       
        System.out.println("Ingrese el limite de su tabla");
        limite1 = entrada.nextInt();
        System.out.println("Ingrese hasta que tabla desea operar");
        limite2 = entrada.nextInt();
        
        
       while(num1 <= limite1){
           while(num2 <= limite2){
                int resultado = num1 * num2;
                cadena = String.format("%s%d * %d = %d\n",
                   cadena,
                   num1,
                   num2,
                   resultado);
                 num2 = num2 + 1;
       }
           num2 = 1;
           num1 = num1 + 1;
       }
        System.out.printf("%s",
                cadena);
       
        
        
    }
}
