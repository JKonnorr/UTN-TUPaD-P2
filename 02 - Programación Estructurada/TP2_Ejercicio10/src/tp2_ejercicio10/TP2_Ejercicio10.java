package tp2_ejercicio10;
import java.util.Scanner;


public class TP2_Ejercicio10 {


    public static void main(String[] args) {
        int stockActual,cantidadVendida, cantidadRecibida, stockFinal; 
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el stock actual del producto: ");
        stockActual = scanner.nextInt();
        System.out.print("Ingrese la cantidad vendida: ");
        cantidadVendida = scanner.nextInt();
        System.out.print("Ingrese la cantidad recibida: ");
        cantidadRecibida = scanner.nextInt();
        
        stockFinal = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
        System.out.println("El nuevo stock del producto es: " + stockFinal);
        
    }
    
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;
    }
}
