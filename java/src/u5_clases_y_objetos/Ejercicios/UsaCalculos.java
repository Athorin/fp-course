import java.util.Scanner;
/**
 * Write a description of class UsaCalculos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UsaCalculos
{
    public static void main() {
        Scanner scan = new Scanner(System.in);
        
        int opcion= -1;
        int n;
        
        while(opcion!=0) {
            System.out.println("Menu Principal");
            System.out.println("1. Suma de los N primeros números naturales");
            System.out.println("Elige opción: ");
            opcion=scan.nextInt();
            
            switch(opcion){
                case 1: System.out.print("Introduce el valor de N: ");
                        n=scan.nextInt();
                        System.out.println("La suma es: " + Calculos.sumaNaturales(n));
                        break;
            }
        }
    }
}
