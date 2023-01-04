import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a description of class EJ19_ArrayListString here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EJ19_ArrayListString
{
    public static void main()
    {
        Scanner scan = new Scanner (System.in);
        
        ArrayList<String> nombres = new ArrayList<String>();
        ArrayList<String> apellidos = new ArrayList<String>();
        
        String dato;
        
        for(int i = 1; i <= 2; i++)
        {
            System.out.println("Introduce el nombre del alumno: ");
            dato = scan.nextLine();
            nombres.add(dato);
            
            System.out.println("Introduce los apellidos del alumno: ");
            apellidos.add(scan.nextLine());
        }
        
        System.out.printf("\n\n");
        
        for(int i = 0; i < nombres.size(); i++)
        {
            System.out.println("Nombre: "+nombres.get(i)+" "+apellidos.get(i));
        }
    }
}
