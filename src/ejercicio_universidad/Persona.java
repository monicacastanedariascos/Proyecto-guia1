package ejercicio_universidad;

public class Persona {
    protected String nombre;
    protected int cedula;
    protected String lugarNacimiento;
    protected String fechaNacimiento;
    protected String ciudad;

    public Persona(String nombre, int cedula, String lugarNacimiento, String fechaNacimiento, String ciudad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.lugarNacimiento = lugarNacimiento;
        this.fechaNacimiento = fechaNacimiento;
        this.ciudad = ciudad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getCiudad() {
        return ciudad;
    }
}
