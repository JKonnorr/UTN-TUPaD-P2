/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_ejercicio4;

/**
 *
 * @author Gabriel
 */
public class TP3_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gallina gallina1 = new Gallina();
        gallina1.setIdGallina(1);
        gallina1.setEdad(2);
        gallina1.setHuevosPuestos(5);
        
        Gallina gallina2 = new Gallina();
        gallina2.setIdGallina(2);
        gallina2.setEdad(1);
        gallina2.setHuevosPuestos(0);
        
        
        // Mostrar estado inicial
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();

        // Simular acciones
        gallina1.ponerHuevo();
        gallina1.envejecer();

        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.envejecer();

        // Mostrar estado final
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    }
    
}
