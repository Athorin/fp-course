/**
 * Write a description of class Carta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carta
{
    private int numero;
    private String palo;
    private boolean disponible;

    //Constructor por Defecto
    public Carta()
    {
        numero = 0;
        palo = new String ("Comodin");
        disponible = false;
    }
    //Constructor de Carta
    public Carta(int numero, String palo)
    {
        this.numero = numero;
        this.palo = palo;
        this.disponible = true;
    }
    
    //Metodos Getter
    public int getNumero()
    {
        return numero;
    }
    public String getPalo()
    {
        return palo;
    }
    public boolean getEstado()
    {
        return disponible;
    }
    
    //Metodos Set
    public void setEstado(boolean disp)
    {
        this.disponible = disp;
    }
}
