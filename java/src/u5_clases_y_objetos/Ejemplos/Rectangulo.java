/**
 * Primer programa orientado a objetos.
 * 
 * 
 * @author Fran Azorin 
 * @version 10/01/2014
 */
public class Rectangulo
{
    //Atributos o Variables Miembro
    private float base;
    private float altura;
    
    //Constructores Rectangulo
    public Rectangulo() {
        //base = altura = 0; (Se puede hacer de las dos formas)
        setBaseAltura(0,0);
    }
    //Constructor Sobrecargado Rectangulo
    /**
     *Calculo de un Rectangulo con dimensiones que el usuario pasa por parametro.
     *@param b valor de la Base
     *@param a valor de la Altura
     */
    public Rectangulo(float b, float a){
       
        setBaseAltura(b,a);
        
        /* Otro modo es:
         * base = b;
         * altura = a;
         */
    }
    //Constructor Sobrecargado Rectangulo
    public Rectangulo(int b, int a){
        
        setBaseAltura(b,a);
        
        /* Otro modo es:
         * base = b;
         * altura = a;
         */
    }
    //Constructor Sobrecargado Rectangulo
     /**
     *Calculo de un Cuadrado (lados iguales)
     *@param l valor de un Lado del Cuadrado
     */
    public Rectangulo(float l){
        setBaseAltura(l,l);
    }
    
    
    /*
     * Metodos SET lo utilizamos para iniciar variables miembro mediante metodo.
     * Y aplicar el metodo internamente al constructor.
     */
    public void setBase (float b) {
        base=b;
    }
    public void setAltura (float a) {
        altura=a;
    }
    public void setBaseAltura(float b,float a) {
        base=b;
        altura=a;
        
    }
    
    //Metodos de Funcionalidad del Objeto
    public float calcPerimetro() {
        return 2*(base+altura);
    }
    
    public float calcArea() {
        return base*altura;
    }
}
