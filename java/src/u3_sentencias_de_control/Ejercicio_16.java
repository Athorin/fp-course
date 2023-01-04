package u3_sentencias_de_control;
/**
 * Lee un valor entero positivo por teclado y muestra una tabla de numeros
 * desde 1 hasta n en piramidal
 * 
 * @author Fran Azorin 
 * @version v1.0   20/11/2013
 */

import java.util.Scanner;
public class Ejercicio_16
{
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
        int n,i,j;
        
        System.out.print("Introduce un numero: ");
        n=scan.nextInt();
        
        if(n>0) {
            for(i=n;i>0;i--) {
                for(j=1;j<=i;j++){
                    System.out.printf("%d ",j);
                }
                System.out.println("");
            }
        }else{ System.out.printf("El numero %d es negativo, no se ejecuta el programa",n);}
    }
}
