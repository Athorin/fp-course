/**
 * Clase Ciudadano que almacena el Nombre y DNI de una persona.
 * Los metodos get() y set(), y diseñar un metodo que calcule y devuelva el NIF.
 * 
 * @author Fran Azorin
 * @version 24/02/2014
 */
public class Ciudadano
{
    private String nombre;
    private int dni;
    
    public Ciudadano()
    {
        nombre = new String();
        dni = 0;
    }
    
    public Ciudadano(String nombre, int dni)
    {
        this.nombre = new String (nombre);
        this.dni = dni;
    }
    
    
    public String getNombre()
    {
        return new String (nombre); //Asi se devuelve una copia, para mayor privacidad.
        //return nombre; Y desde aqui la original, que podria acceder cualquiera.
    }
    public int getDNI()
    {
        return dni;
    }
    
    public void setDatos()
    {
        
    }
    
    
    public String calcularNIF()
    {
        String letrasNIF = "TRWAGMYFPDXBNJZSQVHLCKE";
        String nif;
        int resto = dni % 23;
        nif = String.valueOf(dni) + letrasNIF.charAt(resto);
        
        return nif;
    }
}
