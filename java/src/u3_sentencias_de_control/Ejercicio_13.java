package u3_sentencias_de_control;
/**
 * Programa que calcula e imprime el factorial de varios numeros introducidos por teclado.
 * La entrada de Datos finaliza cuando el usuario introduce un numeronegativo.
 * Tiene metodo factorial
 * 
 * @author Azorin 
 * @version v1.0
 */


import java.util.Scanner;

public class Ejercicio_13
{
    public static double factorial(int num)
    {
        int m=1;
        for(int i=1;i<=num;i++) {
                m=m*i;
        }
        return m;
    }
    
    
    
    
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
        int n;
        double m;
        
        do{
            System.out.print("Introduce un numero: ");
            n=scan.nextInt();
            m=factorial(n);
            
            if(n>0) {
                System.out.println("El factorial es: "+m);
            }
            else{System.out.println("Salir del programa");}
            
            System.out.println("");
            
        }while(n>=0); 
    } 
}
