public class EJ3_Fibonacci {

	/**
	 * Programa que almacena en un vector, los 15 primeros numeros de la serie de Fibonacci.
	 */
	public static void main(String[] args) {

		int fibonacci[] = new int[15];
		int n1 = 1, n2 = 1, aux;
		
		for(int i = 0; i < fibonacci.length; i++){
			fibonacci[i] = n1;
			aux = n2;
			n2+= n1;
			n1 = aux;
			System.out.printf("%d ",fibonacci[i]);
		}

	}

}
