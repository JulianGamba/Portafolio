import java.util.Scanner;

public class Ej4excepcion {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el precio unitario del artículo: ");
            double precioUnitario = scanner.nextDouble();

            System.out.print("Ingrese la cantidad de unidades compradas: ");
            int cantidad = scanner.nextInt();

            double facturaTotal = calcularFactura(precioUnitario, cantidad);

            System.out.println("Total a pagar: $" + facturaTotal);

            scanner.close();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }

    public static double calcularFactura(double precioUnitario, int cantidad) throws Exception {
        if (precioUnitario < 0 || cantidad < 0) {
            throw new Exception("El precio unitario y la cantidad deben ser valores no negativos.");
        }

        double subtotal = precioUnitario * cantidad;
        double iva = subtotal * 0.19;

        if (subtotal > 130000) {
            double descuento = subtotal * 0.05;
            return subtotal + iva - descuento;
        } else {
            return subtotal + iva;
        }
    }
}
