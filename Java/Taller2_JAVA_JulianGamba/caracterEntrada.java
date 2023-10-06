public class caracterEntrada {
    public static char caracterEntrada(String cadena, int indice) throws Exception {
        if (indice >= 0 && indice < cadena.length()) {
            return cadena.charAt(indice);
        } else {
            throw new Exception("Índice fuera de rango");
        }
    }

    public static void main(String[] args) {
        try {
            String cadena = "Ejemplo";
            int indice = 4;
            char caracter = caracterEntrada(cadena, indice);
            System.out.println("El carácter en la posición " + indice + " de la palabra Ejemplo es: " + caracter);
        } catch (Exception e) {
            System.out.println("Excepción: " + e.getMessage());
        }
    }
}
