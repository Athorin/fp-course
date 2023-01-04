/**
 * Escribir fragmento de codigo que haga lo siguiente:
 * a. Definir vector de nombre muestras de 40 elementos tipo double.
 * b. Almacenar un valor enc ada elemento del vector que coincida con la posicion que ocupa en el ebvctor.
 * c. Mostrar por consola el valor de los ultimos cinco elementos.
 * d. ¿Se puede almacenar el valor 3,1416 en el vector? Razona la respuesta
 * e. ¿Se puede utilizar el valor 3,1416 como un indice del vector? Razona la respuesta
 * 
 * 
 * @author Fran Azorin
 * @version 23/02/2014
 */
public class EJ7_PreguntasCortas
{
    public static void main()
    {
        //Punto A del ejercicio
        double muestras [] = new double [40];
        int i;
        
        //Punto B del ejercicio
        for (i = 0; i < muestras.length; i++)
        {
            muestras[i] = i;
        }
        
        //Punto C del Ejercicio
        System.out.printf ("Los ultimos 5 numeros del vector muestras son: ");
        for (i = muestras.length-5; i < muestras.length; i++)
        {
            System.out.printf("\nPosicion %d -> Valor %.2f  ",i,muestras[i]);
        }
        
        /* Punto D del ejercicio
         * Si que se puede usar el valor 3,1414 en el vector
         * porque los elementos contenidos en el vector son de tipo double 
         */
        
        /* Punto E del ejercicio
         * Pero el 3,1416 no se puede utiliar como indice del vector
         * porque los vectores son secuenciales enteros.
         */
        
        
        
    }
}
