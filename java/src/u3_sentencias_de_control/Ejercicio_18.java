package u3_sentencias_de_control;
/**
 * Crear Metodo elevadoA() como funcion del programa. Pedira dos numeros por teclado
 * base y exponente, y calculara el resultado de la operacion, sin numeros negativos.
 * 
 * @author Fran Azorin 
 * @version v1.0  20/11/2013
 */


import java.util.Scanner;
public class Ejercicio_18
{
    public static double elevadoA(int b,int e)
    {
        double n;
        int i;
        
        i=1;
        n=b;
        
        do{
            n=(n*b);
            i++;
        }while(i<e);
        
        return n;
    }
    
    public static void main()
    {
        Scanner scan=new Scanner(System.in);
        int b,e,r;
        
        System.out.print("Introduce la base: ");
        b=scan.nextInt();
        System.out.print("Introduce el exponente: ");
        e=scan.nextInt();
        
        
        System.out.println("\nEl resultado es: "+elevadoA(b,e));
    }
        
        
}
