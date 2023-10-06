public class Camion extends Vehiculo {
    private int nroRuedas;

    public Camion(String nombre, double precio, int nroRuedas) {
        super(nombre, precio);
        this.nroRuedas = nroRuedas;
    }

    @Override
    public double calcularTasa() {
        return nroRuedas * 100;
    }

    public int getNroRuedas() {
        return nroRuedas;
    }
}
