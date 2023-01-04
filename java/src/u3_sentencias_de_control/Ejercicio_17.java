package u3_sentencias_de_control;
/**
 * 10 numeros introducidos por teclado, cual es el mayor
 * 
 * @author Fran Azorin 
 * @version v1.0  20/11/2013
 */

import java.util.Scanner;

public class Ejercicio_17
{
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
        int n,i,mayor;
        
        mayor=Integer.MIN_VALUE;
        
        for(i=1;i<10;i++) {
            System.out.print("Introduce otro numero: ");
            n=scan.nextInt();
            
            if(n>mayor) {mayor=n;}
            
        }
            
        System.out.printf("\nEl mayor de los numeros es: %d",mayor);
    }
}
