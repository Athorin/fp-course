import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Hipotenusa
 */
@WebServlet(name = "Hipotenusa", urlPatterns="/Hipotenusa")
public class Hipotenusa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter salida = response.getWriter();
		
		String dato, error = null; 
		boolean excepcion = false;
		int c1, c2, h = 0;
		
		try{
			
			//Cuando no existe parametro en el formulario, request coge Null
			
			dato = request.getParameter("c1");
			if(dato.length() == 0){ throw new NullPointerException(); } //Excepcion lanzada por mi
			c1 = Integer.parseInt(dato); //Si da error al pasarlo a int, salta NumberFormatException
			
			dato = request.getParameter("c2");
			if(dato.length() == 0){ throw new NullPointerException(); } 
			c2 = Integer.parseInt(dato); 
			
			
			//Calculo de la Hipotenusa
			h = (int) Math.sqrt( (Math.pow(c1, 2)) + (Math.pow(c2, 2)) );
			
		}catch (NullPointerException e1){
			error = "Error: No hay datos";
			excepcion = true;
		}catch (NumberFormatException e2){
			error = "Error: No son numeros";
			excepcion = true;
		}
		
		
		salida.println("<html><head><title>Hipotenusa</title></head><body>");	
		if(excepcion){
			salida.println("<h1>"+error+"</h1>");
		}else{
			salida.println("<h1>Hipotenusa: "+h+"</h1>");
		}
		salida.println("</body></html>");

		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
