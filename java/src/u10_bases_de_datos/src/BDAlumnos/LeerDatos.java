import java.sql.*;

public class LeerDatos {

	public static void main(String[] args) {
		
		String controlador = "com.mysql.jdbc.Driver";			
		Connection conexion; 									
		String url = "jdbc:mysql://127.0.0.1:3306/bd_alumnos";	
		String user = "LUCIA"; String pass = "666666";
		
		Statement sentenciaSQL;
		ResultSet datos;
		String sql = "SELECT nombre, apellidos, edad FROM alumnos";
		
		try {
			Class.forName(controlador).newInstance();
			conexion = DriverManager.getConnection(url, user, pass);	
			
			sentenciaSQL = conexion.createStatement();			//Crea el objeto para poder hacer Sentencias.
			datos = sentenciaSQL.executeQuery(sql);				//Hace una consulta y devuelve datos de la BD.
			
			while(datos.next()) { //Usamos el While porque el puntero esta en BeforeFirst, asi pasara al Primero al ejecutarse.
				
				String nombre = datos.getString("nombre");
				String apellidos = datos.getString("apellidos");
				int edad = datos.getInt("edad");
				System.out.println("Nombre: " + nombre + " " + apellidos + "\t Edad: " + edad);
			}
			
			datos.close();
			sentenciaSQL.close();			
			conexion.close();											
			
		} catch (InstantiationException e) {
			e.printStackTrace();
			
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			System.out.println("No se encuentra el controlador de la base de datos");
			e.printStackTrace();
			
		} catch (SQLException e) {
			//Casi todo el Bloque Try/Catch usa esta excepcion, habra que afinar un poco.
			System.out.println("Problemas de la Conexion con la Base de Datos");
			e.printStackTrace();
			
		}
		
	}

}
