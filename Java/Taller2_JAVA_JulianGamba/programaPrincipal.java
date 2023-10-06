import java.util.Scanner;

public class programaPrincipal {
    public static char caracterEntrada(String cadena, int indice) throws Exception {
        if (indice >= 0 && indice < cadena.length()) {
            return cadena.charAt(indice);
        } else {
            throw new Exception("Has intentado recuperar una posición de la cadena de caracteres que no existe.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese una cadena de caracteres: ");
            String cadena = scanner.nextLine();

            char caracter = caracterEntrada(cadena, 7);
            System.out.println("El carácter en la posición 7 es: " + caracter);
        } catch (Exception e) {
            System.out.println("Excepción: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}