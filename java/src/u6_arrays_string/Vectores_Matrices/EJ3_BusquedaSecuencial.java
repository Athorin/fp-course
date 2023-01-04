import java.util.Scanner;

/**
 * Almacena 20 numeros enteros (entre 1 y 100) de forma aleatoria.
 * Pedir un valor por teclado y determina si se encuentra o no en el vector.
 * 
 * Busqueda Secuencial
 * Se recorre el vector desde el primero elemento, comparando cada uno de ellos
 * con el valor a buscar. Para determinar si se ha encontrado o no, se utiliza una
 * variable interruptor.
 * 
 * @author Fran Azorin
 * @version 06/02/2014
 */
public class EJ3_BusquedaSecuencial
{
    public static void main()
    {
        Scanner scan = new Scanner (System.in);
        int vector [] = new int [20];
        int num,i;
        boolean found;
        
        for(i=0; i<vector.length; i++)
        {
            vector[i] = (int) (Math.random()*100);
            System.out.printf("%d ",vector[i]);
        }
        
        System.out.println("\nBusqueda por el vector de un numero, introduzcalo: ");
        num = scan.nextInt();
        i=0; found=false;
        do
        {
            if(vector[i] == num)
            {
                  found = true;
                  System.out.printf("Se ha encontrado una coincidencia en la posicion "+i+" del vector");
            }
            i++;
        
        }while(i<vector.length & found==false);
        
        if(found == false){System.out.println("No hay coincidencias");}
    }
}
