package ejercicio_universidad;

public class Carrera {
    private String nombre;
    private int creditos;
    private int semestres;
    private String nivel;
    private Curso cursos[];

    public Carrera(String nombre, int creditos, int semestres, String nivel, Curso[] cursos) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.semestres = semestres;
        this.nivel = nivel;
        this.cursos = cursos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public void setSemestres(int semestres) {
        this.semestres = semestres;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public int getSemestres() {
        return semestres;
    }

    public String getNivel() {
        return nivel;
    }

    public Curso[] getCursos() {
        return cursos;
    }
}
