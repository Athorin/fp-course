import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirNovelas {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args){
		
		BufferedWriter fichero;
		Scanner scan = new Scanner (System.in);
		String titulo;
		
		
		try {
			
			//Con True a�adimos valor al final, si no borra el fichero antes de escribir
			fichero = new BufferedWriter (new FileWriter ("fich/Novelas.txt",true));
			
			try{
				
				for(int i = 0; i < 3; i++){
				
					System.out.println("Introduce el titulo de la novela: ");
					titulo = scan.nextLine();
					fichero.write(titulo); fichero.newLine();
				}
				
			}catch (IOException e){
				System.out.println("Error: Escritura de Datos Fallida");
			}
			
			try{
				fichero.close();
			}catch (IOException e){
				System.out.println("Error: Problemas al Cerrar el Fichero");
			}
			
		} catch (IOException e) {
			
			System.out.println("Error: No se puede abrir el fichero");
		} 

		
		scan.close();
	}

}
