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
       
       int num1;
       //int num2;
       int limite1;
       //int limite2;
       
        System.out.println("Ingrese el limite de su tabla");
        limite1 = entrada.nextInt();
        System.out.println("Ingrese hasta que tabla desea operar");
        num1 = entrada.nextInt();
        
       while(num1 <= limite1){
           
           
       }
       
        
        
    }
}
