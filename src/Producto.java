public class Producto {
    public String nombre;
    public int codigo;
    public String fechaVencimiento;
    public String nombreFabricante;
    public int cantidadInventario;
    public int precioUnitario;

    public Producto() {
    }

    public Producto(String nombre, int codigo, String fechaVencimiento, String nombreFabricante, int cantidadInventario, int precioUnitario) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.fechaVencimiento = fechaVencimiento;
        this.nombreFabricante = nombreFabricante;
        this.cantidadInventario = cantidadInventario;
        this.precioUnitario = precioUnitario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public int getCantidadInventario() {
        return cantidadInventario;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    public void setCantidadInventario(int cantidadInventario) {
        this.cantidadInventario = cantidadInventario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", codigo=" + codigo +
                ", fechaVencimiento='" + fechaVencimiento + '\'' +
                ", nombreFabricante='" + nombreFabricante + '\'' +
                ", cantidadInventario=" + cantidadInventario +
                ", precioUnitario=" + precioUnitario +
                '}';
    }
}
