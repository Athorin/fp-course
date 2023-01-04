import java.util.Scanner;

/**
 * Almacena 10 objetos enteros en un vector.
 * Los valores enteros son introducidos por teclado.
 * Una vez creado, se calcula e imprime la media de los valores almacenados.
 * 
 * @author Fran Azorin 
 * @version 23/02/2014
 */
public class EJ6_Media
{
   public static void main()
   {
       Scanner scan = new Scanner (System.in);
       
       int valores [] = new int [5];
       int i;
       double media=0;
       
       for (i = 0; i < valores.length; i++)
       {
           System.out.println("Introduce valor a almacenar: ");
           valores [i] = scan.nextInt();
       }
       
       System.out.printf("\n\n");
       
       for (i = 0; i < valores.length; i++)
       {
           System.out.printf("%d ",valores[i]);
           media+= valores[i];
       }       
       media = media / valores.length;
       System.out.printf("\nLa media es: %.2f",media);
   }
}
