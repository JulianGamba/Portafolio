// 3. A un trabajador le pagan según sus horas trabajadas y la tarifa está a un valor por hora. Si la cantidad de horas trabajadas es mayor a 40 horas, la tarifa por hora se incrementa en un 50% para las horas extras. Calcular el salario del trabajador dadas las horas trabajadas y la tarifa.

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese las horas trabajadas: ");
        double horasTrabajadas = scanner.nextDouble();
        
        System.out.print("Ingrese la tarifa por hora: ");
        double tarifaPorHora = scanner.nextDouble();
        
        double salario;
        
        if (horasTrabajadas <= 40) {
            salario = horasTrabajadas * tarifaPorHora;
        } else {
            double horasExtras = horasTrabajadas - 40;
            salario = (40 * tarifaPorHora) + (horasExtras * tarifaPorHora * 1.5);
        }
        
        System.out.println("El salario del trabajador es: " + salario);
        
        scanner.close();
    }
}