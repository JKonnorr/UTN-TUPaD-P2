/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ejercicio13;

/**
 *
 * @author Gabriel
 */
public class TP2_Ejercicio13 {

    
    public static void main(String[] args) {
         // a. Declarar e inicializar el array
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // b. Mostrar precios originales con función recursiva
        System.out.println("Precios originales:");
        mostrarRecursivo(precios, 0);

        // c. Modificar el precio de un producto específico (ej: índice 2)
        precios[2] = 129.99;

        // d. Mostrar precios modificados con otra función recursiva
        System.out.println("Precios modificados:");
        mostrarRecursivo(precios, 0);
    }
    public static void mostrarRecursivo(double[] array, int indice) {
        // Caso base
        if (indice == array.length) {
            return;
        }
        // Mostrar el precio en la posición actual
        System.out.println("Precio: $" + array[indice]);

        // Llamada recursiva para el siguiente índice
        mostrarRecursivo(array, indice + 1);
    }
}
