/**
 * Write a description of class UsaRectangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UsaRectangulo
{
    public static void main() {
        //Aqui se define el objeto implicito, dandole una variable para cada instancia de ese objeto.
        Rectangulo rectangulo1;
        rectangulo1 = new Rectangulo(10,12);
        
        //rectangulo1.setBaseAltura(10,12);
        System.out.println("Area: " + rectangulo1.calcArea() );
        System.out.println("Perimetro: "+ rectangulo1.calcPerimetro() );
    }
}
