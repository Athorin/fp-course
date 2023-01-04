/**
 * Write a description of class UsaPunto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UsaPunto
{
    public static void main() {
        Punto p = new Punto(5,7);
        
        System.out.println("Punto: ("+
            p.getCoordenadaX() + "," +
            p.getCoordenadaY() + ")");
            
        p.desplazarEjeX(5);
    }
}
