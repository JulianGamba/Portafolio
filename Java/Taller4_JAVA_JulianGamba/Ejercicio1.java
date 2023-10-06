// 1. Declara un arreglo unidimensional de tipo entero llamado "numeros" con una longitud de 10 elementos. Puedes asignarle los valores que desees.
public class Ejercicio1 {
    public static void main(String[] args) {
        int[] numeros = {5, 12, 7, 3, 8, 15, 9, 6, 10, 14};
        
        // Mostrar elementos del arreglo
        System.out.println("Elementos del arreglo:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        
        // Calcular la suma de los elementos
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        System.out.println("\nSuma de los elementos: " + suma);
        
        // Encontrar el número máximo y mínimo
        int maximo = numeros[0];
        int minimo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
        System.out.println("Número máximo: " + maximo);
        System.out.println("Número mínimo: " + minimo);
    }
}
