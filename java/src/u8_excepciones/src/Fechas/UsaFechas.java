import java.util.InputMismatchException;
import java.util.Scanner;

public class UsaFechas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Hispana fecha;
		int dia, mes, a�o;

		
		try {
			
			System.out.println("Introduce el dia: "); dia = scan.nextInt();
			System.out.println("Introduce el mes: "); mes = scan.nextInt();
			System.out.println("Introduce el a�o: "); a�o = scan.nextInt();
			
			fecha = new Hispana(dia, mes, a�o);
			
			System.out.println("La fecha introducida es: " + fecha.formatear());
			
		}catch(InputMismatchException f){
			System.out.println("Error: Se esperaba un numero Entero Positivo");
		}catch (FechaIncorrecta e) {
			//Try salta a Catch si es una excepcion ejecutada en el contructor new Hispana, el codigo escrito dentro de Try no se activa 
			//e.printStackTrace();  Muestra la pila de ejecucion, nos ayudara a localizar los errores.
			
			System.out.println("Error en la entrada de datos: " + e);
		}

	}

}
