
public class HiloSencillo extends Thread {
	
	public HiloSencillo(){
		super();
	}
	
	public void run(){
		System.out.println("Hilo Sencillo");
	}
	
	public static void main(String[] args){
		HiloSencillo miHilo = new HiloSencillo();
		miHilo.start();
	}
}
