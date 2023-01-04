import java.util.Scanner;

/**
 * Ejemplo de Busqueda Binaria
 * 
 * @author Fran Azorin
 * @version 10/02/2014
 */
public class EJ3v2_BusquedaBinaria
{
    public static void main()
    {
        Scanner scan = new Scanner (System.in);
        
        int vector [] = {0,1,2,3,4,5,6,7,8,9};
        int left = 0, middle, right = 10-1;
        boolean found = false;
        int valor;
        
        System.out.printf ("\n\nIntroduzca el valor a buscar de 0 a 9: ");
        valor = scan.nextInt();
        
        while (left <= right && !found) //Bucle de Busqueda Binaria
        {
            middle = (left + right) / 2; //Suma los lados y divide entre dos para hallar el centro.
            if(vector[middle] == valor){
                found = true; //Si el centro es el valor, ya lo hemos encontrado.
            }else{ if(valor > vector[middle]) 
                   {     //Si el valor es mayor que el centro.
                        left = middle + 1; //El centro se convierte en el nuevo limite izquierdo.
                   }else{//Si el valor es menor que el centro
                        right = middle - 1; //El centro se convierte en el nuevo limite derecho.
                   }
            }
        }
        
       if(found){System.out.printf("Valor encontrado");}
       else{System.out.printf("Valor NO encontrado");}
    }
}
