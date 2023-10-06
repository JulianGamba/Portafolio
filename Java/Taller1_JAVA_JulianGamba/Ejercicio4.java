// 4. Realice un programa que permita emitir la factura correspondiente a una compra de un artículo determinado, del que se adquieren una o varias unidades. El IVA es del 19% y si el precio bruto ( precio venta mas IVA) es mayor de $130000 se debe realizar un descuento del 5%.

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del artículo: ");
        String nombre = scanner.next();

        System.out.print("Ingrese el precio del artículo: ");
        double precio = scanner.nextDouble();

        double iva = 0.19 * precio;
        double precioConIVA = precio + iva;

        if (precioConIVA > 130000) {
            double descuento = 0.05 * precioConIVA;
            precioConIVA -= descuento;
        }

        System.out.println("---------- FACTURA ----------");
        System.out.println("El artículo comprado es: "+ nombre);
        System.out.println("El precio del iva es: " + iva);
        System.out.println("El precio total es: " + precioConIVA);
        System.out.println("------------------------------");
        scanner.close();
    }
}
