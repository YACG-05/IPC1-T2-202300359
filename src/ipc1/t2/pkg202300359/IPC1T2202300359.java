/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ipc1.t2.pkg202300359;

import java.util.Scanner;

/**
 *
 * @author yuryc
 */
public class IPC1T2202300359 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar; 
        
        do {
            System.out.print("Ingrese el primer numero: ");
            double numero1 = scanner.nextDouble();
            
            System.out.print("Ingrese el segundo numero: ");
            double numero2 = scanner.nextDouble();
            
            System.out.print("Ingrese la operacion (suma, resta, multiplicacion, division): ");
            String operacion = scanner.next();
            
            switch (operacion) {
                case "suma":
                    System.out.printf("Resultado: %.2f\n", (numero1 + numero2));
                    break;
                case "resta":
                    System.out.printf("Resultado: %.2f\n", (numero1 - numero2));
                    break;
                case "multiplicacion":
                    System.out.printf("Resultado: %.2f\n", (numero1 * numero2));
                    break;
                case "division":
                    if (numero2 == 0) {
                        System.out.println("Error: No se puede dividir por cero.");
                    } else {
                        System.out.printf("Resultado: %.2f\n", (numero1 / numero2));
                    }
                    break;
                default:
                    System.out.println("Operacion no soportada. Use suma, resta, multiplicacion o division.");
                    break;
            }
            
            System.out.print("Desea realizar otra operacion? (si/no): ");
            continuar = scanner.next();
            
        } while (continuar.equalsIgnoreCase("si"));
        
        System.out.println("Calculadora cerrada. Gracias por usarla.");
        scanner.close();
    }
    
}
