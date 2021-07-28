import javax.swing.*;
import javax.swing.JOptionPane;
import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main (String args[]){
        Fraccionario x=new Fraccionario();
        System.out.println(x);
        Fraccionario w=new Fraccionario(1,2);
        System.out.println(w);

        /*System.out.println("Hola esto esta raro");
        System.out.println("yo soy capaz");
        byte entero;
        entero=32;
        System.out.println("numeroentero: "+entero);
        Scanner entrada = new Scanner(System.in);
        float numero;

        System.out.println("digite un mumero: ");
        numero=entrada.nextFloat();
        System.out.printf("el numero digitado es "+numero);
*/

        /*
        Scanner entrada= new Scanner(System.in);
        System.out.print("digite 2 numeros: ");
        float numero1, numero2,suma,resta,multi,div, mod;
        numero1=entrada.nextFloat();
        numero2=entrada.nextFloat();
        suma=numero1+numero2;
        resta=numero1-numero2;
        multi=numero1*numero2;
        div=numero1/numero2;
        mod=numero1%numero2;

        System.out.println("lasuma es "+suma);
        System.out.println("la resta es "+resta);
        System.out.println("la multiplicaicon es "+multi);
        System.out.println("la division es "+div);
        System.out.println("el modulo es"+mod);
*/
        /*
        int numero, dato=5;
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero: "));
        if (numero==dato) {
            JOptionPane.showMessageDialog(null,"el numero e 5");
        }
        else {
            JOptionPane.showMessageDialog(null, "el numero NO es 5");
        }


         */
        /*
        int dato;
        dato=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero: "));
        switch(dato){
            case 1: JOptionPane.showMessageDialog(null,"elnumero es 1");
                break;
            case 2: JOptionPane.showMessageDialog(null,"elnumero es 2");
                break;
            case 3: JOptionPane.showMessageDialog(null,"elnumero es 3");
                break;
            case 4: JOptionPane.showMessageDialog(null,"elnumero es 4");
                break;
            case 5: JOptionPane.showMessageDialog(null,"elnumero es 5");
                break;
            default: JOptionPane.showMessageDialog(null,"elnumero no esta entre 1 y 5");
                break;

        }
*//*
        int numero;
        numero=Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
        JOptionPane.showMessageDialog(null, (numero%2==0) ? "espar": "es impar");
*/

    }

}
