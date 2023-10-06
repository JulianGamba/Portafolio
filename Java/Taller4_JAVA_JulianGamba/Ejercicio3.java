// 3. Crear una colección de tipo ArrayList formada por cadenas (String) leídas por teclado. Hacer una clase de prueba para añadir varios elementos a lista, para eliminar elementos y para listar los elementos.
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Agregar elementos a la lista
        System.out.println("Ingrese elementos (ingrese 'fin' para terminar):");
        String elemento = scanner.nextLine();
        while (!elemento.equalsIgnoreCase("fin")) {
            lista.add(elemento);
            elemento = scanner.nextLine();
        }

        // Mostrar elementos de la lista
        System.out.println("Elementos en la lista:");
        for (String item : lista) {
            System.out.println(item);
        }

        // Eliminar elementos de la lista
        System.out.print("Ingrese el elemento a eliminar: ");
        String elementoEliminar = scanner.nextLine();
        if (lista.contains(elementoEliminar)) {
            lista.remove(elementoEliminar);
            System.out.println("Elemento eliminado: " + elementoEliminar);
        } else {
            System.out.println("Elemento no encontrado en la lista.");
        }

        scanner.close();
    }
}
