public class UsaPunto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Punto p = new Punto(4,2);
		System.out.println(p.toString());
		String s = new String();
		
		//Punto copia = new Punto();
		
		Tridimensional pt = new Tridimensional(4,2,5);
		Tridimensional pt2 = new Tridimensional(4,2,5);
		
		/* Copia = p.copiarPunto()
		 * System.out.println(copia);
		 */
		
		System.out.println(p.equals(pt));
	}

}
