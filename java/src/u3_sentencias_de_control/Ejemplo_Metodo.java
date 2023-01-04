package u3_sentencias_de_control;

/**
 * Ejemplo de Metodo.
 * 
 * @author Azorin 
 * @version Beta 1.0
 */
public class Ejemplo_Metodo
{
    public static boolean mayuscula (char c)
    {
        boolean resultado;
        
        if (c>='A' && c<='Z') {
            resultado=true;
        }else{
            resultado=false;
        }
        
        return resultado;
    }
    
    
    
    public static void main ()
    {
        char letra='E';
        
        if (mayuscula(letra)) {
            System.out.println (letra + " es una letra mayuscula");
        }else{
            System.out.println (letra + " no es una letra mayuscula");
        }
        
    }
}
