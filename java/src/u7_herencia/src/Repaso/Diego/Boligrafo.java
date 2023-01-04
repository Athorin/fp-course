public class Boligrafo {

	private String tama�o;
	private String color;
	
	//Constructor por Defecto
	public Boligrafo()
	{
		this.tama�o = new String();
		this.color = new String();
	}
	//Constructor con Parametros
	public Boligrafo(String tama�o, String color)
	{
		String colores[] = {"azul","negro","rojo"};
		String tama�os[] = {"grande","mediano","peque�o"};
		
		for (int i = 0; i < colores.length; i++)
		{
			if(tama�os[i].equalsIgnoreCase(tama�o)) {this.tama�o = tama�o;}
			if(colores[i].equalsIgnoreCase(color)) {this.color = color;}
		}


	}
	
	//Metodos Setter
	public void setTama�o(String tama�o)
	{
		this.tama�o = tama�o;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	
	//Metodos Getter
	public String getTama�o()
	{
		return this.tama�o;
	}
	public String getColor()
	{
		return this.color;
	}
	
	//Metodos
	public void estableceBoligrafo (String tama�o, String color)
	{
		this.tama�o = tama�o;
		this.color = color;
	}
	public boolean esIgual (Boligrafo boli)
	{
		return this.equals(boli);
	}


}
