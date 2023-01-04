public class Real extends Numero {
	
	private double real;
	
	public Real (double num)
	{
		real = num;
	}
	
	//Funcionalidad
	public double getValorReal()
	{
		return this.real;
	}
	
	public int aEntero()
	{
		return (int)this.real;
	}
	
	public String toString()
	{
		return String.valueOf(this.real);
	}
}
