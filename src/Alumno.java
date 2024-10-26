import java.util.ArrayList;

public class Alumno extends Persona{

    private int lejago;
    private ArrayList<Carrera> carreras  = new ArrayList<Carrera>();

    public Alumno(int dni, String nombre, String apellido, int lejago, ArrayList<Carrera> carreras) {
        super(dni, nombre, apellido);
        this.lejago = lejago;
        this.carreras = carreras;
    }

    public int getLejago() {
        return lejago;
    }

    public void setLejago(int lejago) {
        this.lejago = lejago;
    }

    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(ArrayList<Carrera> carreras) {
        this.carreras = carreras;
    }

    @Override
    public void verDatos() {

    }

    public void verCronogramaCarrera(){

    }
}
