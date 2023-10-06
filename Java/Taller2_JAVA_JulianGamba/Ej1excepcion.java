import java.util.Scanner;

public class Ej1excepcion {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el sueldo del trabajador: ");
            double sueldo = scanner.nextDouble();

            double descuento = calcularDescuento(sueldo);
            double sueldoNeto = sueldo - descuento;

            System.out.println("Descuento aplicado: $" + descuento);
            System.out.println("Sueldo neto: $" + sueldoNeto);

            scanner.close();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }

    public static double calcularDescuento(double sueldo) throws Exception {
        if (sueldo < 0) {
            throw new Exception("El sueldo no puede ser negativo");
        } else if (sueldo <= 1000000) {
            return sueldo * 0.10;
        } else if (sueldo <= 2000000) {
            return 1000000 * 0.10 + (sueldo - 1000000) * 0.05;
        } else {
            return 1000000 * 0.10 + 1000000 * 0.05 + (sueldo - 2000000) * 0.03;
        }
    }
}
