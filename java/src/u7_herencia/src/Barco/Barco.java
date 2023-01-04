public class Barco {

	private String matricula;
	private int eslora;
	private int a�oFabricacion;
	
	public Barco(){
		matricula = new String();
		eslora = a�oFabricacion = 0;
	}
	
	public Barco (String m, int e, int a){
		setMatricula(m);
		setEslora(e);
		setA�oFabricacion(a);
	}
	
	//Metodos SETTER
	public void setMatricula(String m){
		matricula = new String (m);
	}
	
	public void setEslora(int e){
		eslora = e;
	}
	
	public void setA�oFabricacion(int a){
		a�oFabricacion = a;
	}
	
	//Metodos GETTER
	public String getMatricula(){
		return new String (matricula);
	}
	
	public int getEslora(){
		return eslora;
	}
	
	public int getA�oFabricacion(){
		return a�oFabricacion;
	}
	
	//Metodos Funcionales
	public int getA�oFabricacion(){
		
	}
	
	public int calcularModuloAlquiler(){
		return eslora*10;
	}
}
