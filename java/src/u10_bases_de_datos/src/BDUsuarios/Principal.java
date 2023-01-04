import java.sql.SQLException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		GestionBD usuarios = new GestionBD();
		Usuario u; String nombre;
		
		int opcion = 0;
		
		try {
			//Conexion
			usuarios.conectar();
			
			do{
				//Menu de Opciones
				System.out.println("Gestion de Usuarios");
				System.out.println("1. Dar de Alta");
				System.out.println("4. Lista de Usuarios");
				System.out.println("0. Salir");
				
				opcion = scan.nextInt(); scan.nextLine();
				
				switch(opcion){
				
					//Insertado de datos (Funciona)
					case 1: 
						
							System.out.println("Introduce los datos");
							u = new Usuario();
							
							System.out.println("Nombre: ");
							u.setNombre(scan.nextLine());
							
							System.out.println("Contrase�a: ");
							u.setPassword(scan.nextLine());
							
							System.out.println("Email: ");
							u.setEmail(scan.nextLine());
							
							try{
								usuarios.insertar(u);
								
							}catch (ExisteUsuarioExc e){
								System.out.println("El usuario no se puede insertar porque ya existe");
								e.printStackTrace();
							}catch (SQLException e){
								System.out.println("Problemas con el acceso a datos");
								e.printStackTrace();
							}
							
					break;
					
					//Dar de Baja un Usuario
					case 2: 
						
							System.out.println("Introduce el Nombre del Usuario a Eliminar: ");
							nombre = new String(scan.nextLine());
							
							if(!usuarios.existeUsuario(nombre)){
								System.out.println("El usuario NO existe");
							}else{
								try{
									usuarios.eliminar(nombre);
									System.out.println("El usuario ha sido eliminado");
								}catch (ExisteUsuarioExc e) {
									e.printStackTrace();
								}

							}
			
					break;
					
					//Modificar la Contrase�a de un Usuario
					case 3: 
						
							String pass, confpass; boolean correcto = false;
							
							System.out.println("Introduce los datos de la Cuenta a Modificar");
							u = new Usuario();
							
							System.out.println("Nombre: ");
							u.setNombre(scan.nextLine());
							System.out.println("Email: ");
							u.setEmail(scan.nextLine());
							
							while(!correcto){
								System.out.println("Nueva Contrase�a: ");
								pass = new String(scan.nextLine());
								System.out.println("Confirma Contrase�a: ");
								confpass = new String(scan.nextLine());
								
								if(pass.equals(confpass)){
									u.setPassword(pass);
									correcto = true;
								}else{
									System.out.println("Las nuevas contrase�as no coinciden");
								}
							}
							
							try{
								usuarios.modificaContrase�a(u);
								
							}catch (ExisteUsuarioExc e){
								System.out.println("El usuario no se puede insertar porque ya existe");
								e.printStackTrace();
							}catch (SQLException e){
								System.out.println("Problemas con el acceso a datos");
								e.printStackTrace();
							}

			
					break;
					
					//Listar Usuarios almacenados con su email
					case 4: if(usuarios.existeUsuario("franc")){
								System.out.println("El usuario existe");
							}else{
								System.out.println("El usuario NO existe");
							}
					
					break;
							
					case 0: try{
								usuarios.desconectar();
								
							}catch (SQLException e){
								System.out.println("Problemas con la desconexion de la base de datos");
								e.printStackTrace();
							}
					break;
				}
				
			}while(opcion != 0);
			

		} catch (InstantiationException e) {
			// TODO Bloque catch generado autom�ticamente
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Bloque catch generado autom�ticamente
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Problemas con el driver de manejo de la base de datos");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Problemas con la conexion de la base de datos");
			e.printStackTrace();
		}
		
		

	}

}
