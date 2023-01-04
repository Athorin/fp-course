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
        int a,b,c;
        Ecuacion ec1;
        
        System.out.println("Vamos a pedirte los valores de los 3 coeficientes de la ecuacion");
        do{
            System.out.println("Introduce el valor de A: ");
            a = scan.nextInt();
            System.out.println("Introduce el valor de B: ");
            b = scan.nextInt();
            System.out.println("Introduce el valor de C: ");
            c = scan.nextInt();
            
            ec1= new Ecuacion(a,b,c);
            if ( a!=0 || b!=0 || c!=0 ) {
            System.out.println("La primera solucion es: " + ec1.solucionUno() );
            System.out.println("La segunda solucion es: " + ec1.solucionDos() );
            }
            
        }while ( a!=0 || b!=0 || c!=0 ) ;
            
        
    }
}
