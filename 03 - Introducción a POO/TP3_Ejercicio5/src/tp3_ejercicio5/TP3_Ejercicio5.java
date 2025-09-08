/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_ejercicio5;

/**
 *
 * @author Gabriel
 */
public class TP3_Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Crear la nave
        NaveEspacial nave1 = new NaveEspacial();
        nave1.setNombre("Apollo 2025");

        // Mostrar estado inicial
        nave1.mostrarEstado();

        // Intentar avanzar sin recargar
        nave1.avanzar(30);

        // Recargar combustible
        nave1.recargarCombustible(50);

        // Intentar despegar y luego avanzar correctamente
        nave1.despegar();
        nave1.avanzar(20);

        // Estado final
        nave1.mostrarEstado();
    }
}
