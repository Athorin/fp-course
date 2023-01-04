/**
 * Usar el programa Complejo hecho en clase.
 * A�adir la funcionalidad suma:
 * 	- Suma un numero complejo que recibe por parametro al numero implicito.
 * 	  Dejando el resultado en el numero implicito.
 * A�adir funcionalidad toCadena():
 *  - Devuelve el numero complejo en forma de String con formato (a+bi)
 * 
 * @author Fran Azorin 
 * @version 03.05.2014
 */
public class Complejo
{

	//Variables Miembro
    private double real, imaginario;

    public Complejo() //Constructor por Defecto
    {
        real = imaginario = 0;
    }
    public Complejo(double r, double i) //Constructor
    {
        real = r;
        imaginario = i;        
    }
 
    
    //Metodos Get
    public double getReal() {
        return real;
    }
    public double getImaginario() {
        return imaginario;
    }

    
    
    //Funcion Suma
    public void suma(Complejo c){
    	this.real += c.real;
    	this.imaginario += c.imaginario;
    }
    
    //Funcion que convierte a String
    public Complejo toCadena(){
    	String cadena;
    		toString(); //ESTA A MEDIO HACER
    	return cadena;
    }

  
    //Devuelve un Complejo
    public Complejo productoEscalar (int escalar) 
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
