import java.util.ArrayList;

public class Carrera extends Alumno {
    private int codigo;
    private String titulo;
    private double cuotaMensual;
    private ArrayList<Materia> materias = new ArrayList<Materia>();

    public Carrera(int dni, String nombre, String apellido, int lejago, ArrayList<Carrera> carreras, int codigo, String titulo, double cuotaMensual, ArrayList<Materia> materias) {
        super(dni, nombre, apellido, lejago, carreras);
        this.codigo = codigo;
        this.titulo = titulo;
        this.cuotaMensual = cuotaMensual;
        this.materias = materias;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public double cambiarValorCuota(double nuevoValor) {
        this.cuotaMensual = nuevoValor;
        return this.cuotaMensual;
    }

    public void verAlumnosInscriptos(ArrayList<Alumno> alumnos) {

    }
}

