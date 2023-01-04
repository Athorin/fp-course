import java.util.Scanner;

/**
 * Write a description of class InformacionPersonas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VectorPersonas
{
    public static void main()
    {
        Scanner scan = new Scanner(System.in);
        
        Ciudadano personas[] = new Ciudadano [4];
        String nombre, dni;
        
        for (int i = 0; i < personas.length-1; i++)
        {
            System.out.println("Introduce el nombre de la personas: ");
            nombre = scan.nextLine();
            System.out.println("Introduce el dni de la personas: ");
            dni = scan.nextLine();
            
            personas[i] = new Ciudadano(nombre,Integer.parseInt(dni));
        }
    }
}
