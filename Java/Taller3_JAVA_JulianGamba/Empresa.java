import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Empleado> empleados;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarEmpleados() {
        System.out.println("Empleados de " + nombre + ":");
        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre() + ", Salario: " + empleado.getSalario() + ", Departamento: " + empleado.getDepartamento());
        }
    }

    public double calcularSalarioTotal() {
        double salarioTotal = 0;
        for (Empleado empleado : empleados) {
            salarioTotal += empleado.getSalario();
        }
        return salarioTotal;
    }

    public static void main(String[] args) {
        Empresa empresa = new Empresa("Mi Empresa");

        Empleado empleado1 = new Empleado("Juan", 30000, "Ventas");
        Empleado empleado2 = new Empleado("Maria", 35000, "Finanzas");

        empresa.agregarEmpleado(empleado1);
        empresa.agregarEmpleado(empleado2);

        empresa.mostrarEmpleados();
        System.out.println("Salario Total de la Empresa: $" + empresa.calcularSalarioTotal());
    }
}
