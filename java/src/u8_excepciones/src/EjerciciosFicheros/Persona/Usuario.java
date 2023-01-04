import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 * Usuario es una persona que se da de alta en una aplicacion, en determinada fecha.
 * 
 * Clase Usuario con siguiente informacion:
 * - Nombre - Dni - Clave - Aplicacion - Fecha de Alta
 * Tiene constructor y metodos Get
 * 
 * Fecha Formato: Tipo GregorianCalendar (capturada del S.O.)
 * 
 * @author Fran Azorin
 * @version v1.0
 */
public class Usuario extends Persona {

	private String aplicacion;
	private GregorianCalendar alta;
	
	public Usuario(){
		super();
		aplicacion = new String();
		alta = new GregorianCalendar();
	}
	
	public Usuario(String nombre, int dni, String app) throws ExceptionDni{
		super(nombre, dni, "0/0/0");
		aplicacion = new String(app);
		setFechaAlta();
	}
	
	
	//Metodos SET / GET
	public void setApp (String app){
		this.aplicacion = new String (app);
	}
	public void setFechaAlta(){
		this.alta = (GregorianCalendar) Calendar.getInstance();
	}
	
	public String getApp(){	
		return this.aplicacion;
	}
	public String getFechaAlta(){
		String fecha;
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		fecha = formato.format(alta.getTime());
		return fecha;
	}
	
	
	
	//Metodos Funcionales
	
	
}
