import java.util.ArrayList;

public class Entero extends Numero {
	
	//Variables Miembro
	private int entero;
	
	//Constructor
	public Entero (int num)
	{
		entero = num;
	}
	
	//Metodos
	public int getValorEntero()
	{
		return this.entero;
	}
	
	public double aReal()
	{
		return (double) this.entero;
	}
	
	public int getNumerosPrimos()
	{
		return 0;
	}
	
	public String toString()
	{
		return String.valueOf(this.entero);
	}
	
	public ArrayList<Entero> getNumeroPrimos(){
		ArrayList<Entero> numerosPrimos = new ArrayList
	}
	
}
