/**
 * Write a description of class Complejos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Complejo
{
    // Variables miembro (son el estado en el que se encuentra el objeto)
    private double real, imaginario;

    /*
     * Constructores, los utilizo para formar el objeto (lo crea).
     * Les da el estado inicial. (Les pone valores al objeto)
     * (Objeto se define en el programa principal, fuera de esta clase)
     */
    /**
     * Documentacion Externa
     */
    public Complejo() //Constructor por Defecto
    {
        // Inicia variables a cero
        real = imaginario = 0;
    }
    public Complejo(double r, double i) //Constructor
    {
        real = r;
        imaginario = i;        
    }
 
    /*
     * Metodos Get que devuelve el valor fuera de la clase,
     * para que se consulten.
     */
    /**
     * Documentacion Externa
     */
    public double getReal() {
        return real;
    }
    public double getImaginario() {
        return imaginario;
    }

    
    /*
     * Metodos (funcionalidad) sirve para modificar el objeto
     * o trabajar con el. Es las funciones que se pueden hacer.
     */
    
    
   /*public Complejo productoEscalar(int r)
    {
        real*= r; //this.real = this.real*r;
        imaginario*= r; //this.imaginario = this.imaginario*r;
        
        return this;
    }*/
    
    public Complejo productoEscalar (int escalar)  //Devuelve una referencia a un Objeto
    {
        Complejo resul;
        double r,i;
        r = this.real*escalar;
        i = this.imaginario*escalar;
        
        resul = new Complejo(r,i);
        
        return resul;
    }
   
   /*
    * Llegan los dos objetos por parametro
    * Y es un metodo estatico, porque no trabaja con el objeto implicito
    */
   public static boolean comparacion (Complejo c1, Complejo c2) 
    {
        boolean resultado;
        if (c1.real == c2.real && c1.imaginario == c2.imaginario) {
            resultado = true;
        }else{
            resultado = false;
        }
        return resultado;
    }
   public boolean comparacion (Complejo c) {
        boolean resultado;
        if (this.real == c.real && this.imaginario == c.imaginario) {
            resultado = true;
        }else{
            resultado = false;
        }
        return resultado;
    }
}
