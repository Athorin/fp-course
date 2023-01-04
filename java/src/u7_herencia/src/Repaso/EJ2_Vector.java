import java.util.Scanner;
public class EJ2_Vector {

	/**
	 * Programa que almacena en un vector 20 numeros enteros
	 * generados aleatoriamente (entre 100 y 200).
	 * 
	 * Pedir un valor por teclado y determinar si se encuentra en el vector.
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		int vector[] = new int [20];
		int num;
		boolean encontrado = false;
		
		for(int i = 0; i < vector.length; i++){
			vector[i] = (int) (Math.random()*100 + 100);
		}
		
		System.out.println("Introduce un valor a buscar en el vector: ");
		num = scan.nextInt();
		
		for(int i = 0; i < vector.length; i++){
			if(vector[i] == num){
				encontrado = true;
				System.out.println("Se ha encontrado el numero en la posicion: "+i);
			}
		}
		if(!encontrado){
			System.out.println("El numero NO existe en el vector");			
		}
		
	}

}
