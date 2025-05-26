
import java.util.*;

public class Problema3_EmpresaEjecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Problema3_Empresa empresa = new Problema3_Empresa("Printex", "1102345678000", "Guayaquil");

        System.out.print("Ingrese la cantidad de departamentos: ");
        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.print("Ingrese el nombre del departamento: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese el numero de empledos: ");
            int empleados = sc.nextInt();
            System.out.print("Ingrese el numero de Produccion Anual: ");
            double produccion = sc.nextDouble();
            sc.nextLine();

            Problema3_Departamento dep = new Problema3_Departamento(nombre, empleados, produccion);
            empresa.agregarDepartamento(dep);
        }

        System.out.println("----------------------------");
        System.out.println("REPORTE DE DEPARTAMENTOS");
        empresa.mostrarDepartamentos();
        System.out.println("----------------------------");
    }
}
