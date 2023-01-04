public class Anglosajona extends Fecha {

	public Anglosajona(int d, int m, int a) throws FechaIncorrecta{
		super(d,m,a);
	}
	
	public String formatear(){
		String fecha = new String();
		String meses[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		
		switch(dia){
			case 1:	fecha = "The " + dia +"st of "+ meses[mes-1] +" "+ a�o; break;
			case 2: fecha = "The " + dia +"nd of "+ meses[mes-1] +" "+ a�o; break;
			case 3: fecha = "The " + dia +"rd of "+ meses[mes-1] +" "+ a�o; break;
			case 21: fecha = "The " + dia +"st of "+ meses[mes-1] +" "+ a�o; break;
			case 22: fecha = "The " + dia +"nd of "+ meses[mes-1] +" "+ a�o; break;
			case 23: fecha = "The " + dia +"rd of "+ meses[mes-1] +" "+ a�o; break;
			case 31: fecha = "The " + dia +"st of "+ meses[mes-1] +" "+ a�o; break;
			default: fecha = "The " + dia +"th of "+ meses[mes-1] +" "+ a�o;
		}
		
		return fecha;
	}

}
