/**
 * Almacena 20 numeros enteros aleatorios comprendidos entre 50 - 100.
 * Despues de Almacenarlos, mostrarlos por pantalla.
 * 
 * Ejemplo de un Vector.
 * 
 * @author Fran Azorin 
 * @version 05/02/2014
 */
public class EJ1_Vector
{
    public static void main()
    {
        int almacenaNum [] = new int [20];
        int i;
        
        //De la otra forma, si el tamaño del vector cambia tambien cambia en los bucles
        for(i=0;i<20;i++) //(i=0;i < almacenaNum.length; i++) 
        {
            almacenaNum[i] = (int)(Math.random() * 51 + 50);
        }
        
        i=0;
        System.out.println("Los Numeros almacenados son: ");
        do
        {
            System.out.printf("Posicion %d -> Numero %d \n",i,almacenaNum[i]);
            i++;
        }while(i < almacenaNum.length);
    }
}
