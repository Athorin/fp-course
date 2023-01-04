import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Parametros
 */
@WebServlet("/Parametros")
public class Parametros extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter salida = response.getWriter();	
		String valorNombre, valorFecha;
		
		//Ponemos esto despues de la URL -> ?nombre=Pepe&fecha=12/09/1992
		
		valorNombre = request.getParameter("nombre");
		valorFecha = request.getParameter("fecha");
		
		salida.println("<html><head><title>Parametros</title></head>  <body>");
		salida.println("<h1>Hola "+valorNombre+"</h1>");
		salida.println("<h1>Has nacido: "+valorFecha+"</h1>");
		salida.println("</html></body>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Para pasar datos por un POST debemos crear un formulario en un HTML aparte
		doGet(request, response);
	}

}
