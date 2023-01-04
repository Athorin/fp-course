import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ModUsuario
 */
//@WebServlet("/ModUsuario")
public class ModUsuario extends HttpServlet {
	
	//Declaramos esta variable global, para almacenar el pool de conexiones
	private DataSource servicioConexiones;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     * Constructor por defecto
     */
    public ModUsuario() {
        super();
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 * Inicializa antes de recibir peticiones.
	 */
	public void init(ServletConfig config) throws ServletException {
		
		super.init(config);
		Context contexto;
		try {
			contexto = new InitialContext();
			servicioConexiones = (DataSource) contexto.lookup("java:comp/env/jdbc/BDUsuarios");
		} catch (NamingException e) {
			System.out.println("Error de la conexion a la BD");
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
		Usuario u = new Usuario();
		
		//ESTRUCTURA
		
		//ESTO EN EL FILTRO
		//OBTENER DATOS DEL FORMULARIO 
		//VALIDAR
		
		//CONECTAR
		//OBTENER USUARIO
		//MODIFICAR CONTRASE�A
		//DESCONECTAR
		//GENERAR SALIDA HTML
		
		System.out.println("He acabado");
	}

}
