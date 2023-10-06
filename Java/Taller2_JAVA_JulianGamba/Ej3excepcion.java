import java.util.Scanner;

public class Ej3excepcion {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese la cantidad de horas trabajadas: ");
            double horasTrabajadas = scanner.nextDouble();

            System.out.print("Ingrese la tarifa por hora: ");
            double tarifaPorHora = scanner.nextDouble();

            double salario = calcularSalario(horasTrabajadas, tarifaPorHora);

            System.out.println("Salario del trabajador: $" + salario);

            scanner.close();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    }

    public static double calcularSalario(double horasTrabajadas, double tarifaPorHora) throws Exception {
        if (horasTrabajadas < 0 || tarifaPorHora < 0) {
            throw new Exception("Las horas trabajadas y la tarifa por hora deben ser valores no negativos.");
        }

        double salario;
        if (horasTrabajadas <= 40) {
            salario = horasTrabajadas * tarifaPorHora;
        } else {
            double horasNormales = 40;
            double horasExtras = horasTrabajadas - 40;
            salario = (horasNormales * tarifaPorHora) + (horasExtras * 1.5 * tarifaPorHora);
        }

        return salario;
    }
}
