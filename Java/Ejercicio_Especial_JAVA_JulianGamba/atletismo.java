import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class atletismo{

    public static void ingresarResultados(Map<String, Map<String, Double>> resultados, Scanner scanner, List<String> pruebas) {
        while (true) {
            System.out.print("Nombre del corredor (o 'fin' para terminar): ");
            String nombre = scanner.nextLine();

            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            Map<String, Double> tiemposCorredor = new HashMap<>();
            for (String prueba : pruebas) {
                System.out.print("Tiempo en " + prueba + " (en segundos): ");
                double tiempo = scanner.nextDouble();
                scanner.nextLine(); // Limpiar el buffer de entrada

                tiemposCorredor.put(prueba, tiempo);
            }

            resultados.put(nombre, tiemposCorredor);
        }
    }

    public static void mostrarGanadores(Map<String, Map<String, Double>> resultados, List<String> pruebas) {
        for (String prueba : pruebas) {
            System.out.println("Resultados en " + prueba + ":");
            List<String> ganadores = encontrarGanadores(resultados, prueba);
            for (String ganador : ganadores) {
                System.out.println("Ganador de Oro: " + ganador + " con " + resultados.get(ganador).get(prueba) + " segundos");
            }
        }
    }

    private static List<String> encontrarGanadores(Map<String, Map<String, Double>> resultados, String prueba) {
        List<String> ganadores = new ArrayList<>();
        double menorTiempo = Double.MAX_VALUE;

        for (Map.Entry<String, Map<String, Double>> entry : resultados.entrySet()) {
            Map<String, Double> tiempos = entry.getValue();
            double tiempo = tiempos.get(prueba);

            if (tiempo < menorTiempo) {
                ganadores.clear();
                ganadores.add(entry.getKey());
                menorTiempo = tiempo;
            } else if (tiempo == menorTiempo) {
                ganadores.add(entry.getKey());
            }
        }

        return ganadores;
    }
}