// 5. Crear un mapa ordenado cuyos elementos de una clase que sean títulos de libros y su respectivo autor. Considerar el nombre del autor como campo clave. La aplicación dará entrada a los elementos del mapa y realizará operaciones que obtengan submapas por rango, o a partir de una clave (autor) dada.

import java.util.Map;
import java.util.TreeMap;

public class Ejercicio5 {
    public static void main(String[] args) {
        TreeMap<String, String> libros = new TreeMap<>();
        
        // Agregar títulos de libros con autores
        libros.put("George Orwell", "1984");
        libros.put("J.K. Rowling", "Harry Potter");
        libros.put("Jane Austen", "Orgullo y prejuicio");
        
        // Obtener submapas por rango de claves
        Map<String, String> submapa1 = libros.subMap("A", "G");
        Map<String, String> submapa2 = libros.subMap("J", "K");
        
        // Mostrar submapas
        System.out.println("Libros por autor (A-G): " + submapa1);
        System.out.println("Libros por autor (J-K): " + submapa2);
    }
}
