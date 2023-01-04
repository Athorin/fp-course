import u2_principios_basicos.U2_Main;
import utils.MenuEjercicios;

/**
 * Creación del primer programa en Java.
 *
 * @author Fco Alejandro Azorin Gil
 * @version v1.0   04/11/2013
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");

        launch();
    }

    public static void launch() {

        int option;

        do {
            option = MenuEjercicios.chooseOption();
            switch(option) {
                case 2: U2_Main.launch(); break;
                case 3: U2_Main.launch(); break;
                case 4: U2_Main.launch(); break;
                case 5: U2_Main.launch(); break;
                case 6: U2_Main.launch(); break;
                case 7: U2_Main.launch(); break;
                case 8: U2_Main.launch(); break;
                case 10: U2_Main.launch(); break;
                case 11: U2_Main.launch(); break;
                case 13: U2_Main.launch(); break;
                case 14: U2_Main.launch(); break;
            }
        } while(option != 0);

        System.out.println("ADIOS!");

    }
}