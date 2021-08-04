package ejercicio_universidad;

import java.util.Arrays;

public class Profesor extends Persona {
    private String nacionalidad;
    private int Sueldo;
    private String profesion;
    private Curso cursos[];

    public Profesor(String nombre, int cedula, String lugarNacimiento, String fechaNacimiento, String ciudad, String nacionalidad, int sueldo, String profesion, Curso[] cursos) {
        super(nombre, cedula, lugarNacimiento, fechaNacimiento, ciudad);
        this.nacionalidad = nacionalidad;
        Sueldo = sueldo;
        this.profesion = profesion;
        this.cursos = cursos;
    }

    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setSueldo(int sueldo) {
        Sueldo = sueldo;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getSueldo() {
        return Sueldo;
    }

    public String getProfesion() {
        return profesion;
    }

    public Curso[] getCursos() {
        return cursos;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", Sueldo=" + Sueldo +
                ", profesion='" + profesion + '\'' +
                ", cursos=" + Arrays.toString(cursos) +
                '}';
    }
}
