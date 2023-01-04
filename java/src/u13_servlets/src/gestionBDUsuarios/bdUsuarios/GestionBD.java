import gestionBDUsuarios.bdUsuarios.*;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class GestionBD {

	private Connection conexion;

	public GestionBD(){
		conexion = null; //conectar();
	}
	
	
	public void conectar(DataSource servConexiones) throws SQLException{
		synchronized(servConexiones){
			conexion = servConexiones.getConnection();
		}
	}
	public void desconectar() throws SQLException{
		if(conexion != null){
			conexion.close();
		}	
	}
	
	
	public void insertar(Usuario u) throws SQLException, ExisteUsuarioExc{
		
		Statement sentenciaSQL = null;
		String sql = "INSERT INTO bd_usuarios.usuarios VALUES('"+u.getNombre()+"','"+u.getPassword()+"','"+u.getEmail()+"')";
	
		if(existeUsuario(u.getNombre())){
			throw new ExisteUsuarioExc();
		}else{
			try{
				sentenciaSQL = conexion.createStatement();
				sentenciaSQL.executeUpdate(sql);
			}finally{
				if(sentenciaSQL != null)sentenciaSQL.close();			
			}	
		}
		
	}
	
	public void eliminar(Usuario u) throws SQLException, ExisteUsuarioExc{
		Statement sentenciaSQL = null;
		String sql = "DELETE FROM bd_usuarios.usuarios WHERE(nombre = "+u.getNombre()+")";
		
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
	
	
	public ArrayList consultar(int n) throws SQLException{
		
		ArrayList<String> usuarios = new ArrayList<String>(3);
		String sql = "SELECT nombre FROM bd_usuarios.usuarios WHERE(id == "+n+")";
		
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
	
	
	
	public boolean existeUsuario(String n) throws SQLException{	

		boolean existe = true;
		ResultSet datos;
		Statement sentenciaSQL = null;	
		String sql = "SELECT * FROM bd_usuarios.usuarios WHERE (nombre = '"+n+"')";
		
		//conectar();
		
		try{
			sentenciaSQL = conexion.createStatement();
			datos = sentenciaSQL.executeQuery(sql);
			
			int cont = 0;
			while(datos.next()){
				cont++;
			}
			
			if(cont == 0){
				existe = false;
			}
		}finally{
			if(sentenciaSQL != null) sentenciaSQL.close();
		}

		return existe;
	}
	
	
	
}

	
