//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Producto producto = new Producto(1, "Teclado", 15000, 10);

    System.out.println("Stock inicial: " + producto.getStock());

    producto.registrarVenta(3);
    producto.registrarVenta(5);
    producto.registrarVenta(10);

    producto.registrarIngresoStock(8);

    System.out.println("Stock final: " + producto.getStock());
}
