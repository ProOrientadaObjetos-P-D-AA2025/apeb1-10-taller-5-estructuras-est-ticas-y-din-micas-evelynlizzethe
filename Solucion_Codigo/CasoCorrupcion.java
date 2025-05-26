import java.util.*;

public class CasoCorrupcion {
    private String nombre;
    private int fechaInicio;
    private String estado;
    private String detalle;
    private ArrayList<Persona> implicados;

    public CasoCorrupcion(String nombre, int fechaInicio, String detalle) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.detalle = detalle;
        this.implicados = new ArrayList<>();
        this.estado = calcularEstado();
    }
    
    private String calcularEstado(){
        if (fechaInicio > 14){
            return "Urgente";
        }else{
            if (fechaInicio > 7){
                return "Alerta";
            } else {
                return "Iniciado";
            }
        }
    }
    public void agregarImplicado(Persona p){
        implicados.add(p);
    }
    
    public void actualizarEstado(int nuevosDias){
        this.fechaInicio = nuevosDias;
        this.estado = calcularEstado();
    }
    
    public String toString() {
        String encabezado = String.format("Caso: %s\nEstado: %s\nDetalles: "
                + "%s\nDias desde inicio: %d\n--- Implicados ---\n",
                nombre, estado, detalle, fechaInicio);
        String implicadosTexto = "";
        for (Persona p : implicados) {
            implicadosTexto += String.format("%s\n\n", p.toString());
        }
        return encabezado + implicadosTexto;
    }
}
