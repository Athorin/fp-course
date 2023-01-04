public class Hispana extends Fecha {
	
	public Hispana(int d, int m, int a) throws FechaIncorrecta{
		super(d,m,a);
	}
	
	public String formatear(){
		String fecha = new String();
		String meses[] = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		
		fecha = dia +" "+ meses[mes-1] +" "+ a�o;
		
		return fecha;
	}

}
