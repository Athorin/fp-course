/*import java.util.Calendar;
import java.util.GregorianCalendar;*/

/**
 * Clase Ciudadano que almacena el Nombre y DNI de una persona.
 * Los metodos get() y set(), y dise�ar un metodo que calcule y devuelva el NIF.
 * 
 * @author Fran Azorin
 * @version 24/02/2014
 */
public class Persona
{
    private String nombre;
    private String dni;
    private String fechaNac;
    private String clave;
    
    
    //CONSTRUCTORES
    public Persona()
    {
        nombre = new String();
        dni = new String();
        fechaNac = null;
        clave = new String();
    }
    public Persona(String nombre, int dni, String fecha) throws ExceptionDni
    {
        this.nombre = new String (nombre);
        setDNI(dni);
        setFecha(fecha);
        setClave();
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
    public String getFecha()
    {
    	return fechaNac;
    }
    public String getClave()
    {
    	return clave;
    }
    
    
    
    //Metodos SETTER
    public void setNombre(String nombre)
    {
    	this.nombre = new String (nombre);
    }
    
    public void setDNI(int nif) throws ExceptionDni
    {
    	if(!dniValido(nif)){
    		throw new ExceptionDni("Dni " + nif + " no es valido.");
    	}else{
    		this.dni = calcularNIF(nif);
    	}
    }
    
    public void setFecha(String fecha)
    {
    	this.fechaNac = new String (fecha);
    }
    
    public void setClave()
    {
    	char random[] = new char[6];
    	String clave; int i;
    	
    	for(i = 0; i < 3; i++){
    		random[i] = this.dni.charAt((int) (Math.random()*this.dni.length()));
    	}
    	for(i = 3; i < 6;i++){
    		random[i] = (this.nombre.charAt((int) (Math.random()*this.nombre.length()) ));
    	}
    	
    	this.clave = new String(random);
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
