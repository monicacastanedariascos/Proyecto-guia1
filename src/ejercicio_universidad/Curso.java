package ejercicio_universidad;

public class Curso {
    private int codigo;
    private int creditos;
    private String salon;
    private int numeroEstudiantes;

    public Curso(int codigo, int creditos, String salon, int numeroEstudiantes) {
        this.codigo = codigo;
        this.creditos = creditos;
        this.salon = salon;
        this.numeroEstudiantes = numeroEstudiantes;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public void setNumeroEstudiantes(int numeroEstudiantes) {
        this.numeroEstudiantes = numeroEstudiantes;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCreditos() {
        return creditos;
    }

    public String getSalon() {
        return salon;
    }

    public int getNumeroEstudiantes() {
        return numeroEstudiantes;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigo=" + codigo +
                ", creditos=" + creditos +
                ", salon='" + salon + '\'' +
                ", numeroEstudiantes=" + numeroEstudiantes +
                '}';
    }
}
