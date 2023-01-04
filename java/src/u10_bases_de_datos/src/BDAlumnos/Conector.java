import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {

	public static void main(String[] args) {
		
		//El conector se pondra en todos los programas que vayan a utilizar la base de datos.
		
		String controlador = "com.mysql.jdbc.Driver";			//El driver se ubica fisicamente en la carpeta de instalacion de MySQL
		Connection conexion; 									//Hemos ubicado en las librerias referidas el JAR del conector de MySQL
		String url = "jdbc:mysql://localhost:3306/bd_alumnos";	//Para tener acceso a la URL de la Base de Datos
		String user = "root"; String pass = "666666";			//User y Pass del usuario de la Base de Datos
		
		try {
			Class.forName(controlador).newInstance();					//Inicializa el Driver en el programa
			conexion = DriverManager.getConnection(url, user, pass);	//Abre la Conexion con la BD
			System.out.println("Conexion Establecida");
			conexion.close();											//Es importante cerrar la conexion al acabar para no saturar.
			
		} catch (InstantiationException e) {
			e.printStackTrace();
			
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			System.out.println("No se encuentra el controlador de la base de datos");
			e.printStackTrace();
			
		} catch (SQLException e) { 
			System.out.println("Problemas con la Base de Datos");
			e.printStackTrace();
			
		}
		
		

	}

}
