
public class HiloSencilloRunn extends Thread {
	
	public HiloSencilloRunn(){
		super();
	}
	
	public void run(){
		System.out.println("Hilo Sencillo con Runnable");
	}
	
	public static void main(String[] args){
		HiloSencilloRunn hsR = new HiloSencilloRunn();
		Thread hilo = new Thread(hsR);
		hilo.start();
	}
}
