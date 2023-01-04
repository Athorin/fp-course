/**
 * Programa que desplaza los elementos del vector una posicion a la derecha.
 * 
 * @author Fran Azorin 
 * @version 06/02/2014
 */
public class EJ2_Desplazamiento
{
    public static void main()
    {
        int vector[] = new int [10];
        //int vector[] = {1,2,3,4,5,6,7,8,9,10}
        
        for(int i=0, j=1; i<vector.length; i++,j++)
        {
            vector[i] = j;
            System.out.println("Posicion "+i+" numero "+vector[i]);
        }
        
        System.out.printf("\n\nDesplazamos todos los elementos una posicion a la derecha.\n\n");
        
        
        for(int i= vector.length-1; i>=0; i--)
        {
           if(i>0){
               vector[i] = vector[i-1];
           }else{
               if(i == 0){
                   vector[i] = 0;
               }
            }
            
            System.out.println("Posicion "+i+" numero "+vector[i]);
        }
    }    
}
