import javax.swing.JOptionPane;
import java.util.Scanner;
import javax.swing.*;

import javax.swing.*;
public class arreglos {

    public static void main(String[] args){
        Scanner entrada= new Scanner(System.in);
        int nElementos;
        nElementos=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo"));
        char[] letras = new char[nElementos];
        System.out.println("digite los elementos");
        for(int i=0; i < nElementos; i++){
            System.out.print((i+1) + ". Digite un caracter: ");
            letras[i]=entrada.next().charAt(0);
        }
        System.out.println("\nlos caracteres del arreglo son: ");
        for(int i=0; i<nElementos;i++){
            System.out.println(letras[i]);
        }




    }
}
