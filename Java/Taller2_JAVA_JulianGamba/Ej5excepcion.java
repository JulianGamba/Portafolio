import java.util.Scanner;

public class Ej5excepcion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumaCalificaciones = 0;
        int contador = 0;

        for (int i = 1; i <= 5; i++) {
            try {
                System.out.print("Ingrese la calificación " + i + ": ");
                double calificacion = scanner.nextDouble();

                if (calificacion < 0 || calificacion > 10) {
                    System.out.println("La calificación debe estar entre 0 y 10. Intente de nuevo.");
                    i--; // Restar 1 al índice para que se vuelva a pedir la misma calificación.
                } else {
                    sumaCalificaciones += calificacion;
                    contador++;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Ingrese un número válido.");
                scanner.next(); // Limpiar el búfer de entrada
                i--; // Restar 1 al índice para que se vuelva a pedir la misma calificación.
            }
        }

        scanner.close();

        if (contador > 0) {
            double promedio = sumaCalificaciones / contador;
            System.out.println("Promedio de calificaciones: " + promedio);

            if (promedio >= 6 && promedio <= 10) {
                System.out.println("Aprobado");
            } else if (promedio >= 5 && promedio < 6) {
                System.out.println("Derecho a extraordinario");
            } else if (promedio >= 2 && promedio < 5) {
                System.out.println("Derecho a título");
            } else if (promedio >= 0 && promedio < 2) {
                System.out.println("Sin derecho a acreditar");
            }
        } else {
            System.out.println("No se ingresaron calificaciones válidas.");
        }
    }
}
