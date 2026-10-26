public class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(int codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void registrarIngresoStock(int cantidad) {
        if (cantidad > 0) {
            stock += cantidad;
            System.out.println("Ingreso de stock realizado correctamente.");
        } else {
            System.out.println("Error: la cantidad debe ser mayor a cero.");
        }
    }

    public void registrarVenta(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: la cantidad debe ser mayor a cero.");
        } else if (cantidad <= stock) {
            stock -= cantidad;
            System.out.println("Venta realizada correctamente.");
        } else {
            System.out.println("Error: no hay suficiente stock.");
        }
    }

    public int getStock() {
        return stock;
    }
}
