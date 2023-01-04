/**
 * Write a description of class Punto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Punto
{
    //Variables Miembro
    private int coordenadaX, coordenadaY;
    private static int contPuntos = 0; //Cuenta los Puntos que se han Construido
    
    
    //Constructores
    public Punto() {
        coordenadaX = coordenadaY = 0;
        contPuntos++;
    }
    
    public Punto(int x, int y) {
        setCoordenadas(x,y);
        contPuntos++;
    }
    
    public Punto(int v) {
        setCoordenadas(v,v);
        contPuntos++;
    }
    
    
    //Metodos
    
    //Introduce Coordenadas
        public void setCoordenadas(int x, int y) {
        coordenadaX = x;
        coordenadaY = y;
    }
    
    public void setCoordenadaX(int x) {
        coordenadaX = x;
    }

    public void setCoordenadaY(int y) {
        coordenadaY = y;
    }
    
    //Devuelve Coordenadas
    public int getCoordenadaX() {
        return coordenadaX;
    }
    
    public int getCoordenadaY() {
        return coordenadaY;
    }
    
    public int getContPuntos() {
        return contPuntos;
    }
        
    //Modifica la Coordenada para desplazar el eje
    public void desplazarEjeX(int v) {
        coordenadaX+=v;
    }    
            
    public void desplazarEjeY(int v) {
        coordenadaY+=v;
    }
    
    //Compara un punto con otro
    public boolean comparar(Punto p) {
        boolean result;
        
        if (p.getCoordenadaX () == this.getCoordenadaX ()  && p.getCoordenadaY () == this.getCoordenadaY() )
            result=true;
        else result=false;
        
        return result;
    }

}