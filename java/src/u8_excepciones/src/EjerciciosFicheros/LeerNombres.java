import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerNombres {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args){
		
		BufferedReader fichero = null;	
		String linea;
		
		try {
			
			fichero = new BufferedReader(new FileReader("fich/Nombres.txt"));
			
			
			linea = fichero.readLine();
			
			while(linea != null){
				System.out.println(linea);
				linea = fichero.readLine();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Error: No se ha encontrado el fichero.");
		} catch (IOException e){
			System.out.println("Error: No se puede acceder a los datos");
		} finally {
			if(fichero != null){
				try {
					fichero.close();
				} catch (IOException e) {
					System.out.println("Problemas al cerrar la comunicacion");
				}
			}
		}

	}

}
