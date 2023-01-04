/**
 * Ordena el vector de tamaño N con el metodo burbuja.
 * 
 * Metodo Burbuja:
 * Realiza como maximo N-1 pasadas por el vector, siendo N el tamaño del mismo.
 * En cada pasada compara elementos dos a dos, de forma que si encuentra
 * dos elementos "desordenados" los intercambia.
 * 
 * @author Fran Azorin
 * @version 23/02/2014
 */
public class EJ5_Burbuja
{
    public static void main() 
    {
           int vector [] = {2,4,3,5,1};
           int n, j, i;
           
           
           for (i = 0; i < vector.length; i++)
           {
               for (j = 0; j < vector.length-1; j++)
               {
                   if (vector[i] < vector[j]) 
                   {
                       n = vector[i];
                       vector[i] = vector[j];
                       vector[j] = n;
                   }
               }
           }
           
           for (i = 0; i < vector.length; i++)
           {
               System.out.println(vector[i]);
            }
    }
}
