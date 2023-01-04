import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Write a description of class UsaEcuacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UsaEcuacion
{
	
    public static void main() {
        
    	Scanner scan = new Scanner (System.in);
        double a,b,c;
        
        for(int i = 0; i < 5; i++){
        	
           	a = leerDatos("Introduce el coeficiente cuadr�tico: ");
           	b = leerDatos("Introduce el coeficiente lineal: ");  
           	c = leerDatos("Introduce el t�rmino independiente: ");
        
           	try{
        		     		
               	Ecuacion e = new Ecuacion(a,b,c);
               	System.out.println("La soluci�n uno es: " + e.solucionUno());
               	System.out.println("La soluci�n dos es: " + e.solucionDos());
               	
        	}catch (ExcepcionCoeficienteCuadratico e){
        		
        			System.out.println("Error: " + e);
        	}
        }
        	
        scan.close();
    }
    
    private static double leerDatos(String s){
    	double dato=0; boolean salida = true;
    	Scanner scan = new Scanner (System.in);
    	
    	System.out.println("s");
    	do{
        	try{
        		salida = true;
        		dato = scan.nextDouble();
        	}catch(InputMismatchException e){
        		salida = false;
        		scan.nextLine();
        		System.out.println("Error: Se esperaba un numero real");
        	}
    	}while(!salida);

    	scan.close();
    	return dato;
    }
}
