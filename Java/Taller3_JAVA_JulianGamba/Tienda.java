public class Tienda {
    private String[] productos;
    private int cantidadProductos;

    public Tienda() {
        productos = new String[50];
        cantidadProductos = 0;
    }

    public void agregarProducto(String producto) {
        if (cantidadProductos < productos.length) {
            productos[cantidadProductos] = producto;
            cantidadProductos++;
            System.out.println("Producto agregado: " + producto);
        } else {
            System.out.println("No se pueden agregar más productos. La lista está llena.");
        }
    }

    public void eliminarProducto(String producto) {
        for (int i = 0; i < cantidadProductos; i++) {
            if (productos[i].equals(producto)) {
                productos[i] = productos[cantidadProductos - 1];
                productos[cantidadProductos - 1] = null;
                cantidadProductos--;
                System.out.println("Producto eliminado: " + producto);
                return;
            }
        }
        System.out.println("Producto no encontrado en la lista.");
    }

    public void mostrarProductos() {
        System.out.println("Lista de Productos:");
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.println(productos[i]);
        }
    }

    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        tienda.agregarProducto("Camiseta");
        tienda.agregarProducto("Zapatos");
        tienda.agregarProducto("Pantalones");

        tienda.mostrarProductos();

        tienda.eliminarProducto("Zapatos");

        tienda.mostrarProductos();
    }
}
