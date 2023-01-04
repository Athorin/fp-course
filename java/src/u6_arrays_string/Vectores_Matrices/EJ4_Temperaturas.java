/**
 * Almacena las temperaturas diarias durante una semana 
 * y que calcule la temperatura maxima y minima.
 * 
 * Indicar el dia de la semana que ha registrado el valor maximo
 * y el dia de la semana que ha registrado el valor minimo.
 * 
 * @author Fran Azorin
 * @version 10/02/2014
 */
public class EJ4_Temperaturas
{
    public static void main()
    {
        double temperaturas [] = new double [7];
        int dia;
        double min,max;
        int diamin = 0, diamax = 0;
        
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        
        for(dia = 0; dia < temperaturas.length; dia++)
        {
            temperaturas[dia] = (double) (Math.random() * 30);
            System.out.printf("Para el dia %d hace una temperatura de %.1f ºC\n",dia,temperaturas[dia]);
            
            if(temperaturas[dia] < min){
                min = temperaturas[dia];
                diamin = dia;
            }else{ if (temperaturas[dia] > max){
                      max = temperaturas[dia];
                      diamax = dia;
                   }
            }
        }
        System.out.printf("\nLa temperatura minima es: %.1f ºC, el dia %d",min,diamin);
        System.out.printf("\nLa temperatura maxima es: %.1f ºC, el dia %d",max,diamax);

    }
}
