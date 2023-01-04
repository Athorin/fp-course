import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;
	
public class LeerEscribirNombres {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		BufferedReader fichero; BufferedWriter fichero2;
		String archivo, archivo2, mayus = null, cadena = null;
		String aux, aux2;
		
		
		try{
			
			System.out.println("Introduce el nombre del archivo de lectura: ");
			archivo = scan.nextLine();
			
			aux = archivo.substring(0,archivo.lastIndexOf("."));
			aux2 = archivo.substring(archivo.lastIndexOf("."));
			archivo2 = (aux + "Mayusculas" + aux2);
			
			System.out.println(archivo + " y " + archivo2);

			
			try{
				fichero = new BufferedReader (new FileReader(archivo));
				fichero2 = new BufferedWriter (new FileWriter(archivo2));
				
				do{
					cadena = fichero.readLine();
					if(cadena!=null){
						mayus = cadena.toUpperCase();
						fichero2.write(mayus); fichero2.newLine();
					}

				}while(cadena != null);

				
				fichero.close(); fichero2.close();
				
			}catch (FileNotFoundException e){
				System.out.println("Error: Archivo NO Encontrado");
			}catch (IOException e){
				System.out.println("Error: En la entrada/salida de datos");
			}
			
		}catch (NoSuchElementException e){
			System.out.println("Error al Introducir Linea de Caracteres");
		}

	}
	

}
