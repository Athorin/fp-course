/**
 * Ecuacion de Segundo Grado
 * 
 * @author Fran Azorin
 * @version v2.0    13/05/2014
 */
public class Ecuacion
{
    private double a, b, c;

    public Ecuacion()
    {
        a = 1; b = c = 0;
    }
    public Ecuacion(double a, double b, double c) throws ExcepcionCoeficienteCuadratico {
        if(a==0){
        	throw new ExcepcionCoeficienteCuadratico("Coeficiente Cudratico 0");
        }
    	this.a = a;
        this.b = b;
        this.c = c;
    }
   
    //METODOS GET
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    
    //FUNCIONES
    private double discriminante() 
    {
        double discriminante;
        
        discriminante = b*b - 4*a*c;
        return discriminante;
    }    
    public double solucionUno() {
        double solucion;
        
        if (a != 0) {
            if (discriminante() >= 0) {
                solucion = ( - b + Math.sqrt (discriminante())) / (2 * a);
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
        
        if (a != 0) {
            if (discriminante() >= 0) {
                solucion = ( - b + Math.sqrt (discriminante())) / (2 * a);
            }else{
                solucion = Double.NaN;
            }
        }else{
            solucion=Double.NaN;
        }
        return solucion;        
    }
}
