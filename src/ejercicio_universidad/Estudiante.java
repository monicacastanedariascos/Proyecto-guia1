package ejercicio_universidad;

public class Estudiante extends Persona {
    private String semestreActual;
    private String carrera;
    private String fechaIngreso;
    private Curso cursos[];


    public Estudiante(String nombre, int cedula, String lugarNacimiento, String fechaNacimiento, String ciudad, String semestreActual, String carrera, String fechaIngreso, Curso[] cursos) {
        super(nombre, cedula, lugarNacimiento, fechaNacimiento, ciudad);
        this.semestreActual = semestreActual;
        this.carrera = carrera;
        this.fechaIngreso = fechaIngreso;
        this.cursos = cursos;
    }

    public void setSemestreActual(String semestreActual) {
        this.semestreActual = semestreActual;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }

    public String getSemestreActual() {
        return semestreActual;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public Curso[] getCursos() {
        return cursos;
    }
}