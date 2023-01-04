/**
 * Ecuacion de Segundo Grado
 * 
 * @author Fran Azorin
 * @version v1.0    20/01/2014
 */
public class Ecuacion
{
    // Variables miembro, coeficientes de la Ecuacion de Segundo grado
    private int coefA, coefB, coefC;

    /**
     * Constructores para objectos de la clase Ecuacion
     */
    public Ecuacion()
    {
        // Inicializar variables miembro
        coefA = 1; coefB = coefC = 0;
    }
    public Ecuacion(int a, int b, int c) {
        coefA = a;
        coefB = b;
        coefC = c;
    }
   

    /**
     * Metodos GET para devolver los valores, que se consulten fuera de la clase
     * 
     * @param  void   no tiene parametro.
     * @return     el Coeficiente de A, B y C
     */
    public int getCoefA() {
        return coefA;
    }
    public int getCoefB() {
        return coefB;
    }
    public int getCoefC() {
        return coefC;
    }
    
    /**
     * Metodos para obtener la Solucion de la Ecuacion
     */
    private int discriminante() //Lo hacemos privado, para encapsularlo y que el usuario no se entere de este calculo
    {
        int discriminante;
        
        discriminante = coefB * coefB - 4 * coefA * coefC;
        return discriminante;
    }    
    public double solucionUno() {
        double solucion;
        
        if (coefA != 0) {
            if (discriminante() >= 0) {
                solucion = ( - coefB + Math.sqrt (discriminante())) / (2 * coefA);
            }else{
                solucion = Double.NaN;
            }
        }else{
            solucion=Double.NaN;
        }
        return solucion;
    }
    public double solucionDos() {
        double solucion;
        
        if (coefA != 0) {
            if (discriminante() >= 0) {
                solucion = ( - coefB + Math.sqrt (discriminante())) / (2 * coefA);
            }else{
                solucion = Double.NaN;
            }
        }else{
            solucion=Double.NaN;
        }
        return solucion;        
    }
}
