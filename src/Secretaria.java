import java.sql.SQLOutput;
import java.util.Scanner;

public class Secretaria extends Persona {

    private double salario;

    public Secretaria(int dni, String nombre, String apellido, double salario) {
        super(dni, nombre, apellido);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void inscribirAlumno(){
        Scanner entradaTeclado= new Scanner(System.in);
        System.out.println("ingrese el nombre del alumno que desea ingresar");
        String nombre = entradaTeclado.nextLine();
        System.out.println("ingrese el apellido del alumno que desea ingresar");
        String apellido = entradaTeclado.nextLine();

    }


    public void cobrarCuota(){
        System.out.println("cobrar cuota");
    }

    @Override
    public void verDatos() {
        System.out.println("nombre : " + this.getNombre());
        System.out.println("apellido : " + this.getApellido());

    }
}
