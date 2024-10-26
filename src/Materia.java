import java.util.ArrayList;

public class Materia extends Carrera{

    private int codigoMateria;
    private String nombreMateria;
    private String contenido;

    public Materia(int dni, String nombre, String apellido, int lejago, ArrayList<Carrera> carreras, int codigo, String titulo, double cuotaMensual, ArrayList<Materia> carreras1, int codigo1, String contenido, String nombreMateria) {
        super(dni, nombre, apellido, lejago, carreras, codigo, titulo, cuotaMensual, carreras1);
        this.codigoMateria = codigo1;
        this.contenido = contenido;
        this.nombreMateria = nombreMateria;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public int getCodigoMateria() {
        return codigoMateria;
    }

    public void setCodigoMateria(int codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    public String cambiarContenido(String contenidoNuevo){
        this.contenido = contenidoNuevo;
        return contenidoNuevo;
    }

}
