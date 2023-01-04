/**
 * Programa que genera 20 caracteres de la tabla ASCII de forma aleatoria
 * Determina cuantos digitos y cuantas letras mayusuculas se han obtenido.
 * 
 * HE PUESTO DOS FORMAS DE HACERLO
 * 
 * @author Fran Azorin
 * @version 03/02/2014
 */
public class GeneradorASCII
{
    public static void main(){
        //PRIMERA FORMA DE HACERLO
        int i,num=0,mayus=0;
        char c;
        
    
        for(i=0;i<20;i++){
            c = (char)(Math.random() * 256);
            
            System.out.println("Caracter "+c);
            if(c >= 48 & c <= 57){
                num++;
            }
            if(c >= 65 & c <= 90){
                mayus++;
            }
                    
                
        }
        
        
        //SEGUNDA FORMA DE HACERLO 
        System.out.println("El numero de Digitos es: "+num+" y el de Mayusuculas es: "+mayus);
        num=0;
        mayus=0;
        
            for(i=0;i<20;i++){
            c = (char)(Math.random() * 256);
            
            System.out.println("Caracter numero "+i+" es "+c);
            if(Character.isDigit(c)){
                num++;
            }
            if(Character.isLetter(c)){
                if(Character.isUpperCase(c)){
                    mayus++;
                }
            }
                    
            
        }
        System.out.println("El numero de Digitos es: "+num+" y el de Mayusuculas es: "+mayus); 
        
    }
}
