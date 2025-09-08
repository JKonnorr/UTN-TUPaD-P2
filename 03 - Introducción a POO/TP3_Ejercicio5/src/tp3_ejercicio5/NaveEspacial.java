/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ejercicio5;

/**
 *
 * @author Gabriel
 */
public class NaveEspacial {
    // Atributos
    private String nombre;
    private int combustible;

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    // Método despegar
    public void despegar() {
            System.out.println("La nave " + nombre + " ha despegado.");
        }

    // Método avanzar
    public void avanzar(int distancia) {
        int consumo = distancia * 2; // 2 unidades por cada km
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println("La nave " + nombre + " avanzó " + distancia + " km.");
        } else {
            System.out.println("Combustible insuficiente para avanzar " + distancia + " km.");
        }
    }

    // Método recargar combustible
    public void recargarCombustible(int cantidad) {
        int limite = 200;
        if (combustible + cantidad > limite) {
            combustible = limite;
            System.out.println("Combustible recargado al máximo (" + limite + ").");
        } else {
            combustible += cantidad;
            System.out.println("Se recargaron " + cantidad + " unidades de combustible.");
        }
    }

    // Método mostrar estado
    public void mostrarEstado() {
        System.out.println("Nave: " + nombre);
        System.out.println("Combustible disponible: " + combustible);
    }
}
