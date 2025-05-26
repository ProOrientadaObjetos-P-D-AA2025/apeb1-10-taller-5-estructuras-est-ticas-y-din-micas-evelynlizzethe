import java.util.*;
public class Problema3_Empresa {
    
    private String nombre;
    private String ruc;
    private String direccion;
    private ArrayList<Problema3_Departamento> departamentos;

    public Problema3_Empresa(String nombre, String ruc, String direccion) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        departamentos = new ArrayList<>();
    }
    
    public void agregarDepartamento(Problema3_Departamento dep){
        departamentos.add(dep);
    }
    
    public void mostrarDepartamentos(){
        for (Problema3_Departamento dep : departamentos) {
            System.out.println(dep);
        }
    }
}
