import java.sql.*;
import java.util.ArrayList;

public class GestionBD {

	private String driver;
	private Connection conexion;
	private String url, user, pass;
	
	
	public GestionBD(){
		driver = "com.mysql.jdbc.Driver";
		url = "jdbc:mysql://127.0.0.1:3306/bd_usuarios"; 
		user = "LUCIA"; pass = "666666";
		conexion = null; //conectar();
	}
	
	
	public void conectar() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
		Class.forName(driver).newInstance();
		conexion = DriverManager.getConnection(url, user, pass);
	}
	public void desconectar() throws SQLException{
		if(conexion != null){
			conexion.close();
		}	
	}
	
	
	public void insertar(Usuario u) throws SQLException, ExisteUsuarioExc, InstantiationException, IllegalAccessException, ClassNotFoundException{
	
		Statement sentenciaSQL = null;
		String sql = "INSERT INTO bd_usuarios.usuarios VALUES('"+u.getNombre()+"','"+u.getPassword()+"','"+u.getEmail()+"')";
		
		if(existeUsuario(u.getNombre())){
			throw new ExisteUsuarioExc();
		}else{
			try{
				sentenciaSQL = conexion.createStatement();
				sentenciaSQL.executeUpdate(sql);
				
			}finally{
				if(sentenciaSQL != null) sentenciaSQL.close();			
			}	
		}	
	}
	
	public void eliminar(String n) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException, ExisteUsuarioExc{
		Statement sentenciaSQL = null;
		String sql = "DELETE FROM bd_usuarios.usuarios WHERE(nombre = '"+n+"')";
		
		//Posibilidad 2
		if(existeUsuario(n)){
			throw new ExisteUsuarioExc();
		}else{			
			try{
				sentenciaSQL = conexion.createStatement();
				sentenciaSQL.executeUpdate(sql);			
			}finally{
				if(sentenciaSQL != null) sentenciaSQL.close();
			}
		}
	}
	
	public ArrayList consultar(int n) throws SQLException{
		
		ArrayList<String> usuarios = new ArrayList<String>(3);
		String sql = "SELECT nombre FROM usuarios WHERE(id == "+n+")";
		
		Statement sentenciaSQL = conexion.createStatement();	
		ResultSet datos = sentenciaSQL.executeQuery(sql);	
		
		while(datos.next()) { 
			usuarios.add(datos.getString("nombre"));
			usuarios.add(datos.getString("password"));
			usuarios.add(datos.getString("email"));
		}
		
		datos.close();
		sentenciaSQL.close();
		
		return usuarios;
	}
	
	public ArrayList listar(int n) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException{
		
		conectar();
		Usuario u;
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		String sql = "SELECT nombre, email FROM bd_usuarios.usuarios";
		Statement sentenciaSQL = null;
		
		try{
			sentenciaSQL = conexion.createStatement();	
			ResultSet datos = sentenciaSQL.executeQuery(sql);	
			
			int i = 0;
			while(datos.next()) { 
				u = new Usuario(datos.getString("nombre"),null,datos.getString("email"));
				usuarios.add(i,u);
				i++;
			}
		}finally{
			if(sentenciaSQL != null) sentenciaSQL.close();
		}
		return usuarios;
	}
	
	
	public void modificaContraseña(Usuario u) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, ExisteUsuarioExc{
		
		Statement sentenciaSQL = null;
		
		if(!existeUsuario(u.getNombre())){
			throw new ExisteUsuarioExc();
		}else{
			String sql="UPDATE bd_usuarios.usuarios SET password = '"+u.getPassword()+"' WHERE nombre='"+u.getNombre()+"'";
			try{
				sentenciaSQL = conexion.createStatement();
				sentenciaSQL.executeUpdate(sql);
			}finally{
				if(sentenciaSQL != null) sentenciaSQL.close();
			}
		}
	}
	
	public boolean existeUsuario(String n) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException{	
		//Count para ver si existe
		boolean existe = true;
		ResultSet datos;
		Statement sentenciaSQL = null;	
		String sql = "SELECT * FROM bd_usuarios.usuarios WHERE (nombre = '"+n+"')";
		//La Otra forma de hacerlo
		//String sql = "SELECT COUNT(*) FROM bd_usuarios.usuarios WHERE(nombre = '"+n+"')";
		
		conectar();
		
		try{
			sentenciaSQL = conexion.createStatement();
			datos = sentenciaSQL.executeQuery(sql);
			
			int cont = 0;
			while(datos.next()){
				cont++;
			}
			
			/* Otra forma de hacerlo no acabada
			 * datos.first();
			 * int dato = datos.getInt(0);
			 * 	
			 * if(dato > 0){
			 * 		existe = true;
			 * }else{
			 *		existe = false;
			 * }
			 */
			
			if(cont == 0){
				existe = false;
			}
		}finally{
			if(sentenciaSQL != null) sentenciaSQL.close();
		}

		return existe;
	}
	
	
	
}