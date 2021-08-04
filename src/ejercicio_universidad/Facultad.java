package ejercicio_universidad;

import java.util.Arrays;

public class Facultad {
    private String nombre;
    private Profesor profesores[];

    public Facultad(String nombre, Profesor profesores[]) {
        this.nombre = nombre;
        this.profesores = profesores;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProfesores(Profesor[] profesores) {
        this.profesores = profesores;
    }

    public String getNombre() {
        return nombre;
    }

    public Profesor[] getProfesores() {
        return profesores;
    }

    @Override
    public String toString() {
        return "Facultad{" +
                "nombre='" + nombre + '\'' +
                ", profesores=" + Arrays.toString(profesores) +
                '}';
    }
}
