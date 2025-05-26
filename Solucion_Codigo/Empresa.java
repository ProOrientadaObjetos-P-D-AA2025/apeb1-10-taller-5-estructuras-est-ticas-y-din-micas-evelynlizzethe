import java.util.*;
public class Empresa {
    
    private String nombre;
    private String ruc;
    private String direccion;
    private ArrayList<Departamento> departamentos;

    public Empresa(String nombre, String ruc, String direccion) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        departamentos = new ArrayList<>();
    }
    
    public void agregarDepartamento(Departamento dep){
        departamentos.add(dep);
    }
    
    public void mostrarDepartamentos(){
        for (Departamento dep : departamentos) {
            System.out.println(dep);
        }
    }
}
