package u3_sentencias_de_control;
/**
 * Introducir fecha y calcular el numero de dia, en que se encuentra del año.
 * @author Fran Azorin
 * @version v1.0    26/11/2013
 */

import java.util.Scanner;

public class Ejercicio_19
{
   public static void main()
   {
       Scanner scan=new Scanner(System.in);
       int i,day,month,year,total;
       total=0;
       
       do{
           System.out.print("Introduce el dia: ");
           day=scan.nextInt();
       
           System.out.print("Introduce el mes: ");
           month=scan.nextInt();
       
           System.out.print("Introduce el año: ");
           year=scan.nextInt();
           
           if(day<=0 | month<=0 | year<=0){System.out.println("\nNo se permitan numeros negativos, repita\n");}
           if(day<0 | day>31 | month<0 | month>12){System.out.println("\nHa introducido un numero fuera del rango de dia o mes, repita.\n");}
           
       }while(day<=0 | month<=0 | year<=0 | day<0 | day>31 | month<0 | month>12);
       
       
       for(i=0;i<=month;i++) { 
           switch(i) {
               case 1: total=0;break;
               case 2: total+=28;break;
               case 3: total+=31;break;
               case 4: total+=30;break;
               case 5: total+=31;break;
               case 6: total+=30;break;
               case 7: total+=31;break;
               case 8: total+=31;break;
               case 9: total+=30;break;
               case 10: total+=31;break;
               case 11: total+=30;break;
               case 12: total+=31;break;
            }
       }
       total=total+day;
       System.out.printf("\nLa posicion en dias del año es: %d ",total);
    }
       
}
