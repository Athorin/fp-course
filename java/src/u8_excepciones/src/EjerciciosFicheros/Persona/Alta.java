import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Alta {

	/**
	 * Programa que le por teclado los datos de varias personas y los almacena en fichero.
	 * Formato: Nombre Dni Clave
	 * Fichero: personas.txt
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		BufferedWriter fichero;
		String nombre; int dni; String fecha;
		Persona p;
		
		int salir;
		
		try {
			
			fichero = new BufferedWriter(new FileWriter("fich/Personas.txt"));
			
			System.out.printf("\n Alta de Usuarios\n------------------\n");
			
			do{
				System.out.println("Datos de un Nuevo Usuario");
				
				
				System.out.println("Nombre: "); nombre = scan.nextLine();
				System.out.println("DNI: "); dni = scan.nextInt(); scan.nextLine();
				System.out.println("Fecha: "); fecha = scan.nextLine();
				
				
				try {
					p = new Persona(nombre, dni, fecha);
					p.setClave();
					
					fichero.write("NOMBRE: " + p.getNombre());
					fichero.write("   DNI: " + p.getDNI());
					fichero.write("   Clave: " + p.getClave() + "\n");
					
				} catch (ExceptionDni e) {
					System.out.println("Error: El DNI no es valido");
				}
				
				
				
				System.out.printf("\n\n�Quiere dejar de Introducir datos?\nPulse 0 para Salir\nPulse cualquier otro numero para continuar\n");
				salir = scan.nextInt(); scan.nextLine();
				
				
			}while(salir!=0);
			
			
			fichero.close();
			
		} catch (IOException e) {
			System.out.println("Error: Fichero NO Encontrado");
		} catch (InputMismatchException e){
			System.out.println("Error: Se esperaba un entero en DNI");
		}
		
	
		scan.close();

	}

}
