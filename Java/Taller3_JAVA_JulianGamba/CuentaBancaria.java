public class CuentaBancaria {
    private double saldo;
    private String titular;

    public CuentaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Saldo actual: $" + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser mayor que 0.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Saldo actual: $" + saldo);
        } else {
            System.out.println("No tiene fondos suficientes para realizar el retiro.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Titular de la cuenta: " + titular);
        System.out.println("Saldo actual: $" + saldo);
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez");

        cuenta.mostrarSaldo();
        cuenta.depositar(1000);
        cuenta.retirar(500);
        cuenta.mostrarSaldo();
    }
}
