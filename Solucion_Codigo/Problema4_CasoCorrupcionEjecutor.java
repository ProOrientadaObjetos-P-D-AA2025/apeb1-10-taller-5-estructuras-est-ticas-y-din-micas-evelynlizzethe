import java.util.*;
public class Problema4_CasoCorrupcionEjecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del caso: ");
        String nombreCaso = sc.nextLine();
        System.out.print("Ingrese dias desde el inicio del caso: ");
        int fechaInicio = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese detalles del caso: ");
        String detalles = sc.nextLine();
        
        CasoCorrupcion caso = new CasoCorrupcion(nombreCaso, fechaInicio, detalles);
        
        System.out.print("Ingrese el numero de personas implicadas: ");
        int num = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < num; i++) {
            System.out.println("Persona #" + (i+1));
            
            System.out.print("Ingrese el nombre: ");
            String nombreP = sc.nextLine();
            System.out.print("Ingrese la edad: ");
            int edad = sc.nextInt();
            sc.nextLine();
            System.out.print("Ingrese la ocupacion: ");
            String ocupacion = sc.nextLine();
            System.out.println("Ingrese el nivel de impliacion (acusado, testigo, victima): ");
            String implicacion = sc.nextLine();
            System.out.println("Tiene sentencia (Si/No): ");
            boolean sentencia = sc.nextBoolean();
            System.out.println("Colabora con la justicia (Si/No): ");
            boolean justicia = sc.nextBoolean();
            
            double danioEconomico = 0;
            if (implicacion.equalsIgnoreCase("acusado")){
                System.out.println("Ingrese el daño economico causado: $ ");
                danioEconomico = sc.nextDouble();
            }
            sc.nextLine();
            
            Persona persona = new Persona(nombreP, edad, ocupacion, implicacion, sentencia, justicia, danioEconomico);
            
            caso.agregarImplicado(persona);
        }
        
        System.out.println("---------------------------");
        System.out.println("DETALLES DEL CASO");
        System.out.println(caso.toString());
    }
}
