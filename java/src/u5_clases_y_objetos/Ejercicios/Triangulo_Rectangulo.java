/**
 * Write a description of class Triangulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangulo_Rectangulo
{
    //Variables Miembro
    private double cateto1, cateto2, hipotenusa;
    
    public Triangulo_Rectangulo() //Constructor por Defecto
    {
        cateto1 = cateto2 = hipotenusa = 0;
    }
    
    public Triangulo_Rectangulo(double a, double b) //Constructor que recibe el valor de los catetos.
    {
        cateto1 = a;
        cateto2 = b;
        //Saca el valor de la Hipotenusa con el Teorema de Pitagoras.
        hipotenusa = Math.sqrt(cateto1*cateto1 + cateto2*cateto2);
    }
    
    public double getHipotenusa() //Metodo GET, para devolver el valor de la hipotenusa.
    {
        return hipotenusa;
    }
    
    public double calcularPerimetro() {
        double perimetro;
        
        perimetro = hipotenusa + cateto1 + cateto2;
        return perimetro;
    }
    
    public double calcularArea() {
        double area;
        
        area = cateto1*cateto2 / 2;
        return area;
    }
}
