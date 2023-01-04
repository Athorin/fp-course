public class UsaBarco {

	/**
	 * Programa que usa la clase Barco.
	 */
	public static void main(String[] args) {
		Barco b = new Barco ("bbb",10,2000);
		Velero v = new Velero (3,"vvv",10,2000);
		Yate y = new Yate ( 6, "yyy",10,2000);
		
		b=y;
		
		System.out.println("Modulo barco: " + b.calcularModuloAlquiler());
		System.out.println("Modulo velero: " + b.calcularModuloAlquiler());
		System.out.println("Modulo yate: " + b.calcularModuloAlquiler());

	}

}
