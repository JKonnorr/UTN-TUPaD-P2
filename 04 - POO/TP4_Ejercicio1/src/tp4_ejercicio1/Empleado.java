
package tp4_ejercicio1;


public class Empleado {
    
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 800;
        totalEmpleados++;
        this.id = totalEmpleados;
    }
    
    
    public void actualizarSalario(int porcentajeAumento){
        this.salario += this.salario * (porcentajeAumento / 100.0);
        System.out.println("Salario de " + this.nombre + " aumentado en un " + porcentajeAumento + " %.");
    }
    
    public void actualizarSalario(double cantidadFijaAumento){
            this.salario += cantidadFijaAumento;
        System.out.println("Salario de " + this.nombre + " aumentado en  $" + cantidadFijaAumento);
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }
}
