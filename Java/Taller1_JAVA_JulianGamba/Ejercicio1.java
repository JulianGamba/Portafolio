// 1. A un trabajador le descuentan de su sueldo el 10% si su sueldo es menor o igual a 1000000, por encima de 1000000 y hasta 2000000 el 5% del adicional, y por encima de 2000000 el 3% del adicional. Calcular el descuento y sueldo neto que recibe el trabajador dado su sueldo.
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el sueldo del trabajador: ");
        double sueldo = scanner.nextDouble();
        
        double descuento = 0.0;

        if (sueldo <= 1000000) {
            descuento = sueldo * 0.10;
        } else if (sueldo > 1000000 && sueldo <= 2000000) {
            descuento = sueldo * 0.05;
        } else {
            descuento = sueldo * 0.03;
        }
        
        double sueldoTotal = sueldo - descuento;
        
        System.out.println("Descuento: " + descuento);
        System.out.println("Sueldo Neto: " + sueldoTotal);
        
        scanner.close();
    }
}
