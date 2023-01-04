public class Punto {
	
	private int x; private int y;
	
	public Punto(){
		x = y = 0;
	}
	
	public Punto(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
	//Metodos Funcionales
	public Punto copiarPunto(){
		Punto p = new Punto (x,y);
		return p;
	}
	
	//Redefinidos
	public String toString(){
		String coordenada;
		coordenada = "Coordenada Y: " + y + "    " + "Coordenada X: " + x;
		return coordenada;
	}
		
	public boolean equals (Object obj){
		boolean resultado = false;
		
		if(obj instanceof Punto)//�Es la variable obj una referencia de tipo Punto?
		{ 
			/*Convierto la referencia obj a referencia tipo punto
			 *El casting lo hacemos para poder usar los metodos de la clase Punto
			 *si no solo podriamos de la clase Object
			 */ 
			 
			 Punto p = (Punto) obj;
			
			 if(p.getX() == this.getX) 
		}
	}
}
