
public class InvocaMensaje extends Thread {

		Mensaje m;
		String s;
		
		public InvocaMensaje(Mensaje m, String s){
			this.m = m;
			this.s = s;
		}

		public void run(){
			synchronized(m){
				m.imprimirMensaje(s);
			}
		}
}
