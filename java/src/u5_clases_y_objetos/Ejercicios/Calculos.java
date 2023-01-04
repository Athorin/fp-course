/**
 * Metodos de la Clase Calculos
 * NOTA-> Cuando NO tienen variables miembros, los metodos son candidatos a ser metodos estaticos.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculos
{
    //Metodo Suma Naturales (calcula la suma de los N primeros numeros naturales)
    public static int sumaNaturales (int n) {
        int i = 0, suma = 0;
        
        while (i < n) {
            i++;
            suma+=i;
        }
        
        return suma;
    }
    
    //Metodo X elevado a N (exponente no negativo y base no nula)
    public static int calcularPotencia (int base, int exp) {
        int producto = 1;
        
        while (exp>0) {
            producto*=base;
            exp--;
        }
        
        return producto;
    }
    
    //Metodo Suma de Digitos de un Numero Entero Positivo
    public static int sumaDigitos (int n) {
        int suma = 0;
        
        if (n<0) {n*=-1;}
        
        while (n>0) {
            suma+=n%10;
            n/=10;
        }
        
        return suma;
    }
}
