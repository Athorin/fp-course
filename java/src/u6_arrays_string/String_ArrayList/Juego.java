import java.util.Scanner;

/**
 * Write a description of class Juego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Juego
{
    public static void main()
    {
        Baraja baraja = new Baraja();
        Scanner scan = new Scanner(System.in);
        boolean plantar = false;
        double suma = 0;
        int opcion;
        Carta carta;
        
        System.out.printf("\n     Menu\n******************");      
        baraja.barajar();
        while(plantar == false && suma < 7.5)
        {
            System.out.printf("\nPulse 1 para obtener una carta / Pulse 0 para Plantarse\n");
            opcion = scan.nextInt();
            
            if(opcion == 1)
            {
                carta = baraja.extraerCarta();
                System.out.println("La carta es: "+carta.getNumero()+" "+carta.getPalo());
                if(carta.getNumero() <= 7)
                {
                    suma+= carta.getNumero();
                }else{
                    suma+= 0.5;
                }
                System.out.println("La suma es: "+suma);
                if(suma > 7.5)
                {
                    System.out.printf("\n\nHas superado al 7,5 ¡HAS PERDIDO!\n");
                }else{
                    if(suma == 7.5)
                    {
                        System.out.printf("\n\nHas dado en el clavo. ¡HAS GANADO!\n");  
                    }
                }
            }else{
                if(opcion == 0)
                {
                    plantar = true;
                }
            }            
        }
    }
}
