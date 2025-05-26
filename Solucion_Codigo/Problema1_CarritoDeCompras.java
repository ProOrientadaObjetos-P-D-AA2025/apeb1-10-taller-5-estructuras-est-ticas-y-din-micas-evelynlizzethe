
import java.util.ArrayList;

public class Problema1_CarritoDeCompras {

    private ArrayList<Problema1_Producto> producto;
    private ArrayList<Problema1_Producto> carritoCompra;
    private ArrayList<Integer> cantidad;

    private double descuento;
    private double totalCompra;

    public Problema1_CarritoDeCompras() {
        producto = new ArrayList<>();
        carritoCompra = new ArrayList<>();
        cantidad = new ArrayList<>();
        descuento = 0;
        totalCompra = 0;
    }

    public void agregarProductoTienda(Problema1_Producto pro) {
        producto.add(pro);
    }

    public void agregarProducto(String nombre, int cantidad) {
        
        boolean encontrado = false;

        for (int i = 0; i < producto.size(); i++) {
            Problema1_Producto pro = producto.get(i);

            if (pro.getNombre().equalsIgnoreCase(nombre)) {
                encontrado = true;

                if (pro.getCantidadDisponible() < cantidad) {
                    System.out.println("No hay suficientes existencias de: " + nombre);
                    return;
                }
                carritoCompra.add(pro);
                this.cantidad.add(cantidad);
                totalCompra += pro.getPrecios() * cantidad;
                return;
            }
        }
        if (!encontrado) {
            System.out.println("Producto no encontrado: " + nombre);
        }
    }
    
    public double calcularTotal(){
        return totalCompra;
    }
    
    public String realizarPago(double montoPagado, double descuentoPromo){
        
        if(totalCompra > 1000){
            descuento = (totalCompra * descuentoPromo);
            totalCompra -= descuento;
        }
        
        if(montoPagado >= totalCompra){
            for (int i = 0; i < carritoCompra.size(); i++) {
                Problema1_Producto pro = carritoCompra.get(i);
                int cant = cantidad.get(i);
                pro.reducirCantidad(cant);
                
            }
            return "Pago realizado";
        } else {
            double faltante = (totalCompra - montoPagado);
            return "Pago insuficiente. Faltan: $" + String.format("%.2f", faltante);
        }
    }
    
    public String mostrarDetalleCompra(){
        String detalle = "";
        for (int i = 0; i < carritoCompra.size(); i++) {
            Problema1_Producto pro = carritoCompra.get(i);
            int cant = cantidad.get(i);
            detalle += pro.getNombre() + "- Cantidad: " + cant + "\n";
        }
        
        detalle += String.format("Total: $%.2f\n", totalCompra);
        
        if(descuento > 0){
            detalle += String.format("Descuento Aplicado: $%.2f\n", descuento);
        }
        return detalle;
    }
}
