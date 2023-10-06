import java.util.LinkedList;
public class Ejercicio41 {
    public static void main(String[] args) {
        LinkedList<Ejercicio4> estudiantes = new LinkedList<>();

        // Agregar estudiantes a la lista
        estudiantes.add(new Ejercicio4("Juan", 8.5));
        estudiantes.add(new Ejercicio4("María", 9.2));
        estudiantes.add(new Ejercicio4("Carlos", 7.8));

        // Calcular el mejor y el peor estudiante
        Ejercicio4 mejorEstudiante = estudiantes.getFirst();
        Ejercicio4 peorEstudiante = estudiantes.getFirst();
        double sumaPromedios = 0;

        for (Ejercicio4 estudiante : estudiantes) {
            double promedio = estudiante.getPromedio();
            sumaPromedios += promedio;

            if (promedio > mejorEstudiante.getPromedio()) {
                mejorEstudiante = estudiante;
            }

            if (promedio < peorEstudiante.getPromedio()) {
                peorEstudiante = estudiante;
            }
        }

        double promedioTotal = sumaPromedios / estudiantes.size();

        System.out.println("Mejor Estudiante: " + mejorEstudiante.getNombre());
        System.out.println("Peor Estudiante: " + peorEstudiante.getNombre());
        System.out.println("Promedio de Estudiantes: " + promedioTotal);
    }
}

