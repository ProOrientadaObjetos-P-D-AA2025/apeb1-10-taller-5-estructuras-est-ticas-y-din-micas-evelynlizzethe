import java.util.Scanner;

public class Problema2_EstudianteEjecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();
        System.out.print("Edad del estudiante: ");
        int edad = sc.nextInt();
        
        Estudiante estudiante = new Estudiante (nombre, edad);
        sc.nextLine();
        
        System.out.print("Nombre de la materia: ");
        String nombreMateria = sc.nextLine();
        System.out.print("Ingrese la nota ACD: ");
        double acd = sc.nextDouble();
        System.out.print("Ingrese la nota APE: ");
        double ape = sc.nextDouble();
        System.out.print("Ingrese la nota AA: ");
        double aa = sc.nextDouble();
        sc.nextLine();
        
        Materia materia = new Materia(nombreMateria, acd, ape, aa);
        estudiante.asignarMateria(materia);
        
        System.out.println("------------------");
        System.out.println("RESULTADOS");
        System.out.println(estudiante);
        System.out.println("------------------");
        
    }
}
