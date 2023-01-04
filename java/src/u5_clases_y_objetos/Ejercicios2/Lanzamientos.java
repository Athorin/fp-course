import java.util.Scanner;
/**
 * Programa que lanza un dado 10 veces y determina cuantos numeros pares hemos obtenido.
 * Utiliza una clase objeto Dado.
 */
public class Lanzamientos
{
    public static void main(){
        Scanner scan = new Scanner(System.in);
        int n,p=0,i,caras;
        
        System.out.println("Introduce el numero de caras del dado");
        caras=scan.nextInt();

        Dado dado1 = new Dado (caras);
        
        for(i=1;i<=10;i++){
            n=dado1.lanzarDado();
            System.out.println("Tirada "+i+" El numero es: "+n);
            if(n%2==0){
                p++;
            }
        }
        System.out.println("La cantidad de numero pares que han salido es: "+p);
    }
}
