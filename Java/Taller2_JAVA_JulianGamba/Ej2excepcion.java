import java.util.Scanner;

public class Ej2excepcion {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int contador = 0;
            int suma = 0;
            int maximo = Integer.MIN_VALUE;
            int minimo = Integer.MAX_VALUE;

            int numero;
            do {
                System.out.print("Ingrese un número entero no negativo (ingrese negativo para terminar): ");
                numero = scanner.nextInt();

                if (numero >= 0) {
                    contador++;
                    suma += numero;
                    maximo = Math.max(maximo, numero);
                    minimo = Math.min(minimo, numero);
                }
            } while (numero >= 0);

            if (contador > 0) {
                double promedio = (double) suma / contador;
                System.out.println("Mayor número ingresado: " + maximo);
                System.out.println("Menor número ingresado: " + minimo);
                System.out.println("Promedio de números ingresados: " + promedio);
            } else {
                System.out.println("No se ingresaron números válidos.");
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }
}
