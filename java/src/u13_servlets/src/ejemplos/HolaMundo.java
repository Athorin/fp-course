import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class HolaMundo
 */
//@WebServlet(name = "Anotacion", urlPatterns="/Anotaciones") Es una anotacion, simplifica mucho.
//Esto sobra porque lo vamos a poner en el Descritor de Despligue a traves de Web.xml
//O se pone la anotacion, o se pone en el descriptor, pero las dos no.
public class HolaMundo extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter salida = response.getWriter();
		
		salida.println("<html>");
		salida.println("<body>");
		for(int i = 1; i <= 6; i++){
			salida.println("<h"+i+">Hola Mundo</h"+i+">");
		}
		salida.println("</body>");
		salida.println("</html>");
		
		System.out.println("Servlet Hola Mundo");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
