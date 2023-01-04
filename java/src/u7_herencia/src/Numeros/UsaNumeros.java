import java.util.ArrayList;
import java.util.Scanner;

public class UsaNumeros {

	/**
	 * Ejercicios de Herencia III
	 * Parte 2.
	 * Dise�a la clase UsaNumeros con un m�todo main() que realiza las tareas que se indican a 
	 * continuaci�n (en el orden indicado): 
	 * 
	 *	- Almacenar 10 n�meros introducidos por teclado; el usuario introducir� un n�mero 
	 *    entero y otro real, de forma alternativa, hasta un total de 10. Los n�meros ser�n 
	 *	  almacenados en un vector. 
	 *
	 *  - Ordenar los n�meros introducidos. 
	 *
	 *  - Calcular y almacenar, en otro vector, el doble de los n�meros enteros introducidos y la 
	 *    mitad de los n�meros reales. 
	 * 
	 *  - Calcular e imprimir la suma de todos los n�meros primos menores que el mayor 
	 *    n�mero entero almacenado
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		//Variables
		Numero vector [] = new Numero [5];
		double calculos[] = new double [5];
		Entero m;
		ArrayList<Entero> primos;
		int suma = 0;
		
		
		//Programa
		
		//Introducion de Datos en el Vector
		
		for(int i=0; i < vector.length; i++)
		{
			if(i%2 == 0)
			{
				System.out.println("Introduce un numero Entero: ");
				vector[i] = new Entero( scan.nextInt() );
			}else{
				System.out.println("Introduce un numero Real: ");
				vector[i] = new Real( scan.nextDouble() );				
			}
				
		}
		
		//Comprobacion de los datos introducidos
		
		System.out.println("Los numeros introducidos son: ");
		
		for(int i=0; i < vector.length; i++)
		{
			System.out.println( vector[i].toString() );				
		}
		
		//Ordenar el Vector
		ordenar(vector);
		
		System.out.println("Vector ordenado: ");
		for(int i = 0; i < vector.length; i++){
			System.out.println(vector[i].toString());
		}
		
		//Almacenar los calculos en otro vector
		for(int i = 0; i < vector.length; i++)
		{
			if(vector[i] instanceof Entero){
				calculos[i] = vector[i].calcularDoble();
			}else{
				calculos[i] = vector[i].calcularMitad();
			}
		}
		
		//Calcular el Mayor
		m = calcularMayor(vector);
		
		//Calcular los Primos
		primos = m.getNumerosPrimos();
		
		for(int i = 0; i < primos.size(); i++){
			suma += primos.get(i).getValorEntero();
		}
		System.out.println("La suma de los numeros primos es: " + suma);

	}//Fin del Programa Principal
	
	
	
	//Metodos
	
	public static void ordenar (Numero v[])
	{
		//Ordenacion de vector por Burbuja
		Numero aux;
		for(int i = 0; i < v.length; i++)
		{
			for(int j = 0; j < v.length - i; j++)
			{
				Double d1, d2;
				d1 = new Double(v[j].toString());
				d2 = new Double(v[j+1].toString());
				
				if ( d1 > d2 )
				{
					aux = v[j];
					v[j] = v[j+1];
					v[j+1] = aux;
				}
			}
		}
	}
	
	public static Entero calcularMayor (Numero v[])
	{
		int mayor = Integer.MIN_VALUE;
		
		for(int i = 0; i < v.length; i++){
			if(v[i] instanceof Entero){
				/*Para una instancia de tipo Numero, no podemos usar el metodo de una subclase.
				  Vamos a utilizar una referencia Entera que apunte a Numero, para poder usar metodos de entero.*/
				Entero e = (Entero) v[i];
				if(e.getValorEntero() > mayor){
					mayor = e.getValorEntero();
				}					
			}
		}
		
		return new Entero(mayor);
	}
	
}//FIN
