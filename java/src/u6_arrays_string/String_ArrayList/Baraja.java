import java.util.ArrayList;

/**
 * Write a description of class Baraja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Baraja
{
    private ArrayList<Carta> baraja = new ArrayList<Carta>(40);
    private int cont = 0;

    public Baraja()
    {   
        String palo = new String();
        for(int i = 1; i <= 4; i++)
        {
            switch(i)
            {
                    case 1: palo = new String("Oros"); break;
                    case 2: palo = new String("Copas"); break;
                    case 3: palo = new String("Espadas"); break;
                    case 4: palo = new String("Bastos"); break;
            }            
            
            for(int j = 1; j <= 12; j++)
            {
                if(j==8){j+=2;}
                baraja.add(new Carta (j,palo));
            }
        }
    }
    

    public void Comprobar()
    {
        for(int i = 0; i < baraja.size(); i++)
        {
            System.out.println(baraja.get(i).getNumero()+" "+baraja.get(i).getPalo());
        }        
    }
    public void barajar()
    {
        int n;
        Carta aux;
        for(int i = 0; i < baraja.size(); i++)
        {
            n = (int)(Math.random() * this.baraja.size());
            aux = baraja.get(n);
            baraja.set(n, baraja.get(i));
            baraja.set(i,aux);
        }
        
        for(int i = 0; i < baraja.size(); i++)
        {
            if(baraja.get(i).getEstado() == false)
            {
                baraja.get(i).setEstado(true);
            }
        }
    }
    public Carta extraerCarta()
    {
        Carta c = new Carta();
        cont++;
        
        if (cont < baraja.size() -1 && baraja.get(cont).getEstado() == true)
        {
            baraja.get(cont).setEstado(false);            
            return baraja.get(cont);
        }else{
            return c;
        }
    }
}
