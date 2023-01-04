import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Clase Ciudadano que almacena el Nombre y DNI de una persona.
 * Los metodos get() y set(), y dise�ar un metodo que calcule y devuelva el NIF.
 * 
 * @author Fran Azorin
 * @version 24/02/2014
 */
public class Ciudadano
{
    private String nombre;
    private String dni;
    private Calendar fechaNac;
    
    //CONSTRUCTORES
    public Ciudadano()
    {
        nombre = new String();
        dni = new String();
        fechaNac = null;
    }
    public Ciudadano(String nombre, int dni)
    {
        this.nombre = new String (nombre);
        this.dni = calcularNIF(dni);
    }
    public Ciudadano(String n, int d, int dia, int mes, int a�o)
    {
    	setNombre(n);
    	setDNI(d);
    	setFecha(dia,mes,a�o);
    }
    
    //Metodos GETTER
    public String getNombre()
    {
        return new String (nombre); //Asi se devuelve una copia, para mayor privacidad.
        //return nombre; Y desde aqui la original, que podria acceder cualquiera.
    }
    public String getDNI()
    {
        return dni;
    }
    public Calendar getFechaNac()
    {
    	return fechaNac;
    }
    
    //Metodos SETTER
    public void setNombre(String nombre)
    {
    	this.nombre = new String (nombre);
    }
    
    public void setFecha (Calendar f)
    {
    	this.fechaNac = f;
    }
    public void setFecha (int d, int m, int a)
    {
    	this.fechaNac = new GregorianCalendar(a,m-1,d);
    }
    public void setDNI(int nif) throws Exception
    {
    	if(!dniValido(nif)){
    		throw new Exception("Dni " + nif + " no es valido.");
    	}
    	this.dni = calcularNIF(nif);
    }
    
    //Metodos Funcionales
    
    private boolean dniValido(int dni){
    	boolean resultado = true;
    	if (dni < 1 || dni > 99999999){
    		resultado = false;
    	}
    	return resultado;
    }
    public String calcularNIF(int dni)
    {
        String letrasNIF = "TRWAGMYFPDXBNJZSQVHLCKE";
        String nif;
        int resto = dni % 23;
        nif = String.valueOf(dni) + letrasNIF.charAt(resto);
        
        return nif;
    }
}
