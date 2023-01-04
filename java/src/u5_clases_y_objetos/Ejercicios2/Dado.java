/**
 * Write a description of class Dado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dado
{
    private final int CARAS; //El numero de caras es constante en el dado
    
    //Constructores
    /**
     * Constructor por Defecto (Dado de 6 Caras)
     */
    public Dado(){
        CARAS = 6;
    }
    
    /**
     * Constructor que inicia el valor de caras definido por el usuario.
     */
    public Dado (int n_caras){
        CARAS = n_caras;
    }
    
    
    //Funcionalidad
    /**
     * Metodo GET para obtener el numero de caras.
     */
    public int getN_Caras(){
        return CARAS;
    }
    
    /**
     * Metodo para lanzar el Dado.
     */
    public int lanzarDado(){
        return (int) (Math.random() * CARAS + 1);
    }
}
