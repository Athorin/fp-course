import java.util.ArrayList;
import java.util.Scanner;

public class UsaCiudadano {

	/**
	 * Programa que almacena en un ArrayList los datos de varias personas.
	 * Se introducen por teclado.
	 * 
	 * Imprime el nombre y DNI de aquellas personas que han nacido en el siglo XX.
	 */
	public static void main(String[] args) {

		//SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
		Scanner scan = new Scanner(System.in);
		ArrayList <Ciudadano> lista = new ArrayList<Ciudadano>(5);
		Ciudadano p;
		String nombre; String fechan;
		
		int dni, cuentaErrores=0;
		boolean esValido;
		
		//Ciudadano ciudadano = new Ciudadano("Fran",1111,12,12,2000);
		//System.out.println(formato.format(ciudadano.getFechaNac().getTime()));
		
		for(int i = 0; i < 5; i++){
			esValido = false;
			
			System.out.println("Introduce el nombre de la persona n�" + (i+1) + " :");
			nombre = scan.nextLine();
			
			System.out.println("Introduce la fecha de nacimiento: ");
			fechan = scan.nextLine();
			
			while(!esValido){
				try{
					
					System.out.println("Introduce el dni: ");
					dni = scan.nextInt(); scan.nextLine();
				
					p = new Ciudadano(nombre, dni, fechan);
					lista.add(p);
					esValido = true;
					
				}catch(java.util.InputMismatchException e){
					scan.nextLine();
					System.out.println("Error: Se esperaba un numero entero positivo");
					cuentaErrores++;
					
				}catch(ExceptionDni e){
					System.out.println("Error: "+e);
					cuentaErrores++;
				}
			}
			
		}
		
		System.out.println("El numero de errores totales de dni ha sido de: " + cuentaErrores);

	}

}
