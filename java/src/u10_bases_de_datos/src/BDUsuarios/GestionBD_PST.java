import java.sql.*;
import java.util.ArrayList;

public class GestionBD_PST {

	private String driver;
	private Connection conexion;
	private String url, user, pass;
	
	
	public GestionBD_PST(){
		driver = "com.mysql.jdbc.Driver";
		url = "jdbc:mysql://127.0.0.1:3306/bd_usuarios?userServerPrepStmts=true"; 
		//?userServerPrepStmts=true Le indicamos que es PreparedStatement
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
		//Cambiamos Statement por PreparedStatement (todo lo comentado es Statement)
		
		PreparedStatement sentenciaSQL = null;
		String sql = "INSERT INTO bd_usuarios.usuarios VALUES(?,?,?)";
		
		if(existeUsuario(u.getNombre())){
			throw new ExisteUsuarioExc();
		}else{
			try{
				sentenciaSQL = conexion.prepareStatement(sql);
			
				sentenciaSQL.setString(1, u.getNombre());
				sentenciaSQL.setString(2, u.getPassword());
				sentenciaSQL.setString(3, u.getEmail());
			
				sentenciaSQL.executeUpdate();
			}finally{
				if(sentenciaSQL != null) sentenciaSQL.close();			
			}	
		}
		
	}
	
	public void eliminar(String n) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException, ExisteUsuarioExc{
		PreparedStatement sentenciaSQL = null;
		String sql = "DELETE FROM bd_usuarios.usuarios WHERE nombre = ?";
		
		//Posibilidad 2
		if(existeUsuario(n)){
			throw new ExisteUsuarioExc();
		}else{
			try{
				sentenciaSQL = conexion.prepareStatement(sql);
				sentenciaSQL.setString(1,n);
				sentenciaSQL.executeUpdate(sql);			
			}finally{
				if(sentenciaSQL != null) sentenciaSQL.close();
			}
		}
	}
	
	public boolean existeUsuario(String n) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException{	
		//Count para ver si existe
		boolean existe = true;
		PreparedStatement sentenciaSQL = null;
		String sql = "SELECT * FROM bd_usuarios.usuarios WHERE nombre=?";
		//Forma Sin acabar -> String sql = "SELECT COUNT(*) FROM bd_usuarios.usuarios WHERE(?)";
		
		conectar();
		
		try{
			sentenciaSQL = conexion.prepareStatement(sql);
			sentenciaSQL.setString(1, n);
			ResultSet datos = sentenciaSQL.executeQuery(sql);
			
			int cont = 0;
			while(datos.next()){
				cont++;
			}
			
			/* Otra forma de hacerlo no acabada
			 * datos.first();
			 * int dato = datos.getInt(0);
			 */
			
			if(cont == 0){
				existe = false;
			}
			
		}finally{
			if(sentenciaSQL != null) sentenciaSQL.close();
		}

		return existe;
	}
	
	
	public ArrayList consultar(int n) throws SQLException{
		
		ArrayList<String> usuarios = new ArrayList<String>(3);
		String sql = "SELECT nombre FROM usuarios WHERE(id == "+n+")";
		
		PreparedStatement sentenciaSQL = null;
		
		sentenciaSQL = conexion.prepareStatement(sql);	
		ResultSet datos = sentenciaSQL.executeQuery();	
		
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
		PreparedStatement sentenciaSQL = null;
		
		try{
			sentenciaSQL = conexion.prepareStatement(sql);	
			ResultSet datos = sentenciaSQL.executeQuery();	
			
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
	
	
	public void modificaContrase�a(Usuario u) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, ExisteUsuarioExc{
		
		PreparedStatement sentenciaSQL = null;
		
		if(!existeUsuario(u.getNombre())){
			throw new ExisteUsuarioExc();
		}else{
			String sql="UPDATE bd_usuarios.usuarios SET password =? WHERE nombre=?";
			try{
				sentenciaSQL = conexion.prepareStatement(sql);
				sentenciaSQL.setString(1,u.getPassword());
				sentenciaSQL.setString(1,u.getNombre());
				sentenciaSQL.executeUpdate(sql);
			}finally{
				if(sentenciaSQL != null) sentenciaSQL.close();
			}
		}
	}
		

	
}
