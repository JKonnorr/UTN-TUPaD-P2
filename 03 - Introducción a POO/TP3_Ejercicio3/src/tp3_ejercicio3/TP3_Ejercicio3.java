/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_ejercicio3;

/**
 *
 * @author Gabriel
 */
public class TP3_Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro libro1 = new Libro();
        
        
        libro1.setTitulo("1984");
        libro1.setAutor("George Orwell");

        // Mostrar información
        libro1.mostrarInfo();

        // Intentar modificar con un año inválido
        libro1.setAñoPublicacion(-100);  // No debería aplicarse
        libro1.mostrarInfo();

        // Modificar con un año válido
        libro1.setAñoPublicacion(1949);

        // Mostrar información final
        System.out.println("Información final del libro:");
        libro1.mostrarInfo();
    }
    
}
