public class UsaInvocaMensaje {
	
	public static void main(String[] args) {
		
		Mensaje objeto= new Mensaje();
	
		InvocaMensaje h1= new InvocaMensaje(objeto, "Hola");
		InvocaMensaje h2= new InvocaMensaje(objeto, "Mundo");
		InvocaMensaje h3= new InvocaMensaje(objeto, "Java");
		
		h1.start();
		h2.start();
		h3.start();
	}
}