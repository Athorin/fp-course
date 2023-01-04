import java.util.Scanner;

/**
 * Programa que lee tantos numero enteros como quiere el usuario.
 * (en forma de Cadena de Caracteres)
 * 
 * Calcula la media de todos los numeros introducidos.
 * 
 * El programa finaliza cuando se lee el valor 0.
 * 
 * @author Fran Azorin
 * @version 03/02/2014
 */
public class Media
{
    public static void main()
    {
        Scanner scan = new Scanner (System.in);
        double media;
        int i,num;
        String valor;
        
        media=0;
        i=0;
        
                
        do{
            System.out.print("Introduce un numero entero (0 para terminar): ");
            valor = scan.nextLine();
            num = Integer.parseInt(valor);
            i++;
            media+= num;
            
            //num = new Integer (valor).intValue();
        }while(num!=0);

        if(i!=0){
            media/= i;
            System.out.println("La media de los valores de leidos es: " + media);
        }else{
            System.out.println("No se han leido valores distintos de cero");
        }

        
    }
}
