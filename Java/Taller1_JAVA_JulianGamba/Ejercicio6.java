// 6. Elabore un programa que pida al usuario cinco calificaciones parciales entre 0 y 10. El programa debe verificar que los datos estén en el rango adecuado y calcular e imprimir el promedio final. De acuerdo al promedio, deberá también imprimir alguno de los siguientes mensajes: de 6 a 10: “Aprobado”, de 5 a 6: “Derecho a extraordinario”, de 2 a 5: “Derecho a título”, y de 0 a 2: “Sin derecho a acreditar”.

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese la calificación " + i + ": ");
            double calificacion = scanner.nextDouble();

            if (calificacion < 0 || calificacion > 10) {
                System.out.println("La calificación debe estar en el rango de 0 a 10.");
                i--;
            } else {
                suma += calificacion;
            }
        }

        double promedio = suma / 5;

        System.out.println("El promedio es: " + promedio);

        if (promedio >= 6 && promedio <= 10) {
            System.out.println("Aprobado");
        } else if (promedio >= 5 && promedio < 6) {
            System.out.println("Derecho a extraordinario");
        } else if (promedio >= 2 && promedio < 5) {
            System.out.println("Derecho a título");
        } else if (promedio >= 0 && promedio < 2) {
            System.out.println("Sin derecho a acreditar");
        }

        scanner.close();
    }
}
