import java.util.Scanner;

public class EJ1_Media {

	/**
	 * Dise�ar un programa que lea numeros por teclado hasta encontrar un nulo
	 * y que calcule la media de todos los valores leidos.
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		int num, i=0;
		double media = 0;
		
		do{
			System.out.println("Introduce un numero: ");
			num = scan.nextInt();
			media+=  num;
			if(num!=0){i++;}
		}while(num!=0);
		
		media = media/i;
		
		System.out.println("La media es: "+media);
		scan.close();
	}

}
