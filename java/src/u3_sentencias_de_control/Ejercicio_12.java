package u3_sentencias_de_control;
/**
 * Write a description of class Ejercicio_12 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Ejercicio_12
{
    public static void main()
    {
        Scanner entrada=new Scanner (System.in);
        int n,i;
        float m;
        i=0;
        m=0;
        n=1;
        
        while(n!=0) {
            System.out.print("Introduce un numero: ");
            n=entrada.nextInt();
            m+=n;
           
            if(n!=0) {i++;}
        }
        
        m=m/i;
        System.out.println("La media es: "+m);
    }
}
