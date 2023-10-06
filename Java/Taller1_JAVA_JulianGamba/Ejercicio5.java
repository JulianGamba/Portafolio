// 5. Realice un programa en JAVA que pida al usuario una serie de números enteros no negativos utilizando un ciclo do…while. Una vez que el usuario introduzca un número negativo, el ciclo deberá terminar y el programa deberá imprimir el mayor, menor, y promedio de todos los números ingresados (excepto el último).

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int suma = 0;
        int contador = 0;

        do {
            System.out.print("Ingrese un número (negativo para salir): ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                suma += numero;
                contador++;

                if (numero > mayor) {
                    mayor = numero;
                }

                if (numero < menor) {
                    menor = numero;
                }
            }
        } while (numero >= 0);

        scanner.close();

        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("Mayor número ingresado: " + mayor);
            System.out.println("Menor número ingresado: " + menor);
            System.out.println("Promedio de los números ingresados: " + promedio);
        } else {
            System.out.println("No se ingresaron números válidos.");
        }
    }
}
