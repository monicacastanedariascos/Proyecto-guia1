public class main {
    public static void main (String args[]){

        Fraccionario w=new Fraccionario(1,2);
        System.out.println(w);
        Fecha f=new Fecha(17,"junio",1989);
        System.out.println(f);
        Proyectil z=new Proyectil(4.0f,6.0f);
        System.out.println(z);
//    public Producto(String nombre, int codigo, String fechaVencimiento, String nombreFabricante, int cantidadInventario, int precioUnitario) {
        Producto productos[]=new Producto[2];
        productos[0]=new Producto("kippitos",123,"2may","mono",10,5);
        productos[1]=new Producto("fruna",22,"3jun","monica",20,2);


        Tienda x=new Tienda("Moe's bar", "call2 3", 2913444,productos);
        System.out.println(x);


    }

}
