/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_ejercicio2;

/**
 *
 * @author Gabriel
 */
public class TP3_Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mascota mascota1 = new Mascota();
        
        mascota1.nombre = "Firulais";
        mascota1.edad = 2;
        mascota1.especie = "Perro";

        // Mostrar la información 
        mascota1.mostrarInfo();

        // Simular el paso del tiempo
        mascota1.cumplirAnios();
        mascota1.mostrarInfo();

        mascota1.cumplirAnios();
        mascota1.mostrarInfo();
    
    }
    
}
