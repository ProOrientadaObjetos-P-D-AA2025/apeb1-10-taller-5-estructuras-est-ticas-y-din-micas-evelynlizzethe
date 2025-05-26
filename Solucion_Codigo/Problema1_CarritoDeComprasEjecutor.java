
import java.util.*;

public class Problema1_CarritoDeComprasEjecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CarritoDeCompras carrito = new CarritoDeCompras();

        carrito.agregarProductoTienda(new Producto("Laptop", 1169.0, 7));
        carrito.agregarProductoTienda(new Producto("MousePad", 20.0, 37));
        carrito.agregarProductoTienda(new Producto("Parlantes", 45.0, 22));

        System.out.print("Ingrese el nombre del producto que desea adquirir: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese la cantidad: ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        carrito.agregarProducto(nombre, cantidad);

        System.out.println("Total a pagar hasta ahora: $" + carrito.calcularTotal());

        System.out.print("Ingrese el monto a pagar: ");
        double pago = sc.nextDouble();
        sc.nextLine();

        int porcentaje = 10;
        double descuentoPromo = (porcentaje / 100.0);

        String resultado = carrito.realizarPago(pago, descuentoPromo);
        
        System.out.println(resultado);
        System.out.println("-----------------------");
        System.out.println("Detalles de la compra");
        System.out.println(carrito.mostrarDetalleCompra());
    }
}
