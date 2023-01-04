import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/*TAREAS PENDIENTES
 * DAR FORMATO A LAS FECHAS
 */

/**
 * Servlet implementation class Seguimiento
 */
@WebServlet("/Seguimiento")
public class Seguimiento extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * doGet manda por el URL
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * doPost manda por formularios
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter salida = response.getWriter();
		
		HttpSession sesion; //Almacena la Sesion
		Integer contador;
		
		sesion = request.getSession(); //Devuelve la sesion o crea una nueva
		
		if(sesion.isNew()){
			contador = new Integer(1); //Crea la variable
			
		}else{
			contador = (Integer) sesion.getAttribute("Visitas"); //Recupera el atributo
			
			int cont = contador.intValue();
			cont++; //Lo incrementamos de esta forma, porque el objeto es constante
			contador = new Integer(cont);
		}
		
		sesion.setAttribute("Visitas", contador); //Almacena la referencia a la variable
		//Tambien hace encapsulacion y desencapsulacion de tipo automatica, por lo que podemos cambiar
		//lo de new Integer, por un tipo primitivo int
		
		
		salida.println("<html><body>");
		salida.println("Identificacion de Sesion: " + sesion.getId() + "<br>");
		salida.println("Numero de Accesos a la Sesion Actual: " + sesion.getAttribute("Visitas") + "<br>");
		salida.println("Fecha de la Creacion de la Sesion: " + sesion.getCreationTime() + "<br>");
		salida.println("Fecha de la Ultima Sesion: " + sesion.getLastAccessedTime() + "<br>");
		salida.println("</body></html>");
		 
		
	}

}
