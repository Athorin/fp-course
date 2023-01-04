/**
 * Ejercicio 8. Diseña la clase Vector que encapsule un vector de numeros enteros.
 * La clase debe incluir la siguiente funcionalidad:
 * 
 * a. Al menos dos contructores
 * b. Un metodo que permita insertar un elemento en el vector.
 * c. Un metodo que devuelva el valor almacenado en una determinada posicion del vector.
 * d. Un metodo que calcule la media de los valores almacenados.
 * e. Un metodo que determine si un valor entero recibido por parametro
 * se encuentra o no almacenado en el vector.
 * f. Un metodo que calcule el mayor valor almacenado en el vector.
 * g. Un metodo que ordene el vector implicito.
 * 
 * @author Fran Azorin
 * @version 14/02/2014
 */
public class EJ8_Vector
{
    private int vector[], numElem;
    private final int TAMAÑO;
    
    /**
     * A. Constructor que inicializa por defecto.
     */
    public EJ8_Vector()
    {
        /* TAM=0;
         * vector[]= null; */
         
         TAMAÑO = 10;
         vector = new int [TAMAÑO];
         numElem = 0;
        
    }
    
    /**
     * A. Constructor que inicializa el tamaño determinado por el usuario.
     */
    public EJ8_Vector(int t)
    {
        TAMAÑO = t;
        vector = new int [TAMAÑO];
        numElem = 0;
    }
    
    
    /**
     * B. Metodo que permite insertar un elemento en el vector.
     */
    public boolean setValor (int valor)
    { 
        boolean resultado;
        if(numElem < TAMAÑO) {
            vector[numElem] = valor;
            numElem++;
            resultado = true;
        }else{
            resultado = false;
        }
        return resultado;
    }
    
    /**
     * C. Metodo que devuelve el valor almacenado en una determinada posicion del vector.
     */
    public int getValor (int pos) 
    {
        return vector[pos];
    }
    
    /**
     * D. Metodo que calcula la media de los valores almacenados.
     */
    public double calcularMedia()
    {
        return 0;
    }
    
    /**
     * E. Metodo que determina si un valor entero recibido por parametro
     * se encuentra o no almacenado en el vector.
     */
    public boolean existeValor (int valor)
    {
        boolean existe = false;
        
        
        return existe;
    }
    
    /**
     * F. Metodo que calcula el mayor valor almacenado en el vector.
     */
    public int mayorNum ()
    {
        int max = vector[0];
        
        return max;
    }
    
    /**
     * G. Metodo que ordena el vector implicito.
     */
    public void ordenar()
    {
        
    }
}
