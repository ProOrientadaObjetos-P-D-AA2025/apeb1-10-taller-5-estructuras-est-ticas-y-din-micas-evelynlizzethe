
public class Problema4_Persona {
    
    private String nombre;
    private int edad;
    private String ocupacion;
    private String implicacion;
    private boolean sentencia;
    private boolean justicia;
    private double danioEconomico;

    public Problema4_Persona(String nombre, int edad, String ocupacion, String implicacion, 
            boolean sentencia, boolean justicia, double danioEconomico) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.implicacion = implicacion;
        this.sentencia = sentencia;
        this.justicia = justicia;
        this.danioEconomico = danioEconomico;
    }
   
    public String toString() {
        return String.format("Nombre: %s\nEdad: %d\nOcupacion: %s\nImplicacion: %s\n"
                + "Sentencia: %s\nColabora con la justicia: %s\nDaño economico: $%.2f",
                nombre, edad, ocupacion, implicacion,
                (sentencia ? "Sí" : "No"),
                (justicia ? "Sí" : "No"),
                danioEconomico);
    }
}
