package hugo;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main (String[]args){
        Scanner captura = new Scanner(System.in);
        logica fisica =new logica();

        int cantidad;

        System.out.print("ingrese la cantidad ");
        cantidad=captura.nextInt();

        for(int i=1;i<=cantidad;i++){
            System.out.println("ingrese numero["+i+"]=");
           int  datos=captura.nextInt();
            fisica.agregar(datos);
        }
        System.out.println(fisica.Media());
        System.out.println(fisica.Desviacion());
    }
}
