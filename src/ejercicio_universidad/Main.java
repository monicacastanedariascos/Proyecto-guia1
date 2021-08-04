package ejercicio_universidad;

public class Main {
    public static void main(String[] args) {
    //definir cursos

        Curso cursillos[]=new Curso[3];
        cursillos[0]=new Curso(222,3,"104",10);
        cursillos[1]=new Curso(223,3,"105",11);
        cursillos[2]=new Curso(224,8,"102",15);

    //definir profesores

        Profesor profesores[]=new Profesor[3];
        profesores[0]=new Profesor("monica",112,"medellin","17junio","medellin","colomba",2000000,"ingeniro",cursillos);
        profesores[1]=new Profesor("monica",112,"medellin","17junio","medellin","colomba",2000000,"ingeniro",cursillos);
        profesores[2]=new Profesor("monica",112,"medellin","17junio","medellin","colomba",2000000,"ingeniro",cursillos);


        //definir facultad

        Facultad facultades[]=new Facultad[1];
        facultades[0]=new Facultad("facultad ingenieria",profesores);

        Universidad universidad=new Universidad("ean","baptiste","bogota",facultades);

        System.out.println(universidad);

    }
}
