//import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonaMain {

	/**
	 * Programa que almacena en un ArrayList los datos de varias personas.
	 * Se introducen por teclado.
	 * 
	 * Imprime el nombre y DNI de aquellas personas que han nacido en el siglo XX.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ArrayList <Persona> lista = new ArrayList<Persona>(5);
		Persona p;
		String nombre, fechan;
		int dni, cuentaErrores=0;
		boolean esValido;
		
		
		for(int i = 0; i < 2; i++){
			esValido = false;
			
			System.out.println("Introduce el nombre de la persona n�" + (i+1) + " :");
			nombre = scan.nextLine();
			
			System.out.println("Introduce la fecha de nacimiento: ");
			fechan = scan.nextLine();
			
			while(!esValido){
				
				try{
					
					System.out.println("Introduce el dni: ");
					dni = scan.nextInt(); scan.nextLine();
				
					p = new Persona(nombre, dni, fechan);
					lista.add(p);
					esValido = true;
					
				}catch(java.util.InputMismatchException e){
					scan.nextLine();
					System.out.println("Error: Se esperaba un numero entero positivo");
					cuentaErrores++;
					
				} catch (ExceptionDni e) {
					System.out.println("Error: El DNI NO es Valido");
				}
					
			}
			
		}
		
		System.out.println("El numero de errores totales de dni ha sido de: " + cuentaErrores);

	}

	}
