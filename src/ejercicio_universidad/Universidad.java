package ejercicio_universidad;

import java.util.Arrays;

public class Universidad {
    private String nombre;
    private String nombreRector;
    private String ciudad;
    private Facultad facultades[];

    public Universidad(String nombre, String nombreRector, String ciudad, Facultad facultades[]) {
        this.nombre = nombre;
        this.nombreRector = nombreRector;
        this.ciudad = ciudad;
        this.facultades = facultades;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNombreRector(String nombreRector) {
        this.nombreRector = nombreRector;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setFacultades(Facultad[] facultades) {
        this.facultades = facultades;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreRector() {
        return nombreRector;
    }

    public String getCiudad() {
        return ciudad;
    }

    public Facultad[] getFacultades() {
        return facultades;
    }

    @Override
    public String toString() {
        return "Universidad{" +
                "nombre='" + nombre + '\'' +
                ", nombreRector='" + nombreRector + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", facultades=" + Arrays.toString(facultades) +
                '}';
    }
}
