/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ejercicio2;

/**
 *
 * @author Gabriel
 */
public class Mascota {
    String nombre;
    String especie;
    int edad;
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }
        
        public void cumplirAnios() {
        edad++;
        System.out.println(nombre + " ha cumplido un año más. Ahora tiene " + edad + " años.");
    }
}
