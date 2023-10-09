import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Map<String, Map<String, Double>> resultados = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        List<String> pruebas = new ArrayList<>();
        pruebas.add("100 mts");
        pruebas.add("200 mts");
        pruebas.add("400 mts");

        atletismo.ingresarResultados(resultados, scanner, pruebas);
        atletismo.mostrarGanadores(resultados, pruebas);

        scanner.close();
    }
}

/* En este ejercicio he decidido utilizar HashMap para poder asociar de una forma adecuada el tiempo de cada prueba a los corredores. Solo se muestran los resultados en oro, no me fue posible mostrar los otros. */