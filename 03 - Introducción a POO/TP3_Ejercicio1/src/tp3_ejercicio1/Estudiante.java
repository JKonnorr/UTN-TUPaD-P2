/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ejercicio1;

/**
 *
 * @author Gabriel
 */
public class Estudiante {
    
    String nombre;
    String apellido;
    String curso;
    double calificacion;
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificación: " + calificacion);
    }
    public void subirCalificacion(double puntos) {
        calificacion += puntos;
        System.out.println("Se aumentó la calificación en " + puntos + " puntos.");
    }
    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        if (calificacion < 0) {
            calificacion = 0; // para que no sea negativa
        }
        System.out.println("Se redujo la calificación en " + puntos + " puntos.");
    }
}   
