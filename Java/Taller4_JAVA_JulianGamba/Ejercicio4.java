// 4. Crear una colección de tipo LinkedList formada por elementos de la clase Estudiante. Hace una clase main de prueba para añadir elementos, eliminar elementos y listar los elementos de dicha clase. Crear métodos para determinar el mejor y el peor estudiante de acuerdo a su promedio y calcular el promedio de los estudiantes en la lista.
class Ejercicio4 {
    private String nombre;
    private double promedio;

    public Ejercicio4(String nombre, double promedio) {
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPromedio() {
        return promedio;
    }
}
