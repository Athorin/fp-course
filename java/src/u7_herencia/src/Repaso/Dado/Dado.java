public class Dado {
	
	private int caras;
	private int numero []= new int [caras];
	
	public Dado(){
		caras = 0;
	}
	public Dado(int n){
		caras = n;

		for(int i = 0; i < numero.length;i++){
			numero[i] = i+1;
		}
	}
	
	public void setCaras(int n){
		caras = n;
	}
	
	public int getCaras(){
		return caras;
	}
	
	public int lanzarDado(){
		int resultado;
		
		return resultado = (int) (Math.random()*caras+1);
	}
	
}
