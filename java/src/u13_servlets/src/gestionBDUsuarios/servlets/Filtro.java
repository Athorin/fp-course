import javax.servlet.*;
import java.io.IOException;

/**
 * Servlet Filter implementation class Filtro
 */
//@WebFilter(servletNames = { "ModUsuario" })
public class Filtro implements Filter {

    /**
     * Constructor por Defecto
     */
    public Filtro() {
        
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		//En null se pone el recurso al que se le devuelve el control (puede ser un servlet u otra cosa)
		//Realmente no se muy bien como funciona
		RequestDispatcher dispatcher = request.getRequestDispatcher(null); 
		dispatcher.forward(request, response);
		
		//ESTRUCTURA
		//RECOGER LOS DATOS DE USUARIO
		
		String nombre = request.getParameter("nombre");
		String password = request.getParameter("actual");
		String newPassword = request.getParameter("nueva");
		String repeatPassword = request.getParameter("repetir");
		
		System.out.println(nombre);
		
		//SI DATOS VACIOS ENTONCES 
		if(nombre == "" || password == "" || newPassword == "" || repeatPassword == ""){
			
		}
			//ENVIAR CONTROL A PAGINA DE ERROR
		
		//SI NO
			
			//SI CONTRASE�AS NO OK ENTONCES
				
				//LANZAS CONTROL A OTRA PAGINA DE ERROR
			
			//SINO CONTINUAR CONTROL NORMAL
			chain.doFilter(request, response);
			
			System.out.println("Despues de Servlet");
			
			
			
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
