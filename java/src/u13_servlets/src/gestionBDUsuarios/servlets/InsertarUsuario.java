import gestionBDUsuarios.bdUsuarios.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

/**
 * Servlet implementation class InsertarUsuario
 */
@WebServlet("/InsertarUsuario")
public class InsertarUsuario extends HttpServlet {
	
	//Declaramos esta variable global, para almacenar el pool de conexiones
	private DataSource servicioConexiones;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertarUsuario() {
        super();
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 * Inicializa antes de recibir peticiones.
	 */
	public void init(ServletConfig config) throws ServletException {
		
		//Capturar el objeto "Servicio de conexiones"
		super.init(config);
		//Context hace referencia a Context.xml
		Context contexto;
		try {
			contexto = new InitialContext();
			servicioConexiones = (DataSource) contexto.lookup("java:comp/env/jdbc/BDUsuarios");
		} catch (NamingException e) {
			System.out.println("No se puede recuperar el pool de conexiones");
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter salida = response.getWriter();
		GestionBD bd = new GestionBD();
		int error = 0;
		Usuario u = new Usuario();

			try {
				
				//ESTRUCTURA
				//RECOGER DATOS DEL FORMULARIO
				
				String nombre = (request.getParameter("name")); 
				String password = (request.getParameter("pass"));
				String email =(request.getParameter("mail"));

				
				//A�ADIR VALIDACION PARA COMPROBAR DATOS (excepcion) SINO VOLVER AL FORMULARIO
				if(nombre == null || nombre == "" || password == null || password == ""|| email == null || email == ""){
					throw new NullPointerException();
				}else{
					
					u.setNombre(nombre);
					u.setPassword(password);
					u.setEmail(email);
						
					//CONECTAR CON LA BASE DE DATOS (excepciones)
					bd.conectar(servicioConexiones);
					
					//ACCEDER A LA BASE DE DATOS (excepciones)
					bd.insertar(u);
				}
				
			} catch (SQLException e) {
				//Error - No se puede conectar a la base de datos
				error = 3;
				
			} catch (ExisteUsuarioExc e) {
				//Error - Existe el Usuario
				error = 2;
				
			} catch (NullPointerException e) {
				//Error - No se han rellenado los campos
				error = 1;
				
			} finally{
				//DESCONECTAR (Excepciones)
				try {
					bd.desconectar();
				}catch(SQLException e) {
					System.out.println("Error al Desconectar la BD");
					e.printStackTrace();
				}
			}

		
		
		
		//Generar la salida en forma de pagina HTML 
		//Estudio de las situaciones de error para dar una salida u otra.
		
		if(error > 0){ //Pongo el formulario de nuevo para pedir los datos
			

			
			salida.println("<html><head><meta charset='ISO-8859-1'><title>Insertar Usuario</title></head><body>");
			switch(error){
				case 1: salida.println("<h1>Error: No has rellenado todos los campos</h1>");
				break;
				
				case 2: salida.println("<h1>Error: El Usuario Existe</h1>");
				break;
				
				case 3: salida.println("<h1>Error: No pudimos conectar con la base de datos</h1>");
				break;
		
			}
			salida.println("<form action='http://localhost:8080/Tema_13._Servlets/InsertarUsuario' method='post'>");
			salida.println("Nombre: <br> <input name='name' id='name' type='text'> <br>");
			salida.println("Contrase�a: <br> <input name='pass' id='pass' type='text'> <br>");
			salida.println("Email: <br> <input name='mail' id='mail' type='text'> <br>");
			salida.println("<br><input type='submit' value='Insertar' id='boton'> 	<input type='reset' value='Borrar' id='boton'>"); 
			salida.println("</form></body></html>");
			
		}else{ //Muestro los datos almacenados
			
			salida.println("<html><head><title>Usuario</title></head><body>");
			salida.println("<h1>El campo ha sido a�adido correctamente con los siguientes datos:</h1>");
			salida.println("<h1>Nombre: "+u.getNombre()+"</h1>");
			salida.println("<h1>Contrase�a: "+u.getPassword()+"</h1>");
			salida.println("<h1>Email: "+u.getEmail()+"</h1>");
			salida.println("</html></body>");
		}
		
		
	}

}
