
public class DemoHiloActual {

	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		System.out.println("Hilo Actual " + t);
		
		t.setName("Mi Hilo");
		System.out.println("Despues del cambio de nombre " + t);

	}

}
