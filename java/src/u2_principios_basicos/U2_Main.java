package u2_principios_basicos;

import utils.MenuEjercicios;

/**
 * Ejercicios de la unidad 2. Principios basicos
 * Variables y operaciones
 * 
 * @author Fco Alejandro Azorin Gil
 * @version v1.0.2013
 */
public class U2_Main {

    /**
     * No hacer caso de esta funcion, es solo para simplificar la ejecucion del main
     * añadiendo un menu para ejecutar el ejercicio que queramos probar
     */
    public static void launch() {

        int option;

        do {
            option = MenuEjercicios.chooseOption();
            switch(option) {
                case 6: ejercicio6(); break;
                case 7: ejercicio7(); break;
                case 8: ejercicio8(); break;
                case 9: ejercicio9(); break;
            }
        } while(option != 0);

    }

    /**
     * Ejercicio 6 Perimetro
     * Programa que calcula el perimetro y area de un Rectangulo.
     */
    public static void ejercicio6() {
        int a = 5, b = 10, area, per;
    
        area = a*b;
        per = a*2 + b*2;
    
        System.out.println("El area es: "+area +" cm2" +" y el perimetro: "+per +" cm");
    }

    /**
     * Ejercicio 7 Edad
     * Calcula la edad en dias a partir de los años, suponiendo 365 dias.
     */
    public static void ejercicio7() {
        int age = 22, days;

        days = age * 365;

        System.out.println("La edad en dias para alguien de: "+age+" años, es: "+days+" dias");
    }

    /**
     * Ejercicio 8 Masa
     * Calculo del indice de masa corporal.
     */
    public static void ejercicio8() {
        int peso = 65;
        float imc, altura = 1.80f;

        imc = peso / (altura * altura);

        System.out.println("El IMC es: "+imc);
    }

    /**
     * Ejercicio 9 Segundos
     * Calcula la cantidad de segundos equivalentes para una hora en formato hh:mm:ss
     */
    public static void ejercicio9() {
        int hh = 2,mm = 3,ss = 44, totalseg;

        totalseg = hh * 3600 + mm * 60 + ss;

        System.out.printf("La hora %02d:%02d:%02d en segundo es: %d \n",hh,mm,ss,totalseg);
    }
    
}
