/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ejercicio4;
import java.util.Scanner;
/**
 *
 * @author Gabriel
 */
public class TP2_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Pedir datos
        System.out.print("Ingresa el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingresa la categoría del producto (A, B o C): ");
        char categoria = scanner.next().toUpperCase().charAt(0);

        double descuentoPorcentaje = 0;

        switch (categoria) {
            case 'A':
                descuentoPorcentaje = 10;
                break;
            case 'B':
                descuentoPorcentaje = 15;
                break;
            case 'C':
                descuentoPorcentaje = 20;
                break;
            default:
                System.out.println("Categoría no válida.");
                scanner.close();
                return;
        }

        double montoDescuento = precio * (descuentoPorcentaje / 100);
        double precioFinal = precio - montoDescuento;

        System.out.println("Precio original: $" + precio);
        System.out.println("Descuento aplicado: " + descuentoPorcentaje + "%");
        System.out.println("Monto del descuento: $" + montoDescuento);
        System.out.println("Precio final: $" + precioFinal);
    }
    
}
