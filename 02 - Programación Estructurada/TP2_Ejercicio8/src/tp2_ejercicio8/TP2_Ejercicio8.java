/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ejercicio8;
import java.util.Scanner;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class TP2_Ejercicio8 {
    
   
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = scanner.nextDouble() / 100;

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = scanner.nextDouble() / 100;

        double precioFinal = calcularPrecioFinal(impuesto, descuento);

        System.out.println("El precio final del producto es: $" + precioFinal);
        
    }
    
    static double calcularPrecioFinal(double impuesto, double descuento){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = scanner.nextDouble();
        
        double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        return precioFinal;
    }
}
