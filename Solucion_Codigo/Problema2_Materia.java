
public class Problema2_Materia {

    private String nombre;
    private double acd;
    private double ape;
    private double aa;

    public Problema2_Materia(String nombre, double acd, double ape, double aa) {
        this.nombre = nombre;
        this.acd = acd;
        this.ape = ape;
        this.aa = aa;
    }

    public String estadoEstudiante() {
        double total = (acd + ape + aa);
        if (total >= 7.0) {
            return "APROBADO";
        } else {
            return "NO APROBADO. Debe rendir examen de recuperacion";
        }
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String toString() {
        return String.format("Materia: %s\nACD: %.2f, APE: %.2f, AA: %.2f\nResultado: %s",
                nombre, acd, ape, aa, estadoEstudiante());
    }
}
