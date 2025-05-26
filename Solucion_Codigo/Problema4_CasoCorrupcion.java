import java.util.*;

public class Problema4_CasoCorrupcion {
    private String nombre;
    private int fechaInicio;
    private String estado;
    private String detalle;
    private ArrayList<Problema4_Persona> implicados;

    public Problema4_CasoCorrupcion(String nombre, int fechaInicio, String detalle) {
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
    public void agregarImplicado(Problema4_Persona p){
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
        for (Problema4_Persona p : implicados) {
            implicadosTexto += String.format("%s\n\n", p.toString());
        }
        return encabezado + implicadosTexto;
    }
}
