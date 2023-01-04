import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UsuarioAlta {

	/**
	 * Programa que pide datos por teclado de usuarios y los almacena en Fichero
	 * Fichero: usuarios.csv
	 * Formato: nombre; dni; aplicacion; clave; dd/mm/aaaa
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		BufferedWriter fichero;
		String nombre, app, clave, alta; int dni;
		
		try {
			
			fichero = new BufferedWriter(new FileWriter("fich/usuarios.csv"));
			fichero.write("Nombre;"+"DNI;"+"Aplicacion;"+"Clave;"+"Alta\n");
			
			try{
				
				System.out.println("Nombre: "); nombre = scan.nextLine();
				System.out.println("DNI: "); dni = scan.nextInt(); scan.nextLine();
				System.out.println("Aplicacion: "); app = scan.nextLine();
				
				Usuario user = new Usuario(nombre,dni,app);
				clave = user.getClave(); alta = user.getFechaAlta();
				
				fichero.write(user.getNombre() + "; " +user.getDNI() + "; " + user.getApp() + "; " + user.getClave() + "; " + user.getFechaAlta()+"\n");
				
			} catch (InputMismatchException e){
				System.out.println("Error: Se esperaba un numero Entero");
			} catch (ExceptionDni e) {
				System.out.println("Error: DNI No valido");
			}
	
			fichero.close();
			
		} catch (IOException e) {
			System.out.println("Error: Fichero NO Encontrado");
		} 
		

		
	}

}
