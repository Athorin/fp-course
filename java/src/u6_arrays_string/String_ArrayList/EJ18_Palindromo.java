import java.util.Scanner;

/**
 * Determina si una cadena de caracteres introducida por teclado es o no un palindromo.
 * 
 * @author Fran Azorin 
 * @version 24/02/2014
 */
public class EJ18_Palindromo
{
   public static void main()
   {
       Scanner scan = new Scanner (System.in);
       String cadena;
       
       System.out.println("Introduce cadena a comparar: ");
       cadena = scan.nextLine();
       
       String cadenaFinal = new String();
       String[] arrayCadenas = cadena.toLowerCase().trim().split(" ");
       /* Split -> indica que separador de cadenas usamos para dividirlas
        * Ejemplo -> " " Buenos dias -> "Buenos" "Dias"
        * Ejemplo -> "o" -> "Buen" "S dias"
        */
       
       boolean palindromo = true;
       int left = 0, right;
       
       for (int i = 0; i < arrayCadenas.length; i++)
       {
           cadenaFinal+= arrayCadenas[i];
       }
       
       right = cadenaFinal.length()-1;
       
       while (left != right && left < right && palindromo)
       {
           if(cadena.charAt(left) != cadena.charAt(right) )
           {
               palindromo = false;
           }
           left++; right--;
        }
        
       if(palindromo) {System.out.println("Es un palindromo");}
       else           {System.out.println("No es un palindromo");}
           
    }
}
