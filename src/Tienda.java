import java.util.Arrays;

public class Tienda {
    public String nombre;
    public String direccion;
    public int Telefono;

    public Producto productos[];

    public Tienda(String nombre, String direccion, int telefono, Producto productos[]) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.productos=productos;
        Telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(int telefono) {
        Telefono = telefono;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", Telefono=" + Telefono +
                ", productos=" + Arrays.toString(productos) +
                '}';
    }
}
