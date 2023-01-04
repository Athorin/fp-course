/**
 * Write a description of class Recta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Recta
{
    // instance variables - replace the example below with your own
    private Punto p1, p2;

    //CONSTRUCTORES
    public Recta() //Constructor por Defecto (debemos usar el metodo Set en este ejercicio)
    {
        /* p1 = p2 = null;
         * p1 = new Punto(); Otra forma de inicializar, haciendo referencia a otro objeto.
         * p2 = new Punto(); */
        
         this.setPunto1(0,0);
         this.setPunto2(0,0);
    }
    public Recta(int x1, int y1, int x2, int y2)
    {
         /* p1 = new Punto(x1,y1);
          * p2 = new Punto(x2,y2); */
         
          this.setPunto1(x1,y1);
          this.setPunto2(x2,y2);
    }
    public Recta(Punto p1, Punto p2)
    {
        /* p1 = p1; Rompe la encapsulacion y deja de ser privado el objeto punto.
         * p2 = p2;*/
         
        // p1 = new Punto (p1.getCoordenadaX(), p1.getCoordenadaY() );
        
         this.setPunto1(p1);
         this.setPunto2(p2);
    }
    
    //METODOS SET
    public void setPunto1(Punto p) 
    {
        p1 = new Punto (p.getCoordenadaX(), p.getCoordenadaY() );
    }
    public void setPunto1(int x, int y) 
    {
        p1 = new Punto (x,y);
    }    
    public void setPunto2(Punto p) 
    {
        p2 = new Punto (p.getCoordenadaX(), p.getCoordenadaY() );
    }
    public void setPunto2(int x, int y) 
    {
        p2 = new Punto (x,y);
    }        
    

    //METODOS FUNCIONALES
    public double calcularPendiente()
    {
        double pendiente=0;
        
        if(p1.getCoordenadaX() == p2.getCoordenadaX() )
        {
            pendiente = Double.NaN;
        }else{
            pendiente = (p2.getCoordenadaY() - p1.getCoordenadaY()) / (p2.getCoordenadaX() - p1.getCoordenadaX());
        }
        return pendiente;
    }
    
    public void desplazarEjeX(int valor)
    {
        p1.desplazarEjeX(valor);
        p2.desplazarEjeX(valor);
    }
}
