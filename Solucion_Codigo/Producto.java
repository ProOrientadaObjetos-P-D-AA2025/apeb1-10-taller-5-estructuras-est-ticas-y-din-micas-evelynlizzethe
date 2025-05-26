
public class Producto {

    private String nombre;
    private double precios;
    private int cantidadDisponible;

    public Producto(String nombre, double precios, int productosDisponibles) {
        this.nombre = nombre;
        this.precios = precios;
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecios() {
        return precios;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }
    
    public void reducirCantidad(int cantidadVendida) {
        if (cantidadVendida <= cantidadDisponible) {
            cantidadDisponible -= cantidadVendida;
        }
    }
    
    public String toString() {
        return String.format("Producto: %s\nPrecio: $%.2f\nCantidad Disponible: %d",
                nombre, precios, cantidadDisponible);
    }
}
