import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ModDatos {

	public static void main(String[] args) {
		
		String controlador = "com.mysql.jdbc.Driver";			
		Connection conexion; 									
		String url = "jdbc:mysql://127.0.0.1:3306/bd_alumnos";	
		String user = "LUCIA"; String pass = "666666";
		
		Scanner scan = new Scanner(System.in);
		Statement sentenciaSQL;

		
		try {
			Class.forName(controlador).newInstance();
			conexion = DriverManager.getConnection(url, user, pass);	
			
			sentenciaSQL = conexion.createStatement();		
			
			System.out.println("Nombre: ");
			String nombre = scan.nextLine();
			System.out.println("Apellidos: ");
			String apellidos = scan.nextLine();
			System.out.println("Edad: ");
			int edad = scan.nextInt();
			
			String insertsql = "INSERT INTO alumnos VALUES('"+nombre+"','"+apellidos+"',"+edad+")";
			sentenciaSQL.executeUpdate(insertsql);
			
			System.out.println("Numero de Expediente a borrar: ");
			int expediente = scan.nextInt();
			String deletesql = "DELETE FROM alumnos WHERE(expediente = "+expediente+")";
			sentenciaSQL.executeUpdate(deletesql);

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
