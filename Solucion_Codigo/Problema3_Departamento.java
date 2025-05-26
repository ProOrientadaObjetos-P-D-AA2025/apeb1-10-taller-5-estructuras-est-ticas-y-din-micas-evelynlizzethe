
public class Problema3_Departamento {

    private String nombre;
    private int numEmpleados;
    private double produccionAnual;
    private String categoria;

    public Problema3_Departamento(String nombre, int numEmpleados, double produccionAnual) {
        this.nombre = nombre;
        this.numEmpleados = numEmpleados;
        this.produccionAnual = produccionAnual;
        this.categoria = calcularCategoria();
    }

    private String calcularCategoria() {
        if (numEmpleados > 20 && produccionAnual > 1000000) {
            return "A";
        } else {
            if (numEmpleados >= 20 && produccionAnual >= 1000000) {
                return "B";
            } else {
                if (numEmpleados >= 10 && produccionAnual >= 500000) {
                    return "C";
                } else {
                    return "Sin categoria";
                }
            }
        }
    }
    public String toString() {
        return String.format("Departamento: %s\nEmpleados: %d\nProduccion: %.2f\nCategoria: %s",
                nombre, numEmpleados, produccionAnual, categoria);
    }
}
