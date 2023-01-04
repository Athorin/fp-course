package u3_sentencias_de_control;

import utils.MenuEjercicios;
import utils.Utils;

/**
 * Ejercicios de la unidad 3. Sentencias de control
 *
 * @author Fco Alejandro Azorin Gil
 * @version v1.0.2013
 */
public class UD3_Main {

    /**
     * No hacer caso de esta funcion, es solo para simplificar la ejecucion del main
     * añadiendo un menu para ejecutar el ejercicio que queramos probar
     */
    public static void launch() {

        int option;

        do {
            option = MenuEjercicios.chooseOption();
            switch(option) {
                case 1: ejercicio1(); break;
                case 2: ejercicio2(); break;
                case 3: ejercicio3(); break;
                case 4: ejercicio4(); break;
                case 5: ejercicio5(); break;
                case 10: ejercicio10(); break;
                case 11: ejercicio11(); break;
                case 12: ejercicio12(); break;
                case 13: ejercicio13(); break;
                case 14: ejercicio14(); break;
                case 15: ejercicio15(); break;
                case 16: ejercicio16(); break;
                case 17: ejercicio17(); break;
                case 18: ejercicio18(); break;
                case 19: ejercicio19(); break;
                case 20: ejercicio20(); break;
            }
        } while(option != 0);

    }

    /**
     * Ejercicio de condicionales IF
     * Dado un numero, indica por pantalla si es par o impar.
     */
    public static void ejercicio1() {

        int num = Utils.leerNumero();

        if (num % 2 == 0) System.out.printf("El numero %d es par",num);
        if (num % 2 == 1) System.out.printf("El numero %d es impar",num);
    }

    /**
     * Ejercicio de condicionales IF - ELSE
     * Dado dos numeros enteros, indica cual es el mayor (no controla si son iguales)
     */
    public static void ejercicio2() {
        int a,b;

        a = Utils.leerNumero();
        b = Utils.leerNumero();

        if(a < b) System.out.printf("El numero %d es menor que %d",a,b);
        else System.out.printf("El numero %d es mayor que %d",a,b);
    }

    /**
     * Ejercicio de bucles FOR y condicionales IF
     * Imprime los numeros del 1 al 100
     * Calcula e imprime la suma de todos los numeros pares por un lado y los impares por otro
     */
    public static void ejercicio3() {
        int par = 0, impar = 0;

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);

            if(i % 2 == 0) par = par + i;
            if(i % 2 == 1) impar = impar + i;
        }

        System.out.printf("La suma de los pares es %d y la de los impares es %d",par,impar);
    }

    /**
     * Ejercicio de bucles DO WHILE y condicionales IF
     */
    public static void ejercicio4() {
        int i = 0, cuad = 0;

        do{
            if(i % 2 == 1) {
                cuad = cuad + (i*i);
            }
            i++;
        } while(i <= 100);

        System.out.println("La suma de los cuadrados impares es: " + cuad);
    }

    /**
     * Ejercicio de bucle FOR y condicional IF con operador OR
     */
    public static void ejercicio5() {
        int i;

        for(i = 1; i <= 30; i++) {
            if(i % 2 == 0 || i % 3 == 0) System.out.println(i);
        }
    }

    /**
     * Ejercicio de conficionales IF anidados
     */
    public static void ejercicio10() {
        int dia, mes, año;

        System.out.println("Introduce el dia: ");
        dia = Utils.leerNumero();
        System.out.println("Introduce el mes: ");
        mes = Utils.leerNumero();
        System.out.println("Introduce el año: ");
        año = Utils.leerNumero();

        if (dia >= 1 && dia <= 30) {
            if (mes >= 1 && mes <= 12) {
                if (año > 0) {
                    System.out.printf("La fecha %02d-%02d-%04d es una fecha valida", dia, mes, año);
                } else {
                    System.out.printf("La fecha %02d-%02d-%04d no es una fecha valida", dia, mes, año);
                }
            }
        }

    }

    /**
     * Ejercicio de condicional IF con variables de caracteres char
     */
    public static void ejercicio11() {

        char letra = Utils.leerCaracter();

        System.out.println("La letra es: " + letra);

        if (letra >= 65 && letra <= 90) {
            letra += 32;
            System.out.println("La letra era mayuscula, la paso a minuscula: " + letra);
        } else{
            System.out.println("No es una letra mayuscula, no hace falta modificar");
        }
    }

}
