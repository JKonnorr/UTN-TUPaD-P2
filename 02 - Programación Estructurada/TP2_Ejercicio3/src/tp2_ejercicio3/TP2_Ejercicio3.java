/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_ejercicio3;
import java.util.Scanner;
/**
 *
 * @author Gabriel
 */
public class TP2_Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        if (edad < 12) {
            System.out.println("Sos un/a Niño/a.");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Sos un/a Adolescente.");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Sos un/a Adulto/a.");
        } else {
            System.out.println("Sos un/a Adulto/a mayor.");
        }
    }
    
}
