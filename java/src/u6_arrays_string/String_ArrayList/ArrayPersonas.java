import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a description of class InformacionPersonasArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayPersonas
{
    public static void main()
    {
        Scanner scan = new Scanner (System.in);
        
        ArrayList<Ciudadano> personas = new ArrayList<Ciudadano>();
        String nombre; int dni; String letra;
       
        for(int i = 0; i < 2; i++)
        {
            System.out.println("Introduce el nombre de la persona: ");
            nombre = scan.nextLine();
            System.out.println("Introduce el dni: ");
            dni = scan.nextInt(); scan.nextLine();

            personas.add(new Ciudadano(nombre, dni));    
        }
        
        System.out.println("Introduce una letra DNI para buscar coincidencia: ");
        letra = scan.nextLine().toUpperCase();
        
        for(int i = 0; i < personas.size(); i++)
        {
            System.out.println(personas.get(i).calcularNIF());
            
            //charAt(ultima posicion) personas.get(i).calcularNIF();
        }
        /*for(int i = 0; i < personas.size(); i++)
         *{
         * *******Personas Almacenadas*********
         * nombre = personas.get(i).getNombre();
         * System.out.println("Persona "+nombre);
         *}
         */
        
    }
}
