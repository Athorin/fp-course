/**
 * Write a description of class UsaPunto2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UsaPunto2
{
    public static void main() {
        Punto p1 = new Punto(3,6);
        Punto p2 = new Punto();
        
        if(p1.comparar(p2) ) {
            System.out.println("IGUALES");
        }else{
            System.out.println("DISTINTOS");
        }
 
        System.out.println("Puntos instanciados: "+p1.getContPuntos() );
    
   }
}
