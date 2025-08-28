package tp_ejercicio11;
import java.util.Scanner;

public class TP2_Ejercicio11 {

 static final double DESCUENTO = 0.10;
 
    public static void calcularDescuentoEspecial(double precio){
        double descuentoAplicado = precio * DESCUENTO;
        double precioFinal = precio - descuentoAplicado;
        
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
        return;
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precio;
        
        System.out.print("Ingrese el precio del producto: ");
        precio = scanner.nextDouble();
        
        calcularDescuentoEspecial(precio);
        
    } // cierre de main
    
    
}
