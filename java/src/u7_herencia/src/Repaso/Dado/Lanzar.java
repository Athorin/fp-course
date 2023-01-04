public class Lanzar {

	/**
	 * Programa que lanza un dado 20 veces.
	 * Determina cuantas veces se han obtenido cada uno de los posibles resultados.
	 */
	public static void main(String[] args) {
		
		Dado dado = new Dado(6);
		int resultado;
		int r1=0, r2=0, r3=0, r4=0, r5=0, r6=0;
		
		for(int i = 0; i < 20; i++){
			resultado = dado.lanzarDado();
			System.out.printf("%d ",resultado);
			switch(resultado){
				case 1: r1++;break;
				case 2: r2++;break;
				case 3: r3++;break;
				case 4: r4++;break;
				case 5: r5++;break;
				case 6: r6++;break;
			}
		}
		System.out.printf("\n");
		System.out.println("La cantidad obtenida de cada numero son:");
		System.out.println("Numero 1: "+r1);
		System.out.println("Numero 2: "+r2);
		System.out.println("Numero 3: "+r3);
		System.out.println("Numero 4: "+r4);
		System.out.println("Numero 5: "+r5);
		System.out.println("Numero 6: "+r6);

	}

}
