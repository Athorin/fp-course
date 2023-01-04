
public class Mensaje {
	
	//public synchronized void imprimirMensaje(String m){
	public void imprimirMensaje(String m){
		
		System.out.print("["+ m);
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("]");
	
	}
	
}
