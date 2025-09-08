/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_ejercicio1;

/**
 *
 * @author Gabriel
 */
public class TP3_Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Estudiante estudiante1 = new Estudiante();
        
        estudiante1.nombre = "Gabriel";
        estudiante1.apellido = "Ledesma";
        estudiante1.curso = "Programacion 2";
        estudiante1.calificacion = 6.0;

        // Mostramos la información inicial
        estudiante1.mostrarInfo();

        // Subimos la calificación y mostramos
        estudiante1.subirCalificacion(1.0);
        estudiante1.mostrarInfo();

        // Bajamos la calificación y mostramos
        estudiante1.bajarCalificacion(2.0);
        estudiante1.mostrarInfo();
    }
    
}
