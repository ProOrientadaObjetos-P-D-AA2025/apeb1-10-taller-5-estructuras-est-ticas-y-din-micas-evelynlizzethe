
public class Estudiante {
    private String nombre;
    private int edad;
    private Materia materia;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void asignarMateria(Materia materia){
        this.materia = materia;
    }
    
    public String toString() {
        return String.format("Estudiante: %s\nEdad: %d\n%s",
                nombre, edad, materia.toString());
    }   
}
