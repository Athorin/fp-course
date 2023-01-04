package u3_sentencias_de_control;

/**
 * Contar de 1 a 10 formateado en lineas, hasta 12 veces.
 * 
 * @author Fran Azorin 
 * @version v1.0
 */
public class Ejercicio_15
{
    public static void main()
    {
        int j,i;
    
        for(i=0;i<12;i++) {
            for(j=0;j<=10;j++){
                System.out.printf(" %d",j);
            }
            System.out.println("");
        }
    }
}
