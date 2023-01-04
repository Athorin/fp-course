package u3_sentencias_de_control;

/**
 * Introduce un caracter y determina si es alfanumero o no mediante una funcion.
 * 
 * @author Fran Azorin 
 * @version v1.0
 */



public class Ejercicio_14
{
    public static boolean esAlfanumerico(char c)
    {
        boolean x;
        
        if(c>='A' && c<='Z' || c>='a' && c<='z' || c>='0' && c<='9') {
            
            x=true;
            
        }else{x=false;}
        
        return x;
    }
    
    
    
    public static void main()
    {
        char car;
        
        car=';';
        
        if(esAlfanumerico(car)) {
            System.out.printf("El caracter %c es alfanumerico",car);
        }else{System.out.printf("El caracter %c NO es alfanumerico",car);}
    }
}
