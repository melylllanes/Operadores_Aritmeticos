/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author melissa.a.lopez
 */
public class Calculadora {


    public double suma(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public double resta(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public double multiplicacion(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public double division(double numero1, double numero2) {
        return numero1 / numero2;
    }
    
     public double modulo(double numero1, double numero2) {
        return numero1 % numero2;
    }


    public static void main(String[] args) {
        // TODO code application logic here
        
        double numero1;
        double numero2;
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Numero 1: ");
        numero1 = sc.nextDouble();
        System.out.println("Numero 2: ");
        numero2 = sc.nextDouble();


        Calculadora calc = new Calculadora();
        
        
        System.out.println("X: " + numero1);
        System.out.println("Y: " + numero2);

        System.out.println("Suma: " + (calc.suma(numero1, numero2)));
        System.out.println("Resta: " + (calc.resta(numero1, numero2)));
        System.out.println("Multiplicación: " + (calc.multiplicacion(numero1, numero2)));
        System.out.println("División: " + (calc.division(numero1, numero2)));
        System.out.println("Módulo: " + (calc.modulo(numero1, numero2)));


    }

}
