public class Tridimensional extends Punto {

	private int z;
	
	public Tridimensional(){
		super();
		z = 0;
	}
	
	public Tridimensional(int x, int y, int z){
		super(x,y);
		this.z = z;
	}
	
	public int getZ(){
		return this.z;
	}
	
	public boolean equals(Object obj){
		boolean resultado = false;
		if(obj instanceof Tridimensional){
			Tridimensional p = (Tridimensional) obj;
			if(super.equals(p) && p.getZ() == this.getZ()){
				resultado = true;
			}
		}
		return resultado;
	}
}
