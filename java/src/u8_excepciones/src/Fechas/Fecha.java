public abstract class Fecha {
	
	protected int dia, mes, a�o;
	
	public Fecha(){
		dia=1;
		mes=1;
		a�o=2000;
	}
	public Fecha(int d, int m, int a) throws FechaIncorrecta{
		if(!esFechaValida(d,m,a)){
			throw new FechaIncorrecta("La fecha no es valida");
		}
		dia=d;
		mes=m;
		a�o=a;
	}
	
	//Metodos
	private boolean esFechaValida(int d, int m, int a){
		boolean resultado = true;
		
		if(a�o < 0){
			resultado = false;
		}else{
			if(mes < 0 || mes > 12){
				resultado = false;
			}else{
				switch(mes){
					case 2: if(esBisiesto()){if(dia < 0 || dia > 29){resultado = false;} break;}else{if(dia < 0 || dia > 28){resultado = false;} break;}
					case 4: 
					case 6: 
					case 9: 
					case 11: if(dia < 0 || dia > 30){resultado = false;} break;
					default: if(dia < 0 || dia > 31){resultado = false;} break;
				}
			}
		}
		
		return resultado;
	}
	
	
	public void incrementarDia(){
		dia++;
		switch(mes){
			case 2: if(dia>28){dia=1;mes++;}break;
			case 4: 
			case 6: 
			case 9: 
			case 11: if(dia>30){dia=1;mes++;}break;
			case 12: if(dia>31){dia=1;mes=1;a�o++;}break;
			default: if(dia>31){dia=1;mes++;}break;
		}
	}
	
	public abstract String formatear();
	
	
	private boolean esBisiesto(){
		boolean resultado = false;
		
		if(a�o%4 == 0 && a�o%100 !=0){
			resultado = true;
			
		}else{
			if(a�o%400 == 0 && a�o%100 == 0){
				resultado = true;
			}
		}
		return resultado;
	}

}
