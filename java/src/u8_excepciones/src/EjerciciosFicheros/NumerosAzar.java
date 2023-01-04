import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class NumerosAzar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		PrintWriter fichero;
		int num;
		
		try {
			
			fichero = new PrintWriter(new FileWriter("fich/Numeros.txt",true));
			
			for(int i = 0; i < 10; i++){
				num = (int)(Math.random()*101) + 100;
				fichero.println(num);
			}
			
			fichero.close();
			
		} catch (IOException e) {		
			System.out.println("Error: Problemas al Abrir el Fichero");
		}
		
	}

}
