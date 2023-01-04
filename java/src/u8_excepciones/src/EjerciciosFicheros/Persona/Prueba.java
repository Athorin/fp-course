public class Prueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			Usuario x = new Usuario("fran",12,"hotmail");
			
			
			System.out.println(x.getFechaAlta());
			
		} catch (ExceptionDni e1) {
			e1.printStackTrace();
		}
		
	}

}
