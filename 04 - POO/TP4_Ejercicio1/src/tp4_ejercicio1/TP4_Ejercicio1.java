
package tp4_ejercicio1;

public class TP4_Ejercicio1 {

    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado(1, "Gabriel", "Gerente", 2000);
        Empleado empleado2 = new Empleado(2, "Carla", "Desarroladora", 1500);
        Empleado empleado3 = new Empleado("Gustavo", "Administrativo");
        
        empleado1.actualizarSalario(10);
        
        empleado2.actualizarSalario(100.00);
        
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
        
        
    }
    
}
