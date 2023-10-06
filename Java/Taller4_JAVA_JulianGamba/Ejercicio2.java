// 2. Declara un arreglo bidimensional de tipo cadena (String) llamado "matriz" con una longitud de 3 filas y 2 columnas. Puedes asignarle los valores reales que desees.
public class Ejercicio2 {
    public static void main(String[] args) {
        String[][] matriz = {{"7", "3"}, {"13", "9"}, {"11", "2"}};
        
        // Mostrar elementos de la matriz
        System.out.println("Elementos de la matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        // Encontrar el mayor número de una columna
        int columna = 1; // Cambia la columna según tus necesidades
        int mayorColumna = Integer.MIN_VALUE;
        for (int i = 0; i < matriz.length; i++) {
            int valor = Integer.parseInt(matriz[i][columna]);
            if (valor > mayorColumna) {
                mayorColumna = valor;
            }
        }
        System.out.println("Mayor número de la columna " + columna + ": " + mayorColumna);
        
        // Encontrar el menor valor de una fila
        int fila = 2; // Cambia la fila según tus necesidades
        int menorFila = Integer.MAX_VALUE;
        for (int j = 0; j < matriz[fila].length; j++) {
            int valor = Integer.parseInt(matriz[fila][j]);
            if (valor < menorFila) {
                menorFila = valor;
            }
        }
        System.out.println("Menor valor de la fila " + fila + ": " + menorFila);
        
        // Encontrar punto de silla (si existe)
        for (int i = 0; i < matriz.length; i++) {
            int menorFilaActual = Integer.MAX_VALUE;
            int columnaPuntoSilla = -1;
            
            // Encontrar el menor valor de la fila
            for (int j = 0; j < matriz[i].length; j++) {
                int valor = Integer.parseInt(matriz[i][j]);
                if (valor < menorFilaActual) {
                    menorFilaActual = valor;
                    columnaPuntoSilla = j;
                }
            }
            
            // Verificar si es el mayor de su columna
            boolean esPuntoSilla = true;
            for (int k = 0; k < matriz.length; k++) {
                int valor = Integer.parseInt(matriz[k][columnaPuntoSilla]);
                if (valor > menorFilaActual) {
                    esPuntoSilla = false;
                    break;
                }
            }
            
            if (esPuntoSilla) {
                System.out.println("Punto de silla en la fila " + i + ", columna " + columnaPuntoSilla);
            }
        }
    }
}
